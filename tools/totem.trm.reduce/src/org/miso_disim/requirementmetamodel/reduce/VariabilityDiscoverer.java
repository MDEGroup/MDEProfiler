package org.miso_disim.requirementmetamodel.reduce;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

import MM_uncertainty.Attribute;
import MM_uncertainty.Boolean_;
import MM_uncertainty.Cardinality;
import MM_uncertainty.Feature;
import MM_uncertainty.FeatureType;
import MM_uncertainty.Integer_;
import MM_uncertainty.Many;
import MM_uncertainty.Real_;
import MM_uncertainty.Reference;
import MM_uncertainty.String_;
import VariabilityFM.AttOrReferenceExclusiveChoice;
import VariabilityFM.AttributeTypeChoice;
import VariabilityFM.AttributeTypeGroup;
import VariabilityFM.FeatureCardinalityChoice;
import VariabilityFM.FeatureCardinalityGroup;
import VariabilityFM.FeatureKindGroup;
import VariabilityFM.FeatureMaxCardinalityChoice;
import VariabilityFM.FeatureMinCardinalityChoice;
import VariabilityFM.MetamodelVariability;
import VariabilityFM.Node;
import VariabilityFM.NodeKind;
import VariabilityFM.OrRequires;
import VariabilityFM.ReferenceTypeChoice;
import VariabilityFM.ReferenceTypeGroup;
import VariabilityFM.VariabilityFMFactory;
import VariabilityFM.VariabilityModel;
import VariabilityFM.VariableFeature;
import anatlyzer.atl.model.ATLModel;
import anatlyzer.atlext.ATL.Binding;
import anatlyzer.atlext.ATL.MatchedRule;
import anatlyzer.atlext.OCL.NavigationOrAttributeCallExp;

public class VariabilityDiscoverer {

	protected SourceInferenceContext source;
	protected TargetInferenceContext target;
	protected ATLModel model;

	protected HashMap<Binding, VariableFeature> bindingToSourceFeature = new HashMap<Binding, VariableFeature>(); 
	protected HashMap<Binding, VariableFeature> bindingToTargetFeature = new HashMap<Binding, VariableFeature>();
	
	public VariabilityDiscoverer(ATLModel model, SourceInferenceContext source, TargetInferenceContext target) {
		this.model  = model;
		this.source = source;
		this.target = target;
	}
	
	public VariabilityModel perform() {
		VariabilityModel vm = VariabilityFMFactory.eINSTANCE.createVariabilityModel();
		
		// 1. Source meta-model
		HashSet<Feature> alreadyProcessed = new HashSet<Feature>();
		MetamodelVariability mms = VariabilityFMFactory.eINSTANCE.createMetamodelVariability();
		mms.setName("Source");
		vm.setSource(mms);
		
		for (Binding b : model.allObjectsOf(Binding.class)) {
			// Establish correspondences for bindings		
			createVariableFeature(alreadyProcessed, source, mms, b.getValue(), (vf) -> {
				bindingToSourceFeature.put(b, vf);
			});
		}

		for (NavigationOrAttributeCallExp nav : model.allObjectsOf(NavigationOrAttributeCallExp.class)) {
			createVariableFeature(alreadyProcessed, source, mms, nav, (vf) -> {});
		}	
			
		// 2. Target meta-model
		alreadyProcessed = new HashSet<Feature>();
		MetamodelVariability mmt = VariabilityFMFactory.eINSTANCE.createMetamodelVariability();
		mmt.setName("Target");
		vm.setTarget(mmt);
		
		for (Binding b : model.allObjectsOf(Binding.class)) {
			// Establish correspondences for bindings		
			createVariableFeature(alreadyProcessed, target, mmt, b, (vf) -> {
				bindingToTargetFeature.put(b, vf);
			});
		}


		// Sanity check: no feature with uncertainity is left unassigned in the feature model
		checkAllFeaturesConverted(target, mmt);
		checkAllFeaturesConverted(source, mms);
		
		// 3. Analyse bindings
		for (Binding b : model.allObjectsOf(Binding.class)) {
			if ( bindingToSourceFeature.containsKey(b) && bindingToTargetFeature.containsKey(b) ) {
				analyseBinding(b, bindingToSourceFeature.get(b), bindingToTargetFeature.get(b));				
			}
		}
		
		int i = 0;
		TreeIterator<EObject> it = vm.eAllContents();
		while ( it.hasNext() ) {
			EObject obj = it.next();
			if ( obj instanceof Node ) {
				Node n = (Node) obj;
				n.setUniqueId(i + "");
				i++;
			}
		}
		
		return vm;
	}
	
	private void analyseBinding(Binding b, VariableFeature sourceVF, VariableFeature targetVF) {
		if ( sourceVF.getKind() != null ) {
			
			// THIS IS ONLY TEMPORARY, TO AVOID A BUG FOR HSM2FSM:
			if ( targetVF.getKind().getAttOrRef() == null || sourceVF.getKind().getAttOrRef() == null )
				return;
			
			// check attribute type			
			AttributeTypeGroup srcAttChoice = sourceVF.getKind().getAttOrRef().getAttributeChoice();
			AttributeTypeGroup tgtAttChoice = targetVF.getKind().getAttOrRef().getAttributeChoice();
			
			// For integer in the target, Integer <- Integer 
			find(tgtAttChoice.getChoices(), Integer_.class, (tgtChoice) -> {
				OrRequires req = VariabilityFMFactory.eINSTANCE.createOrRequires();

				find(srcAttChoice.getChoices(), Integer_.class, (srcChoice) -> {
					req.getNodes().add(srcChoice);
					tgtChoice.getConstraints().add(req);
				});				
			});
			
			// For real in the target, Real <- Real or Integer
			find(tgtAttChoice.getChoices(), Real_.class, (tgtChoice) -> {
				List<Node> constrainedNodes = new ArrayList<Node>();

				find(srcAttChoice.getChoices(), Integer_.class, (srcChoice) -> {
					constrainedNodes.add(srcChoice);
				});				
				
				find(srcAttChoice.getChoices(), Real_.class, (srcChoice) -> {
					constrainedNodes.add(srcChoice);
				});				

				if ( ! constrainedNodes.isEmpty() ) {
					OrRequires req = VariabilityFMFactory.eINSTANCE.createOrRequires();
					req.getNodes().addAll(constrainedNodes);
					tgtChoice.getConstraints().add(req);
				}
			});

			// For integer in the source, (Integer, Real) <- Integer 
			find(srcAttChoice.getChoices(), Integer_.class, (srcChoice) -> {
				List<Node> constrainedNodes = new ArrayList<Node>();

				find(tgtAttChoice.getChoices(), Integer_.class, (tgtChoice) -> {
					constrainedNodes.add(tgtChoice);
				});				
				
				find(tgtAttChoice.getChoices(), Real_.class, (tgtChoice) -> {
					constrainedNodes.add(tgtChoice);
				});				

				if ( ! constrainedNodes.isEmpty() ) {
					OrRequires req = VariabilityFMFactory.eINSTANCE.createOrRequires();
					req.getNodes().addAll(constrainedNodes);
					srcChoice.getConstraints().add(req);
				}
			});

			// TODO: Check this is true!
			// For real in the source Real <- Real 
			find(srcAttChoice.getChoices(), Real_.class, (srcChoice) -> {
				OrRequires req = VariabilityFMFactory.eINSTANCE.createOrRequires();

				find(tgtAttChoice.getChoices(), Real_.class, (tgtChoice) -> {
					req.getNodes().add(tgtChoice);
					srcChoice.getConstraints().add(req);
				});				
			});
			
			// check reference types
			analysePossibleReferenceType(b, sourceVF, targetVF);
			
		}
		
		// check cardinality
		if ( sourceVF.getCardinality() != null && targetVF.getCardinality() != null ) {
			analyseCardinalityConstraints(b, sourceVF, targetVF);
		}
	}
	
	private void analyseCardinalityConstraints(Binding b, VariableFeature sourceVF, VariableFeature targetVF) {
		FeatureCardinalityGroup sourceCard = sourceVF.getCardinality();
		FeatureCardinalityGroup targetCard = targetVF.getCardinality();
		
		// source constraint: max(1) <- max(1)
		find(sourceCard.getMax(), (v -> v == 1), targetCard.getMax(), (v -> v == 1), (src, tgtList) -> {
			OrRequires req = createOrGetRequires(src);
			req.getNodes().addAll(tgtList);
		});
		
		// source constraint: max(*) <- max(1) or max(*)
		find(sourceCard.getMax(), (v -> v == 1 || v == -1), targetCard.getMax(), (v -> v == -1), (src, tgtList) -> {
			OrRequires req = createOrGetRequires(src);
			req.getNodes().addAll(tgtList);
		});		
		
		// target constraint: max(1) <- max(1)
		find(targetCard.getMax(), (v -> v == 1), sourceCard.getMax(), (v -> v == 1), (tgt, srcList) -> {
			OrRequires req = createOrGetRequires(tgt);
			req.getNodes().addAll(srcList);
		});
		
		// target constraint: max(*) <- max(1) or max(*)
		find(targetCard.getMax(), (v -> v == -1), sourceCard.getMax(), (v -> v == 1 || v == -1), (tgt, srcList) -> {
			OrRequires req = createOrGetRequires(tgt);
			req.getNodes().addAll(srcList);
		});
		
	}

	private OrRequires createOrGetRequires(FeatureCardinalityChoice src) {
		return (OrRequires) src.getConstraints().stream().filter(c -> c instanceof OrRequires).findAny().
			orElseGet(() -> {
				OrRequires r = VariabilityFMFactory.eINSTANCE.createOrRequires();
				src.getConstraints().add(r);
				return r;
			});
	}

	private void find(List<? extends FeatureCardinalityChoice> choices1, Predicate<Integer> p1, List<? extends FeatureCardinalityChoice> choices2, Predicate<Integer> p2, BiConsumer<FeatureCardinalityChoice, List<FeatureCardinalityChoice>> f) {
		List<FeatureCardinalityChoice> r1 = choices1.stream().filter(c -> p1.test(c.getValue())).collect(Collectors.toList());
		List<FeatureCardinalityChoice> r2 = choices2.stream().filter(c -> p2.test(c.getValue())).collect(Collectors.toList());
		if ( r1.size() > 0 && r2.isEmpty() ) {
			// throw new IllegalStateException("Not sure what to do in this case");
			System.out.println("Ignoring case where a cardinality is not satisfied in the other side. ");
			// See for example: PNML2PetriNet, cardinality between NetContents.contents and PetriNet.elements
			System.out.println("    A proper solution would take into account all cardinality constraints and see if at least one is satisifed. For the moment only one by one are checked.");
			return;
		}
		
		for (FeatureCardinalityChoice c1 : r1) {
			f.accept(c1, r2);
		}
	}

	private void analysePossibleReferenceType(Binding b, VariableFeature sourceVF, VariableFeature targetVF) {
		// Given a  target_feature <- expr.source_feature
		//
		
		ReferenceTypeGroup srcRefChoice = sourceVF.getKind().getAttOrRef().getReferenceChoice();
		ReferenceTypeGroup tgtRefChoice = targetVF.getKind().getAttOrRef().getReferenceChoice();
		
		HashMap<MM_uncertainty.Class, ReferenceTypeChoice> map = new HashMap<MM_uncertainty.Class, ReferenceTypeChoice>();
		
		// Any class in the source meta-model could be used, in principle
		for (MM_uncertainty.Class srcClass : source.getClasses()) {
			ReferenceTypeChoice choice = VariabilityFMFactory.eINSTANCE.createReferenceTypeChoice();	
			choice.setName(srcClass.getName());
			choice.setKlass(srcClass);
			srcRefChoice.getChoices().add(choice);
			
			map.put(srcClass, choice);
		}
		
		// Any class in the target meta-model could be used, in principle
		for (MM_uncertainty.Class tgtClass : target.getClasses()) {
			ReferenceTypeChoice choice = VariabilityFMFactory.eINSTANCE.createReferenceTypeChoice();	
			choice.setName(tgtClass.getName());
			choice.setKlass(tgtClass);
			tgtRefChoice.getChoices().add(choice);
			
			map.put(tgtClass, choice);
		}
		
		// Analyse the rules
		for (MatchedRule rule : model.allObjectsOf(MatchedRule.class)) {
			if ( rule.isIsAbstract() || rule.getInPattern().getElements().size() != 1 )
				continue;
			
			MM_uncertainty.Class inType  = source.findClassByName(rule.getInPattern().getElements().get(0).getType().getName());
			MM_uncertainty.Class outType = target.findClassByName(rule.getOutPattern().getElements().get(0).getType().getName());
			
			ReferenceTypeChoice sourceRefChoice = map.get(inType);
			OrRequires req = null;
			if ( sourceRefChoice.getConstraints().isEmpty() ) {
				 req = VariabilityFMFactory.eINSTANCE.createOrRequires();
				 sourceRefChoice.getConstraints().add(req);
			} else {
				req = (OrRequires) sourceRefChoice.getConstraints().get(0);
			}
			
			ReferenceTypeChoice targetRefChoice = map.get(outType);
			req.getNodes().add(targetRefChoice);
			
			// TODO: How to take into account possible subtype relationships
		}
		
				
	}


	private void find(EList<AttributeTypeChoice> choices, Class<?> clazz, Consumer<AttributeTypeChoice> f) {
		choices.stream().filter(c -> clazz.isInstance( c.getDatatype_() )).findFirst().ifPresent(f);
		
	}

	private void createVariableFeature(HashSet<Feature> alreadyProcessed, InferenceContext ctx, MetamodelVariability vm, Object atlElement, Consumer<VariableFeature> cons) {
		// What if it is an arbitrary expression?	
		Feature feature = ctx.getFeatureOf( atlElement );
		if ( feature != null ) {
			if ( feature.eContainer() == null ) {
				System.out.println("Feature '" + feature.getName() + "' without class. Spurious trace link.");
				return;
			} else {
				System.out.println("Feature '" + feature.getName() + "' OK.");
			}
				 			
			if ( alreadyProcessed.contains(feature) ) {
				System.out.println("Already processed: " + feature.getName());
				return;
			}
			
			alreadyProcessed.add(feature);
			
			boolean hasVariability = false; 
			FeatureKindGroup fkind = null;
			FeatureCardinalityGroup fcard = null;
			
			// if ( feature.getHasType().isEmpty() ) {
			if ( hasVariableType(feature) ) {
				// No type, then there are two options: attribute or reference
				fkind = createAttributeReferenceChoice(feature);
				hasVariability = true;
			} 
			// check the other cases, 	it its an attribute but the type is open			
			// 							it is a reference but the type is open

			if ( hasVariableCardinality(feature) ) {
				fcard = createCardinalityGroup(feature);
				hasVariability = true;
			}
			
		
			if ( hasVariability ) {
				VariableFeature vf = VariabilityFMFactory.eINSTANCE.createVariableFeature();
				vf.setName( ((MM_uncertainty.Class) feature.eContainer()).getName() + "::" + feature.getName());
				vf.setFeature(feature);
				vm.getFeatures().add(vf);
				// vf.setFeature()
				if ( fkind != null ) 
					vf.setKind(fkind);				
				if ( fcard != null ) 
					vf.setCardinality(fcard);
				
				cons.accept(vf);
			}
			
		} 
	}
	
	private boolean hasVariableType(Feature feature) {
		if ( feature.getHasType().isEmpty() || hasBothTypes(feature) )
			return true;
		
		FeatureType x = feature.getHasType().get(0);
		if ( x instanceof Attribute ) {
			Attribute att = (Attribute) x;
			return att.getType().size() > 1;
		} else {
			Reference ref = (Reference) x;
			return ref.getTarget().size() > 1;
		}
	}
	
	private boolean hasVariableCardinality(Feature feature) {
		return feature.getMin() == null || feature.getMax() == null;
	}

	private FeatureCardinalityGroup createCardinalityGroup(Feature feature) {
		FeatureCardinalityGroup fcardinality = VariabilityFMFactory.eINSTANCE.createFeatureCardinalityGroup();
		fcardinality.setNodeKind(NodeKind.COMPULSORY);
		fcardinality.setName(getFeatureName(feature));

		Cardinality minCardinality = feature.getMin();
		Cardinality maxCardinality = feature.getMax();
		
		if ( minCardinality == null ) {
			FeatureMinCardinalityChoice c0 = VariabilityFMFactory.eINSTANCE.createFeatureMinCardinalityChoice();
			c0.setName(getFeatureName(feature) + " min 0");
			c0.setValue(0);
			FeatureMinCardinalityChoice c1 = VariabilityFMFactory.eINSTANCE.createFeatureMinCardinalityChoice();
			c1.setName(getFeatureName(feature) + " min 1");
			c1.setValue(1);
			
			fcardinality.getMin().add(c0);
			fcardinality.getMin().add(c1);
		}
		
		if ( maxCardinality == null ) {
			FeatureMaxCardinalityChoice c1 = VariabilityFMFactory.eINSTANCE.createFeatureMaxCardinalityChoice();
			c1.setName(getFeatureName(feature) + " max 1");
			c1.setValue(1);
			FeatureMaxCardinalityChoice cstar = VariabilityFMFactory.eINSTANCE.createFeatureMaxCardinalityChoice();
			cstar.setName(getFeatureName(feature) + " max *");
			cstar.setValue(-1);
			
			fcardinality.getMax().add(c1);
			fcardinality.getMax().add(cstar);
		} else if ( feature.getMax() instanceof Many ) { 
			FeatureMaxCardinalityChoice cstar = VariabilityFMFactory.eINSTANCE.createFeatureMaxCardinalityChoice();
			cstar.setName(getFeatureName(feature) + " max *");
			cstar.setValue(-1);

			fcardinality.getMax().add(cstar);
		}
				
		return fcardinality;
	}

	
	private String getFeatureName(Feature feature) {
		return ((MM_uncertainty.Class) feature.eContainer()).getName() + "." + feature.getName();
	}

	private FeatureKindGroup createAttributeReferenceChoice(Feature feature) {
		FeatureKindGroup fkind = VariabilityFMFactory.eINSTANCE.createFeatureKindGroup();
		fkind.setNodeKind(NodeKind.COMPULSORY);
		fkind.setName(((MM_uncertainty.Class) feature.eContainer()).getName() + "." + feature.getName());

		Attribute att = (Attribute) feature.getHasType().stream().filter(f -> f instanceof Attribute).findAny().orElse(null);
		Reference ref = (Reference) feature.getHasType().stream().filter(f -> f instanceof Reference).findAny().orElse(null);
		
		/** Create both attributes and references */
		if ( feature.getHasType().isEmpty() || hasBothTypes(feature) ) {
			AttOrReferenceExclusiveChoice attOrRef = VariabilityFMFactory.eINSTANCE.createAttOrReferenceExclusiveChoice();
			attOrRef.setName("AttOrReferenceExclusiveChoice-" + feature.getName());
			fkind.setAttOrRef(attOrRef);
			
			// Attribute choice
			createAttributeTypeGroup(feature, att, attOrRef);		
			// Reference choice
			createReferenceTypeGroup(attOrRef);
		} else {
			// TODO: Create another kind of node, possibly compulsory to select att types or ref types
		}
		
		return fkind;
	}

	private void createReferenceTypeGroup(AttOrReferenceExclusiveChoice attOrRef) {
		ReferenceTypeGroup ref = VariabilityFMFactory.eINSTANCE.createReferenceTypeGroup();
		// analysePossibleReferenceType(feature, ref);
		ref.setName("Reference");
		attOrRef.setReferenceChoice(ref);
	}

	private void createAttributeTypeGroup(Feature feature, Attribute att, AttOrReferenceExclusiveChoice attOrRef) {
		AttributeTypeGroup attGroup = VariabilityFMFactory.eINSTANCE.createAttributeTypeGroup();		
		attGroup.setName("Attribute");
		analysePossibleAttributeType(att, attGroup);
		attOrRef.setAttributeChoice(attGroup);
	}

	private boolean hasBothTypes(Feature feature) {
		return feature.getHasType().size() == 2;
	}

	private void analysePossibleAttributeType(Attribute att, AttributeTypeGroup attGroup) {
		if ( att == null || hasDataType(att, String_.class) ) {
			// Simplest analysis, all types are possible
			AttributeTypeChoice string_ = VariabilityFMFactory.eINSTANCE.createAttributeTypeChoice();
			string_.setDatatype_(source.getStringType());
			string_.setName("String");
			attGroup.getChoices().add(string_);
		}

		if ( att == null || hasDataType(att, Integer_.class) ) {
			AttributeTypeChoice integer_ = VariabilityFMFactory.eINSTANCE.createAttributeTypeChoice();
			integer_.setDatatype_(source.getIntegerType());
			integer_.setName("Integer");
			attGroup.getChoices().add(integer_);
		}

		if ( att == null || hasDataType(att, Real_.class) ) {
			AttributeTypeChoice real_ = VariabilityFMFactory.eINSTANCE.createAttributeTypeChoice();
			real_.setDatatype_(source.getRealType());
			real_.setName("Real");
			attGroup.getChoices().add(real_);
		}

		if ( att == null || hasDataType(att, Boolean_.class) ) {
			AttributeTypeChoice boolean_ = VariabilityFMFactory.eINSTANCE.createAttributeTypeChoice();
			boolean_.setDatatype_(source.getBooleanType());
			boolean_.setName("Boolean");
			attGroup.getChoices().add(boolean_);
		}
	}
	

	private boolean hasDataType(Attribute att, Class<?> clazz) {
		return att.getType().stream().anyMatch(dt -> clazz.isInstance(dt));
	}

	private void checkAllFeaturesConverted(InferenceContext ctx, MetamodelVariability mmv) {	
		ctx.getFeatures().stream().filter(f -> f.getHasType().isEmpty() ).forEach(f -> {
			if ( ! mmv.getFeatures().stream().anyMatch(vf -> vf.getFeature() == f) ) {
				System.err.println("Feature " + f.getName() + " has no correspondence in the VM model.");
			}
		});
	}

	
}

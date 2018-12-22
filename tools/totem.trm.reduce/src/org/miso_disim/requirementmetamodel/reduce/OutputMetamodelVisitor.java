package org.miso_disim.requirementmetamodel.reduce;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import MM_uncertainty.Attribute;
import MM_uncertainty.Boolean_;
import MM_uncertainty.Class;
import MM_uncertainty.DataType;
import MM_uncertainty.Feature;
import MM_uncertainty.FeatureType;
import MM_uncertainty.Integer_;
import MM_uncertainty.MM_uncertaintyFactory;
import MM_uncertainty.Many;
import MM_uncertainty.Metamodel;
import MM_uncertainty.Real_;
import MM_uncertainty.Reference;
import MM_uncertainty.String_;
import anatlyzer.atl.model.ATLModel;
import anatlyzer.atl.util.ATLUtils;
import anatlyzer.atlext.ATL.Binding;
import anatlyzer.atlext.ATL.Callable;
import anatlyzer.atlext.ATL.ContextHelper;
import anatlyzer.atlext.ATL.Helper;
import anatlyzer.atlext.ATL.LazyRule;
import anatlyzer.atlext.ATL.MatchedRule;
import anatlyzer.atlext.ATL.Module;
import anatlyzer.atlext.ATL.OutPatternElement;
import anatlyzer.atlext.ATL.StaticHelper;
import anatlyzer.atlext.OCL.BooleanType;
import anatlyzer.atlext.OCL.CollectionExp;
import anatlyzer.atlext.OCL.CollectionOperationCallExp;
import anatlyzer.atlext.OCL.EnumLiteralExp;
import anatlyzer.atlext.OCL.IntegerExp;
import anatlyzer.atlext.OCL.IntegerType;
import anatlyzer.atlext.OCL.Iterator;
import anatlyzer.atlext.OCL.IteratorExp;
import anatlyzer.atlext.OCL.LoopExp;
import anatlyzer.atlext.OCL.NavigationOrAttributeCallExp;
import anatlyzer.atlext.OCL.OclExpression;
import anatlyzer.atlext.OCL.OclModel;
import anatlyzer.atlext.OCL.OclModelElement;
import anatlyzer.atlext.OCL.OclType;
import anatlyzer.atlext.OCL.Operation;
import anatlyzer.atlext.OCL.OperationCallExp;
import anatlyzer.atlext.OCL.OperatorCallExp;
import anatlyzer.atlext.OCL.RealExp;
import anatlyzer.atlext.OCL.RealType;
import anatlyzer.atlext.OCL.SequenceExp;
import anatlyzer.atlext.OCL.SequenceType;
import anatlyzer.atlext.OCL.SetExp;
import anatlyzer.atlext.OCL.StringExp;
import anatlyzer.atlext.OCL.StringType;
import anatlyzer.atlext.OCL.VariableExp;
import anatlyzer.atlext.processing.AbstractVisitor;

public class OutputMetamodelVisitor extends AbstractVisitor {
	private List<String> outputMetamodels = new ArrayList<String>();
	private HashMap<Object, Object> oclComputedTypeMap = new HashMap<Object, Object>();;
	private HashMap<Object, OclType> callableElementsContextType;
	/** This keeps track of which meta-model element has been assigned to each ATL element (e.g., binding -> feature) */
	protected HashMap<Object, Object> traceLinks = new HashMap<Object, Object>();
	private HashMap<Callable, OclType> callableElementsReturnType;
	private Metamodel rootOut = MM_uncertaintyFactory.eINSTANCE.createMetamodel();
	private String_ stringDt = MM_uncertaintyFactory.eINSTANCE.createString_();
	private Integer_ integerDt = MM_uncertaintyFactory.eINSTANCE.createInteger_();
	private Real_ realDt = MM_uncertaintyFactory.eINSTANCE.createReal_();
	private Boolean_ boolDt = MM_uncertaintyFactory.eINSTANCE.createBoolean_();
	public Metamodel getRootOut() {
		this.rootOut.getDataType().add(stringDt);
		this.rootOut.getDataType().add(integerDt);
		this.rootOut.getDataType().add(realDt);
		this.rootOut.getDataType().add(boolDt);
		return rootOut;
	}

	public void setRootOut(Metamodel root) {
		this.rootOut = root;
	}
	private Feature checkIsPresent(String name, Class klass) {
		return klass.getFeats().stream().filter(x->x.getName().equals(name)).findAny().orElse(null);
	}

	public void perform(ATLModel model, HashMap<Object, OclType> callableElementsContextType,
			HashMap<Callable, OclType> callableElementsReturnType,
			Metamodel root, HashMap<Object, Object> oclComputedTypeMap) {
		this.rootOut.getDataType().add(stringDt);
		this.rootOut.getDataType().add(integerDt);
		this.rootOut.getDataType().add(realDt);
		this.rootOut.getDataType().add(boolDt);
		this.rootOut = root;
		this.callableElementsContextType = callableElementsContextType;
		this.callableElementsReturnType = callableElementsReturnType;
		if(model.getRoot() instanceof Module){
			for(OclModel inModels: ((Module) model.getRoot()).getOutModels())
				outputMetamodels.add(inModels.getMetamodel().getName());
		}
		this.oclComputedTypeMap = oclComputedTypeMap;
		startVisiting(model.getRoot());
	}
	@Override
	public void inBinding(Binding self) {
		Class klass = (Class) oclComputedTypeMap.get(self.getOutPatternElement());
		Feature feat = checkIsPresent(self.getPropertyName(), klass);
		if(feat == null) {
			if (oclComputedTypeMap.get(self.getValue()) instanceof Feature){
				feat = MM_uncertaintyFactory.eINSTANCE.createFeature();
				Feature featureOld = (Feature) oclComputedTypeMap.get(self.getValue());
				if(featureOld.getMax() instanceof Many) feat.setMax(TypeUtils.createMany());
				if(featureOld.getHasType().size()!=0){
					for(FeatureType ft : featureOld.getHasType()){
						if(ft instanceof Attribute) {
							Attribute attr = MM_uncertaintyFactory.eINSTANCE.createAttribute();
							((Attribute)ft).getType().forEach(z -> attr.getType().add(z));
							feat.getHasType().add(attr);
						}
						if (ft instanceof Reference)
							feat = featureOld;
					}
				}
			}
			if (oclComputedTypeMap.get(self.getValue()) instanceof Class){
				Class klazz = (Class) oclComputedTypeMap.get(self.getValue());
				feat = MM_uncertaintyFactory.eINSTANCE.createFeature();
				Reference ref = MM_uncertaintyFactory.eINSTANCE.createReference();
				ref.getTarget().add(klazz);
				feat.getHasType().add(ref);
			}
			
			if ( feat == null ) {
				feat = MM_uncertaintyFactory.eINSTANCE.createFeature();
				//System.out.println("Type not computed for expression in " + self.getValue().getLocation());
			}
			
			feat.setName(self.getPropertyName());
			klass.getFeats().add(feat);
		}
		traceLinks.put(self, feat);
	}

	private List<anatlyzer.atlext.OCL.OclFeature> checkIsAttribute(String name) {
		java.util.Iterator<Entry<Object, OclType>> i = callableElementsContextType.entrySet().iterator();
		List<anatlyzer.atlext.OCL.OclFeature> result = new ArrayList<anatlyzer.atlext.OCL.OclFeature>();
		while(i.hasNext()) {
			Entry<Object, OclType> pair = i.next();
			if(pair.getKey() instanceof anatlyzer.atlext.OCL.Attribute) {
				anatlyzer.atlext.OCL.Attribute att = (anatlyzer.atlext.OCL.Attribute)pair.getKey();
				if(att.getName().equals(name)) {
					result.add(att);
				}
			}
			if(pair.getKey() instanceof ContextHelper)
			{
				ContextHelper ch = (ContextHelper) pair.getKey();
						if(ch.getDefinition().getFeature() instanceof Operation){
							Operation op = (Operation) ch.getDefinition().getFeature();
							if(op.getName().equals(name)){
									result.add(op);
							}
						}
							
			} 
//			else if ( pair.getKey() instanceof StaticHelper ) {
//				StaticHelper ch = (StaticHelper) pair.getKey();
//				if ( ATLUtils.getHelperName(ch).equals(name)) {
//					result.add(ch.getDefinition().getFeature());
//				}
//			}
		}
		return result;
	}
	private List<Object> getAttributeValue(String name) {
		java.util.Iterator<Entry<Callable, OclType>> i = callableElementsReturnType.entrySet().iterator();
		List<Object> result = new ArrayList<Object>();
		while(i.hasNext()) {
			Entry<Callable, OclType> pair = i.next();
			if(pair.getKey() instanceof anatlyzer.atlext.OCL.Attribute) {
				anatlyzer.atlext.OCL.Attribute att = (anatlyzer.atlext.OCL.Attribute)pair.getKey();
				Object obj = pair.getValue();
				if(att.getName().equals(name)) {
					result.add(obj);
				}
			}
			if(pair.getKey() instanceof ContextHelper)
			{
				ContextHelper ch = (ContextHelper) pair.getKey();
						if(ch.getDefinition().getFeature() instanceof Operation){
							Operation op = (Operation) ch.getDefinition().getFeature();
							if(op.getName().equals(name)){
									result.add(pair.getValue());
							}
						}
						else if(ch.getDefinition().getFeature() instanceof anatlyzer.atlext.OCL.Attribute) {
							anatlyzer.atlext.OCL.Attribute att = (anatlyzer.atlext.OCL.Attribute) ch.getDefinition().getFeature();
							Object obj = pair.getValue();
							if(att.getName().equals(name)) {
								result.add(obj);
							}
						}
						
							
			}
		}
		return result;
	}
	private List<LazyRule> checkIsLazyRule(String name) {
		return callableElementsContextType.entrySet().stream().
				filter(z -> LazyRule.class.isInstance(z.getKey())).
				map(z -> (LazyRule)z.getKey()).filter(z->name.equals(z.getName())).
				collect(Collectors.toList());		
	}
	
	private List<StaticHelper> checkIsStaticHelper(String name) {
		return callableElementsReturnType.entrySet().stream().
				filter(z -> StaticHelper.class.isInstance(z.getKey())).
				map(z -> (StaticHelper)z.getKey()).filter(z->name.equals(ATLUtils.getHelperName(z))).
				collect(Collectors.toList());		
	}
		
	private List<ContextHelper> checkIsContextHelper(String name) {
		return callableElementsContextType.entrySet().stream().
				filter(z -> ContextHelper.class.isInstance(z.getKey())).
				map(z -> (ContextHelper)z.getKey()).
				filter(z-> Operation.class.isInstance(z.getDefinition().getFeature()) &&
						name.equals(((Operation)z.getDefinition().getFeature()).getName())).
				collect(Collectors.toList());
	}

	private String isContainerContextHelper(EObject e) {
		if (e instanceof ContextHelper)
			return ((ContextHelper)e).getDefinition().getContext_().getContext_().getName();
		if (e.eContainer() == null)
			return null;
		return isContainerContextHelper(e.eContainer());
		
	}
		
	private Class getClassFromName(String name){
		Class klass;
		try {
			klass = rootOut.getClasses().stream().filter(z -> name.equals(z.getName())).
					findAny().orElseThrow(()-> new Exception());
			return klass;
		} catch (Exception e) {
			klass = MM_uncertaintyFactory.eINSTANCE.createClass();
			klass.setName(name);
			rootOut.getClasses().add(klass);
			return klass;
		}
	}
	@Override
	public VisitingActions preMatchedRule(MatchedRule self) {
		return actions("inPattern","outPattern");
	}
	@Override
	public VisitingActions preIteratorExp(IteratorExp self) {
		return actions("source", "iterators", "body");
	}

	@Override
	public VisitingActions preOperationCallExp(OperationCallExp self) {
		return actions("source","arguments");
	}
	@Override
	public void beforeIntegerType(IntegerType self) {
		Feature f = MM_uncertaintyFactory.eINSTANCE.createFeature();
		Attribute a = MM_uncertaintyFactory.eINSTANCE.createAttribute();
		a.getType().add(integerDt);
		f.getHasType().add(a);
		oclComputedTypeMap.put(self, f);
	}
	@Override
	public void beforeRealType(RealType self) {
		Feature f = MM_uncertaintyFactory.eINSTANCE.createFeature();
		Attribute a = MM_uncertaintyFactory.eINSTANCE.createAttribute();
		a.getType().add(realDt);
		f.getHasType().add(a);
		oclComputedTypeMap.put(self, f);
	}
	@Override
	public void beforeBooleanType(BooleanType self) {
		Feature f = MM_uncertaintyFactory.eINSTANCE.createFeature();
		Attribute a = MM_uncertaintyFactory.eINSTANCE.createAttribute();
		a.getType().add(boolDt);
		f.getHasType().add(a);
		oclComputedTypeMap.put(self, f);
	}
	@Override
	public void beforeStringType(StringType self) {
		Feature f = MM_uncertaintyFactory.eINSTANCE.createFeature();
		Attribute a = MM_uncertaintyFactory.eINSTANCE.createAttribute();
		a.getType().add(stringDt);
		f.getHasType().add(a);
		oclComputedTypeMap.put(self, f);
	}
	@Override
	public void inSequenceType(SequenceType self) {
		Feature f = MM_uncertaintyFactory.eINSTANCE.createFeature();
		f.setMax(TypeUtils.createMany());
		if (self.getElementType() instanceof OclModelElement){
			OclModelElement temp = (OclModelElement) self.getElementType();
			if(rootOut.getClasses().stream().anyMatch(z -> temp.getName().equals(z.getName()))){
				Reference r = MM_uncertaintyFactory.eINSTANCE.createReference();
				Class c = getClassFromName(temp.getName());
				r.getTarget().add(c);
				f.getHasType().add(r);
			}
		}
		else {
			f = (Feature) oclComputedTypeMap.get(self.getElementType());
		}
		oclComputedTypeMap.put(self, f);
	}
	
	private Map<String, MM_uncertainty.Enum> stringToEnum = new HashMap<>();
	
	@Override
	public void inEnumLiteralExp(EnumLiteralExp self) {
		// TODO: Faking enum literals with strings is not a good idea
		Feature f = MM_uncertaintyFactory.eINSTANCE.createFeature();
		Attribute a = MM_uncertaintyFactory.eINSTANCE.createAttribute();
		
		// TODO: This is just wrong. We can't do this right because
		// in ATL there is no way to get the enum name.
		String enumName = "?";
		// The code generator will check if the name is '?' and avoid checking the name
		if ( ! stringToEnum.containsKey(enumName) ) {
			MM_uncertainty.Enum enum_ = MM_uncertaintyFactory.eINSTANCE.createEnum();
			enum_.setName(enumName);
			stringToEnum.put(enumName, enum_);
			this.rootOut.getDataType().add(enum_);
		}
		
		MM_uncertainty.Enum dtEnum = stringToEnum.get(enumName);
				
		a.getType().add(dtEnum);
		f.getHasType().add(a);
		oclComputedTypeMap.put(self, f);		
	}
	
	@Override
	public void beforeNavigationOrAttributeCallExp(NavigationOrAttributeCallExp self) {
		Feature f;
		List<anatlyzer.atlext.OCL.OclFeature> l = checkIsAttribute(self.getName());
		if(l.size() == 0) {
			f = MM_uncertaintyFactory.eINSTANCE.createFeature();
			f.setName(self.getName());
			oclComputedTypeMap.put(self, f);				
		}
//		else 
//			for (anatlyzer.atlext.OCL.OclFeature i : l) {
//				//oclComputedTypeMap.put(self, oclComputedTypeMap.get(i.getType()));
//				//System.out.println(oclComputedTypeMap.get(i.getType()));
//			}
	}
	@Override
	public void inNavigationOrAttributeCallExp(NavigationOrAttributeCallExp self) {
		Object sourceType;
		if(self.getSource() instanceof VariableExp)
			sourceType = oclComputedTypeMap.get(((VariableExp)self.getSource()).getReferredVariable());
		else 
			sourceType = oclComputedTypeMap.get(self.getSource());
		Object navigationType = oclComputedTypeMap.get(self);
		///NEW
		List<anatlyzer.atlext.OCL.OclFeature> attrs = checkIsAttribute(self.getName());
		if(attrs.size() != 0){
			List<Object> lAttr = getAttributeValue(self.getName());
			for (Object object : lAttr) {
				oclComputedTypeMap.put(self, oclComputedTypeMap.get(object));
			}
		}
		else {
			if (sourceType instanceof Feature) {
				if(navigationType!=null) {
					Feature feat = (Feature) sourceType;
					Reference ref = null;
					for (FeatureType attribute : feat.getHasType()) {
						if(attribute instanceof Reference)
							ref = (Reference) attribute;
					}
					if(ref == null) {
						ref = MM_uncertaintyFactory.eINSTANCE.createReference();
						feat.getHasType().add(ref);
						oclComputedTypeMap.put(self,navigationType);
					} 
					else {
						
						if (ref.getTarget().size()!=0) {
							Class c = ref.getTarget().get(0);
							if(navigationType instanceof Feature) {
								Feature a = checkIsPresent(((Feature) navigationType).getName(), c);
								if(a == null) {
									c.getFeats().add((Feature) navigationType);
									// jesusc: This assignment is to make sure that a is not null when put in the oclComputedTypeMap
									a = (Feature) navigationType;
								}
								oclComputedTypeMap.put(self, a);
							}
						}
					}
				}
			}
			if (sourceType instanceof Class) {
				if(checkIsAttribute(self.getName()).size() == 0) {
					Feature a = checkIsPresent(self.getName(), (Class) sourceType); 
					Class tempClass = getClassFromName(((Class) sourceType).getName());
					if(a == null && navigationType instanceof Feature)
						a = (Feature) navigationType;
					tempClass.getFeats().add(a);
					oclComputedTypeMap.put(self, a);
				}
			}
		}
		///END
	}
	@Override
	public void inIteratorExp(IteratorExp self) {
		Object sourceType = oclComputedTypeMap.get(self.getSource()) ;
		if(sourceType instanceof Feature) {
			((Feature) sourceType).setMax(TypeUtils.createMany());
		}
		if(self.getName().equals("select") || self.getName().equals("reject")) {
			oclComputedTypeMap.put(self, oclComputedTypeMap.get(self.getSource()));
		}
		if(self.getName().equals("sortedBy")) {
			oclComputedTypeMap.put(self, oclComputedTypeMap.get(self.getSource()));
		}
		if(self.getName().equals("collect")){
			oclComputedTypeMap.put(self, oclComputedTypeMap.get(self.getBody()));
		}
	}
		
	@Override
	public void beforeVariableExp(VariableExp self) {
//		if (self.getReferredVariable().getVarName().equals("self")) {
//			String name = isContainerContextHelper(self);
//			if(name != null){
//				Class klass = getClassFromName(name);
//				oclComputedTypeMap.put(self.getReferredVariable(), klass);
//			}
//		}
//		else if(self.getReferredVariable().getVarName().equals("thisModule")) {
//			//System.out.println("PRINT: THIS MODULE");
//		}
//		else {
//			oclComputedTypeMap.put(self, oclComputedTypeMap.get(self.getReferredVariable()));
//		}
	}
	
	@Override
	public void beforeStringExp(StringExp self) {
		Attribute attr = MM_uncertaintyFactory.eINSTANCE.createAttribute();
		attr.getType().add(stringDt);
		Feature f = MM_uncertaintyFactory.eINSTANCE.createFeature();
		f.getHasType().add(attr);
		oclComputedTypeMap.put(self, f);
	}
	@Override
	public void beforeIntegerExp(IntegerExp self) {
		Attribute attr = MM_uncertaintyFactory.eINSTANCE.createAttribute();
		attr.getType().add(integerDt);
		Feature f = MM_uncertaintyFactory.eINSTANCE.createFeature();
		f.getHasType().add(attr);
		oclComputedTypeMap.put(self, f);
	}
	@Override
	public void beforeRealExp(RealExp self) {
		Attribute attr = MM_uncertaintyFactory.eINSTANCE.createAttribute();
		attr.getType().add(realDt);
		Feature f = MM_uncertaintyFactory.eINSTANCE.createFeature();
		f.getHasType().add(attr);
		oclComputedTypeMap.put(self, f);
	}
	@Override
	public void beforeCollectionOperationCallExp(CollectionOperationCallExp self) {
		Feature f = MM_uncertaintyFactory.eINSTANCE.createFeature();
		if(self.getOperationName().equals("size")){
			Attribute attr = MM_uncertaintyFactory.eINSTANCE.createAttribute();
			attr.getType().add(integerDt);
			f.getHasType().add(attr);
		}
		oclComputedTypeMap.put(self, f);
	}
	@Override
	public void inCollectionOperationCallExp(CollectionOperationCallExp self) {
		Object type = oclComputedTypeMap.get(self.getSource()) ;
		if(type instanceof Feature)
			((Feature)type).setMax(TypeUtils.createMany());
		Feature f =  MM_uncertaintyFactory.eINSTANCE.createFeature();
		if(self.getOperationName().equals("size")){
			Attribute attr = MM_uncertaintyFactory.eINSTANCE.createAttribute();
			attr.getType().add(integerDt);
			f.getHasType().add(attr);
		}
		if(self.getOperationName().equals("flatten")){
			if (oclComputedTypeMap.get(self.getSource()) instanceof Feature) {
				f = (Feature) oclComputedTypeMap.get(self.getSource());
				f.setMax(TypeUtils.createMany());
			}
		}
		oclComputedTypeMap.put(self, f);
	}
	@Override
	public void beforeOclModelElement(OclModelElement self) {
		if(outputMetamodels.contains(self.getModel().getName())){
			Class c = getClassFromName(self.getName());
			oclComputedTypeMap.put(self, c);
		}
	}
	@Override
	public void inOperationCallExp(OperationCallExp self) {
		if(self.getOperationName().equals("union")){
			Feature f = MM_uncertaintyFactory.eINSTANCE.createFeature();
			f.setMax(TypeUtils.createMany());
			oclComputedTypeMap.put(self, f);
		}
	}
	@Override
	public void beforeOperationCallExp(OperationCallExp self) {
//		if(self.getOperationName().equals("allInstances")) {
//			OclModelElement ome = (OclModelElement) self.getSource();
//			oclComputedTypeMap.put(self, getClassFromName(ome.getName()));
//		}
		if(self.getOperationName().equals("toString")) {
			Feature f = MM_uncertaintyFactory.eINSTANCE.createFeature();
			Attribute attr = MM_uncertaintyFactory.eINSTANCE.createAttribute();
			attr.getType().add(stringDt);
			f.getHasType().add(attr);
			oclComputedTypeMap.put(self, f);
		}
		
		if(checkIsAttribute(self.getOperationName()).size() != 0) {
			List<Object> lAttr = getAttributeValue(self.getOperationName());
			for (Object object : lAttr) {
				oclComputedTypeMap.put(self, oclComputedTypeMap.get(object));
			}
		}
		if(self.getOperationName().equals("union")){
			Feature f = MM_uncertaintyFactory.eINSTANCE.createFeature();
			f.setMax(TypeUtils.createMany());
			oclComputedTypeMap.put(self, f);
		}
		
		List<LazyRule> lr = checkIsLazyRule(self.getOperationName()); 
		if(lr.size()!=0) {
			for (LazyRule lazyRule : lr) {
				OutPatternElement l = lazyRule.getOutPattern().getElements().get(0);
				oclComputedTypeMap.put(self, oclComputedTypeMap.get(l));
			}
			
		}
		
		List<StaticHelper> staticHelpers = checkIsStaticHelper(self.getOperationName());
		if(staticHelpers.size()!=0) {
			for (StaticHelper h : staticHelpers) {
				OclType t = ATLUtils.getHelperReturnType(h);
				if ( t instanceof OclModelElement ) {
					Class klass = getClassFromName(t.getName());
					oclComputedTypeMap.put(self, klass);
				}
				else {
					throw new UnsupportedOperationException("TODO: Handle data types");
				}
			}		
		}
		
		
		List<ContextHelper> ch = checkIsContextHelper(self.getOperationName());
		if(ch.size() != 0) {
		//TODO
		}
	}
	
	@Override
	public void inOperatorCallExp(OperatorCallExp self) {
		String opName = self.getOperationName();
		Object sourceType = oclComputedTypeMap.get(self.getSource());
		Feature feat = MM_uncertaintyFactory.eINSTANCE.createFeature();
		Attribute featAttrType = MM_uncertaintyFactory.eINSTANCE.createAttribute();
		feat.getHasType().add(featAttrType);
		boolean stringFound = false;
		boolean realFound = false;
		switch (opName) {
			case "and":
			case "or":
				for (OclExpression oclExpression : self.getArguments()) {
					Object argumentsTypeAnd = oclComputedTypeMap.get(oclExpression);
					if(argumentsTypeAnd instanceof Feature)
						if(((Feature) argumentsTypeAnd).getHasType() instanceof Attribute){
							Attribute attrType = (Attribute) ((Feature) argumentsTypeAnd).getHasType();
							attrType.getType().clear();
							attrType.getType().add(boolDt);
							featAttrType.getType().clear();
						}
						else {
							Attribute attrType = MM_uncertaintyFactory.eINSTANCE.createAttribute();
							((Feature) argumentsTypeAnd).getHasType().clear();
							attrType.getType().add(boolDt);
						}
				}
				if(sourceType instanceof Feature) 
					if(((Feature) sourceType).getHasType() instanceof Attribute){
						Attribute attrType = (Attribute) ((Feature) sourceType).getHasType();
						attrType.getType().clear();
						attrType.getType().add(boolDt);
					}
					else {
						Attribute attrType = MM_uncertaintyFactory.eINSTANCE.createAttribute();
						((Feature) sourceType).getHasType().clear();
						attrType.getType().add(boolDt);
					}
				featAttrType.getType().add(boolDt);
				if(feat.getHasType().size()==0 &&
						isStricktThan(featAttrType, feat.getHasType())){
					feat.getHasType().clear();
					feat.getHasType().add(featAttrType);			
				}
				break;
			case "+":
				
				for (OclExpression oclExpression : self.getArguments()) {
					Object argumentsTypePlus = oclComputedTypeMap.get(oclExpression);
					if(argumentsTypePlus instanceof Feature) 
						if(((Feature) argumentsTypePlus).getHasType() instanceof Attribute){
							Attribute attrType = (Attribute) ((Feature) argumentsTypePlus).getHasType();
							if(!attrType.getType().contains(stringDt)) attrType.getType().add(stringDt);
							else stringFound = true;
							if(!attrType.getType().contains(realDt)) attrType.getType().add(realDt);
							else realFound = true;
							if(!attrType.getType().contains(integerDt)) attrType.getType().add(integerDt);
							
						}
						else {
							Attribute attrType = MM_uncertaintyFactory.eINSTANCE.createAttribute();
							((Feature) argumentsTypePlus).getHasType().clear();
							((Feature) argumentsTypePlus).getHasType().add(attrType);
							if(!attrType.getType().contains(stringDt)) attrType.getType().add(stringDt);
							if(!attrType.getType().contains(realDt)) attrType.getType().add(realDt);
							if(!attrType.getType().contains(integerDt)) attrType.getType().add(integerDt);
						}
				}
				if(sourceType instanceof Feature) 
					if(((Feature) sourceType).getHasType() instanceof Attribute){
						Attribute attrType = (Attribute) ((Feature) sourceType).getHasType();
						if(!attrType.getType().contains(stringDt)) attrType.getType().add(stringDt);
						else stringFound = true;
						if(!attrType.getType().contains(realDt)) attrType.getType().add(realDt);
						else realFound = true;
						if(!attrType.getType().contains(integerDt)) attrType.getType().add(integerDt);
					}
					else {
						Attribute attrType = MM_uncertaintyFactory.eINSTANCE.createAttribute();
						((Feature) sourceType).getHasType().clear();
						((Feature) sourceType).getHasType().add(attrType);
						if(!attrType.getType().contains(stringDt)) attrType.getType().add(stringDt);
						if(!attrType.getType().contains(realDt)) attrType.getType().add(realDt);
						if(!attrType.getType().contains(integerDt)) attrType.getType().add(integerDt);
					}
				if(stringFound)
					featAttrType.getType().add(stringDt);
				else {
					if(realFound) featAttrType.getType().add(realDt);
					else {
						featAttrType.getType().add(stringDt);
						featAttrType.getType().add(realDt);
						featAttrType.getType().add(integerDt);
					}
				}
				if(feat.getHasType().size()==0 &&
						isStricktThan(featAttrType, feat.getHasType())){
					feat.getHasType().clear();
					feat.getHasType().add(featAttrType);			
				}
				break;
			case "=":
				OclExpression oclExpressionArgument = self.getArguments().get(0);
				Object argumentsTypeEquals = oclComputedTypeMap.get(oclExpressionArgument);
				mergeType(sourceType, argumentsTypeEquals);
				feat.getHasType().clear();
				featAttrType.getType().add(boolDt);
				feat.getHasType().add(featAttrType);
				break;
			case "-":
			case "*":
				
				for (OclExpression oclExpression : self.getArguments()) {
					Object argumentsTypeLess = oclComputedTypeMap.get(oclExpression);
					if(argumentsTypeLess instanceof Feature)
						if(((Feature) argumentsTypeLess).getHasType() instanceof Attribute){
							Attribute attrType = (Attribute) ((Feature) argumentsTypeLess).getHasType();
							if(!attrType.getType().contains(realDt)) attrType.getType().add(realDt);
							else realFound = true;
							if(!attrType.getType().contains(integerDt)) attrType.getType().add(integerDt);
						}
						else {
							Attribute attrType = MM_uncertaintyFactory.eINSTANCE.createAttribute();
							((Feature) argumentsTypeLess).getHasType().clear();
							((Feature) argumentsTypeLess).getHasType().add(attrType);
							if(!attrType.getType().contains(realDt)) attrType.getType().add(realDt);
							if(!attrType.getType().contains(integerDt)) attrType.getType().add(integerDt);
						}
				}
				if(sourceType instanceof Feature) 
					if(((Feature) sourceType).getHasType() instanceof Attribute){
						Attribute attrType = (Attribute) ((Feature) sourceType).getHasType();
						if(!attrType.getType().contains(realDt)) attrType.getType().add(realDt);
						if(!attrType.getType().contains(integerDt)) attrType.getType().add(integerDt);
					}
					else {
						Attribute attrType = MM_uncertaintyFactory.eINSTANCE.createAttribute();
						((Feature) sourceType).getHasType().clear();
						((Feature) sourceType).getHasType().add(attrType);
						if(!attrType.getType().contains(realDt)) attrType.getType().add(realDt);
						else realFound = true;
						if(!attrType.getType().contains(integerDt)) attrType.getType().add(integerDt);
					}
				if(realFound) featAttrType.getType().add(realDt);
				else {
					featAttrType.getType().add(stringDt);
					featAttrType.getType().add(realDt);
					featAttrType.getType().add(integerDt);
				}
				if(feat.getHasType().size()==0 &&
						isStricktThan(featAttrType, feat.getHasType())){
					feat.getHasType().clear();
					feat.getHasType().add(featAttrType);			
				}
				break;
			default:
				break;
		}
		feat.getHasType().add(featAttrType);
		oclComputedTypeMap.put(self, feat);
		

	}
	private List<FeatureType> mergeType(Object sourceType, Object argumentsTypeEquals) {
		List<FeatureType> result = new ArrayList<FeatureType>();
		if(sourceType instanceof Feature && argumentsTypeEquals instanceof Feature) {
			if(((Feature)sourceType).getHasType().size() == 0)
				((Feature)sourceType).getHasType().addAll(((Feature)argumentsTypeEquals).getHasType());
			if(((Feature)argumentsTypeEquals).getHasType().size() == 0)
				((Feature)argumentsTypeEquals).getHasType().addAll(((Feature)sourceType).getHasType());	
			result.addAll(((Feature)sourceType).getHasType());
			result.addAll(((Feature)argumentsTypeEquals).getHasType());
		}
		if(sourceType instanceof Class && argumentsTypeEquals instanceof Feature) {
			Reference ref = ((Feature)argumentsTypeEquals).getHasType().stream().
					filter(z -> Reference.class.isInstance(z)).map(z -> (Reference)z).findAny().
					orElse(MM_uncertaintyFactory.eINSTANCE.createReference());
			ref.getTarget().add((Class) sourceType);
			if  (!checkReference((Feature) argumentsTypeEquals, (Class) sourceType))
				((Feature)argumentsTypeEquals).getHasType().add(ref);
			result.add(ref);
			result.addAll(((Feature)argumentsTypeEquals).getHasType());
				
		}
		if(sourceType instanceof Feature && argumentsTypeEquals instanceof Class) {
			Reference ref = ((Feature)sourceType).getHasType().stream().
					filter(z -> Reference.class.isInstance(z)).map(z -> (Reference)z).findAny().
					orElse(MM_uncertaintyFactory.eINSTANCE.createReference());
			ref.getTarget().add((Class) argumentsTypeEquals);
			result.add(ref);
			result.addAll(((Feature)sourceType).getHasType());
			if  (!checkReference((Feature) sourceType, (Class) argumentsTypeEquals))
				((Feature)sourceType).getHasType().add(ref);
		}
		if(sourceType instanceof Class && argumentsTypeEquals instanceof Class) {
			if (sourceType == argumentsTypeEquals){
				Reference ref = MM_uncertaintyFactory.eINSTANCE.createReference();
				ref.getTarget().add((Class) argumentsTypeEquals);
				result.add(ref);
			}
		}
		
		return result;
	}
	private boolean checkReference(Feature argumentsTypeEquals, Class sourceType) {
		return argumentsTypeEquals.getHasType().stream().filter(z -> Reference.class.isInstance(z)).
			map(z -> (Reference)z).anyMatch(z -> z.getTarget().contains(sourceType));
	}
	private boolean isStricktThan(Attribute featAttrType, EList<FeatureType> hasType) {
		for (FeatureType featureType : hasType) {
			if (featAttrType instanceof Attribute)
			if(featAttrType.getType().size() < ((Attribute)featureType).getType().size())
				return true;
		}
		return false;
	}
	@Override
	public void inSequenceExp(SequenceExp self) {
		computeCollectionLiteralExp(self);
	}
	
	@Override
	public void inSetExp(SetExp self) {
		computeCollectionLiteralExp(self);
	}
	
	private void computeCollectionLiteralExp(CollectionExp self) {
		Feature f = MM_uncertaintyFactory.eINSTANCE.createFeature();
		f.setMax(TypeUtils.createMany());
		for (OclExpression string : self.getElements()) {
			if(oclComputedTypeMap.get(string) instanceof Class){
				Class tempFeat = (Class) oclComputedTypeMap.get(string);
				Reference r = f.getHasType().stream().
						filter(z -> Reference.class.isInstance(z)).
						map(z -> (Reference)z).findAny().
						orElse(MM_uncertaintyFactory.eINSTANCE.createReference());
				if (!r.getTarget().contains(tempFeat)) r.getTarget().add((Class) oclComputedTypeMap.get(string));
				f.getHasType().add(r);
			}if (oclComputedTypeMap.get(string) instanceof Feature) {
				Feature tempFeat = (Feature) oclComputedTypeMap.get(string);
				Set<DataType> set = tempFeat.getHasType().stream().filter(z-> Attribute.class.isInstance(z)).map(z -> (Attribute)z)
					.flatMap(z -> z.getType().stream()).collect(Collectors.toSet());
				if (!set.isEmpty()) {
					Attribute attribute = f.getHasType().stream().
							filter(z -> Attribute.class.isInstance(z)).
							map(z -> (Attribute)z).findAny().
							orElse(MM_uncertaintyFactory.eINSTANCE.createAttribute());
					attribute.getType().addAll(set);
					f.getHasType().add(attribute);
				}
			}
		}
		oclComputedTypeMap.put(self, f);
	}

	@Override
	public void beforeIterator(Iterator self) {
		Object t = oclComputedTypeMap.get(((LoopExp)self.eContainer()).getSource());
		oclComputedTypeMap.put(self, t);
	}
	
}

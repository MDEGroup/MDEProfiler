package org.miso_disim.requirementmetamodel.reduce;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

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
import MM_uncertainty.Number;
import MM_uncertainty.Real_;
import MM_uncertainty.Reference;
import MM_uncertainty.String_;
import MM_uncertainty.UBoolean;
import MM_uncertainty.UnknowClass;
import anatlyzer.atl.model.ATLModel;
import anatlyzer.atl.util.ATLSerializer;
import anatlyzer.atlext.ATL.Callable;
import anatlyzer.atlext.ATL.ContextHelper;
import anatlyzer.atlext.ATL.LazyRule;
import anatlyzer.atlext.ATL.MatchedRule;
import anatlyzer.atlext.ATL.Module;
import anatlyzer.atlext.ATL.OutPatternElement;
import anatlyzer.atlext.OCL.BooleanType;
import anatlyzer.atlext.OCL.CollectionOperationCallExp;
import anatlyzer.atlext.OCL.IfExp;
import anatlyzer.atlext.OCL.IntegerExp;
import anatlyzer.atlext.OCL.IntegerType;
import anatlyzer.atlext.OCL.Iterator;
import anatlyzer.atlext.OCL.IteratorExp;
import anatlyzer.atlext.OCL.LetExp;
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
import anatlyzer.atlext.OCL.StringExp;
import anatlyzer.atlext.OCL.StringType;
import anatlyzer.atlext.OCL.VariableExp;
import anatlyzer.atlext.processing.AbstractVisitor;
import anatlyzer.atlext.processing.AbstractVisitor.VisitingActions;

public class InputMetamodelVisitor extends AbstractVisitor {

	Metamodel rootIn = MM_uncertaintyFactory.eINSTANCE.createMetamodel();
	private List<String> inputMetamodels = new ArrayList<String>();
	private List<String> outputMetamodels = new ArrayList<String>();
	//HashMap<String, Class> klassHashMap = new HashMap<String, Class>();
	private HashMap<Object, OclType> callableElementsContextType;
	private String_ stringDt = MM_uncertaintyFactory.eINSTANCE.createString_();
	private Integer_ integerDt = MM_uncertaintyFactory.eINSTANCE.createInteger_();
	private Real_ realDt = MM_uncertaintyFactory.eINSTANCE.createReal_();
	private Boolean_ boolDt = MM_uncertaintyFactory.eINSTANCE.createBoolean_();
	private HashMap<Object, Object> oclComputedTypeMap = new HashMap<Object, Object>();
	private HashMap<Callable, OclType> callableElementsReturnType;
	
	public Metamodel getRootIn() {
		this.rootIn.getDataType().add(stringDt);
		this.rootIn.getDataType().add(integerDt);
		this.rootIn.getDataType().add(realDt);
		this.rootIn.getDataType().add(boolDt);
		
		// This is to ensure that all classes have mandatoryAllowed = true
		this.rootIn.getClasses().forEach(c -> c.setMandatoryAllowed(true));
		this.rootIn.getClasses().forEach(c -> { 
			//We never set isAbstract to true explicitly... it is difficult 
			// if ( UBoolean.TRUE.equals(c.getIsAbstract()) )
				c.setSubsAllowed(true);
		});
		
		return rootIn;
	}
	public HashMap<Object, Object> getOclComputedTypeMap() {
		return oclComputedTypeMap;
	}
	public void setOclComputedTypeMap(HashMap<Object, Object> oclComputedTypeMap) {
		this.oclComputedTypeMap = oclComputedTypeMap;
	}
	
	public void perform(ATLModel model, HashMap<Object, OclType> callableElements,
			HashMap<Callable, OclType> callableElementsReturnType, Metamodel rootIn, HashMap<Object, Object> oclComputedType) {
		this.callableElementsContextType = callableElements;
		this.callableElementsReturnType = callableElementsReturnType;
		this.rootIn = rootIn;
		this.oclComputedTypeMap = oclComputedType;
		this.rootIn.getDataType().add(stringDt);
		this.rootIn.getDataType().add(integerDt);
		this.rootIn.getDataType().add(realDt);
		this.rootIn.getDataType().add(boolDt);
		if(model.getRoot() instanceof Module){
			for(OclModel inModels: ((Module) model.getRoot()).getInModels())
				inputMetamodels.add(inModels.getMetamodel().getName());
			for(OclModel inModels: ((Module) model.getRoot()).getOutModels())
				outputMetamodels.add(inModels.getMetamodel().getName());
		}
			
		startVisiting(model.getRoot());
	}
	private Feature checkIsPresent(String name, Class klass) {
		return klass.getFeats().stream().filter(x->x.getName().equals(name)).findAny().orElse(null);
	}
	private List<anatlyzer.atlext.OCL.OclFeature> checkIsAttribute(String name) {
		List<anatlyzer.atlext.OCL.OclFeature> result = 
			callableElementsContextType.entrySet().stream().
				filter(z -> anatlyzer.atlext.OCL.Attribute.class.isInstance(z.getKey())).
				map(z -> (anatlyzer.atlext.OCL.Attribute) z.getKey()).
				filter(z->name.equals(z.getName())).
				collect(Collectors.toList());
		result.addAll(callableElementsContextType.entrySet().stream().
				filter(z -> ContextHelper.class.isInstance(z.getKey())).
				map(z -> (ContextHelper) z.getKey()).
				filter( z-> Operation.class.isInstance(z.getDefinition().getFeature()) &&
						name.equals(((Operation)z.getDefinition().getFeature()).getName())).
				map(z -> (Operation)z.getDefinition().getFeature()).
				collect(Collectors.toList()));
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
							if(op.getName().equals(name))
									result.add(pair.getValue());
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
	@Override
	public void inLetExp(LetExp self) {
		System.out.println(self);
	}
	private Class getClassFromName(String name){
		
		Class klass;
		try {
			klass = rootIn.getClasses().stream().filter(z -> name.equals(z.getName())).
					findAny().orElseThrow(()-> new Exception());
			return klass;
		} catch (Exception e) {
			klass = MM_uncertaintyFactory.eINSTANCE.createClass();
			klass.setMandatoryAllowed(true);
			klass.setName(name);
			rootIn.getClasses().add(klass);
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
	public VisitingActions preIfExp(IfExp self) {
		return actions("type", 
				method("openIfScope", self),
				"condition", 
				"thenExpression" , 
				method("openElseScope", self), 
				"elseExpression",
				method("closeIfElseScope", self));
	}	

	private HashMap<String, Class> kindsOfs = new HashMap<String, Class>();
	
	public void openIfScope(IfExp self) {
		if ( self.getCondition() instanceof OperationCallExp && ((OperationCallExp) self.getCondition()).getOperationName().equals("oclIsKindOf")) {
			OperationCallExp exp = (OperationCallExp) self.getCondition();
			OclModelElement m = (OclModelElement) exp.getArguments().get(0);
			Class c = getClassFromName(m.getName());
		
			String expId = computeExprId(exp.getSource());
			kindsOfs.put(expId, c);			
		}
		
	}

	public void openElseScope(IfExp self) {
		// TODO: Reverse the current scope
	}


	public void closeIfElseScope(IfExp self) {
		if ( self.getCondition() instanceof OperationCallExp && ((OperationCallExp) self.getCondition()).getOperationName().equals("oclIsKindOf")) {
			OperationCallExp exp = (OperationCallExp) self.getCondition();
			String expId = computeExprId(exp.getSource());
			kindsOfs.remove(expId);
		}
	}
	private String computeExprId(OclExpression oclExpression) {
		return ATLSerializer.serialize(oclExpression);
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
			Reference r = MM_uncertaintyFactory.eINSTANCE.createReference();
			Class c = getClassFromName(temp.getName());
			r.getTarget().add(c);
			f.getHasType().add(r);
		}
		else {
			f = (Feature) oclComputedTypeMap.get(self.getElementType());
		}
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
			//TODO
//			for (anatlyzer.atlext.OCL.OclFeature i : l)
	}
	@Override
	public void inNavigationOrAttributeCallExp(NavigationOrAttributeCallExp self) {
		Object sourceType;
		sourceType = (self.getSource() instanceof VariableExp)?
				oclComputedTypeMap.get(((VariableExp)self.getSource()).getReferredVariable()): 
				oclComputedTypeMap.get(self.getSource());
			
		// Check if there is an implicit casting due to an if expression 		
		String exprId = computeExprId(self.getSource());		
		if ( this.kindsOfs.containsKey(exprId) ) {
			sourceType = this.kindsOfs.get(exprId);
		}
		
		Object navigationType = oclComputedTypeMap.get(self);
		List<anatlyzer.atlext.OCL.OclFeature> attrs = checkIsAttribute(self.getName());
		if(attrs.size() == 0 || EcoreUtil.isAncestor(attrs, self)){
			if (sourceType instanceof Feature) {
				if(navigationType!=null) {
					Feature feat = (Feature) sourceType;
					Reference ref = (Reference) feat.getHasType().stream().
							filter(z -> Reference.class.isInstance(z)).findAny().orElse(null);
					if(ref == null) {
						ref = MM_uncertaintyFactory.eINSTANCE.createReference();
						feat.getHasType().add(ref);
						UnknowClass unkClass = TypeUtils.createUnknownClass();
						unkClass.setMandatoryAllowed(true);
						unkClass.setIsAbstract(UBoolean.DONT_KNOW);
						unkClass.getFeats().add((Feature) navigationType);
						rootIn.getClasses().add(unkClass);
						ref.getTarget().add(unkClass);
						oclComputedTypeMap.put(self,navigationType);
					} else {
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
				
				Feature a = checkIsPresent(self.getName(), (Class) sourceType); 
				Class tempClass = getClassFromName(((Class) sourceType).getName());
				if(a == null && navigationType instanceof Feature)
					a = (Feature) navigationType;
				if(a == null && navigationType == null) {
					a = MM_uncertaintyFactory.eINSTANCE.createFeature();
					a.setName(self.getName());
					oclComputedTypeMap.put(self, a);	
				}
				tempClass.getFeats().add(a);
				oclComputedTypeMap.put(self, a);
				
			}
		}
	}
	@Override
	public void inIteratorExp(IteratorExp self) {
		System.out.println(self.getLocation());
		Object sourceType = oclComputedTypeMap.get(self.getSource()) ;
		if(sourceType instanceof Feature) {
			((Feature) sourceType).setMax(TypeUtils.createMany());
		}
		if(self.getName().equals("select")) {
			if(self.getBody() instanceof OperationCallExp) {
				OperationCallExp temp = (OperationCallExp) self.getBody();
				if (temp.getOperationName().equals("oclIsKindOf"))
					oclComputedTypeMap.put(self, oclComputedTypeMap.get(self.getBody()));
			}
			else
				oclComputedTypeMap.put(self, oclComputedTypeMap.get(self.getSource()));
		}
		if(self.getName().equals("sortedBy")) {
			oclComputedTypeMap.put(self, oclComputedTypeMap.get(self.getSource()));
		}
		if(self.getName().equals("collect")){
			oclComputedTypeMap.put(self, oclComputedTypeMap.get(self.getBody()));
		}

		if(self.getName().equals("reject")) {
			if ( oclComputedTypeMap.get(self.getSource()) instanceof Feature){
				Feature source = (Feature) oclComputedTypeMap.get(self.getSource());
				if (!(source.getMax() instanceof Many)) {
					Many many = MM_uncertaintyFactory.eINSTANCE.createMany();
					source.setMax(many);
				}
				oclComputedTypeMap.put(self, source);
			}
			if ( oclComputedTypeMap.get(self.getSource()) instanceof Class){
				Class source = (Class) oclComputedTypeMap.get(self.getSource());
				oclComputedTypeMap.put(self, source);
			}
		}
	}
		
	@Override
	public void beforeVariableExp(VariableExp self) {
		if (self.getReferredVariable().getVarName().equals("self")) {
			String name = isContainerContextHelper(self);
			if(name != null){
				Class klass = getClassFromName(name);
				oclComputedTypeMap.put(self.getReferredVariable(), klass);
			}
		}
		else if(self.getReferredVariable().getVarName().equals("thisModule")) {
			//System.out.println("PRINT: THIS MODULE");
		}
		else {
			oclComputedTypeMap.put(self, oclComputedTypeMap.get(self.getReferredVariable()));
		}
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
		if (oclComputedTypeMap.get(self.getSource()) instanceof Feature) {
			f = (Feature) oclComputedTypeMap.get(self.getSource());
			f.setMax(TypeUtils.createMany());
		}
		oclComputedTypeMap.put(self, f);
	}
	@Override
	public void beforeOclModelElement(OclModelElement self) {
		if(inputMetamodels.contains(self.getModel().getName())){
			Class c = getClassFromName(self.getName());
			oclComputedTypeMap.put(self, c);
		}
	}
	@Override
	public void beforeOperationCallExp(OperationCallExp self) {
		if(self.getOperationName().equals("allInstances")) {
			OclModelElement ome = (OclModelElement) self.getSource();
			oclComputedTypeMap.put(self, getClassFromName(ome.getName()));
		}
		
		if ( self.getOperationName().equals("oclIsKindOf") || self.getOperationName().equals("oclIsTypeOf")) {
			OclModelElement ome = (OclModelElement) self.getArguments().get(0);
			oclComputedTypeMap.put(self, getClassFromName(ome.getName()));			
			return;
		}
		
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
		
		
		List<LazyRule> lr = checkIsLazyRule(self.getOperationName()); 
		if(lr.size()!=0) {
			for (LazyRule lazyRule : lr) {
				OutPatternElement l = lazyRule.getOutPattern().getElements().get(0);
				oclComputedTypeMap.put(self, oclComputedTypeMap.get(l));
			}
			
		}
		List<ContextHelper> ch = checkIsContextHelper(self.getOperationName());
		if(ch.size() != 0) {
			//TODO
		}
	}
	
	@Override
	public void inOperationCallExp(OperationCallExp self) {
		if(self.getOperationName().equals("oclIsKindOf")) {
			Class c = getClassFromName(((OclModelElement)(self.getArguments().get(0))).getName());
			oclComputedTypeMap.put(self, c);
		}
		
	}
	
	@Override
	public void inOperatorCallExp(OperatorCallExp self) {
		String opName = self.getOperationName();
		Object sourceType = oclComputedTypeMap.get(self.getSource());
		Feature feat = MM_uncertaintyFactory.eINSTANCE.createFeature();
		Attribute featAttrType = MM_uncertaintyFactory.eINSTANCE.createAttribute();
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
							if ( sourceType instanceof Feature )
								((Feature) sourceType).getHasType().clear();
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
							if(attrType.getType().contains(stringDt)) 
								stringFound = true;
							if(!attrType.getType().contains(realDt)) 
								realFound = true;
							//if(!attrType.getType().contains(integerDt)) attrType.getType().add(integerDt);
							
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
						if(attrType.getType().contains(stringDt)) 
							stringFound = true;
						if(!attrType.getType().contains(realDt)) 
							realFound = true;
//						if(!attrType.getType().contains(integerDt)) attrType.getType().add(integerDt);
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
//		if(feat.getHasType().size()==0 &&
//				isStricktThan(featAttrType, feat.getHasType())){
//			feat.getHasType().clear();
//			feat.getHasType().add(featAttrType);			
//		} 
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
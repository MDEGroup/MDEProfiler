package org.miso_disim.requirementmetamodel.reduce;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFModel;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.m2m.atl.engine.parser.AtlParser;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;

import MM_uncertainty.Cardinality;
import MM_uncertainty.Feature;
import MM_uncertainty.MM_uncertaintyFactory;
import MM_uncertainty.MM_uncertaintyPackage;
import MM_uncertainty.Metamodel;
import VariabilityFM.VariabilityModel;
import anatlyzer.atl.model.ATLModel;
import anatlyzer.atl.util.ATLSerializer;
import anatlyzer.atlext.ATL.ATLPackage;
import anatlyzer.atlext.ATL.Callable;
import anatlyzer.atlext.ATL.SimpleOutPatternElement;
import anatlyzer.atlext.OCL.Attribute;
import anatlyzer.atlext.OCL.OclExpression;
import anatlyzer.atlext.OCL.OclFeature;
import anatlyzer.atlext.OCL.OclType;
import anatlyzer.atlext.OCL.Operation;
import mmfootprint.codegen.RequirementsModel;

public class ReduceRequirementMetamodels {
	public void reduce (String inputPath) throws ATLCoreException{
		int i = inputPath.lastIndexOf("/");
		try {
			if (i >= 0)
				generateRMM(inputPath, inputPath.substring(0, i+1));
		} catch (ParserException e) {
			e.printStackTrace();
		}
	}
	public void generateRMM(String transformation, String outputFolder) throws ATLCoreException, ParserException {
		String trafoName = transformation.substring(transformation.lastIndexOf("/") +1,
				                                    transformation.length()).replace(".atl", "");
//		System.out.println("START PROCESS");
		AtlParser atlParser = new AtlParser();
		ModelFactory modelFactory = new EMFModelFactory();
		IReferenceModel atlMetamodel = modelFactory
				.getBuiltInResource("ATL.ecore");
		EMFModel atlDynModel = (EMFModel) modelFactory.newModel(atlMetamodel);
		atlParser.inject(atlDynModel, transformation);

		Resource originalTrafo = atlDynModel.getResource();

		ATLModel atlModel = new ATLModel(originalTrafo, originalTrafo.getURI()
				.toFileString(), true);
//		 @@@@@@@ UNCOMMENT TO SERIALIZE TRANSFORMATION
//		serialize(atlModel.getRoot(), outputFolder + "PN2PNML.atl.ecore");

		
		
		HashMap<Object, OclType> callableElementsContextType = new HashMap<Object, OclType>();
		try {
			List<Callable> callables = getCallableElements(atlModel);
			for (Callable callable : callables) {
				CallableVisitorContextType callableVisitor = new CallableVisitorContextType();
				callableVisitor.perform(callable);
				callableElementsContextType.put(callableVisitor.getElement(), callableVisitor.getOclType());
			}
		} catch (ParserException e) {
			//System.err.println("UNABLE TO DISCOVER CALLABLE TYPE");
		}
		
		HashMap<Callable, OclType> callableElementsReturnType = new HashMap<Callable, OclType>();
		try {
			List<Callable> callables = getCallableElements(atlModel);
			for (Callable callable : callables) {
				CallableVisitorReturnType callableVisitor = new CallableVisitorReturnType();
				callableVisitor.perform(callable);
				callableElementsReturnType.put(callableVisitor.getElement(), callableVisitor.getOclType());
			}
		} catch (ParserException e) {
			//System.err.println("UNABLE TO DISCOVER CALLABLE TYPE");
		}
		
		VariableVisitor vv = new VariableVisitor(true);
		vv.perform(atlModel);
		InputMetamodelVisitor imv = new InputMetamodelVisitor();
		imv.perform(atlModel, callableElementsContextType, callableElementsReturnType, vv.getRootIn(), 
				vv.getOclComputedType());
		Metamodel mm = imv.getRootIn();

		// Init features cardinality
		List<Feature> features = getFeatures(mm);
		for (Feature feature : features) {
			if(feature.getMax()==null)
				feature.setMax(MM_uncertaintyFactory.eINSTANCE.createUnknownCardinality());
			if(feature.getMin()==null)
				feature.setMin(MM_uncertaintyFactory.eINSTANCE.createUnknownCardinality());
		}
		serialize(mm, outputFolder + trafoName + "_sourceDRM.mm_uncertainty");
		OutputMetamodelVisitor omv = new OutputMetamodelVisitor();
		vv = new VariableVisitor(false);
		vv.perform(atlModel);
		omv.perform(atlModel, callableElementsContextType, callableElementsReturnType, vv.getRootOut(), 
			vv.getOclComputedType());
		Metamodel mmout = omv.getRootOut();

		//Init features cardinality
		features = getFeatures(mmout);
		for (Feature feature : features) {
			if(feature.getMax()==null)
				feature.setMax(MM_uncertaintyFactory.eINSTANCE.createUnknownCardinality());
			if(feature.getMin()==null)
				feature.setMin(MM_uncertaintyFactory.eINSTANCE.createUnknownCardinality());
		}
		serialize(mmout, outputFolder + trafoName +"_targetDRM.mm_uncertainty");
//		System.out.println("END PROCESS");
		
		// Variability discovery
//		System.out.println("\nVariability discovery...");
		
//		for (Binding b : atlModel.allObjectsOf(Binding.class)) {
//			if ( b.getLocation().equals("15:3-15:20") ) {
//				Feature f = (Feature) imv.getOclComputedTypeMap().get(b.getValue());
//				System.out.println(f);
//				return;
//			}			
//		}
		
//		SourceInferenceContext src = new SourceInferenceContext(mm, imv.getOclComputedTypeMap());
//		TargetInferenceContext tgt = new TargetInferenceContext(mmout, omv.traceLinks); 
//		
//		VariabilityModel vm = new VariabilityDiscoverer(atlModel, src, tgt).perform();
//		serialize(vm, outputFolder  + trafoName + "_compatibilityModel.xmi");
		
//		System.out.println("Done!");
	}
	
	public boolean checkConformance (String rMpdelPath, String tempFolder, String metamodelPath){
		RequirementsModel reqmodel_source = new RequirementsModel(rMpdelPath, tempFolder);
		return reqmodel_source.checkConformance(metamodelPath);
	}
	public static List<Callable> getCallableElements(ATLModel atlModel) throws ParserException {
//		System.out.println("EXTRACTING CALLABLE ELEMENTS FROM A ATL MODEL");
		//DEFINE OCL AND HELPER
		OCL<?, EClassifier, ?, ?, ?, EParameter, ?, ?, ?, Constraint, EClass, EObject> ocl;
		OCLHelper<EClassifier, ?, ?, Constraint> helper;
		
		//INSTANCIATE OCL
		ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
		//INSTANCIATE NEW HELPER FROM OCLEXPRESSION
		helper = ocl.createOCLHelper();
		//SET HELPER CONTEXT
		helper.setContext(ATLPackage.eINSTANCE.getModule());
		
		//CREATE OCLEXPRESSION
		OCLExpression<EClassifier> expression = helper.createQuery("Callable.allInstances()");
		//CREATE QUERY FROM OCLEXPRESSION
		Query<EClassifier, EClass, EObject> query = ocl.createQuery(expression);
		
		//EVALUATE OCL
		HashSet<Object> success = (HashSet<Object>) query.evaluate(atlModel.getRoot());
		List<Callable> callableMethods = new ArrayList<Callable>();
		for (Object object : success)
			callableMethods.add((Callable) object);
//		System.out.println("EXTRACTED CALLABLE ELEMENTS FROM A ATL MODEL");
		return callableMethods;

	}
	
	public static List<SimpleOutPatternElement> getSimpleOutPattern(ATLModel atlModel) throws ParserException {
//		System.out.println("EXTRACTING CALLABLE ELEMENTS FROM A ATL MODEL");
		//DEFINE OCL AND HELPER
		OCL<?, EClassifier, ?, ?, ?, EParameter, ?, ?, ?, Constraint, EClass, EObject> ocl;
		OCLHelper<EClassifier, ?, ?, Constraint> helper;
		
		//INSTANCIATE OCL
		ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
		//INSTANCIATE NEW HELPER FROM OCLEXPRESSION
		helper = ocl.createOCLHelper();
		//SET HELPER CONTEXT
		helper.setContext(ATLPackage.eINSTANCE.getModule());
		
		//CREATE OCLEXPRESSION
		OCLExpression<EClassifier> expression = helper.createQuery("SimpleOutPatternElement.allInstances()");
		//CREATE QUERY FROM OCLEXPRESSION
		Query<EClassifier, EClass, EObject> query = ocl.createQuery(expression);
		
		//EVALUATE OCL
		HashSet<Object> success = (HashSet<Object>) query.evaluate(atlModel.getRoot());
		List<SimpleOutPatternElement> callableMethods = new ArrayList<SimpleOutPatternElement>();
		for (Object object : success)
			callableMethods.add((SimpleOutPatternElement) object);
//		System.out.println("EXTRACTED CALLABLE ELEMENTS FROM A ATL MODEL");
		return callableMethods;

	}
	
	public static List<Feature> getFeatures(Metamodel metamodel) throws ParserException {
//		System.out.println("EXTRACTING CALLABLE ELEMENTS FROM A ATL MODEL");
		//DEFINE OCL AND HELPER
		OCL<?, EClassifier, ?, ?, ?, EParameter, ?, ?, ?, Constraint, EClass, EObject> ocl;
		OCLHelper<EClassifier, ?, ?, Constraint> helper;
		
		//INSTANCIATE OCL
		ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
		//INSTANCIATE NEW HELPER FROM OCLEXPRESSION
		helper = ocl.createOCLHelper();
		//SET HELPER CONTEXT
		helper.setContext(MM_uncertaintyPackage.eINSTANCE.getMetamodel());
		
		//CREATE OCLEXPRESSION
		OCLExpression<EClassifier> expression = helper.createQuery("Feature.allInstances()");
		//CREATE QUERY FROM OCLEXPRESSION
		Query<EClassifier, EClass, EObject> query = ocl.createQuery(expression);
		
		//EVALUATE OCL
		HashSet<Object> success = (HashSet<Object>) query.evaluate(metamodel);
		List<Feature> feature = new ArrayList<>();
		for (Object object : success)
			feature.add((Feature) object);
//		System.out.println("EXTRACTED CALLABLE ELEMENTS FROM A ATL MODEL");
		return feature;

	}
	
	
	public static boolean checkConstraint(EPackage atlModel, List<OclExpression> expr) throws ParserException {
//		System.out.println("Check Constraint");
		//DEFINE OCL AND HELPER
		OCL<?, EClassifier, ?, ?, ?, EParameter, ?, ?, ?, Constraint, EClass, EObject> ocl;
		OCLHelper<EClassifier, ?, ?, Constraint> helper;
		
		//INSTANCIATE OCL
		ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
		//INSTANCIATE NEW HELPER FROM OCLEXPRESSION
		helper = ocl.createOCLHelper();
		//SET HELPER CONTEXT
		helper.setContext(ATLPackage.eINSTANCE.getModule());
		
		//CREATE OCLEXPRESSION
		OCLExpression<EClassifier> expression = helper.createQuery("ecore::" + ATLSerializer.serialize(expr.get(0)));
		//CREATE QUERY FROM OCLEXPRESSION
		System.out.println("ecore::" + ATLSerializer.serialize(expr.get(0)));
		Query<EClassifier, EClass, EObject> query = ocl.createQuery(expression);
		
		//EVALUATE OCL
		boolean success =  query.check(atlModel);
//		System.out.println("success " + success);
		return success;
		
	}
	/*
	 * Print some information about a callable hashmap
	 * param callableElements Callabe to be print
	 */
	public static void printCallable(HashMap<OclFeature, OclType> callableElements){
		Iterator<Entry<OclFeature, OclType>> iterator = callableElements.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<OclFeature, OclType> a = iterator.next();
			if (a.getKey() instanceof Attribute) {
				Attribute ch = ((Attribute)a.getKey());
				System.out.println("att " + ch);
			}
			if (a.getKey() instanceof Operation) {
				Operation sh = ((Operation)a.getKey());
				System.out.println("ope " + sh);
			}
		}
	}
	
	
	static ResourceSet outputMetamodelResourceSet = new ResourceSetImpl();
	static {
		outputMetamodelResourceSet.getResourceFactoryRegistry()
		.getExtensionToFactoryMap()
		.put("*", new XMLResourceFactoryImpl());
	}
	
	/*
	 * Serialize an EObject object in a given file path
	 * @param root root to be serialize
	 * @param path path to store serialized model
	 */
	public static void serialize(EObject root, String path) {

		// create a resource
		Resource outputMetamodelResource = outputMetamodelResourceSet.createResource(URI.createFileURI(new File(path).getAbsolutePath()));
		
		outputMetamodelResource.getContents().add(root);
		try {
			outputMetamodelResource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

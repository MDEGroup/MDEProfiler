package org.miso_disim.requirementmetamodel.reduce;

import java.io.File;

import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.ocl.ParserException;

public class TestMain {
	
	public static void main(String args[]) throws ATLCoreException, ParserException {
//		String transformation = "transformation/Families2Persons.atl";
//		String transformation = "transformation/PN2matrix.atl";
		String transformation = "/home/juri/Scrivania/MDEProfile/input/UMLStateMachine2NuSMV-master/UMLStateMachine2NuSMV/UMLStateMachine2NuSMV.atl";
		new ReduceRequirementMetamodels().generateRMM(transformation, "output" + File.separator);
	}
//	
//	public void generateRMM(String transformation, String outputFolder) throws ATLCoreException, ParserException {
//		System.out.println("START PROCESS");
//		AtlParser atlParser = new AtlParser();
//		ModelFactory modelFactory = new EMFModelFactory();
//		IReferenceModel atlMetamodel = modelFactory
//				.getBuiltInResource("ATL.ecore");
//		EMFModel atlDynModel = (EMFModel) modelFactory.newModel(atlMetamodel);
//		atlParser.inject(atlDynModel, transformation);
//
//		Resource originalTrafo = atlDynModel.getResource();
//
//		ATLModel atlModel = new ATLModel(originalTrafo, originalTrafo.getURI()
//				.toFileString(), true);
////		 @@@@@@@ UNCOMMENT TO SERIALIZE TRANSFORMATION
////		serialize(atlModel.getRoot(), outputFolder + "PN2PNML.atl.ecore");
//
//		
//		
//		HashMap<Object, OclType> callableElementsContextType = new HashMap<Object, OclType>();
//		try {
//			List<Callable> callables = getCallableElements(atlModel);
//			for (Callable callable : callables) {
//				CallableVisitorContextType callableVisitor = new CallableVisitorContextType();
//				callableVisitor.perform(callable);
//				callableElementsContextType.put(callableVisitor.getElement(), callableVisitor.getOclType());
//			}
//		} catch (ParserException e) {
//			System.err.println("UNABLE TO DISCOVER CALLABLE TYPE");
//		}
//		
//		HashMap<Callable, OclType> callableElementsReturnType = new HashMap<Callable, OclType>();
//		try {
//			List<Callable> callables = getCallableElements(atlModel);
//			for (Callable callable : callables) {
//				CallableVisitorReturnType callableVisitor = new CallableVisitorReturnType();
//				callableVisitor.perform(callable);
//				callableElementsReturnType.put(callableVisitor.getElement(), callableVisitor.getOclType());
//			}
//		} catch (ParserException e) {
//			System.err.println("UNABLE TO DISCOVER CALLABLE TYPE");
//		}
//		
//		VariableVisitor vv = new VariableVisitor(true);
//		vv.perform(atlModel);
//		InputMetamodelVisitor imv = new InputMetamodelVisitor();
//		imv.perform(atlModel, callableElementsContextType, callableElementsReturnType, vv.getRootIn(), 
//				vv.getOclComputedType());
//		Metamodel mm = imv.getRootIn();
//		serialize(mm, outputFolder + "Input.ecore");
//		OutputMetamodelVisitor omv = new OutputMetamodelVisitor();
//		vv = new VariableVisitor(false);
//		vv.perform(atlModel);
//		omv.perform(atlModel, callableElementsContextType, callableElementsReturnType, vv.getRootOut(), 
//			vv.getOclComputedType());
//		Metamodel mmout = omv.getRootOut();
//		serialize(mmout, outputFolder + "Output.ecore");
//		System.out.println("END PROCESS");
//		
//		// Variability discovery
//		System.out.println("\nVariability discovery...");
//		
////		for (Binding b : atlModel.allObjectsOf(Binding.class)) {
////			if ( b.getLocation().equals("15:3-15:20") ) {
////				Feature f = (Feature) imv.getOclComputedTypeMap().get(b.getValue());
////				System.out.println(f);
////				return;
////			}			
////		}
//		
//		SourceInferenceContext src = new SourceInferenceContext(mm, imv.getOclComputedTypeMap());
//		TargetInferenceContext tgt = new TargetInferenceContext(mmout, omv.traceLinks); 
//		
//		VariabilityModel vm = new VariabilityDiscoverer(atlModel, src, tgt).perform();
//		serialize(vm, outputFolder + "variability.xmi");
//		
//		System.out.println("Done!");
//	}
//	
//	public static List<Callable> getCallableElements(ATLModel atlModel) throws ParserException {
//		System.out.println("EXTRACTING CALLABLE ELEMENTS FROM A ATL MODEL");
//		//DEFINE OCL AND HELPER
//		OCL<?, EClassifier, ?, ?, ?, EParameter, ?, ?, ?, Constraint, EClass, EObject> ocl;
//		OCLHelper<EClassifier, ?, ?, Constraint> helper;
//		
//		//INSTANCIATE OCL
//		ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
//		//INSTANCIATE NEW HELPER FROM OCLEXPRESSION
//		helper = ocl.createOCLHelper();
//		//SET HELPER CONTEXT
//		helper.setContext(ATLPackage.eINSTANCE.getModule());
//		
//		//CREATE OCLEXPRESSION
//		OCLExpression<EClassifier> expression = helper.createQuery("Callable.allInstances()");
//		//CREATE QUERY FROM OCLEXPRESSION
//		Query<EClassifier, EClass, EObject> query = ocl.createQuery(expression);
//		
//		//EVALUATE OCL
//		HashSet<Object> success = (HashSet<Object>) query.evaluate(atlModel.getRoot());
//		List<Callable> callableMethods = new ArrayList<Callable>();
//		for (Object object : success)
//			callableMethods.add((Callable) object);
//		System.out.println("EXTRACTED CALLABLE ELEMENTS FROM A ATL MODEL");
//		return callableMethods;
//
//	}
//	
//	public static List<SimpleOutPatternElement> getSimpleOutPattern(ATLModel atlModel) throws ParserException {
//		System.out.println("EXTRACTING CALLABLE ELEMENTS FROM A ATL MODEL");
//		//DEFINE OCL AND HELPER
//		OCL<?, EClassifier, ?, ?, ?, EParameter, ?, ?, ?, Constraint, EClass, EObject> ocl;
//		OCLHelper<EClassifier, ?, ?, Constraint> helper;
//		
//		//INSTANCIATE OCL
//		ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
//		//INSTANCIATE NEW HELPER FROM OCLEXPRESSION
//		helper = ocl.createOCLHelper();
//		//SET HELPER CONTEXT
//		helper.setContext(ATLPackage.eINSTANCE.getModule());
//		
//		//CREATE OCLEXPRESSION
//		OCLExpression<EClassifier> expression = helper.createQuery("SimpleOutPatternElement.allInstances()");
//		//CREATE QUERY FROM OCLEXPRESSION
//		Query<EClassifier, EClass, EObject> query = ocl.createQuery(expression);
//		
//		//EVALUATE OCL
//		HashSet<Object> success = (HashSet<Object>) query.evaluate(atlModel.getRoot());
//		List<SimpleOutPatternElement> callableMethods = new ArrayList<SimpleOutPatternElement>();
//		for (Object object : success)
//			callableMethods.add((SimpleOutPatternElement) object);
//		System.out.println("EXTRACTED CALLABLE ELEMENTS FROM A ATL MODEL");
//		return callableMethods;
//
//	}
//	
//	
//	public static boolean checkConstraint(EPackage atlModel, List<OclExpression> expr) throws ParserException {
//		System.out.println("Check Constraint");
//		//DEFINE OCL AND HELPER
//		OCL<?, EClassifier, ?, ?, ?, EParameter, ?, ?, ?, Constraint, EClass, EObject> ocl;
//		OCLHelper<EClassifier, ?, ?, Constraint> helper;
//		
//		//INSTANCIATE OCL
//		ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
//		//INSTANCIATE NEW HELPER FROM OCLEXPRESSION
//		helper = ocl.createOCLHelper();
//		//SET HELPER CONTEXT
//		helper.setContext(ATLPackage.eINSTANCE.getModule());
//		
//		//CREATE OCLEXPRESSION
//		OCLExpression<EClassifier> expression = helper.createQuery("ecore::" + ATLSerializer.serialize(expr.get(0)));
//		//CREATE QUERY FROM OCLEXPRESSION
//		System.out.println("ecore::" + ATLSerializer.serialize(expr.get(0)));
//		Query<EClassifier, EClass, EObject> query = ocl.createQuery(expression);
//		
//		//EVALUATE OCL
//		boolean success =  query.check(atlModel);
//		System.out.println("success " + success);
//		return success;
//		
//	}
//	/*
//	 * Print some information about a callable hashmap
//	 * param callableElements Callabe to be print
//	 */
//	public static void printCallable(HashMap<OclFeature, OclType> callableElements){
//		Iterator<Entry<OclFeature, OclType>> iterator = callableElements.entrySet().iterator();
//		while (iterator.hasNext()) {
//			Entry<OclFeature, OclType> a = iterator.next();
//			if (a.getKey() instanceof Attribute) {
//				Attribute ch = ((Attribute)a.getKey());
//				System.out.println("att " + ch);
//			}
//			if (a.getKey() instanceof Operation) {
//				Operation sh = ((Operation)a.getKey());
//				System.out.println("ope " + sh);
//			}
//		}
//	}
//	
//	
//	static ResourceSet outputMetamodelResourceSet = new ResourceSetImpl();
//	static {
//		outputMetamodelResourceSet.getResourceFactoryRegistry()
//		.getExtensionToFactoryMap()
//		.put("*", new XMLResourceFactoryImpl());
//	}
//	
//	/*
//	 * Serialize an EObject object in a given file path
//	 * @param root root to be serialize
//	 * @param path path to store serialized model
//	 */
//	public static void serialize(EObject root, String path) {
//
//		// create a resource
//		Resource outputMetamodelResource = outputMetamodelResourceSet.createResource(URI.createFileURI(new File(path).getAbsolutePath()));
//		
//		outputMetamodelResource.getContents().add(root);
//		try {
//			outputMetamodelResource.save(Collections.EMPTY_MAP);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
}

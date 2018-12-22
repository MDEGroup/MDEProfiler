package it.univaq.MDEProfiler.heuristic;

import java.io.File;
import java.io.PrintStream;

import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.egl.EglTemplateFactory;
import org.eclipse.epsilon.egl.EglTemplateFactoryModuleAdapter;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.IEolModule;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.execute.context.Variable;
import org.eclipse.epsilon.eol.models.IModel;

public class StandAlone {
	private static final String DRMMetaModel = "metamodel/MM_uncertainty.ecore";
	private static final String eol = "esempio.eol";
	public static boolean check(String DRMModel, String metamodel) {
		EglTemplateFactoryModuleAdapter module = new EglTemplateFactoryModuleAdapter(new EglTemplateFactory());
		try {
			module.parse(new File("conformanceGen.egl"));
			IModel model = createEmfModel("UM", DRMModel, DRMMetaModel, true, true, false);
			module.getContext().getModelRepository().addModel(model);
			module.execute();
			module.getContext().getModelRepository().addModel(model);
			Object result = module.execute();
			PrintStream f = new PrintStream(new File (eol));
			f.print(result);
			f.close();
			return checkConformance(metamodel);
		} catch (Exception e) {
			return false;
		}
	}
	private static boolean checkConformance (String fileMetamodel) {
		boolean result = false;
		try {
			IEolModule module = new EolModule();
			if (module.parse(new File("esempio.eol"))) {
				IModel model = createEmfModel("mm", fileMetamodel, "http://www.eclipse.org/emf/2002/Ecore", false, true, false);
				module.getContext().getModelRepository().addModel(model);
				module.execute();
				Object variable = module.getContext().getFrameStack().get("result");
				result = (Boolean)((Variable)variable).getValue();
			}
			module.getContext().getModelRepository().dispose();			
		} 
		catch (Exception e) {
		}
		return result;
	}
	
	private static IModel createEmfModel(String name, String model, String metamodel, boolean metamodelFileBased, boolean readOnLoad, boolean storeOnDisposal) {		
		IModel emfModel = new EmfModel();
		try {
			StringProperties properties = new StringProperties();
			properties.put(EmfModel.PROPERTY_NAME, name);
			properties.put(EmfModel.PROPERTY_MODEL_URI, "file:/"+ new File(model).getAbsolutePath());
			if (metamodelFileBased)
				 properties.put(EmfModel.PROPERTY_FILE_BASED_METAMODEL_URI, "file:/"+ new File(metamodel).getAbsolutePath());
			else properties.put(EmfModel.PROPERTY_METAMODEL_URI, metamodel);
			properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "");
			properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal + "");
			emfModel.load(properties, "");
		} 
		catch (EolModelLoadingException e) {
		}
		return emfModel;
	}
}

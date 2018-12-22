package mmfootprint.codegen;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.net.URISyntaxException;
import java.net.URL;
 
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.egl.EglFileGeneratingTemplateFactory;
import org.eclipse.epsilon.egl.EglTemplateFactoryModuleAdapter;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.IEolModule;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.execute.context.Variable;
import org.eclipse.epsilon.eol.models.IModel;
import org.osgi.framework.Bundle;

public class RequirementsModel {
	
//	public static void main (String args[]) {
//		RequirementsModel gen = new RequirementsModel("samples/requirements_example.model", "samples");
//		System.out.println( gen.checkConformance("samples/test2.ecore") );
//	}
	
	private final String REQUIREMENTS_METAMODEL_FILE  = "metamodel/MM_uncertainty.ecore";
	private final String REQUIREMENTS_MODEL_GENERATOR = "lib/conformanceGen.egl";
	private final String REQUIREMENTS_MODEL_NAME      = "UM";
	private final String METAMODEL_NAME               = "mm";
	private final String METAMODEL_METAMODEL          = "http://www.eclipse.org/emf/2002/Ecore";

	private String fileRequirementsModel;
	private String fileCheckConformance;
	
	/**
	 * Builder. It receives the name of the file that contains the requirements model.
	 * @param fileRequirementsModel
	 * @param temporalFolder
	 */
	public RequirementsModel (String fileRequirementsModel, String temporalFolder) {
		this.fileRequirementsModel = fileRequirementsModel;
		this.fileCheckConformance  = temporalFolder + File.separator + "rmm_conformance_" + fileRequirementsModel.substring( fileRequirementsModel.lastIndexOf(File.separator)+1) + ".eol";
		this.genEOL(); // generate EOL code to check conformance
	}
	/**
	 * It generates the necessary EOL code to check conformance of a metamodel w.r.t the requirements model.
	 */
	private void genEOL () {
		try {
			IEolModule module = new EglTemplateFactoryModuleAdapter(new EglFileGeneratingTemplateFactory());
			// load egl template
			if (module.parse(getResourceFile(REQUIREMENTS_MODEL_GENERATOR, CodeGenConstants.CODEGEN_PLUGIN_NAME))) {
				// load requirements model
				IModel model = createEmfModel();
				module.getContext().getModelRepository().addModel(model);
				// execute egl template
				Object result = module.execute();
				// save result
				PrintStream f = new PrintStream(new File (this.fileCheckConformance));
				f.print(result);
				f.close();
			}
			module.getContext().getModelRepository().dispose();			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public IModel createEmfModel() {
		return createEmfModel(REQUIREMENTS_MODEL_NAME, this.fileRequirementsModel, getResourceFile(REQUIREMENTS_METAMODEL_FILE, CodeGenConstants.REQ_PLUGIN_NAME).getAbsolutePath(), true, true, false);
	}

	/**
	 * It checks whether the received metamodel conforms to the requirements model.
	 * @param fileMetamodel
	 */
	public boolean checkConformance (String fileMetamodel) {
		boolean result = false;
		try {
			IEolModule module = new EolModule();
			// load eol file
			if (module.parse(new File(this.fileCheckConformance))) {
				// load metamodel
				IModel model = createEmfModel(METAMODEL_NAME, fileMetamodel, METAMODEL_METAMODEL, false, true, false);
				module.getContext().getModelRepository().addModel(model);
				// execute eol file
				module.execute();
				// obtain result				
				Object variable = module.getContext().getFrameStack().get("result");
				result = (Boolean)((Variable)variable).getValue();
			}
			module.getContext().getModelRepository().dispose();			
		} 
		catch (Exception e) {
			e.printStackTrace();
			// Better fail at runtime here, because it probably means the conformance code is wrong
			throw new RuntimeException(e);
		}
		return result;
	}

	/**
	 */
	private IModel createEmfModel(String name, String model, String metamodel, boolean metamodelFileBased, boolean readOnLoad, boolean storeOnDisposal) {		
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
			e.printStackTrace();
		}
		return emfModel;
	}

	/**
	 * @return
	 */
	private File getResourceFile (String nameResource, String plugin) {
		Bundle bundle  = Platform.getBundle(plugin);
		URL    fileURL = bundle.getEntry(nameResource);
		try { return new File(FileLocator.resolve(fileURL).toURI()); } catch (URISyntaxException | IOException e) { e.printStackTrace(); }
		return null;
	}
}

package it.univaq.MDEProfiler.heuristic;

import java.io.File;
import java.io.PrintStream;
import java.util.stream.Collectors;

import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.egl.EglTemplateFactory;
import org.eclipse.epsilon.egl.EglTemplateFactoryModuleAdapter;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.IEolModule;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.execute.context.Variable;
import org.eclipse.epsilon.eol.models.IModel;
import org.miso_disim.requirementmetamodel.reduce.ReduceRequirementMetamodels;

import it.univaq.MDEProfiler.graph.model.graph.Edge;
import it.univaq.MDEProfiler.graph.model.graph.Graph;
import it.univaq.MDEProfiler.graph.model.graph.GraphFactory;
import it.univaq.MDEProfiler.graph.model.graph.Node;

public class ATLEcoreTOTEMHeuristic implements IHeuristic {

	private Graph g;
	@Override
	public Graph getGraph(String repoFolder, Graph g) {
		
		this.g = g;
		for (Node n : g.getNodes().
				stream().
				filter(z -> z.getType().contains(FileUtils.ATLKind)).
				collect(Collectors.toList())) {
			try {
				new ReduceRequirementMetamodels().generateRMM(n.getUri(), n.getUri().substring(0, n.getUri().lastIndexOf("/")+1));
				int i = n.getUri().lastIndexOf(".");
				String source = n.getUri().substring(0,i) + "_sourceDRM.mm_uncertainty";
				String target = n.getUri().substring(0,i) + "_TargetDRM.mm_uncertainty";
				Node sourceNode = createNode(source);
				Node targetNode = createNode(target);
				g.getNodes().add(targetNode);
				g.getNodes().add(sourceNode);
				for (Node n1 : g.getNodes().
						stream().
						filter(z -> z.getType().contains(FileUtils.ecoreKind)).
						collect(Collectors.toList())) {
					boolean src = StandAlone.check(source, n1.getName());
					boolean trg = StandAlone.check(target, n1.getName());
					if(trg) {
						Edge edge = GraphFactory.eINSTANCE.createEdge();
						edge.setName(FileUtils.DRM_OUT);
						edge.setSource(n1);
						edge.setTarget(n);
						g.getEdges().add(edge);
					}
					if(src) {
						Edge edge = GraphFactory.eINSTANCE.createEdge();
						edge.setName(FileUtils.DRM_IN);
						edge.setSource(n1);
						edge.setTarget(n);
						g.getEdges().add(edge);
					}
				}
			} catch (Exception e) {
				System.err.println( n.getUri() + e.getMessage());
			} 
		}
		return g;
	}
	private Node createNode(String name) {
		Node n = GraphFactory.eINSTANCE.createNode();
//		String s = file.getAbsolutePath().replace("_sourceDRM.mm_uncertainty",".atl");
		n.setDerivedOrNotExists(false);
		n.getType().add(FileUtils.DRM);
		n.setUri(name);
		n.setName(name);
		return n;
		
	}
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

package it.univaq.MDEProfiler.heuristic;

import java.io.File;
import java.util.List;

import it.univaq.MDEProfiler.graph.model.graph.Edge;
import it.univaq.MDEProfiler.graph.model.graph.Graph;
import it.univaq.MDEProfiler.graph.model.graph.GraphFactory;
import it.univaq.MDEProfiler.graph.model.graph.Node;

public class DRMHeuristic implements IHeuristic {

	private static String extension = ".mm_uncertainty";
	@Override
	public Graph getGraph(String repoFolder, Graph g) {
		
		//GitHubRepositoryManager grm = new GitHubRepositoryManager();
		//String repoFolder = grm.clone(r.getOwner().getName(), r.getName(), FileUtils.getRootFolder());
		File repoFolderF = new File(repoFolder);
		List<File> fList = FileUtils.getFilesByEndingValue(repoFolderF, extension);
		for (File file : fList) {
			boolean guard = g.getNodes().stream().anyMatch(s -> s.getUri().equals(file.getAbsolutePath()));
			if(!guard)
			{
				Node n = GraphFactory.eINSTANCE.createNode();
//				String s = file.getAbsolutePath().replace("_sourceDRM.mm_uncertainty",".atl");
				
				Node trafo = file.getAbsolutePath().endsWith("_sourceDRM.mm_uncertainty")?
						FileUtils.getNodeByFilePath(g, file.getAbsolutePath().replace("_sourceDRM.mm_uncertainty",".atl")):
							FileUtils.getNodeByFilePath(g, file.getAbsolutePath().replace("_targetDRM.mm_uncertainty",".atl"));
				n.setDerivedOrNotExists(false);
				n.getType().add(FileUtils.DRM);
				n.setUri(file.getAbsolutePath());
				n.setName(file.getName());
				g.getNodes().add(n);
				Edge eg1 = GraphFactory.eINSTANCE.createEdge();
				eg1.setSource(trafo);
				eg1.setTarget(n);
				eg1.setExact(true);
				if(file.getAbsolutePath().endsWith("_sourceDRM.mm_uncertainty"))
					eg1.setName(FileUtils.DRM_IN);
				else
					eg1.setName(FileUtils.DRM_OUT);
				g.getEdges().add(eg1);
			}
		}
		return g;
	}
}

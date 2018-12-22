package it.univaq.MDEProfiler.heuristic;

import java.util.stream.Collectors;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.viewers.IStructuredSelection;

import it.univaq.MDEProfiler.graph.model.graph.Edge;
import it.univaq.MDEProfiler.graph.model.graph.Graph;
import it.univaq.MDEProfiler.graph.model.graph.GraphFactory;
import it.univaq.MDEProfiler.graph.model.graph.Node;

public class KM32EcoreHeuristic implements IHeuristic {

	private static String _path = "/home/juri/Scrivania/output.txt";

	@Override
	public Graph getGraph(String repoFolder, Graph g) {
		for (Node n : g.getNodes().stream().filter(z -> z.getType().contains(FileUtils.KM3Kind))
				.collect(Collectors.toList())) {
			try {
				for (Node n1 : g.getNodes().stream().filter(z -> z.getType().contains(FileUtils.ecoreKind))
						.collect(Collectors.toList())) {
					String filenameN = n.getUri().substring(n.getUri().lastIndexOf("/"),n.getUri().lastIndexOf("."));
					String filenameN1 = n1.getUri().substring(n1.getUri().lastIndexOf("/"),n1.getUri().lastIndexOf("."));
					if(filenameN.equals(filenameN1)) {
						Edge edg = GraphFactory.eINSTANCE.createEdge();
						edg.setSource(n);
						edg.setTarget(n1);
						edg.setName(FileUtils.EcoreKM3);
						g.getEdges().add(edg);
					}
					
				}
			} catch (Exception e) {

			}
		}
		return g;
	}
}

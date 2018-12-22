package it.univaq.MDEProfiler.heuristic;

import java.util.stream.Collectors;

import it.univaq.MDEProfiler.graph.model.graph.Edge;
import it.univaq.MDEProfiler.graph.model.graph.Graph;
import it.univaq.MDEProfiler.graph.model.graph.GraphFactory;
import it.univaq.MDEProfiler.graph.model.graph.Node;

public class DRMConformanceTOTEMHeuristic implements IHeuristic {

	@Override
	public Graph getGraph(String repoFolder, Graph g) {
		for (Node n : g.getNodes().stream().filter(z -> z.getType().contains(FileUtils.DRM))
				.collect(Collectors.toList())) {
			try {
				for (Node n1 : g.getNodes().stream().filter(z -> z.getType().contains(FileUtils.ecoreKind))
						.collect(Collectors.toList())) {
					if (StandAlone.check(n.getUri(), n1.getUri())) {
						Edge edge = GraphFactory.eINSTANCE.createEdge();
						Edge oldEdge = g.getEdges().stream().filter(z -> z.getTarget().equals(n)).findFirst().get();
						Node atl = oldEdge.getSource();

						edge.setSource(atl);
						edge.setTarget(n1);
						if (oldEdge.getName().equals(FileUtils.DRM_IN))
							edge.setName(FileUtils.source);
						else
							edge.setName(FileUtils.target);
						edge.setDiscoverBy(n);

						g.getEdges().add(edge);
						
					}
				}
			} catch (Exception e) {

			}
		}
		return g;
	}
}

package it.univaq.MDEProfiler.heuristic.test;

import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.jgit.api.errors.GitAPIException;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import ghmde.Repository;
import it.univaq.MDEProfiler.graph.model.graph.Edge;
import it.univaq.MDEProfiler.graph.model.graph.Graph;
import it.univaq.MDEProfiler.graph.model.graph.GraphFactory;
import it.univaq.MDEProfiler.graph.model.graph.Node;
import it.univaq.MDEProfiler.graph.util.Serializer;
import it.univaq.MDEProfiler.heuristic.ATLHeuristic;
import it.univaq.MDEProfiler.heuristic.ATLWithPathHeuristic;
import it.univaq.MDEProfiler.heuristic.AntHeuristic;
import it.univaq.MDEProfiler.heuristic.AntWithATLHeuristic;
import it.univaq.MDEProfiler.heuristic.EcoreHeuristic;
import it.univaq.MDEProfiler.heuristic.FileUtils;
import it.univaq.MDEProfiler.heuristic.IHeuristic;
import it.univaq.MDEProfiler.heuristic.KM3Heuristic;
import it.univaq.MDEProfiler.heuristic.LauncherATLHeuristic;
import it.univaq.MDEProfiler.heuristic.LauncherHeuristic;
import it.univaq.MDEProfiler.resolver.ParseDataSet;

public class IHeuristicTest {
	private IHeuristic ecore;
	private IHeuristic atl;
	private IHeuristic launcher;
	private IHeuristic launcherGraph;
	private IHeuristic atlPath;
	private IHeuristic ant;
	private AntWithATLHeuristic antATL;
	private IHeuristic km3;
	private ParseDataSet pds;

	@Before
	public void init() {
		atl = new ATLHeuristic();
		ecore = new EcoreHeuristic();
		launcher = new LauncherHeuristic();
		launcherGraph = new LauncherATLHeuristic();
		atlPath = new ATLWithPathHeuristic();
		ant = new AntHeuristic();
		antATL = new AntWithATLHeuristic();
		km3 = new KM3Heuristic();
		pds = new ParseDataSet();

	}

	@Ignore
	@Test
	public void testHeuristic() throws GitAPIException {
		String repoFolder = "/home/juri/MDEProfiler/lolybc88/pATL/";
		Graph g = ecore.getGraph(repoFolder, GraphFactory.eINSTANCE.createGraph());
		g.setName(repoFolder);
		g = atl.getGraph(repoFolder, g);
		g = launcher.getGraph(repoFolder, g);
		System.out.println(g);
		g.getNodes().forEach(s -> System.out.println(s.getUri()));
		it.univaq.MDEProfiler.graph.util.Serializer.serializeModel(g, "/home/juri/MDEProfiler/graph.xmi");
	}

	@Ignore
	@Test
	public void testDimitrisModelGithub() throws GitAPIException {
		Set<Repository> s = pds.getExistingRepository("model/ghmde.model");
		Repository r = s.iterator().next();
		System.out.println("JJJ" + r.getName());
	}

	@Ignore
	@Test
	public void testAllHeuristics() {
		String repo = "/home/juri/MDEProfiler/Table2SVGBarChart/";
		// String repo = "/home/juri/MDEProfiler/SideEffect";

		Graph g = GraphFactory.eINSTANCE.createGraph();
		ecore.getGraph(repo, g);
		atl.getGraph(repo, g);
		launcher.getGraph(repo, g);
		launcherGraph.getGraph(repo, g);
		atlPath.getGraph(repo, g);
		ant.getGraph(repo, g);
		antATL.getGraph(repo, g);
		it.univaq.MDEProfiler.graph.util.Serializer.serializeModel(g, "/home/juri/AAAgraph.xmi");
	}

	@Ignore
	@Test
	public void testProperties() {
		assertNotNull(FileUtils.getRootFolder());
	}

	@Ignore
	@Test
	public void testAnt2Maven() {
		String repo = "/home/juri/MDEProfiler/Ant2Maven";
		Graph g = GraphFactory.eINSTANCE.createGraph();
		g.setName("/home/juri/MDEProfiler/Table2SVGBarChart/Table2SVGBarChart/");
		ecore.getGraph(repo, g);
		atl.getGraph(repo, g);
		km3.getGraph(repo, g);
		launcher.getGraph(repo, g);
		launcherGraph.getGraph(repo, g);
		atlPath.getGraph(repo, g);
		ant.getGraph(repo, g);
		antATL.getGraph(repo, g);
		it.univaq.MDEProfiler.graph.util.Serializer.serializeModel(g, repo + "/graph.xmi");
	}

	@Ignore
	@Test
	public void testAssertionModification() {
		String repo = "/home/juri/MDEProfiler/AssertionModification";
		Graph g = GraphFactory.eINSTANCE.createGraph();
		g.setName("/home/juri/MDEProfiler/AssertionModification/AssertionModification/");
		ecore.getGraph(repo, g);
		atl.getGraph(repo, g);
		km3.getGraph(repo, g);
		launcher.getGraph(repo, g);
		launcherGraph.getGraph(repo, g);
		atlPath.getGraph(repo, g);
		ant.getGraph(repo, g);
		antATL.getGraph(repo, g);
		it.univaq.MDEProfiler.graph.util.Serializer.serializeModel(g, repo + "/graph.xmi");
	}

	@Ignore
	@Test
	public void testTable2SVGBarChart() {
		String repo = "/home/juri/MDEProfiler/Table2SVGBarChart";
		Graph g = GraphFactory.eINSTANCE.createGraph();
		g.setName("/home/juri/MDEProfiler/Table2SVGBarChart/Table2SVGBarChart/");
		ecore.getGraph(repo, g);
		atl.getGraph(repo, g);
		km3.getGraph(repo, g);
		launcher.getGraph(repo, g);
		launcherGraph.getGraph(repo, g);
		atlPath.getGraph(repo, g);
		ant.getGraph(repo, g);
		antATL.getGraph(repo, g);
		it.univaq.MDEProfiler.graph.util.Serializer.serializeModel(g, repo + "/graph.xmi");
	}

	@Ignore
	@Test
	public void testMeasuringModelRepositories() {
		String repo = "/home/juri/MDEProfiler/MeasuringModelRepositories/";
		Graph g = GraphFactory.eINSTANCE.createGraph();
		g.setName("/home/juri/MDEProfiler/MeasuringModelRepositories/MeasuringModelRepositories/");
		ecore.getGraph(repo, g);
		atl.getGraph(repo, g);
		km3.getGraph(repo, g);
		launcher.getGraph(repo, g);
		launcherGraph.getGraph(repo, g);
		atlPath.getGraph(repo, g);
		ant.getGraph(repo, g);
		antATL.getGraph(repo, g);
		it.univaq.MDEProfiler.graph.util.Serializer.serializeModel(g, repo + "/graph.xmi");
	}

	@Ignore
	@Test
	public void testTT2BDD() {
		String repo = "/home/juri/MDEProfiler/TT2BDD/";
		Graph g = GraphFactory.eINSTANCE.createGraph();
		g.setName("/home/juri/MDEProfiler/MeasuringModelRepositories/MeasuringModelRepositories/");
		ecore.getGraph(repo, g);
		atl.getGraph(repo, g);
		km3.getGraph(repo, g);
		launcher.getGraph(repo, g);
		launcherGraph.getGraph(repo, g);
		atlPath.getGraph(repo, g);
		// ant.getGraph(repo, g);
		// antATL.getGraph(repo, g);
		it.univaq.MDEProfiler.graph.util.Serializer.serializeModel(g, repo + "/graph.xmi");
	}

	@Ignore
	@Test
	public void testeFileUtil() {
		String repo = "/home/juri/MDEProfiler/Table2SVGBarChart/";
		Graph g = GraphFactory.eINSTANCE.createGraph();
		g.setName("/home/juri/MDEProfiler/Table2SVGBarChart/Table2SVGBarChart/");
		atl.getGraph(repo, g);
		Node m = GraphFactory.eINSTANCE.createNode();
		m.setDerivedOrNotExists(false);
		m.setName("asd");
		m.setUri("/home/juri/MDEProfiler/Table2SVGBarChart/Table2SVGBarChart/build.xml");
		Node s1 = FileUtils.getNodeByFilePathLazy(g, g.getName() + "transformations/Table2SVGBarChart.atl");
		assertNotNull(s1);
		Node s2 = FileUtils.getNodeByFilePath(g, g.getName() + "transformations/Table2SVGBarChart.atl");
		assertNotNull(s2);
		// transformations/TableSVGBarChart.atl
	}

	@Test
	public void mergeTest() {
		Map<Node, Integer> mapNode = new HashMap<>();
		File outputModelFolder = new File(
				"/home/juri/Scrivania/MDEProfile/EH_AH_KH_LH_ANH_APH_LTH_ANATLH_TOTEM_KM3ECORE/");
		Graph g = GraphFactory.eINSTANCE.createGraph();
		int count = 0;
		for (File project : outputModelFolder.listFiles()) {
			if (count > 30)
				break;
			Graph old = Serializer.deserializeModel(project.getAbsolutePath());
			for (Node n : old.getNodes())
				mapNode.put(n, new Integer(count));
			g.getNodes().addAll(old.getNodes());
			g.getEdges().addAll(old.getEdges());
			count++;
		}

		// File.separator + "global.xmi");
		Set<String> genericNames = new HashSet<>();
		Set<Node> genericNodes = new HashSet<>();
		for (Node node1 : g.getNodes()) {
			for (Node node2 : g.getNodes()) {
				String s2 = getLastPart(node2.getUri());
				String s1 = getLastPart(node1.getUri());
				if (!mapNode.get(node1).equals(mapNode.get(node2)) && node2 != node1) {
					if (s1.equals(s2) && !node2.getUri().equals(node1.getUri())) {
						Edge e = GraphFactory.eINSTANCE.createEdge();
						e.setSource(node1);
						e.setTarget(node2);
						e.setName(FileUtils.BETTWEN_GRPAPH);
						g.getEdges().add(e);
					}
					if (node2.getUri().equals(node1.getUri()) && !genericNames.contains(node2.getUri())) {
						Node n = GraphFactory.eINSTANCE.createNode();
						n.setName(node1.getName());
						n.getType().addAll(node1.getType());
						n.getType().addAll(node2.getType());
						n.setUri(node1.getUri());
						genericNames.add(node1.getUri());
						genericNodes.add(n);
					}

				}
			}
		}
		for (Node node : genericNodes) {
			node.getType().add("GENERIC_NODE");

			List<Node> toRemove = g.getNodes().stream().filter(z -> z.getUri().equals(node.getUri()))
					.collect(Collectors.toList());
			for (Node node2 : toRemove) {
				List<Edge> edges = g.getEdges().stream().filter(z -> z.getSource().equals(node2))
						.collect(Collectors.toList());
				for (Edge edge : edges)
					edge.setSource(node);
				
				edges = g.getEdges().stream().filter(z -> z.getTarget() != null && z.getTarget().equals(node2))
						.collect(Collectors.toList());
				for (Edge edge : edges)
					edge.setTarget(node);
			}
			g.getNodes().add(node);
			g.getNodes().removeAll(toRemove);

		}
		removeDuplicateEdges(g);
		Serializer.serializeModel(g, outputModelFolder.getAbsolutePath() + File.separator + "global2.xmi");
	}

	private void removeDuplicateEdges(Graph g) {
		for (Edge iterable_element : g.getEdges()) {
			if (iterable_element.getName()==null)
				iterable_element.setName("TEMP_NAME");
		}
		Set<Edge> edgs = new HashSet<Edge>();
		for (Edge edge : g.getEdges()) {
			if (!edgs.contains(edge)) {
				List<Edge> edgis = g
						.getEdges().stream().filter(z ->
								z.getName().equals(edge.getName())	&& 
								(edge.getTarget() == z.getTarget() && ( 
								edge.getSource() == z.getSource()) ||
									(edge.getTarget() == z.getSource()) && 
									edge.getSource() == z.getTarget()) && 
								edge != z)
						.collect(Collectors.toList());
				edgs.addAll(edgis);
			}
		}
		g.getEdges().removeAll(edgs);
		return;
	}

	private String getLastPart(String s1) {
		if (s1.contains("/")) {
			s1 = s1.substring(s1.lastIndexOf("/"));
		}
		return s1;
	}

	@Ignore
	@Test
	public void countNodesByType() {
		File outputModelFolder = new File("/home/juri/Scrivania/MDEProfile/outputModel3/");
		for (File project : outputModelFolder.listFiles()) {
			String path = project.getAbsolutePath();
			if (new File(path).exists()) {
				Graph old = Serializer.deserializeModel(path);
				// old.getNodes().stream().filter(z -> (z.getType() == null) ||
				// z.getType().size()==0).collect(Collectors.toList()).forEach(z ->
				// System.out.println(z.getUri()));
				// for (Edge ed : old.getEdges()) {
				// if(ed.getDiscoverBy() != null &&
				// ed.getDiscoverBy().getType().contains(FileUtils.DRM))
				// System.out.println(ed.getSource().getUri() + " - " +
				// ed.getTarget().getUri());
				// }
				for (Node iterable_element : old.getNodes()) {
					if (iterable_element.getType().contains(FileUtils.JavaKind))
						System.out.println(iterable_element.getUri());
				}
			}
		}
	}

	@Ignore
	@Test
	public void dandling() {
		File outputModelFolder = new File(
				"/home/juri/Scrivania/MDEProfile/EH_AH_KH_LH_ANH_APH_LTH_ANATLH_TOTEM_KM3ECORE/");
		File outputModelFolder2 = new File("/home/juri/Scrivania/MDEProfile/outputModel2/");
		File outputModelFolder3 = new File("/home/juri/Scrivania/MDEProfile/outputModel3/");
		int numOfNodes = 0;
		int numOfEdges = 0;
		int numOfDandling = 0;
		// int numOfNodes2 = 0;
		// int numOfEdges2 = 0;
		// int numOfDandling2 = 0;
		// int numOfNodes3 = 0;
		// int numOfEdges3 = 0;
		// int numOfDandling3 = 0;
		for (File project : outputModelFolder.listFiles()) {
			System.out.println(project.getAbsolutePath());
			String path = project.getAbsolutePath();
			String path2 = outputModelFolder2 + "/" + project.getName();
			String path3 = outputModelFolder3 + "/" + project.getName();
			if (new File(path3).exists()) {
				Graph old = Serializer.deserializeModel(path);
				numOfNodes += old.getNodes().stream().filter(z -> !(z.getType().contains(FileUtils.DRM))).count();
				numOfEdges += old.getEdges().stream()
						.filter(z -> z.getName() != null
								&& !(z.getName().equals(FileUtils.DRM_IN) || z.getName().equals(FileUtils.DRM_OUT)))
						.count();
				numOfDandling += countDandling(old);
				// Graph g1 = Serializer.deserializeModel(path2);
				// numOfNodes2 += g1.getNodes().stream().filter(z ->
				// !(z.getType().contains(FileUtils.DRM))).count();
				// numOfEdges2 += g1.getEdges().stream().filter(z -> z.getName() != null &&
				// !(z.getName().equals(FileUtils.DRM_IN) ||
				// z.getName().equals(FileUtils.DRM_OUT)) ).count();
				// numOfDandling2 += countDandling(g1);
				// Graph g3 = Serializer.deserializeModel(path3);
				// numOfNodes3 += g3.getNodes().stream().filter(z ->
				// !(z.getType().contains(FileUtils.DRM))).count();
				// numOfEdges3 += g3.getEdges().stream().filter(z -> z.getName() != null &&
				// !(z.getName().equals(FileUtils.DRM_IN) ||
				// z.getName().equals(FileUtils.DRM_OUT)) ).count();
				// numOfDandling3 += countDandling(g3);
			}
		}
		System.out.println(numOfNodes + " & " + numOfEdges + " & " + numOfDandling + "|| |hline");
		// System.out.println("#Nodes2 " + numOfNodes2 + " #Edges2 " + numOfEdges2 +
		// "#Dandling2 " + numOfDandling2);
		// System.out.println("#Nodes3 " + numOfNodes3 + " #Edges3 " + numOfEdges3 +
		// "#Dandling3 " + numOfDandling3);
	}

	private int countDandling(Graph g) {
		int dandling = 0;
		for (Node n : g.getNodes().stream().filter(z -> !(z.getType().contains(FileUtils.DRM)))
				.collect(Collectors.toList())) {
			long k = 0;// g.getEdges().stream().filter(z-> (z.getSource().equals(n) ||
						// z.getSource().equals(n))).count();
			for (Edge edg : g.getEdges()) {
				if (edg.getSource() != null && edg.getSource().equals(n))
					k++;
				if (edg.getTarget() != null && edg.getTarget().equals(n))
					k++;
			}
			dandling += k == 0 ? 1 : 0;
		}
		return dandling;
	}

}

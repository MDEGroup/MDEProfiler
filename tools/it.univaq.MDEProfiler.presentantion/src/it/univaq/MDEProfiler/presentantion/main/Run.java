package it.univaq.MDEProfiler.presentantion.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import it.univaq.MDEProfiler.graph.model.graph.Graph;
import it.univaq.MDEProfiler.graph.util.Serializer;
import it.univaq.MDEProfiler.heuristic.HeuristicManager;

public class Run {

	private static String baseFolder = "/home/juri/Dropbox/ATLZoo/";
	private static String outputModelFolder = "/home/juri/Scrivania/MDEProfile/EH_AH_KH_LH_ANH_APH_LTH_ANATLH_TOTEM_KM3ECORE/";
//	private static String outputModelFolder2 = "/home/juri/Scrivania/MDEProfile/outputModel2/";
	private static String outputModelFolder3 = "/home/juri/Scrivania/MDEProfile/outputModel3/";
	private static String outHTML = "/home/juri/Scrivania/MDEProfile/outputHTML/";
	private static String _path = "/home/juri/Scrivania/output.txt";
	private static HeuristicManager heuristicManager;
	// public static void main(String[] args){
	// outmodel = outputModelFolder + "name" + ".xmi";
	// runAnalysis();
	// Generate.run(outmodel, outHTML);
	// }

	public static void main(String[] args) {
//		runAnalysisKM3();
//		File baseFolderFile = new File("/home/juri/Scrivania/modelResult/");
//		for (File file : baseFolderFile.listFiles()) {
//			System.out.println("<a href='" + file.getName().replace("xmi", "") + "html'>"
//					+ file.getName().substring(0, file.getName().length() - 4) + "</a>");
			Generate.run(outputModelFolder + "global2.xmi", outHTML);
//
//		}
	}

	private static void runAnalysis() {

		File file = new File(baseFolder);
		for (File f : file.listFiles(File::isDirectory)) {
			// try {
			System.out.println("________________ " + f.getAbsolutePath());
			String graphFile = outputModelFolder + f.getAbsolutePath().replace("/home/juri/Dropbox/ATLZoo/", "")
					+ ".xmi";

			heuristicManager = new HeuristicManager();
			Graph g = heuristicManager.launcherEcore_ATL_ATLWithPathLaucher_LauncherATL_ANT_ANTWithATL(f);

			Serializer.serializeModel(g, outputModelFolder + f.getName() + ".xmi");
			// } catch(Exception e) {
			// System.err.println(f.getAbsolutePath());
			// }
		}
	}
	
	private static void runAnalysisKM3() {

		File file = new File(baseFolder);
		for (File f : file.listFiles(File::isDirectory)) {
			// try {
			System.out.println("________________ " + f.getAbsolutePath());
			String graphFile = outputModelFolder + f.getAbsolutePath().replace("/home/juri/Dropbox/ATLZoo/", "")
					+ ".xmi";
			try {
				Graph myWeb = Serializer.deserializeModel(graphFile);
				
				heuristicManager = new HeuristicManager(myWeb);
				Graph g = heuristicManager.launcherKM3Edges(f);
	
				Serializer.serializeModel(g, outputModelFolder3 + f.getName() + ".xmi");
			 } catch(Exception e) {
				 System.err.println(f.getAbsolutePath());
			 }
		}
	}

	private static void runAnalysisTotem2Step() {

		File file = new File(baseFolder);
		for (File f : file.listFiles(File::isDirectory)) {
			try {
			System.out.println("________________ " + f.getAbsolutePath());
			String graphFile = outputModelFolder + f.getAbsolutePath().replace("/home/juri/Dropbox/ATLZoo/", "")
					+ ".xmi";			
			Graph myWeb = Serializer.deserializeModel(graphFile);
			int old = myWeb.getEdges()!=null?myWeb.getEdges().size():0;
			heuristicManager = new HeuristicManager(myWeb);
			Graph g = heuristicManager.launcherTest(f);
			int newEdges = g.getEdges().size();
			
//			Serializer.serializeModel(g, outputModelFolder2 + f.getName() + ".xmi");
			try (Writer fileWriter = new FileWriter(_path, true)) {
				fileWriter.write(f.getAbsolutePath() + " from " +old + " to " + newEdges + "\n");
			} catch (IOException e) {}
			
			}catch(Exception e) {
			}
		}
	}

}

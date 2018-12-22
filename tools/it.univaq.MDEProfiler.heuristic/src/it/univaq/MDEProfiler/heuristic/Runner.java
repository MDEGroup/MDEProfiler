package it.univaq.MDEProfiler.heuristic;

import java.io.File;

import it.univaq.MDEProfiler.graph.model.graph.Graph;
import it.univaq.MDEProfiler.graph.util.Serializer;
//import it.univaq.MDEProfiler.presentantion.main.Generate;

public class Runner {

	private static String baseFolder = "/home/juri/Scrivania/MDEProfile/input/UMLStateMachine2NuSMV-master/";
	private static String outputModelFolder = "/home/juri/Scrivania/MDEProfile/outputModel/";
	private static String outHTML = "/home/juri/Scrivania/MDEProfile/outputHTML/";
	private static HeuristicManager heuristicManager = new HeuristicManager();
	private static String outmodel;
	public static void main(String[] args){
		outmodel = outputModelFolder + "name" + ".xmi";
		runAnalysis();
//		Generate.run(outmodel, outHTML);
	}

	private static void runAnalysis() {

		Graph g = heuristicManager.launcherTest(new File(baseFolder));
		Serializer.serializeModel(g, outmodel);

	}
//	public static void main(String[] args) {
//		System.out.println(StandAlone.check("hsm2fsm_sourceDRM.mm_uncertainty", "HSM.ecore"));
//	}
}

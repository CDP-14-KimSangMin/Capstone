import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import Data.*;
import Calculate.DijkstraAlgorithm;

import Calculate.*;

public class knuapp {
	public static void main(String[] args){
		List<Node> nodes;
		List<Edge> edges;
		DijkstraAlgorithm dijkstraAlgorithm;
		
		nodes = new ArrayList<Node>();
	    edges = new ArrayList<Edge>();
	       	    
	    for(int i=0;i<1013;i++){	//n : node ¼ö    	
	    	Node location = new Node(Integer.toString(i),"Node"+Integer.toString(i));
	    	nodes.add(location);
	    }

	    addEdge("Edge_1",nodes,edges,1,2,175);
	    addEdge("Edge_2",nodes,edges,2,3,129);
	    addEdge("Edge_3",nodes,edges,3,4,57);
	    addEdge("Edge_4",nodes,edges,4,5,189);
	    addEdge("Edge_5",nodes,edges,5,1012,80);
	    addEdge("Edge_6",nodes,edges,6,1012,121);
	    addEdge("Edge_7",nodes,edges,6,8,129);
	    addEdge("Edge_8",nodes,edges,8,9,87);
	    addEdge("Edge_9",nodes,edges,0,1,142);
	    addEdge("Edge_10",nodes,edges,2,14,25);
	    addEdge("Edge_11",nodes,edges,14,15,74);
	    addEdge("Edge_12",nodes,edges,15,16,44);
	    addEdge("Edge_13",nodes,edges,12,16,52);addEdge("Edge_",nodes,edges,1,2,175);
	    addEdge("Edge_",nodes,edges,2,3,129);
	    addEdge("Edge_",nodes,edges,3,4,57);
	    addEdge("Edge_",nodes,edges,4,5,189);
	    addEdge("Edge_",nodes,edges,5,1012,80);
	    addEdge("Edge_",nodes,edges,6,1012,121);
	    addEdge("Edge_",nodes,edges,6,8,129);
	    addEdge("Edge_",nodes,edges,8,9,87);
	    addEdge("Edge_",nodes,edges,0,1,142);
	    addEdge("Edge_",nodes,edges,2,14,25);
	    addEdge("Edge_",nodes,edges,14,15,74);
	    addEdge("Edge_",nodes,edges,15,16,44);
	    addEdge("Edge_",nodes,edges,12,16,52);
	    addEdge("Edge_",nodes,edges,9,10,44);
	    addEdge("Edge_",nodes,edges,10,11,25);
	    addEdge("Edge_",nodes,edges,11,12,51);
	    addEdge("Edge_",nodes,edges,0,12,154);
	    addEdge("Edge_",nodes,edges,16,18,55);
	    addEdge("Edge_",nodes,edges,18,20,54);
	    addEdge("Edge_",nodes,edges,10,20,51);
	    addEdge("Edge_",nodes,edges,19,20,41);
	    addEdge("Edge_",nodes,edges,17,19,26);
	    addEdge("Edge_",nodes,edges,17,1003,61);
	    addEdge("Edge_",nodes,edges,1003,1006,35);
	    addEdge("Edge_",nodes,edges,14,1003,30);
	    addEdge("Edge_",nodes,edges,15,17,81);
	    addEdge("Edge_",nodes,edges,1006,1009,51);
	    addEdge("Edge_",nodes,edges,4,1009,45);
	    addEdge("Edge_",nodes,edges,23,1009,42);
	    addEdge("Edge_",nodes,edges,19,21,36);
	    addEdge("Edge_",nodes,edges,21,23,46);
	    addEdge("Edge_",nodes,edges,23,25,56);
	    addEdge("Edge_",nodes,edges,24,1010,53);
	    addEdge("Edge_",nodes,edges,8,1010,60);
	    addEdge("Edge_",nodes,edges,23,24,22);
	    addEdge("Edge_",nodes,edges,17,1004,20);
	    addEdge("Edge_",nodes,edges,18,1004,20);
	    addEdge("Edge_",nodes,edges,21,1007,20);
	    addEdge("Edge_",nodes,edges,22,1007,20);
	    addEdge("Edge_",nodes,edges,18,1005,25);
	    addEdge("Edge_",nodes,edges,11,1005,25);
	    addEdge("Edge_",nodes,edges,22,1008,25);
	    addEdge("Edge_",nodes,edges,9,1008,25);
	    addEdge("Edge_",nodes,edges,25,1010,22);
	    addEdge("Edge_",nodes,edges,17,1006,56);
	    addEdge("Edge_",nodes,edges,22,24,82);
	    addEdge("Edge_",nodes,edges,20,22,30);
	    addEdge("Edge_",nodes,edges,13,15,52);
	    addEdge("Edge_",nodes,edges,13,1002,17);
	    addEdge("Edge_",nodes,edges,13,1001,17);
	    addEdge("Edge_14",nodes,edges,9,10,44);
	    addEdge("Edge_15",nodes,edges,10,11,25);
	    addEdge("Edge_16",nodes,edges,11,12,51);
	    addEdge("Edge_17",nodes,edges,0,12,154);
	    addEdge("Edge_18",nodes,edges,16,18,55);
	    addEdge("Edge_19",nodes,edges,18,20,54);
	    addEdge("Edge_20",nodes,edges,10,20,51);
	    addEdge("Edge_21",nodes,edges,19,20,41);
	    addEdge("Edge_22",nodes,edges,17,19,26);
	    addEdge("Edge_23",nodes,edges,17,1003,61);
	    addEdge("Edge_24",nodes,edges,1003,1006,35);
	    addEdge("Edge_25",nodes,edges,14,1003,30);
	    addEdge("Edge_26",nodes,edges,15,17,81);
	    addEdge("Edge_27",nodes,edges,1006,1009,51);
	    addEdge("Edge_28",nodes,edges,4,1009,45);
	    addEdge("Edge_29",nodes,edges,23,1009,42);
	    addEdge("Edge_30",nodes,edges,19,21,36);
	    addEdge("Edge_31",nodes,edges,21,23,46);
	    addEdge("Edge_32",nodes,edges,23,25,56);
	    addEdge("Edge_33",nodes,edges,24,1010,53);
	    addEdge("Edge_34",nodes,edges,8,1010,60);
	    addEdge("Edge_35",nodes,edges,23,24,22);
	    addEdge("Edge_36",nodes,edges,17,1004,20);
	    addEdge("Edge_37",nodes,edges,18,1004,20);
	    addEdge("Edge_38",nodes,edges,21,1007,20);
	    addEdge("Edge_39",nodes,edges,22,1007,20);
	    addEdge("Edge_40",nodes,edges,18,1005,25);
	    addEdge("Edge_41",nodes,edges,11,1005,25);
	    addEdge("Edge_42",nodes,edges,22,1008,25);
	    addEdge("Edge_43",nodes,edges,9,1008,25);
	    addEdge("Edge_44",nodes,edges,25,1010,22);
	    addEdge("Edge_45",nodes,edges,17,1006,56);
	    addEdge("Edge_46",nodes,edges,22,24,82);
	    addEdge("Edge_47",nodes,edges,20,22,30);
	    addEdge("Edge_48",nodes,edges,13,15,52);
	    addEdge("Edge_49",nodes,edges,13,1002,17);
	    addEdge("Edge_50",nodes,edges,13,1001,17);
	    
	    
	    Graph graph = new Graph(nodes, edges);
	    dijkstraAlgorithm = new DijkstraAlgorithm(graph);
	    dijkstraAlgorithm.execute(nodes.get(1002));
	    LinkedList<Node> path = dijkstraAlgorithm.getPath(nodes.get(1006));
	    for (Node vertex : path) {
	        
	    	System.out.print(vertex + ">");
	        
	    }
	    int temp = dijkstraAlgorithm.getdistance(nodes.get(1006));
	    System.out.print(temp);
		return;
	}

	public static void addEdge(String laneId, List<Node> nodes, List<Edge> edges, int from, int to, int distance){
		Edge lane = new Edge(laneId,nodes.get(from), nodes.get(to), distance);
		edges.add(lane);
    	Edge lane2 = new Edge(laneId,nodes.get(to), nodes.get(from), distance);
    	edges.add(lane2);
	}
}
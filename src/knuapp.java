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
	       	    
	    for(int i=0;i<37;i++){	//n : node ¼ö    	
	    	Node location = new Node(Integer.toString(i),"Node"+Integer.toString(i));
	    	nodes.add(location);
	    }

	    addEdge("Edge_0",nodes,edges,1,2,5);
	    addEdge("Edge_1",nodes,edges,2,3,5);
	    addEdge("Edge_2",nodes,edges,3,4,10);
	    addEdge("Edge_3",nodes,edges,4,0,2);
	    addEdge("Edge_4",nodes,edges,0,36,4);
	    addEdge("Edge_5",nodes,edges,4,14,1);
	    addEdge("Edge_6",nodes,edges,36,33,4);
	    addEdge("Edge_7",nodes,edges,33,34,1);
	    addEdge("Edge_8",nodes,edges,33,32,4);
	    addEdge("Edge_9",nodes,edges,32,31,1);
	    addEdge("Edge_10",nodes,edges,31,27,1);
	    addEdge("Edge_11",nodes,edges,27,26,1);
	    addEdge("Edge_12",nodes,edges,26,24,1);
	    addEdge("Edge_13",nodes,edges,24,1,5);
	    addEdge("Edge_14",nodes,edges,2,5,1);
	    addEdge("Edge_15",nodes,edges,5,6,2);
	    addEdge("Edge_16",nodes,edges,6,7,1);
	    addEdge("Edge_17",nodes,edges,7,3,1);
	    addEdge("Edge_18",nodes,edges,5,10,2);
	    addEdge("Edge_19",nodes,edges,9,10,1);
	    addEdge("Edge_20",nodes,edges,10,11,2);
	    addEdge("Edge_21",nodes,edges,11,6,1);
	    addEdge("Edge_22",nodes,edges,11,12,2);
	    addEdge("Edge_23",nodes,edges,12,8,3);
	    addEdge("Edge_24",nodes,edges,11,7,1);
	    addEdge("Edge_25",nodes,edges,16,17,1);
	    addEdge("Edge_26",nodes,edges,17,27,1);
	    addEdge("Edge_27",nodes,edges,10,17,1);
	    addEdge("Edge_28",nodes,edges,17,18,1);
	    addEdge("Edge_29",nodes,edges,18,15,1);
	    addEdge("Edge_30",nodes,edges,15,11,1);
	    addEdge("Edge_31",nodes,edges,18,19,1);
	    addEdge("Edge_32",nodes,edges,19,12,1);
	    addEdge("Edge_33",nodes,edges,19,21,1);
	    addEdge("Edge_34",nodes,edges,19,32,1);
	    addEdge("Edge_35",nodes,edges,33,34,1);
	    addEdge("Edge_36",nodes,edges,23,31,1);
	    addEdge("Edge_37",nodes,edges,23,18,1);
	    
	    
	    Graph graph = new Graph(nodes, edges);
	    dijkstraAlgorithm = new DijkstraAlgorithm(graph);
	    dijkstraAlgorithm.execute(nodes.get(1));
	    LinkedList<Node> path = dijkstraAlgorithm.getPath(nodes.get(4));
	    for (Node vertex : path) {
	        
	    	System.out.print(vertex + ">");
	        
	    }
	    
	    System.out.print(dijkstraAlgorithm.getdistance(nodes.get(4)));
		return;
	}

	public static void addEdge(String laneId, List<Node> nodes, List<Edge> edges, int from, int to, int distance){
		Edge lane = new Edge(laneId,nodes.get(from), nodes.get(to), distance);
		edges.add(lane);
    	Edge lane2 = new Edge(laneId,nodes.get(to), nodes.get(from), distance);
    	edges.add(lane2);
	}
}


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import Data.*;
import Calculate.DijkstraAlgorithm;

public class knuapp {
	public static void main(String[] args){
		List<Node> nodes;
		List<Edge> edges;
		DijkstraAlgorithm dijkstraAlgorithm;
		
		nodes = new ArrayList<Node>();
	    edges = new ArrayList<Edge>();
	       	    
	    for(int i=0;i<7;i++){	    	
	    	Node location = new Node(Integer.toString(i),"Node"+Integer.toString(i));
	    	nodes.add(location);
	    }

	    addEdge("Edge_0",nodes,edges,0,1,10);
	    addEdge("Edge_1",nodes,edges,0,2,9);
	    addEdge("Edge_2",nodes,edges,0,4,5);
	    addEdge("Edge_3",nodes,edges,1,2,7);
	    addEdge("Edge_4",nodes,edges,1,3,6);
	    addEdge("Edge_5",nodes,edges,2,3,8);
	    addEdge("Edge_6",nodes,edges,2,4,15);
	    addEdge("Edge_7",nodes,edges,2,6,18);
	    addEdge("Edge_8",nodes,edges,3,5,3);
	    addEdge("Edge_0",nodes,edges,3,6,19);
	    addEdge("Edge_10",nodes,edges,4,6,12);

	    
	    
	    Graph graph = new Graph(nodes, edges);
	    dijkstraAlgorithm = new DijkstraAlgorithm(graph);
	    dijkstraAlgorithm.execute(nodes.get(0));
	    LinkedList<Node> path = dijkstraAlgorithm.getPath(nodes.get(6));
	    for (Node vertex : path) {
	        System.out.print(vertex + ">");
	    }
	    
		return;
	}

	public static void addEdge(String laneId, List<Node> nodes, List<Edge> edges, int from, int to, int distance){
		Edge lane = new Edge(laneId,nodes.get(from), nodes.get(to), distance);
		edges.add(lane);
    	Edge lane2 = new Edge(laneId,nodes.get(to), nodes.get(from), distance);
    	edges.add(lane2);
	}
}
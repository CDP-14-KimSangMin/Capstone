

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
	       	    
	    for(int i=0;i<4;i++){	    	
	    	Node location = new Node(Integer.toString(i),"Node"+Integer.toString(i));
	    	nodes.add(location);
	    }

	    addEdge("Edge_0",nodes,edges,0,1,10);

	    
	    
	    Graph graph = new Graph(nodes, edges);
	    dijkstraAlgorithm = new DijkstraAlgorithm(graph);
	    dijkstraAlgorithm.execute(nodes.get(1));
	    LinkedList<Node> path = dijkstraAlgorithm.getPath(nodes.get(3));
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
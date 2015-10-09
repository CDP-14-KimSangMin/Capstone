package TestCase;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.junit.Test;

import Data.*;
import Calculate.DijkstraAlgorithm;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class TestDijkstraAlgorithm {

  private List<Node> nodes;
  private List<Edge> edges;

  @Test
  public void testExcute() {
    nodes = new ArrayList<Node>();
    edges = new ArrayList<Edge>();
    for (int i = 0; i < 300; i++) {
    	Node location = new Node("Node_" + i, "Node_" + i);
      nodes.add(location);
    }
    int k = 0;
    int length = 50;
    for (int i = 0; i < 222; i+=7) {
    	for(int j = i; j < 222; j+=5)
    	{
    			undirected("Edge_"+Integer.toString(k), i, j, length+=j);
    			k++;
    			length-=i;
    	}
    }
    for (int i = 1; i < 222; i+=2) {
    	for(int j = i; j < 222; j+=7)
    	{
    			undirected("Edge_"+Integer.toString(k), i, j, length+=j);
    			k++;
    			length-=i;
    	}
    }
    
    /*
    undirected("Edge_0", 0, 1, 85);
    undirected("Edge_1", 0, 2, 217);
    undirected("Edge_2", 0, 4, 173);
    undirected("Edge_3", 2, 6, 186);
    undirected("Edge_4", 2, 7, 103);
    undirected("Edge_5", 3, 7, 183);
    undirected("Edge_6", 5, 8, 250);
    undirected("Edge_7", 8, 9, 84);
    undirected("Edge_8", 7, 9, 167);
    undirected("Edge_9", 4, 9, 502);
    undirected("Edge_10", 9, 10, 40);
    undirected("Edge_11", 1, 10, 600);
    undirected("Edge_12", 5, 2, 10);
*/
    // Lets check from location Loc_1 to Loc_10
    Graph graph = new Graph(nodes, edges);
    DijkstraAlgorithm dijkstra = new DijkstraAlgorithm(graph);
    dijkstra.execute(nodes.get(0));
    LinkedList<Node> path = dijkstra.getPath(nodes.get(217));
    
    assertNotNull(path);
    assertTrue(path.size() > 0);
    
    for (Node vertex : path) {
      System.out.println(vertex);
    }
    
  }

  
  private void undirected(String laneId, int from, int to,
	      int duration) {
	    Edge lane = new Edge(laneId,nodes.get(from), nodes.get(to), duration);
	    edges.add(lane);
	    Edge lane2 = new Edge(laneId,nodes.get(to), nodes.get(from), duration);
	    edges.add(lane2);
	  }
  
} 
package Data;
import java.util.List;
public class Graph {
	/**
	 * constructor
	 */
	public Graph(List<Node> nodes, List<Edge> edges){
		this.nodes = nodes;
		this.edges = edges;
	}
	
	public List<Node> getNodes(){
		return nodes;
	}
	
	public List<Edge> getEdges(){
		return edges;
	}
	
	private List<Node> nodes;
	private List<Edge> edges;
}

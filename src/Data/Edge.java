package Data;

/**
 * @author 2011105018
 */
public class Edge {
	
	/**
	 * Constructor
	 */
	public Edge(int distance, Node from, Node to ){
		this.distance = distance;
		this.from = from;
		this.to = to;
	}
	
	//getter & setter
	//NearRoadData will be initialized by constructor. setter is not necessary
	public int getDistance(){
		return this.distance;
	}
	
	public Node getFrom(){
		return this.from;
	}
	
	public Node getTo(){
		return this.to;
	}
	
	//variables
	private int distance;
	private Node from, to;	
}

package Data;

/**
 * @author 2011105018
 */
public class Edge {
	
	/**
	 * Constructor
	 */
	public Edge(String id, Node from, Node to, int distance){
		this.id = id;
		this.from = from;
		this.to = to;
		this.distance = distance;
		
	}
	
	//getter & setter
	public String getId(){
		return id;
	}
	
	public int getDistance(){
		return distance;
	}
	
	public Node getFrom(){
		return from;
	}
	
	public Node getTo(){
		return to;
	}
	
	//method
	@Override
	public String toString(){
		return from + " " + to;
	}
	
	//variables
	private String id;
	private int distance;
	private Node from;
	private Node to;	
}

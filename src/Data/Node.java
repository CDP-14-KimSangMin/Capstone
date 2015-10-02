package Data;

import java.util.Vector;

public class Node {
	

	//constructor

	public Node(String name){
		this.Name = name;
	}
	
	//getter & setter
	
	public String getName(){
		return this.Name;
	}
	
	public void setName(String name){
		this.Name = name;
	}
	
	//method
	
	/**
	 * This method adds Edge (addElement)
	 * @param roadData
	 */
	public void addNearRoad(Edge roadData){
		Road.addElement(roadData);
	}
	
	//variables
	private Vector<Edge> Road = new Vector<Edge>();
	private String Name;	
}

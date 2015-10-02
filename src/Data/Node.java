package Data;

import java.util.Vector;

public class Node {
	

	//constructor

	public Node(String id, String name, int x, int y){
		this.name = name;
		this.id = id;
		this.x = x;
		this.y = y;
	}
	
	public Node(String id, String name){
		this.name = name;
		this.id = id;
	}
	
	//getter & setter
	
	public String getName(){
		return name;
	}
	
	public String getId(){
		return id;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	//method
	
	/**
	 * This method adds Edge (addElement)
	 * @param roadData
	 */
	public void addNearRoad(Edge roadData){
		Road.addElement(roadData);
	}
	
	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id==null) ? 0 : id.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj){
		if(this==obj) return true;
		if(obj==null) return false;
		if(getClass() != obj.getClass()) return false;
		Node other = (Node) obj;
		if(id==null){
			if(other.id != null){
				return false;
			}
		}else if(!id.equals(other.id)){
			return false;
		}
		return true;
	}
	
	public String toString(){
		return name;
	}
	//variables
	private Vector<Edge> Road = new Vector<Edge>();
	private String name;
	private String id;
	private int x;
	private int y;
}

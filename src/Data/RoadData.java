package Data;

import java.util.Vector;

public class RoadData {
	
	//method
	/**
	 * This method get name of road
	 * @return String RoadName
	 */
	public String getName(){
		return this.RoadName;
	}
	
	public void addNearRoad(NearRoadData roadData){
		nearRoad.addElement(roadData);
	}
	
	private Vector<NearRoadData> nearRoad = new Vector<NearRoadData>();
	private String RoadName;
	
}

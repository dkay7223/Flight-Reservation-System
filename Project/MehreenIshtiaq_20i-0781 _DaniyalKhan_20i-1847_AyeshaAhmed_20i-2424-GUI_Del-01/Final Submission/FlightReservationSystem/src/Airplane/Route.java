package Airplane;

public class Route { 
	
	
	private City depatureCity, ArrivalCity;
	private String routeID=this.depatureCity.getCityCode() + "-" + this.ArrivalCity.getCityCode();
	private int length; // in Kilometers

	public Route(City depatureCity, City arrivalCity, int length) {
		super();
		this.depatureCity = depatureCity;
		ArrivalCity = arrivalCity;
		this.setLength(length);
	}

	public String getRouteID() {
		return routeID;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public City getDepatureCity() {
		return depatureCity;
	}

	public City getArrivalCity() {
		return ArrivalCity;
	}
	
	   
	
	 
	
	
	 
	

}

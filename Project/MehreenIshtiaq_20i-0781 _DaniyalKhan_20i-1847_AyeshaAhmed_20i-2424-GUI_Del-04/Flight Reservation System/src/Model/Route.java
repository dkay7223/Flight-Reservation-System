package Model;

public class Route {

	private City depatureCity, ArrivalCity;
	private String routeID;
	private int length; // in Kilometers
	
	
	public Route(City depatureCity, City arrivalCity, int length) {
		super();
		this.depatureCity = depatureCity;
		ArrivalCity = arrivalCity;
		this.setLength(length);
	}

	public Route() {
		// TODO Auto-generated constructor stub
	}

	public City getDepatureCity() {
		return depatureCity;
	}

	public void setDepatureCity(City depatureCity) {
		this.depatureCity = depatureCity;
	}

	public City getArrivalCity() {
		return ArrivalCity;
	}

	public void setArrivalCity(City arrivalCity) {
		ArrivalCity = arrivalCity;
	}

	public String getRouteID() {
		return routeID;
	}

	public void setRouteID(String routeID) {
		this.routeID = routeID;
	}
	
	public void setRouteID() {
		this.routeID = this.getDepatureCity().getCityCode()+"-"+this.ArrivalCity.getCityCode();
	}
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

}

package Model;

import java.util.ArrayList;

public class City {  
	private String cityName;
	private String cityCode; // city Abbreviation: KHI for Karachi
	private ArrayList<Airport> airports = new ArrayList<>();
	
	
	
	public String getCityName() {
		return cityName;
	}

	public City(String cityName, String cityCode) {
		super();
		this.cityName = cityName;
		this.cityCode = cityCode;
	}

	public City() {
		// TODO Auto-generated constructor stub
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public ArrayList<Airport> getAirports() {
		return airports;
	}

	public void setAirports(ArrayList<Airport> airports) {
		this.airports = airports;
	}

}

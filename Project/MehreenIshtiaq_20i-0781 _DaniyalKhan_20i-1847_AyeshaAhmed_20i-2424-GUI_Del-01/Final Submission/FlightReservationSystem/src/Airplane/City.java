package Airplane;

import java.util.ArrayList;

public class City {  
	private String cityName;
	private String cityCode; // city Abbreviation: KHI for Karachi
	ArrayList<Airport> airports = new ArrayList<>();
	

	public City(String cityName, String cityCode) {
		super();
		this.cityName = cityName;
		this.cityCode = cityCode;
	}

	public String getCityName() {
		return cityName;
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

}

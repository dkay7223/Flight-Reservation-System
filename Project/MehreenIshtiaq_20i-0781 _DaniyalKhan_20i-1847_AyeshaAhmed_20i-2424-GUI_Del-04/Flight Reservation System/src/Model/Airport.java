package Model;

import java.util.ArrayList;

public class Airport {
	private String airportName;
	private String AirportID; // CityAbb: KHI-11; ISB-11
	private ArrayList<Airplane> arrivingAirplanes = new ArrayList<>();
	private ArrayList<Airplane> unScheduledAirplanes = new ArrayList<>();
	private ArrayList<Airplane> departingAirplanes = new ArrayList<>();

	public String getAirportName() {
		return airportName;
	}

	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}

	public String getAirportID() {
		return AirportID;
	}

	public void setAirportID(String airportID) {
		AirportID = airportID;
	}

	public ArrayList<Airplane> getArrivingAirplanes() {
		return arrivingAirplanes;
	}

	public void setArrivingAirplanes(ArrayList<Airplane> arrivingAirplanes) {
		this.arrivingAirplanes = arrivingAirplanes;
	}

	public ArrayList<Airplane> getUnScheduledAirplanes() {
		return unScheduledAirplanes;
	}

	public void setUnScheduledAirplanes(ArrayList<Airplane> unScheduledAirplanes) {
		this.unScheduledAirplanes = unScheduledAirplanes;
	}

	public ArrayList<Airplane> getDepartingAirplanes() {
		return departingAirplanes;
	}

	public void setDepartingAirplanes(ArrayList<Airplane> departingAirplanes) {
		this.departingAirplanes = departingAirplanes;
	}

}

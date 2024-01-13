package Model;

import java.util.ArrayList;

public class Flight {
	// ----Copied from Flight
	public String flightID; // KHI-ISB : RouteID
	public Route route; // City1-City2
	int initialFare; // on the basis of length of Route
	ArrayList<FlightSchedule> flightSchedule = new ArrayList<>();

	public Flight(Route route) {
		super();
		this.route = route;
	}

	public Flight() {
		// TODO Auto-generated constructor stub
	}

	public String getFlightID() {
		return flightID;
	}

	public void setFlightID(String flightID) {
		this.flightID = flightID;
	}

	public Route getRoute() {
		return route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}

	public int getInitialFare() {
		return initialFare;
	}

	public void setFlightID() {
		this.flightID = this.route.getRouteID();
	}

	public void setInitialFare(int initialFare) {
		this.initialFare = initialFare;
	}

	public void setInitialFare() {
		this.initialFare = this.route.getLength() * 20;
	}

	public ArrayList<FlightSchedule> getFlightSchedule() {
		return flightSchedule;
	}

	public void setFlightSchedule(ArrayList<FlightSchedule> flightSchedule) {
		this.flightSchedule = flightSchedule;
	}
}

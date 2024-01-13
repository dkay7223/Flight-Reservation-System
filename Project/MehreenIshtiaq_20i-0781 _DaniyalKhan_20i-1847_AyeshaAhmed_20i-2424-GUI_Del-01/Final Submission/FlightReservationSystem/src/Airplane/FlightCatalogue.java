package Airplane;

import java.util.ArrayList;

public class FlightCatalogue {
	ArrayList<Flight> flights = new ArrayList<>();
	
	private FlightCatalogue() {
		
	}
	static FlightCatalogue getInstance() {
		if(Flightcatalogue==null) {
			Flightcatalogue=new FlightCatalogue();
		}
		return Flightcatalogue;
	}
	
	private static FlightCatalogue Flightcatalogue;
	
	public Flight createFlight(Route route, int initialFare) {
		Flight f=checkIfFlightExists(route, initialFare);
		if(f!=null) {
			return f;
		}
		 f = new Flight(route, initialFare);
		flights.add(f);
		return f;
	}

	private Flight checkIfFlightExists(Route route, int initialFare) {
		for (Flight flight : flights) {
			if (flight.route.equals(route) && flight.initialFare == initialFare) {
				return flight;
			}
		}
		return null;
	}
	 Flight checkIfFlightExists(Route route) {
		for (Flight flight : flights) {
			if (flight.route.equals(route)) {
				return flight;
			}
		}
		return null;
	}
	public void removeFlight(Route r) {

	}

	public void updateFlight(Route r) {

	}

	public ArrayList<Flight> getFlight() {
		return this.flights;

	}

	public FlightSchedule searchFlight(String departure, String arrivalCity) {
		return null;

	}
}

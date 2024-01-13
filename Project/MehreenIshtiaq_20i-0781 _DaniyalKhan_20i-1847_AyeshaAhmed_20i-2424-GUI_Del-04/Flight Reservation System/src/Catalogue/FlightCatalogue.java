package Catalogue;

import java.util.ArrayList;

import Exceptions.FlightAlreadyExistsException;
import Exceptions.FlightNotFoundException;
import Exceptions.RouteNotFoundException;
import Factory.Factory;
import Factory.FlightFactory;
import Model.Flight;
import Model.Route;

public class FlightCatalogue implements Catalogue {
	ArrayList<Flight> flights = new ArrayList<>();
	Factory flightFactory = new FlightFactory();

	private FlightCatalogue() {

	}

	public static FlightCatalogue getInstance() {
		if (Flightcatalogue == null) {
			Flightcatalogue = new FlightCatalogue();
		}
		return Flightcatalogue;
	}

	private static FlightCatalogue Flightcatalogue;

	public Flight createFlight(String routeID) {
		return createFlight(RouteCatalogue.getInstance().searchRoutebyID(routeID));
	}

	private Flight createFlight(Route route) {
		if (route == null) {
			try {
				throw new RouteNotFoundException("Route Does not Exist!");
			} catch (RouteNotFoundException e) {
				System.out.println(e);
				return null;
			}
		}
		Flight flight = checkIfFlightExists(route);
		try {
			if (flight != null) {
				throw new FlightAlreadyExistsException(
						"Can't add flight, because A flight already exists on this route!\n");
			}
		} catch (FlightAlreadyExistsException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println(e);
			return flight;
		}
		flight = (Flight) flightFactory.getInstance();
		flight.setRoute(route);
		flight.setInitialFare();
		flight.setFlightID();
		flights.add(flight);
		return flight;
	}

	protected Flight checkIfFlightExists(Route route) {
		for (Flight flight : flights) {
			if (flight.route.equals(route)) {
				return flight;
			}
		}
		return null;
	}

	protected Flight checkIfFlightExists(String FlightID) {
		for (Flight flight : flights) {
			if (flight.flightID.equals(FlightID)) {
				return flight;
			}
		}
		return null;
	}

	public boolean removeFlight(String FlightID) {
		return removeFlight(checkIfFlightExists(FlightID));
	}

	private boolean removeFlight(Flight f) {

		if (f == null) {
			try {
				throw new FlightNotFoundException("Flight Can't be found");
			} catch (FlightNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
				return false;
			}
		}
		if (f.getFlightSchedule().isEmpty() == true) {
			flights.remove(f);
			return true;
		} else {
			try {
				throw new Exception(
						"This flight can't be Deleted because it has a Schedule linked to it. First remove the schedule!!!");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e);
				return false;
			}
		}
	}

	boolean updateParamenters(Route r) {
		Flight f = checkIfFlightExists(r);
		if (f != null) {
			f.setInitialFare();
			return true;
		}

		return false;

	}

	public ArrayList<Flight> getFlight() {
		return this.flights;

	}

	public Flight searchFlight(String departure, String arrivalCity) {
		Route r = RouteCatalogue.getInstance().checkIfRouteExists(departure, arrivalCity);
		for (Flight flight : flights) {
			if (flight.getRoute().equals(r)) {
				return flight;
			}
		}
		return null;
	}

	@Override
	public void add(Object o) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Object o) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Object o) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Object o) {
		// TODO Auto-generated method stub

	}

	@Override
	public void search(Object o) {
		// TODO Auto-generated method stub

	}

}

package Catalogue;

import java.util.ArrayList;

import Exceptions.*;
import Factory.Factory;
import Factory.FlightFactory;
import Factory.RouteFactory;
import Model.City;
import Model.Route;

public class RouteCatalogue implements Catalogue {
	Factory RF = new RouteFactory();

	private RouteCatalogue() {

	}

	public static RouteCatalogue getInstance() {
		if (routecatalogue == null) {
			routecatalogue = new RouteCatalogue();
		}

		return routecatalogue;
	}

	private static RouteCatalogue routecatalogue = new RouteCatalogue();
	ArrayList<Route> routes = new ArrayList<>();

	// returns false if flight does not exist
	protected boolean checkIfFlightExists(Route r) {
		if (((FlightCatalogue) FlightCatalogue.getInstance()).checkIfFlightExists(r) == null) {
			return false;
		} else
			return true;
	}

	public boolean removeRoute(String Id) {
		Route r = searchRoutebyID(Id);
		if (r == null) {
			try {
				throw new RouteNotFoundException("Can't Delete Route because Route doesnot Exist");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e);
				return false;
			}
		}
		if (checkIfFlightExists(r) == false) {
			routes.remove(r);
			return true;
		} else {
			try {
				throw new Exception("Can't Delete Route because a flight is associated with the route");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e);
				return false;
			}
		}
	}

	public boolean updateRoute(String id, int updatedLength) {
		Route r = searchRoutebyID(id);
		if (r == null) {
			try {
				throw new RouteNotFoundException("Can't Update Route because route is Null");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e);
				return false;
			}
		}
		r.setLength(updatedLength);
		FlightFactory.getCatalogueInstance().updateParamenters(r);
		return true;
	}

	protected Route searchRoutebyID(String routeID) {
		for (Route route2 : routes) {
			if (route2.getRouteID().equals(routeID)) {
				return route2;
			}
		}
		return null;
	}

	public void addRoute(String deptID, String arrivalID, int length) {
		CityCatalogue c = CityCatalogue.getInstance();
		addRoute(c.getCityByCityCode(deptID), c.getCityByCityCode(arrivalID), length);
	}

	private Route addRoute(City dept, City arrival, int length) {
		try {
			if (dept == null || arrival == null || length == 0) {
				throw new CityNotFoundException("Cannot add Null City or Route length can't be Zero!");
			}
		} catch (CityNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println(e);
			return null;
		}
		// if route exists, then this method will return the existing route object!
		// if r is not null, then r is some other existing route, that can't be
		// duplicated.
		Route r = checkIfRouteExists(dept, arrival);
		try {
			if (r != null) {
				// route already exists, cannot duplicate
				// ****Need to pass something so that user may know what happened
				throw new RouteAlreadyExistsExcetion("Can't Add route, because the same route Already Exists!\n");

			}
		} catch (RouteAlreadyExistsExcetion e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println(e);
			return r;
		}

		r = (Route) RF.getInstance();
		r.setDepatureCity(dept);
		r.setArrivalCity(arrival);
		r.setLength(length);
		r.setRouteID();
		routes.add(r);
		return r;
	}
	public Route checkIfRouteExists(String dept,String arr) {
		for (Route route : this.routes) {
			if (route.getArrivalCity().getCityName().equals(arr)
					&& route.getDepatureCity().getCityName().equals(dept)) {
				return route;
			}
		}
		return null;
	}
	private Route checkIfRouteExists(City dept, City arrival) {
		for (Route route : this.routes) {
			if (route.getArrivalCity().getCityName().equals(arrival.getCityName())
					&& route.getDepatureCity().getCityName().equals(dept.getCityName())) {
				return route;
			}
		}
		return null;
	}

	// Check which flights are currently scheduled on this route.
	/*
	 * public boolean updateRoute(String routeID, int updatedLength) { Route r =
	 * searchRoutebyID(routeID); if (r == null) { return false; }
	 * r.setLength(updatedLength); return true;
	 * 
	 * }
	 */
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

	public ArrayList<Route> getRoutes() {
		return this.routes;
	}

}

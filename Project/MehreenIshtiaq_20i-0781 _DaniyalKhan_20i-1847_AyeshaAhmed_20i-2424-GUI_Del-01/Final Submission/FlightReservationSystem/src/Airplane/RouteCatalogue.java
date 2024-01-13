package Airplane;

import java.util.ArrayList;

public class RouteCatalogue {
	private RouteCatalogue() {

	}

	static RouteCatalogue getInstance() {
		if (routecatalogue == null) {
			routecatalogue = new RouteCatalogue();
		}
		return routecatalogue;
	}

	private static RouteCatalogue routecatalogue;

	ArrayList<Route> routes = new ArrayList<>();

	// String routeID, City depatureCity, City arrivalCity, int length

	public Route AddRoute(City dept, City arrival, int length) {
		Route r = checkIfRouteExists(dept, arrival, length);
		if (r != null) {
			// route already exists, cannot duplicate
			// ****Need to pass something so that user may know what happened
			return r;
		}
		r = new Route(dept, arrival, length);
		return r;
	}

	public Route checkIfRouteExists(City dept, City arrival, int length) {
		for (Route route : this.routes) {
			if (route.getArrivalCity().getCityName().equals(arrival.getCityName())
					&& route.getDepatureCity().getCityName().equals(dept.getCityName())
					&& route.getLength() == length) {
				return route;
			}
		}
		return null;
	}

	// Check which flights are currently scheduled on this route.
	// Check which flights are existing on this route

	// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	/*
	 * public void removeRoute(String routeID) { Route r = searchRoutebyID(routeID);
	 * routes.remove(r); }
	 */

	// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	/*
	 * public boolean updateRoute(String routeID, int updatedLength) { Route r =
	 * searchRoutebyID(routeID); if (r == null) { return false; }
	 * r.setLength(updatedLength); return true;
	 * 
	 * }
	 */
	public Route searchRoutebyID(String routeID) {
		for (Route route2 : routes) {
			if (route2.getRouteID().equals(routeID)) {
				return route2;
			}
		}
		return null;
	}

	public ArrayList<Route> getRoutes() {
		return this.routes;

	}

}

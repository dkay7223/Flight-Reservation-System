package Factory;


public interface Factory {
	
	Object getInstance();

}




/*
	 * private static Factory Factory;
	 * 
	 * private Factory() {
	 * 
	 * }
	 * 
	 * public static Factory getInstance() { if (Factory == null) { Factory = new
	 * Factory(); }
	 * 
	 * return Factory; }
	 * 
	 * public RouteCatalogue getRouteCatalogue() { return
	 * RouteCatalogue.getInstance(); }
	 * 
	 * CityCatalogue getCityCatalogue() { return CityCatalogue.getInstance(); }
	 * 
	 * FlightCatalogue getFlightCatalogue() { return FlightCatalogue.getInstance();
	 * }
	 * 
	 * AirplaneCatalogue getAirplaneCatalogue() { return
	 * AirplaneCatalogue.getInstance(); }
	 * 
	 * AirportCatalogue getAirportCatalogue() { return
	 * AirportCatalogue.getInstance(); }
	 */


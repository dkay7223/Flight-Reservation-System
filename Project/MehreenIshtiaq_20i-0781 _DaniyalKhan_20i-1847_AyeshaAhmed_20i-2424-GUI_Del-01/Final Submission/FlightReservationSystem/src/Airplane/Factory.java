package Airplane;

public class Factory {
	private static Factory Factory;

	private Factory() {

	}

	static Factory getInstance() {
		if (Factory == null) {
			Factory = new Factory();
		}
				
		return Factory;
	}

	RouteCatalogue getRouteCatalogue() {
		return RouteCatalogue.getInstance();
	}
	
	FlightCatalogue getFlightCatalogue() {
		return FlightCatalogue.getInstance();
	}
	
	AirplaneCatalogue getAirplaneCatalogue() {
		return AirplaneCatalogue.getInstance();   
	}
	
	AirportCatalogue getAirportCatalogue() {
		return AirportCatalogue.getInstance();
	}
}

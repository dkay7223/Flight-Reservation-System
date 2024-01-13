package Airplane;

import java.util.ArrayList;

public class AirportCatalogue {
	ArrayList<Airport> airports = new ArrayList<>();

	private AirportCatalogue() {

	}

	static AirportCatalogue getInstance() {
		if (Airportcatalogue == null) {
			Airportcatalogue = new AirportCatalogue();
		}
		return Airportcatalogue;
	}

	private static AirportCatalogue Airportcatalogue;
	
	protected void addAirport() {
		
	}
	
	
}

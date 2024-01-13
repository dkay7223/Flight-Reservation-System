package Catalogue;

import java.util.ArrayList;

import Model.Airport;

public class AirportCatalogue implements Catalogue{
	ArrayList<Airport> airports = new ArrayList<>();

	private AirportCatalogue() {

	}

	public static AirportCatalogue getInstance() {
		if (Airportcatalogue == null) {
			Airportcatalogue = new AirportCatalogue();
		}
		return Airportcatalogue;
	}

	private static AirportCatalogue Airportcatalogue;
	
	protected void addAirport() {
		
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

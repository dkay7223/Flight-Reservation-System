package Factory;

import Catalogue.FlightCatalogue;
import Model.Flight;

public class FlightFactory implements Factory {

	public static FlightCatalogue getCatalogueInstance() {
		return FlightCatalogue.getInstance();
	}

	@Override
	public Object getInstance() {
		// TODO Auto-generated method stub
		return new Flight();
	}

}

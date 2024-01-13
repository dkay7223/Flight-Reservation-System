package Factory;

import Catalogue.AirportCatalogue;
import Catalogue.Catalogue;
import Model.Airport;

public class AirportFactory implements Factory{

	@Override
	public Airport getInstance() {
		// TODO Auto-generated method stub
		return new Airport();
	}
	
	public static Catalogue getCatalogueInstance() {
		return AirportCatalogue.getInstance();
	}
	
	

}

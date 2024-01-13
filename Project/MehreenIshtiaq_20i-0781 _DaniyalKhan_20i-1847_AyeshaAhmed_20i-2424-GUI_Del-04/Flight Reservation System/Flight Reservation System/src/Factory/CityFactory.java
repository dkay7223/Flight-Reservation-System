package Factory;

import Catalogue.Catalogue;
import Catalogue.CityCatalogue;
import Model.City;

public class CityFactory implements Factory{

	
	
	public City getInstance() {
		// TODO Auto-generated method stub
		return new City();
	}
	
	public static Catalogue getCatalogueInstance() {
		return CityCatalogue.getInstance();
	}


}

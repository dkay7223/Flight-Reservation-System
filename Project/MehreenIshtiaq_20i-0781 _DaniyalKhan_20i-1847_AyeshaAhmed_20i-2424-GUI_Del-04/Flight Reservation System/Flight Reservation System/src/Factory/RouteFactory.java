package Factory;

import Catalogue.Catalogue;
import Catalogue.RouteCatalogue;
import Model.Route;

public class RouteFactory implements Factory{

	
	
	
	public static Catalogue getCatalogueInstance() {
		// TODO Auto-generated method stub
		return RouteCatalogue.getInstance();
	}

	@Override
	public Object getInstance() {
		// TODO Auto-generated method stub
		return new Route();
	}

}

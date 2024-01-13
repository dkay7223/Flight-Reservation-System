package Factory;

import Catalogue.AirplaneCatalogue;
import Catalogue.Catalogue;
import Model.Airplane;

public class AirplaneFactory implements Factory {

	@Override
	public Airplane getInstance() {
		// TODO Auto-generated method stub
		return new Airplane();
	}

	public static Catalogue getCatalogueInstance() {
		return AirplaneCatalogue.getInstance();
	}

}

package Factory;

import Catalogue.BookingCatalogue;
import Catalogue.Catalogue;
import Model.Booking;

public class BookingFactory implements Factory {

	@Override
	public Booking getInstance() {
		// TODO Auto-generated method stub
		return new Booking();
	}
	
	public static Catalogue getCatalogueInstance() {
		return BookingCatalogue.getInstance();
	}


}

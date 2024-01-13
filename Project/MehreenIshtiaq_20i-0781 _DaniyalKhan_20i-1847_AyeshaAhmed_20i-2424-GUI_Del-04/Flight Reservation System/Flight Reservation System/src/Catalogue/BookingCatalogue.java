package Catalogue;

import java.util.ArrayList;

import Model.Booking;

public class BookingCatalogue implements Catalogue {
	ArrayList<Booking> bookings = new ArrayList<>();

	private BookingCatalogue() {

	}

	public static BookingCatalogue getInstance() {
		if (Bookingcatalogue == null) {
			Bookingcatalogue = new BookingCatalogue();
		}
		return Bookingcatalogue;
	}

	private static BookingCatalogue Bookingcatalogue;

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

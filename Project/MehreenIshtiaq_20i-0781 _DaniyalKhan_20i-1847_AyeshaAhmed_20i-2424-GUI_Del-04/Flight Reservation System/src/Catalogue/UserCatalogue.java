package Catalogue;

import java.util.ArrayList;

import User.Passenger;

public class UserCatalogue implements Catalogue{
	ArrayList<Passenger> passengers=new ArrayList<>();

	private UserCatalogue() {

	}

	public static UserCatalogue getInstance() {
		if (Usercatalogue == null) {
			Usercatalogue = new UserCatalogue();
		}
		return Usercatalogue;
	}

	private static UserCatalogue Usercatalogue;
	public void addPassenger() {

	}

	public void updatePassenger() {

	}

	public void removePassenger() {

	}

	public void getPassenger() {

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

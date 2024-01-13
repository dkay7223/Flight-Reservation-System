package Catalogue;

import java.util.ArrayList;

import Model.Airplane;

public class AirplaneCatalogue implements Catalogue{

	private AirplaneCatalogue() {
		
	}

	public static AirplaneCatalogue getInstance() {
		if (Airplanecatalogue == null) {
			Airplanecatalogue = new AirplaneCatalogue();
		}
		return Airplanecatalogue;
	}

	private static AirplaneCatalogue Airplanecatalogue;
	ArrayList<Airplane> airlanes = new ArrayList<>();

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

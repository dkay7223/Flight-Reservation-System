package Airplane;

import java.util.ArrayList;

public class AirplaneCatalogue {

private AirplaneCatalogue() {
		
	}

	static AirplaneCatalogue getInstance() {
		if (Airplanecatalogue == null) {
			Airplanecatalogue = new AirplaneCatalogue();
		}
		return Airplanecatalogue;
	}

	private static AirplaneCatalogue Airplanecatalogue;

	ArrayList<Airplane> airlanes = new ArrayList<>();

	public void addAirplane(String name, int code, String abb) {

	}

	public void removeAirplane(String name) {

	}

	public void updateAirlane(String name, int code, String abb) {

	}
}

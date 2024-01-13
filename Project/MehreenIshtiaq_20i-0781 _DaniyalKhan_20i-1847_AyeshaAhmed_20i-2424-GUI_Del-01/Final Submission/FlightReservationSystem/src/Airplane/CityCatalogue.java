package Airplane;

import java.util.ArrayList;

import Exceptions.CityAlreadyExistException;
import Exceptions.CityNotFoundException;

public class CityCatalogue {
	ArrayList<City> cities = new ArrayList<>();

	public boolean addCity(String cityName, String cityCode) {
		try {
			if (checkIfCityExists(cityCode) != -1) {
				// city already exists, addition failed
				throw new CityAlreadyExistException();

			}
		} catch (CityAlreadyExistException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		City c = new City(cityName, cityCode);
		cities.add(c);
		return true;
	}

	public int checkIfCityExists(String cityCode) {
		for (int i = 0; i < cities.size(); i++) {
			if (cities.get(i).getCityCode().equals(cityCode))
				return i;
		}
		return -1;
	}
	
	public City getCityByCityCode(String cityCode) {
		// TODO Auto-generated method stub
		for (City city : cities) {
			if(city.getCityCode().equals(cityCode)) {
				return city;
			}
		}
		
		try {
			throw new CityNotFoundException();
		} catch (CityNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	public boolean removeCity(String cityCode) {
		// ****check if any route is linked
		City c=getCityByCityCode(cityCode);
		ArrayList<Route> tempRoutes=Factory.getInstance().getRouteCatalogue().routes;
		try {
			for (Route route : tempRoutes) {
				if(route.getArrivalCity().equals(c)||route.getDepatureCity().equals(c)) {
					throw new Exception("Can't delete city Record! City has a route linked. First delete/update the relevant route.");
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
			return false;
		}
		
		int index = checkIfCityExists(cityCode);

		if (index == -1) {
			// city doesn't exist, removing failed
			// CityNotFoundException
			return false;
		}
		cities.remove(index);

		return true;
	}

	public boolean updateCity(String cityCode, String updatedName, String updatedCityCode) {
		int index = checkIfCityExists(cityCode);
		if (index == -1) {
			// city doesn't exist, updating failed.
			return false;
		}
		cities.get(index).setCityCode(updatedCityCode);
		cities.get(index).setCityName(updatedName);
		return true;// updated successfully

	}

	public ArrayList<City> getCities() {
		return cities;
	}

}

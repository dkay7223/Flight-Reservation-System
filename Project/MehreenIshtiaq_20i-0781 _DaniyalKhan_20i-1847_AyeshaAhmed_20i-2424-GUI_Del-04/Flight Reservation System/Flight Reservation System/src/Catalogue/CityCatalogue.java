package Catalogue;

import java.util.ArrayList;

import Exceptions.CityAlreadyExistException;
import Exceptions.CityNotFoundException;
import Exceptions.NullValueException;
import Factory.CityFactory;
import Factory.Factory;
import Model.City;
import Model.Route;

public class CityCatalogue implements Catalogue {
	Factory CF = new CityFactory();

	private CityCatalogue() {

	}

	public static CityCatalogue getInstance() {
		if (Citycatalogue == null) {
			Citycatalogue = new CityCatalogue();
		}
		return Citycatalogue;
	}

	private static CityCatalogue Citycatalogue;

	ArrayList<City> cities = new ArrayList<>();

	public City addCity(String cityName, String cityCode) {
		try {
			if (cityName == null || cityCode == null) {
				throw new NullValueException("City Name or Code can't be Null!");
			}
		} catch (NullValueException e1) {
			// TODO Auto-generated catch block
			System.out.println(e1);
			return null;
		}
		City c = null;
		try {
			c = getCityByCityCode(cityCode);
			if (c != null) {
				throw new CityAlreadyExistException();
			}
		} catch (CityAlreadyExistException e) {
			System.out.println(e);
			return c;
		}
		c = (City) CF.getInstance();
		c.setCityName(cityName);
		c.setCityCode(cityCode);
		cities.add(c);
		return c;
	}

	public City getCityByCityCode(String cityCode) {
		for (City city : cities) {
			if (city.getCityCode().equals(cityCode)) {
				return city;
			}
		}
		return null;
	}
	

	public boolean removeCity(String cityCode) {

		City c = getCityByCityCode(cityCode);
		boolean flag = checkCityValidations(c);
		if (flag == true) {
			cities.remove(c);
			return true;
		}
		return false;
	}

	private boolean checkCityValidations(City c) {

		if (c == null) {
			try {
				// city doesn't exist, removing/updating failed
				throw new CityNotFoundException("Can't delete/update City because it doesn't exists!\n");
				// CityNotFoundException
			} catch (CityNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
				return false;
			}
		}
		// ****check if any route is linked

		try {
			for (Route route : RouteCatalogue.getInstance().routes) {
				if (route.getArrivalCity().equals(c) || route.getDepatureCity().equals(c)) {
					throw new Exception(
							"Can't delete/update city Record! City has a route linked. First, Update the flights linked to that route, then update/remove the route.\n Then update/remove the city");
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			return false;
		}
		return true;
	}

	public boolean updateCity(String cityCode, String updatedName, String updatedCityCode) {
		City c = getCityByCityCode(cityCode);
		boolean flag = checkCityValidations(c);
		if (flag == true) {
			for (City city : cities) {
				if (city.equals(c)) {
					city.setCityCode(updatedCityCode);
					city.setCityName(updatedName);
					return true;// updated successfully
				}
			}
		}
		// city doesn't exist, updating failed.
		return false;

	}

	public ArrayList<City> getCities() {
		return cities;
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

package Model;

import Catalogue.Catalogue;
import Catalogue.CityCatalogue;
import Catalogue.FlightCatalogue;
import Catalogue.RouteCatalogue;
import Factory.*;

public class Main {
	public static void main(String[] args) {
		
		Catalogue cityCatalogue=CityCatalogue.getInstance();
		((CityCatalogue) cityCatalogue).addCity("Karachi","KHI");
		((CityCatalogue) cityCatalogue).addCity("Islamabad","ISB");
		((CityCatalogue) cityCatalogue).addCity("Faisalabad","FSL");
		((CityCatalogue) cityCatalogue).addCity("Peshawar","PWR");
		
	
	RouteCatalogue routeCataloge=RouteCatalogue.getInstance();
	routeCataloge.addRoute("KHI", "ISB", 1200);
	routeCataloge.addRoute("PWR", "FSL", 1000);
	
	for (int i = 0; i < routeCataloge.getRoutes().size(); i++) {
		System.out.println(	"RouteID: "+routeCataloge.getRoutes().get(i).getRouteID());
		System.out.println(	"Length: "+routeCataloge.getRoutes().get(i).getLength());
		System.out.println(	"Arrival: "+routeCataloge.getRoutes().get(i).getArrivalCity().getCityName());
		System.out.println(	"Dept: "+routeCataloge.getRoutes().get(i).getDepatureCity().getCityName());
		System.out.println("-----");
	}
	Catalogue flightCatalogue=FlightFactory.getCatalogueInstance();
	((FlightCatalogue) flightCatalogue).createFlight("KHI-ISB");
	((FlightCatalogue) flightCatalogue).createFlight("KHI-ISB");
	((FlightCatalogue) flightCatalogue).createFlight("PWR-FSL");
	((FlightCatalogue) flightCatalogue).createFlight("PWR-FSL");
	FlightCatalogue FC=FlightFactory.getCatalogueInstance();
	
	for (Flight flight : FC.getFlight()) {
		System.out.println("FlightID: "+flight.getFlightID());
		System.out.println("InitialFare: "+flight.initialFare);
		System.out.println("RouteID: "+flight.route.getRouteID());
		System.out.println("ARR: "+flight.route.getArrivalCity().getCityName());
		System.out.println("DPT: "+flight.route.getDepatureCity().getCityName());
		System.out.println("---------------");
	}
	routeCataloge.removeRoute("KHI-ISB");
	
	
	for (Flight flight : FC.getFlight()) {
		System.out.println("FlightID: "+flight.getFlightID());
		System.out.println("InitialFare: "+flight.initialFare);
		System.out.println("RouteID: "+flight.route.getRouteID());
		System.out.println("ARR: "+flight.route.getArrivalCity().getCityName());
		System.out.println("DPT: "+flight.route.getDepatureCity().getCityName());
		System.out.println("---------------");
	}((FlightCatalogue) flightCatalogue).removeFlight("KHI-ISB");
	routeCataloge.removeRoute("KHI-ISB");
	for (Flight flight : FC.getFlight()) {
		System.out.println("FlightID: "+flight.getFlightID());
		System.out.println("InitialFare: "+flight.initialFare);
		System.out.println("RouteID: "+flight.route.getRouteID());
		System.out.println("ARR: "+flight.route.getArrivalCity().getCityName());
		System.out.println("DPT: "+flight.route.getDepatureCity().getCityName());
		System.out.println("---------------");
	}
}
}
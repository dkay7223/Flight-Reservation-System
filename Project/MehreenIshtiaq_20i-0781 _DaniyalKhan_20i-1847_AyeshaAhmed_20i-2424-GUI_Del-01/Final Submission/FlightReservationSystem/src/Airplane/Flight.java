package Airplane;

import java.util.ArrayList;
import java.util.Date;

public class Flight {
	// ----Copied from Flight
	public String flightID; // KHI-ISB : RouteID
	public Route route; // City1-City2
	int initialFare = this.route.getLength() * 20; // on the basis of length of Route
	ArrayList<FlightSchedule> flightSchedule = new ArrayList<>();

	public Flight(Route route, int initialFare) {
		super();
		this.flightID = route.getRouteID();
		this.route = route;
		this.initialFare = initialFare;
	}

	public void scheduleFlight(Date departureTime, Date arrivalTime, double economyPeakFactor,
			double businessPeakFactor, Airport departingAirport, Airport ArrivingAirport) {

		// Check if similar Flight Schedule is already defined

		// now adding a schedule
		FlightSchedule fs = new FlightSchedule(this, departureTime, arrivalTime, economyPeakFactor, businessPeakFactor,
				departingAirport, ArrivingAirport);
		flightSchedule.add(fs);

	}
}

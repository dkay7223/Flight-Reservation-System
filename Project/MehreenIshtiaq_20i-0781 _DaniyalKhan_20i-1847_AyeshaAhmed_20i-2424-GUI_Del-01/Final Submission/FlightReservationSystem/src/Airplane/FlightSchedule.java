package Airplane;

import java.util.Date;

public class FlightSchedule {

	protected Flight flight;
	public Date departureTime, arrivalTime;
	protected double economyPeakFactor = 1.00, businessPeakFactor = 1.00; // determined by flight Manager
	private int economyClassFare  = (int) (this.flight.initialFare * economyPeakFactor);
	private int businessClassFare = (int) (this.flight.initialFare * businessPeakFactor);
	public Status scheduleStatus = Status.scheduled;
	public String flightScheduleID = this.flight.flightID + "-" +
				this.departureTime.toString() + "-"
			+ this.arrivalTime.toString(); // FlightID
	Airplane airplane;
	Airport departingAirport;
	Airport ArrivingAirport;
	
	
	
	
	public FlightSchedule(Flight flight, Date departureTime, Date arrivalTime,
			double economyPeakFactor,
			double businessPeakFactor, Airport departingAirport, Airport ArrivingAirport) {
		super();
		this.flight = flight;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.economyPeakFactor = economyPeakFactor;
		this.businessPeakFactor = businessPeakFactor;
		this.departingAirport = departingAirport;
		this.ArrivingAirport = ArrivingAirport;
	}

	public int getEconomyClassFare() {
		return economyClassFare;
	}

	public int getBusinessClassFare() {
		return businessClassFare;
	}

	enum Status {
		scheduled, departed, arrived
	}



}

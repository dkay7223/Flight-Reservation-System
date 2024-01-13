package Model;

import java.util.Date;

public class FlightSchedule {

	private Flight flight;
	private Date departureTime, arrivalTime;
	private double economyPeakFactor = 1.00, businessPeakFactor = 1.00; // determined by flight Manager
	private int economyClassFare = (int) (this.flight.initialFare * economyPeakFactor);
	private int businessClassFare = (int) (this.flight.initialFare * businessPeakFactor);
	private Status scheduleStatus = Status.scheduled;
	private String flightScheduleID = this.flight.flightID + "-" + this.departureTime.toString() + "-"
			+ this.arrivalTime.toString(); // FlightID
	private Airplane airplane;
	private Airport departingAirport;
	private Airport ArrivingAirport;

	public FlightSchedule(Flight flight, Date departureTime, Date arrivalTime, double economyPeakFactor,
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

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public Date getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}

	public Date getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public double getEconomyPeakFactor() {
		return economyPeakFactor;
	}

	public void setEconomyPeakFactor(double economyPeakFactor) {
		this.economyPeakFactor = economyPeakFactor;
	}

	public double getBusinessPeakFactor() {
		return businessPeakFactor;
	}

	public void setBusinessPeakFactor(double businessPeakFactor) {
		this.businessPeakFactor = businessPeakFactor;
	}

	public Status getScheduleStatus() {
		return scheduleStatus;
	}

	public void setScheduleStatus(Status scheduleStatus) {
		this.scheduleStatus = scheduleStatus;
	}

	public String getFlightScheduleID() {
		return flightScheduleID;
	}

	public void setFlightScheduleID(String flightScheduleID) {
		this.flightScheduleID = flightScheduleID;
	}

	public Airplane getAirplane() {
		return airplane;
	}

	public void setAirplane(Airplane airplane) {
		this.airplane = airplane;
	}

	public Airport getDepartingAirport() {
		return departingAirport;
	}

	public void setDepartingAirport(Airport departingAirport) {
		this.departingAirport = departingAirport;
	}

	public Airport getArrivingAirport() {
		return ArrivingAirport;
	}

	public void setArrivingAirport(Airport arrivingAirport) {
		ArrivingAirport = arrivingAirport;
	}

	public void setEconomyClassFare(int economyClassFare) {
		this.economyClassFare = economyClassFare;
	}

	public void setBusinessClassFare(int businessClassFare) {
		this.businessClassFare = businessClassFare;
	}

}

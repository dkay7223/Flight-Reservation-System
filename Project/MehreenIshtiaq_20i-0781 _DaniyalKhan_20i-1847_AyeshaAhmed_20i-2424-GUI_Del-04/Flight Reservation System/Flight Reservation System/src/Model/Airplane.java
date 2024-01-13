package Model;

public class Airplane {
	private String airplaneID;
	private AirplaneStatus airplaneStatus;
	private FlightSchedule flight;
	private int economySeatsCount;
	private int businessSeatsCount;
	
	
	enum AirplaneStatus{
		InAir, Onground
	}
  
	public String getAirplaneID() {
		return airplaneID;
	}

	public void setAirplaneID(String airplaneID) {
		this.airplaneID = airplaneID;
	}

	public AirplaneStatus getAirplaneStatus() {
		return airplaneStatus;
	}

	public void setAirplaneStatus(AirplaneStatus airplaneStatus) {
		this.airplaneStatus = airplaneStatus;
	}

	public FlightSchedule getFlight() {
		return flight;
	}

	public void setFlight(FlightSchedule flight) {
		this.flight = flight;
	}

	public int getEconomySeatsCount() {
		return economySeatsCount;
	}

	public void setEconomySeatsCount(int economySeatsCount) {
		this.economySeatsCount = economySeatsCount;
	}

	public int getBusinessSeatsCount() {
		return businessSeatsCount;
	}

	public void setBusinessSeatsCount(int businessSeatsCount) {
		this.businessSeatsCount = businessSeatsCount;
	}

	
}

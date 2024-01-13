package Airplane;

public class Airplane {
	public String airplaneID;
	public AirplaneStatus airplaneStatus;
	public FlightSchedule flight;
	public int economySeatsCount;
	public int businessSeatsCount;
	
	
	
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

	
}

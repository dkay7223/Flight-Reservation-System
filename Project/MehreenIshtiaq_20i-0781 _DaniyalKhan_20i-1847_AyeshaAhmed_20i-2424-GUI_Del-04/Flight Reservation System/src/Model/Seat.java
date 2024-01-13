package Model;

public class Seat {
	private int seatID;
	private SeatType seatType;
	private Status status;
	
	
	enum SeatType {
		economy, business;
	}

	enum Status {
		occupied, unoccupied;
	}

	public int getSeatID() {
		return seatID;
	}

	public void setSeatID(int seatID) {
		this.seatID = seatID;
	}

	public SeatType getSeatType() {
		return seatType;
	}

	public void setSeatType(SeatType seatType) {
		this.seatType = seatType;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Seat getSeatDetails() {
		return this;
	}

	public void reserveSeat() {

	}

	 
}

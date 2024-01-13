package Exceptions;

public class FlightScheduleNotFoundException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FlightScheduleNotFoundException() {
		super("FlightSchedule Not Found!");
		// TODO Auto-generated constructor stub
	}

	public FlightScheduleNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public FlightScheduleNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public FlightScheduleNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public FlightScheduleNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}

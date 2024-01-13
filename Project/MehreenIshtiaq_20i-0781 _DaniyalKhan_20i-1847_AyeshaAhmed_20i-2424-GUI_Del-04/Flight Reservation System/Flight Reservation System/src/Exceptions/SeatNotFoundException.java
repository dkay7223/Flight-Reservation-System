package Exceptions;

public class SeatNotFoundException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SeatNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public SeatNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public SeatNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public SeatNotFoundException() {
		super("Seat Not Found");
		// TODO Auto-generated constructor stub
	}

	public SeatNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}

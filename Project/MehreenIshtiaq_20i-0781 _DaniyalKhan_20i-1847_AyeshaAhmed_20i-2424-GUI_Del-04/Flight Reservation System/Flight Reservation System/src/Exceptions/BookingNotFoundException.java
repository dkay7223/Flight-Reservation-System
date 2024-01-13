package Exceptions;

public class BookingNotFoundException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BookingNotFoundException() {
		super("Booking Not Found!");
		// TODO Auto-generated constructor stub
	}

	public BookingNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public BookingNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public BookingNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public BookingNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}

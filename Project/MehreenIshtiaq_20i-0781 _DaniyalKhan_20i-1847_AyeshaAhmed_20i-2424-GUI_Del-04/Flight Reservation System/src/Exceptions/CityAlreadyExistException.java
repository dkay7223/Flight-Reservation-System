package Exceptions;

public class CityAlreadyExistException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CityAlreadyExistException() {
		super("Exception: City already Exists");
		// TODO Auto-generated constructor stub
	}

	public CityAlreadyExistException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public CityAlreadyExistException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public CityAlreadyExistException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public CityAlreadyExistException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}

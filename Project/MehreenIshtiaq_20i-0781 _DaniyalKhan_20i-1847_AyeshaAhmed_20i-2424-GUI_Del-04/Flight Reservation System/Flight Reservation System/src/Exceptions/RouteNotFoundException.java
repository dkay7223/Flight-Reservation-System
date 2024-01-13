package Exceptions;

public class RouteNotFoundException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RouteNotFoundException() {
		super("Route Not Found!");
		// TODO Auto-generated constructor stub
	}

	public RouteNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public RouteNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public RouteNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public RouteNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}

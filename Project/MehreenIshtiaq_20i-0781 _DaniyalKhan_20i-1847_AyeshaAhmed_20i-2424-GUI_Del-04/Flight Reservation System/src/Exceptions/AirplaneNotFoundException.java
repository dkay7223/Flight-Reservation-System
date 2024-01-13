package Exceptions;

public class AirplaneNotFoundException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1393755629382927434L;

	public AirplaneNotFoundException() {
		super("Airplane Not Found!");
		// TODO Auto-generated constructor stub
	}

	public AirplaneNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public AirplaneNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public AirplaneNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public AirplaneNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
	
}

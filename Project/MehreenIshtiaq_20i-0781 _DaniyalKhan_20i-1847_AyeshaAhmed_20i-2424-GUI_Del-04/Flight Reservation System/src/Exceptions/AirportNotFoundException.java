package Exceptions;

public class AirportNotFoundException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1820589808927749111L;

	public AirportNotFoundException() {
		// TODO Auto-generated constructor stub
		super("Exception: Airport Not Found!");
	}
	public AirportNotFoundException(String exception) {
		// TODO Auto-generated constructor stub
		super(exception);
	}
	

}

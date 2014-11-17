package mx.skyguardian.unigis.integration.exception;

public class GurtamJSONException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1924418038446047719L;
	
	public GurtamJSONException (Exception e) {
		super(e);
	}
	
	public GurtamJSONException (String s) {
		super(s);
	}
}

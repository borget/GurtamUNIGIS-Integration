package mx.skyguardian.unigis.integration.exception;

public class GurtamRemoteAPIException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9175755407187381829L;
	
	public GurtamRemoteAPIException (Exception e) {
		super(e);
	}
	
	public GurtamRemoteAPIException (String s) {
		super(s);
	}

}

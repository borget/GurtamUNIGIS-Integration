package mx.skyguardian.unigis.integration.business;

import mx.skyguardian.unigis.integration.exception.GurtamRemoteAPIException;

public interface IGurtamUNIGISIntegrator {
	public void sendEvent2UNIGIS() throws GurtamRemoteAPIException, Exception;
}

/**
 * Aplicación que envía información relevante a la plataforma UNIGIS de todas las unidades asociadas a un usuario Gurtam.
 * El envío se direcciona al Web Service SOAP http://www.assistcargo.com/LoginYInsertarEvento.
 * El intervalo de envío de información se puede establecer mediante el archivo de configuración.
 * @see applicationContext.xml
 * @author      Alberto Vázquez Ramírez/alberto.vazq.rmz@gmail.com
 * @since       1.0
 */
package mx.skyguardian.unigis.integration.business;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.annotation.Resource;

import mx.skyguardian.unigis.integration.bean.LoginSession;
import mx.skyguardian.unigis.integration.bean.UNIGISEvent;
import mx.skyguardian.unigis.integration.exception.GurtamRemoteAPIException;
import mx.skyguardian.unigis.integration.http.SkyguardianHTTPClient;
import mx.skyguardian.unigis.integration.json.AbstractJSONDeserializer;
import mx.skyguardian.unigis.integration.soap.UNIGISSoapClient;
import mx.skyguardian.unigis.integration.util.ApplicationUtil;

import org.apache.log4j.Logger;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class GurtamUNIGISIntegrator implements IGurtamUNIGISIntegrator {
	
	private static Logger log = Logger.getLogger(GurtamUNIGISIntegrator.class);
	
	public static void main (String ... args) {

		Map<String, String> env = System.getenv();
		boolean isEnvSet = false;
		String envVar = null;
        for (String envName : env.keySet()) {
        	if(envName.equalsIgnoreCase("UNIGIS_APP_CONTEXT_PATH")){
        		envVar = env.get(envName);
        		isEnvSet = true;
        		break;
        	}
        }
        if (isEnvSet){
        	System.out.println("Env Variable has been found [UNIGIS_APP_CONTEXT_PATH="+envVar+"]");
        	new FileSystemXmlApplicationContext("file:"+envVar);
        } else {
        	System.err.println("ERROR:The env variable has not been set [UNIGIS_APP_CONTEXT_PATH]");
        	Runtime.getRuntime().exit(0);
        }
	}
	
	@Resource(name = "appProperties")
	private Properties appProperties;
	
	private SkyguardianHTTPClient skyguardianHttpClient = null;
	private AbstractJSONDeserializer jsonDeserializer = null;
	private UNIGISSoapClient unigisSoapClient = null;
	

	
	public void sendEvent2UNIGIS() throws GurtamRemoteAPIException, JSONException, Exception {
	
		Map<String, String> properties = new HashMap<String, String>();
		properties.put("user", appProperties.getProperty("mx.skyguardian.unigis.integration.gurtam.user"));
		properties.put("password", appProperties.getProperty("mx.skyguardian.unigis.integration.gurtam.password"));
		
		String loginUrl = ApplicationUtil.getURL(
				appProperties.getProperty("mx.skyguardian.unigis.integration.url.login"), properties);
		
		JSONObject loginJSONObj = skyguardianHttpClient.getHTTPRequest(loginUrl);
		
		LoginSession loginSession = new LoginSession();
		
		loginSession.setEid((String) loginJSONObj.get("eid"));
		loginSession.setPosixTime((Integer) loginJSONObj.get("tm"));
		
		properties.clear();
		
		properties.put("sid", loginSession.getEid());
		
		String unitsUrl = ApplicationUtil.getURL(
				appProperties.getProperty("mx.skyguardian.unigis.integration.url.units"), properties);
				
		JSONObject unitsJSONObj = skyguardianHttpClient.getHTTPRequest(unitsUrl);
		
		List<UNIGISEvent> unigisEvents = jsonDeserializer.getListOfUnitEvents(unitsJSONObj);
		
		int index = 1;
		for (UNIGISEvent unigisEvent : unigisEvents) {
			log.info("MESSAGE-SENT"+index);
			unigisSoapClient.sendEvent2UNIGIS(unigisEvent);
			index++;
		}
		
		log.info("FINISHED ... Report has been sent to UNIGIS");
	}
	
	public Properties getAppProperties() {
		return this.appProperties;
	}

	public void setAppProperties(Properties appProperties) {
		this.appProperties = appProperties;
	}

	public SkyguardianHTTPClient getSkyguardianHttpClient() {
		return this.skyguardianHttpClient;
	}

	public void setSkyguardianHttpClient(SkyguardianHTTPClient skyguardianHttpClient) {
		this.skyguardianHttpClient = skyguardianHttpClient;
	}
	
		public AbstractJSONDeserializer getJsonDeserializer() {
		return this.jsonDeserializer;
	}

	public void setJsonDeserializer(AbstractJSONDeserializer jsonDeserializer) {
		this.jsonDeserializer = jsonDeserializer;
	}	
	
	public UNIGISSoapClient getUnigisSoapClient() {
		return unigisSoapClient;
	}

	public void setUnigisSoapClient(UNIGISSoapClient unigisSoapClient) {
		this.unigisSoapClient = unigisSoapClient;
	}

	public GurtamUNIGISIntegrator() {
		
	}
}

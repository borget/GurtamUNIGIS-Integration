package mx.skyguardian.unigis.integration.test;

import java.util.Properties;

import javax.annotation.Resource;

import mx.skyguardian.unigis.integration.business.GurtamUNIGISIntegrator;
import mx.skyguardian.unigis.integration.business.IGurtamUNIGISIntegrator;
import mx.skyguardian.unigis.integration.http.SkyguardianHTTPClient;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class GurtamUNIGISIntegratorTest {
	
	private static Logger log = Logger.getLogger(GurtamUNIGISIntegratorTest.class);
	
	@Resource(name = "appProperties")
	private static Properties appProperties;
	
	@SuppressWarnings("resource")
	public static void main (String ... args) {
		IGurtamUNIGISIntegrator integrator = getUNIGISIntegrator();
		
		try {
			integrator.sendEvent2UNIGIS();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//new FileSystemXmlApplicationContext("WebContent/WEB-INF/application-servlet.xml", "WebContent/WEB-INF/application-context.xml");
		
	}
	
	private static SkyguardianHTTPClient getHTTPClient() {
		ApplicationContext ctx = new FileSystemXmlApplicationContext(
			"WebContent/WEB-INF/application-servlet.xml", "WebContent/WEB-INF/application-context.xml");
		SkyguardianHTTPClient template = (SkyguardianHTTPClient) ctx.getBean("skyguardianHTTPClient");
		return template;
	}
	
	public Properties getAppProperties() {
		return appProperties;
	}

	public void setAppProperties(Properties appProperties) {
		this.appProperties = appProperties;
	}
	
	
	private static IGurtamUNIGISIntegrator getUNIGISIntegrator() {
		ApplicationContext ctx = new FileSystemXmlApplicationContext(
			"WebContent/WEB-INF/application-servlet.xml", "WebContent/WEB-INF/application-context.xml");
		IGurtamUNIGISIntegrator template = (GurtamUNIGISIntegrator) ctx.getBean("unigisIntegrator");
		return template;
	}
}

package mx.skyguardian.unigis.integration.http;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Properties;

import javax.annotation.Resource;

import mx.skyguardian.unigis.integration.exception.GurtamRemoteAPIException;

import org.apache.log4j.Logger;
import org.json.JSONObject;

public class SkyguardianHTTPClient {
	
	private static Logger log = Logger.getLogger(SkyguardianHTTPClient.class);
	
	@Resource(name = "appProperties")
	private Properties appProperties;
	
	private SkyguardianHTTPClient() {
		
	}

	public JSONObject getHTTPRequest(String urlString) throws GurtamRemoteAPIException, Exception {

		InputStream inputStream = null;
		JSONObject jsonObject = new JSONObject();
		try {

			URL url = new URL(urlString);
			HttpURLConnection connection = (HttpURLConnection) url
					.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Content-Type",
					"application/json; charset=utf-8");

			//connection.setDoOutput(true);

			inputStream = new BufferedInputStream(connection.getInputStream());

			ByteArrayOutputStream dataCache = new ByteArrayOutputStream();

			// Fully read data
			byte[] buff = new byte[1024];
			int len;
			while ((len = inputStream.read(buff)) >= 0) {
				dataCache.write(buff, 0, len);
			}

			// Close streams
			dataCache.close();

			String jsonString = new String(dataCache.toByteArray()).trim();
			log.debug(urlString);
			log.debug(jsonString);
			
			jsonObject = new JSONObject(jsonString);
			
			boolean error = !jsonObject.isNull("error");
			

			if (error) {
				log.error(jsonObject.get("error"));
				throw new GurtamRemoteAPIException(jsonObject.toString());
			} 
	
		} finally {
			if (null != inputStream) {
				inputStream.close();
			}
		}
		
		
		return jsonObject;
	}
	
	public Properties getAppProperties() {
		return appProperties;
	}

	public void setAppProperties(Properties appProperties) {
		this.appProperties = appProperties;
	}
}

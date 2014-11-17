package mx.skyguardian.unigis.integration.quartz;

import mx.skyguardian.unigis.integration.business.GurtamUNIGISIntegrator;
import mx.skyguardian.unigis.integration.exception.GurtamRemoteAPIException;

import org.apache.log4j.Logger;
import org.json.JSONException;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class GurtamUnigisQuartzJob extends QuartzJobBean {
	private GurtamUNIGISIntegrator unigisIntegrator = null;
	private static Logger log = Logger.getLogger(GurtamUnigisQuartzJob.class);
	
	@Override  
	 protected void executeInternal(JobExecutionContext arg0)  throws JobExecutionException {  
		
		try {
			unigisIntegrator.sendEvent2UNIGIS();
		} catch (JSONException e) {

			e.printStackTrace();
		} catch (GurtamRemoteAPIException e) {
			e.printStackTrace();
		} catch (Exception e) {

			e.printStackTrace();
		}  
	  
	 }

	public GurtamUNIGISIntegrator getUnigisIntegrator() {
		return unigisIntegrator;
	}

	public void setUnigisIntegrator(GurtamUNIGISIntegrator unigisIntegrator) {
		this.unigisIntegrator = unigisIntegrator;
	}  
}

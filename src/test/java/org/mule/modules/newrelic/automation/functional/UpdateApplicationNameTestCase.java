/**
 *
 */
package org.mule.modules.newrelic.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.newrelic.NewRelicConnector;
import org.mule.modules.newrelic.automation.runner.FunctionalTestSuite;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;

import com.mule.modules.newrelic.beans.Application;
import com.mule.modules.newrelic.beans.ApplicationInstancesGetResponse;
import com.mule.modules.newrelic.beans.Settings;
import com.mule.modules.newrelic.beans.UpdateApplicationNameRequest;
import com.mule.modules.newrelic.beans.UpdateAppplicationPutResponse;

public class UpdateApplicationNameTestCase extends NewRelicAbstractTestCase{
	public UpdateApplicationNameTestCase() {
		super(NewRelicConnector.class);
		
	}

@Test
  @Category({FunctionalTestSuite.class})
  public void testFlow() throws Exception {
	
	UpdateApplicationNameRequest request=new UpdateApplicationNameRequest();
	
	Application application=new Application();
	request.setApplication(application);
			
			
			
	request.getApplication().setName("TestFromMule");
	Settings settings=new Settings();
	application.setSettings(settings);
	application.getSettings().setApp_apdex_threshold("3.0");
	application.getSettings().setEnable_real_user_monitoring("true");
	application.getSettings().setUse_server_side_config("3.0");
	
	
	
	UpdateAppplicationPutResponse res =(getConnector().updateApplicationName(request, getKey(),getApplicationId() ));
	System.out.println("res************************************************************"+res.getApplication().getName());
    assertNotNull(res);
  }
}

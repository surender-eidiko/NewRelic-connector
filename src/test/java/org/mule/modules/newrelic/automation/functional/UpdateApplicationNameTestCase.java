/**
 *
 */
package org.mule.modules.newrelic.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.newrelic.NewRelicConnector;
import org.mule.modules.newrelic.automation.runner.FunctionalTestSuite;

import org.mule.modules.newrelic.bean.Application;
import org.mule.modules.newrelic.bean.Settings;
import org.mule.modules.newrelic.bean.UpdateApplicationNameRequest;
import org.mule.modules.newrelic.bean.UpdateAppplicationPutResponse;

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
			
			
			
	request.getApplication().setName("New Updated Name");
	Settings settings=new Settings();
	application.setSettings(settings);
	application.getSettings().setApp_apdex_threshold("3.0");
	application.getSettings().setEnable_real_user_monitoring("true");
	application.getSettings().setUse_server_side_config("3.0");
	
	
	
	UpdateAppplicationPutResponse res =(getConnector().updateApplicationName(request, getKey(),getApplicationId() ));
    assertNotNull(res);
  }
}

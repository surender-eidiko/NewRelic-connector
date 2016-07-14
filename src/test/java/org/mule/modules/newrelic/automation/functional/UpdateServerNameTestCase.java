/**
 *
 */
package org.mule.modules.newrelic.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.newrelic.NewRelicConnector;
import org.mule.modules.newrelic.automation.runner.FunctionalTestSuite;

import com.mule.modules.newrelic.beans.Server;
import com.mule.modules.newrelic.beans.UpdateServerNamePutResponse;
import com.mule.modules.newrelic.beans.UpdateServerNameRequest;

public class UpdateServerNameTestCase extends NewRelicAbstractTestCase{
	public UpdateServerNameTestCase() {
		super(NewRelicConnector.class);
		
	}

@Test
  @Category({FunctionalTestSuite.class})
  public void testFlow() throws Exception {
	Server server=new Server();
	server.setName("TestServer");
	
	UpdateServerNameRequest request=new UpdateServerNameRequest();
	request.setServer(server);
	UpdateServerNamePutResponse res =(getConnector().updateServerName(request, getKey(), getServerId()));
	System.out.println("res************************************************************"+res.getServer().getName());
    assertNotNull(res);
	
	
	
  }
}

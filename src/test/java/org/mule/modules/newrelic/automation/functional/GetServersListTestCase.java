/**
 *
 */
package org.mule.modules.newrelic.automation.functional;

import static org.junit.Assert.assertNotNull;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.newrelic.NewRelicConnector;
import org.mule.modules.newrelic.automation.runner.FunctionalTestSuite;

import org.mule.modules.newrelic.bean.ServerListGetResponse;

public class GetServersListTestCase extends NewRelicAbstractTestCase{
	private static final Logger log = Logger.getLogger(GetMetricNamesTestCase.class
		    .getName());
	public GetServersListTestCase() {
		super(NewRelicConnector.class);
		
	}

@Test
  @Category({FunctionalTestSuite.class})
  public void testFlow() throws Exception {
	 ServerListGetResponse res =(getConnector().getServersList("50d21105110edbed5bc2f7c147ec2b409397312a154012d", null, null, null, null, null));
	 log.log(Level.INFO, "info", res);
	 System.out.println("response ********************************************************"+res.getServers()[0].getAccount_id());
     assertNotNull(res);
  }
}

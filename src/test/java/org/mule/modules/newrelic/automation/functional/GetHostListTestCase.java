/**
 *
 */
package org.mule.modules.newrelic.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.newrelic.NewRelicConnector;
import org.mule.modules.newrelic.automation.runner.FunctionalTestSuite;

import org.mule.modules.newrelic.bean.HostListGetResponse;

public class GetHostListTestCase extends NewRelicAbstractTestCase{
	public GetHostListTestCase() {
		super(NewRelicConnector.class);
		
	}

@Test
  @Category({FunctionalTestSuite.class})
  public void testFlow() throws Exception {
	HostListGetResponse res =(getConnector().getHostList("50d21105110edbed5bc2f7c147ec2b409397312a154012d", "19072630", null, null, null));
    assertNotNull(res);
  }
}

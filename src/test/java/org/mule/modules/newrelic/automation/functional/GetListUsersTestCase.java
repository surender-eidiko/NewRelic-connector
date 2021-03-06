/**
 *
 */
package org.mule.modules.newrelic.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.newrelic.NewRelicConnector;
import org.mule.modules.newrelic.automation.runner.FunctionalTestSuite;
import org.mule.modules.newrelic.bean.GetUsersListResponse;

public class GetListUsersTestCase extends NewRelicAbstractTestCase{
	public GetListUsersTestCase() {
		super(NewRelicConnector.class);
		
	}

@Test
  @Category({FunctionalTestSuite.class})
  public void testFlow() throws Exception {
	GetUsersListResponse res =getConnector().getListUsers("50d21105110edbed5bc2f7c147ec2b409397312a154012d");
    assertNotNull(res);
  }
}

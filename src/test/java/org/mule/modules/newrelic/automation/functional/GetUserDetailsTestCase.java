/**
 *
 */
package org.mule.modules.newrelic.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.newrelic.NewRelicConnector;
import org.mule.modules.newrelic.automation.runner.FunctionalTestSuite;

import org.mule.modules.newrelic.bean.UserDetailsGetResponse;

public class GetUserDetailsTestCase extends NewRelicAbstractTestCase{
	public GetUserDetailsTestCase() {
		super(NewRelicConnector.class);
		
	}

@Test
  @Category({FunctionalTestSuite.class})
  public void testFlow() throws Exception {
	UserDetailsGetResponse res =(getConnector().getUserDetails(getKey(),getUserId()));
	System.out.println("res************************************************************"+res.getUser().getEmail());
    assertNotNull(res);
  }
}

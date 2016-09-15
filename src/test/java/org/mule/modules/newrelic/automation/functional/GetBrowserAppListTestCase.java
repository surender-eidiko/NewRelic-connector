/**
 *
 */
package org.mule.modules.newrelic.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.newrelic.NewRelicConnector;
import org.mule.modules.newrelic.automation.runner.FunctionalTestSuite;

import org.mule.modules.newrelic.bean.BrowserAppListGetResponse;

public class GetBrowserAppListTestCase extends NewRelicAbstractTestCase{

	public GetBrowserAppListTestCase() {
		super(NewRelicConnector.class);
	}
	@Test
	  @Category({FunctionalTestSuite.class})
	  public void testFlow() throws Exception {
		BrowserAppListGetResponse res =(getConnector().getBrowserAppList(getKey()));
	    assertNotNull(res);
	  }
}

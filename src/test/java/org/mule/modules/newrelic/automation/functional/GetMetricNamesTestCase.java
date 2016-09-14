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

import org.mule.modules.newrelic.bean.MetricNamesGetResponse;

public class GetMetricNamesTestCase extends NewRelicAbstractTestCase {
	private static final Logger log = Logger.getLogger(GetMetricNamesTestCase.class
		    .getName());
	public GetMetricNamesTestCase() {
		super(NewRelicConnector.class);
		
	}

@Test
  @Category({FunctionalTestSuite.class})
  public void testFlow() throws Exception {
	 MetricNamesGetResponse res =(getConnector().getMetricNames(getKey(),"19072630", null, null));
	 log.log(Level.INFO, "info", res);
	 System.out.println("response ********************************************************"+res);
     assertNotNull(res);
  }
}

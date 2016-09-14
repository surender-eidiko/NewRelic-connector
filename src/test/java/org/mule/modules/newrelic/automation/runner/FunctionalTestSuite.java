/**
 *
 */
package org.mule.modules.newrelic.automation.runner;



import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.mule.modules.newrelic.NewRelicConnector;
import org.mule.modules.newrelic.automation.functional.GetApplicationsTestCase;
import org.mule.modules.newrelic.automation.functional.GetBrowserAppListTestCase;
import org.mule.modules.newrelic.automation.functional.GetHostListTestCase;
import org.mule.modules.newrelic.automation.functional.GetListUsersTestCase;
import org.mule.modules.newrelic.automation.functional.GetMetricNamesTestCase;
import org.mule.modules.newrelic.automation.functional.GetServersListTestCase;
import org.mule.modules.newrelic.automation.functional.GetUserDetailsTestCase;
import org.mule.modules.newrelic.automation.functional.UpdateApplicationNameTestCase;
import org.mule.modules.newrelic.automation.functional.UpdateServerNameTestCase;
import org.mule.tools.devkit.ctf.mockup.ConnectorTestContext;

/*@RunWith(Categories.class)
 @IncludeCategory(FunctionalTestSuite.class)*/
@RunWith(Suite.class)
@SuiteClasses({

	GetApplicationsTestCase.class,
	GetApplicationsTestCase.class,
	GetBrowserAppListTestCase.class,
	GetHostListTestCase.class,
	GetListUsersTestCase.class,
	GetMetricNamesTestCase.class,
	GetServersListTestCase.class,
	GetUserDetailsTestCase.class,
	UpdateApplicationNameTestCase.class,
	UpdateServerNameTestCase.class

})
public class FunctionalTestSuite {

	@BeforeClass
	public static void initialiseSuite() {

		ConnectorTestContext.initialize(NewRelicConnector.class);

	}

	@AfterClass
	public static void shutdownSuite() {

		ConnectorTestContext.shutDown();

	}

}

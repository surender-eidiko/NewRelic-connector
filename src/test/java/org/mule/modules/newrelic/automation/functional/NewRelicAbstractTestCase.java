/**
 *
 */
package org.mule.modules.newrelic.automation.functional;

import org.junit.Before;
import org.mule.modules.newrelic.NewRelicConnector;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;
import org.mule.tools.devkit.ctf.mockup.ConnectorDispatcher;
import org.mule.tools.devkit.ctf.mockup.ConnectorTestContext;

public abstract class NewRelicAbstractTestCase extends AbstractTestCase<NewRelicConnector>{
	

    private NewRelicConnector connector;
	private ConnectorDispatcher<NewRelicConnector> dispatcher;
	
	public NewRelicAbstractTestCase(Class<NewRelicConnector> connector){
		  
	    super(connector);
	  }
	
	 public NewRelicConnector getConnector() {
			return connector;
		}
	 public void setConnector(NewRelicConnector connector) {
			this.connector = connector;
		}
	 public ConnectorDispatcher<NewRelicConnector> getDispatcher() {
			return dispatcher;
		}
	 public void setDispatcher(ConnectorDispatcher<NewRelicConnector> dispatcher) {
			this.dispatcher = dispatcher;
		}
	  
	 @SuppressWarnings("deprecation")
		@Before
		  public void init() throws Exception {

		    // Initialization for single-test run
		    ConnectorTestContext.initialize(NewRelicConnector.class, false);

		    // Context instance
			ConnectorTestContext<NewRelicConnector> context = ConnectorTestContext
		      .getInstance(NewRelicConnector.class);

		    // Connector dispatcher
		    dispatcher = context.getConnectorDispatcher();

		    connector = dispatcher.createMockup();

		  }	
		public String getKey()
		{
			return "50d21105110edbed5bc2f7c147ec2b409397312a154012d";
		}

		
		public String getServerId()
		{
			
			return "19082080";
		}
		
		public String getApplicationId()
		{
			return "19072630";
		}
		
		public String getUserId()
		{
			
			return "1643720";
		}
	
	 
	
	
	
	
	
	
	
		
	    
	  
	  
	 
	
	
	
}

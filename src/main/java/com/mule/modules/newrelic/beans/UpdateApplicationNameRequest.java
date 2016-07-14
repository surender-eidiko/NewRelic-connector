/**
 *
 */
package com.mule.modules.newrelic.beans;

// TODO: Auto-generated Javadoc
/**
 * The Class UpdateApplicationNameRequest.
 */
public class UpdateApplicationNameRequest {
	 
 	/** The application. */
 	private Application application;

	    /**
    	 * Gets the application.
    	 *
    	 * @return the application
    	 */
    	public Application getApplication ()
	    {
	        return application;
	    }

	    /**
    	 * Sets the application.
    	 *
    	 * @param application the new application
    	 */
    	public void setApplication (Application application)
	    {
	        this.application = application;
	    }

	    /* (non-Javadoc)
    	 * @see java.lang.Object#toString()
    	 */
    	@Override
	    public String toString()
	    {
	        return "ClassPojo [application = "+application+"]";
	    }
}

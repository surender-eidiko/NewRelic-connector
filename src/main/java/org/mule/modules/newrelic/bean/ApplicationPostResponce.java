/**
 *
 */
package org.mule.modules.newrelic.bean;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class ApplicationPostResponce.
 */
@Generated("org.jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApplicationPostResponce extends StatusResponse {
	  
  	/** The application. */
  	private Applications application;
	  
  	/** The applications. */
  	private Applications[] applications;

	    /**
    	 * Gets the applications.
    	 *
    	 * @return the applications
    	 */
    	public Applications[] getApplications ()
	    {
	        return applications;
	    }

	    /**
    	 * Sets the applications.
    	 *
    	 * @param applications the new applications
    	 */
    	public void setApplications (Applications[] applications)
	    {
	        this.applications = applications;
	    }

	    /* (non-Javadoc)
    	 * @see java.lang.Object#toString()
    	 */
    	@Override
	    public String toString()
	    {
	        return "ClassPojo [applications = "+applications+"]";
	    }
}

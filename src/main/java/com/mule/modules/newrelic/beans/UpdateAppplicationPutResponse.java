/**
 *
 */
package com.mule.modules.newrelic.beans;

// TODO: Auto-generated Javadoc
/**
 * The Class UpdateAppplicationPutResponse.
 */
public class UpdateAppplicationPutResponse extends StatusResponse{
	
	/** The application. */
	private Application application;
  
	/** The links. */
	private Links links;

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
    
    /**
     * Gets the links.
     *
     * @return the links
     */
    public Links getLinks ()
    {
        return links;
    }

    /**
     * Sets the links.
     *
     * @param links the new links
     */
    public void setLinks (Links links)
    {
        this.links = links;
    }
}

/**
 *
 */
package org.mule.modules.newrelic.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class HostListGetResponse.
 */
public class HostListGetResponse extends StatusResponse{
	
	/** The application_hosts. */
	private Application_hosts[] application_hosts;

    /** The links. */
    private Links links;

    /**
     * Gets the application_hosts.
     *
     * @return the application_hosts
     */
    public Application_hosts[] getApplication_hosts ()
    {
        return application_hosts;
    }

    /**
     * Sets the application_hosts.
     *
     * @param application_hosts the new application_hosts
     */
    public void setApplication_hosts (Application_hosts[] application_hosts)
    {
        this.application_hosts = application_hosts;
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

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [application_hosts = "+application_hosts+", links = "+links+"]";
    }
}

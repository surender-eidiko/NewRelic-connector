/**
 *
 */
package com.mule.modules.newrelic.beans;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


// TODO: Auto-generated Javadoc
/**
 * The Class ApplicationInstancesGetResponse.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class ApplicationInstancesGetResponse extends StatusResponse {
	
	/** The links. */
	private Links links;

    /** The application_instances. */
    private Application_instances[] application_instances;

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

    /**
     * Gets the application_instances.
     *
     * @return the application_instances
     */
    public Application_instances[] getApplication_instances ()
    {
        return application_instances;
    }

    /**
     * Sets the application_instances.
     *
     * @param application_instances the new application_instances
     */
    public void setApplication_instances (Application_instances[] application_instances)
    {
        this.application_instances = application_instances;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [links = "+links+", application_instances = "+application_instances+"]";
    }
}

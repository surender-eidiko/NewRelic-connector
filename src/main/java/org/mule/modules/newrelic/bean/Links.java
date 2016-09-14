/**
 *
 */
package org.mule.modules.newrelic.bean;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


// TODO: Auto-generated Javadoc
/**
 * The Class Links.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class Links
{
	
	/** The application_hosts. */
	private String[] application_hosts;

    /** The servers. */
    private String[] servers;
    
    /** The application. */
    private String application;

    /** The application_host. */
    private String application_host;

    /** The alert_policy. */
    private String alert_policy;

    /** The application_instances. */
    private String[] application_instances;


    /** The server. */
    private String server;
   
   


    /**
     * Gets the server.
     *
     * @return the server
     */
    public String getServer() {
		return server;
	}

	/**
	 * Sets the server.
	 *
	 * @param server the new server
	 */
	public void setServer(String server) {
		this.server = server;
	}

	/**
	 * Gets the application_hosts.
	 *
	 * @return the application_hosts
	 */
	public String[] getApplication_hosts ()
    {
        return application_hosts;
    }

    /**
     * Sets the application_hosts.
     *
     * @param application_hosts the new application_hosts
     */
    public void setApplication_hosts (String[] application_hosts)
    {
        this.application_hosts = application_hosts;
    }

    /**
     * Gets the servers.
     *
     * @return the servers
     */
    public String[] getServers ()
    {
        return servers;
    }

    /**
     * Sets the servers.
     *
     * @param servers the new servers
     */
    public void setServers (String[] servers)
    {
        this.servers = servers;
    }

    /**
     * Gets the alert_policy.
     *
     * @return the alert_policy
     */
    public String getAlert_policy ()
    {
        return alert_policy;
    }

    /**
     * Sets the alert_policy.
     *
     * @param alert_policy the new alert_policy
     */
    public void setAlert_policy (String alert_policy)
    {
        this.alert_policy = alert_policy;
    }

    /**
     * Gets the application_instances.
     *
     * @return the application_instances
     */
    public String[] getApplication_instances ()
    {
        return application_instances;
    }

    /**
     * Sets the application_instances.
     *
     * @param application_instances the new application_instances
     */
    public void setApplication_instances (String[] application_instances)
    {
        this.application_instances = application_instances;
    }

  
    /**
     * Gets the application.
     *
     * @return the application
     */
    public String getApplication ()
    {
        return application;
    }

    /**
     * Sets the application.
     *
     * @param application the new application
     */
    public void setApplication (String application)
    {
        this.application = application;
    }

    /**
     * Gets the application_host.
     *
     * @return the application_host
     */
    public String getApplication_host ()
    {
        return application_host;
    }

    /**
     * Sets the application_host.
     *
     * @param application_host the new application_host
     */
    public void setApplication_host (String application_host)
    {
        this.application_host = application_host;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [application = "+application+", application_host = "+application_host+"]";
    }
}
			
			
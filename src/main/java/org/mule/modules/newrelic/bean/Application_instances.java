/**
 *
 */
package org.mule.modules.newrelic.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class Application_instances.
 */
public class Application_instances {
	 
 	/** The port. */
 	private String port;

	    /** The id. */
    	private String id;

	    /** The host. */
    	private String host;

	    /** The application_name. */
    	private String application_name;

	    /** The application_summary. */
    	private Application_summary application_summary;

	    /** The links. */
    	private Links links;

	    /** The health_status. */
    	private String health_status;

	    /** The language. */
    	private String language;

	    /**
    	 * Gets the port.
    	 *
    	 * @return the port
    	 */
    	public String getPort ()
	    {
	        return port;
	    }

	    /**
    	 * Sets the port.
    	 *
    	 * @param port the new port
    	 */
    	public void setPort (String port)
	    {
	        this.port = port;
	    }

	    /**
    	 * Gets the id.
    	 *
    	 * @return the id
    	 */
    	public String getId ()
	    {
	        return id;
	    }

	    /**
    	 * Sets the id.
    	 *
    	 * @param id the new id
    	 */
    	public void setId (String id)
	    {
	        this.id = id;
	    }

	    /**
    	 * Gets the host.
    	 *
    	 * @return the host
    	 */
    	public String getHost ()
	    {
	        return host;
	    }

	    /**
    	 * Sets the host.
    	 *
    	 * @param host the new host
    	 */
    	public void setHost (String host)
	    {
	        this.host = host;
	    }

	    /**
    	 * Gets the application_name.
    	 *
    	 * @return the application_name
    	 */
    	public String getApplication_name ()
	    {
	        return application_name;
	    }

	    /**
    	 * Sets the application_name.
    	 *
    	 * @param application_name the new application_name
    	 */
    	public void setApplication_name (String application_name)
	    {
	        this.application_name = application_name;
	    }

	    /**
    	 * Gets the application_summary.
    	 *
    	 * @return the application_summary
    	 */
    	public Application_summary getApplication_summary ()
	    {
	        return application_summary;
	    }

	    /**
    	 * Sets the application_summary.
    	 *
    	 * @param application_summary the new application_summary
    	 */
    	public void setApplication_summary (Application_summary application_summary)
	    {
	        this.application_summary = application_summary;
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

	    /**
    	 * Gets the health_status.
    	 *
    	 * @return the health_status
    	 */
    	public String getHealth_status ()
	    {
	        return health_status;
	    }

	    /**
    	 * Sets the health_status.
    	 *
    	 * @param health_status the new health_status
    	 */
    	public void setHealth_status (String health_status)
	    {
	        this.health_status = health_status;
	    }

	    /**
    	 * Gets the language.
    	 *
    	 * @return the language
    	 */
    	public String getLanguage ()
	    {
	        return language;
	    }

	    /**
    	 * Sets the language.
    	 *
    	 * @param language the new language
    	 */
    	public void setLanguage (String language)
	    {
	        this.language = language;
	    }

	    /* (non-Javadoc)
    	 * @see java.lang.Object#toString()
    	 */
    	@Override
	    public String toString()
	    {
	        return "ClassPojo [port = "+port+", id = "+id+", host = "+host+", application_name = "+application_name+", application_summary = "+application_summary+", links = "+links+", health_status = "+health_status+", language = "+language+"]";
	    }
}

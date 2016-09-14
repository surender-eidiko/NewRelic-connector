/**
 *
 */
package org.mule.modules.newrelic.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class Browser_applications.
 */
public class Browser_applications {
	
	/** The id. */
	private String id;

    /** The loader_script. */
    private String loader_script;

    /** The browser_monitoring_key. */
    private String browser_monitoring_key;

    /** The name. */
    private String name;

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
     * Gets the loader_script.
     *
     * @return the loader_script
     */
    public String getLoader_script ()
    {
        return loader_script;
    }

    /**
     * Sets the loader_script.
     *
     * @param loader_script the new loader_script
     */
    public void setLoader_script (String loader_script)
    {
        this.loader_script = loader_script;
    }

    /**
     * Gets the browser_monitoring_key.
     *
     * @return the browser_monitoring_key
     */
    public String getBrowser_monitoring_key ()
    {
        return browser_monitoring_key;
    }

    /**
     * Sets the browser_monitoring_key.
     *
     * @param browser_monitoring_key the new browser_monitoring_key
     */
    public void setBrowser_monitoring_key (String browser_monitoring_key)
    {
        this.browser_monitoring_key = browser_monitoring_key;
    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName ()
    {
        return name;
    }

    /**
     * Sets the name.
     *
     * @param name the new name
     */
    public void setName (String name)
    {
        this.name = name;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", loader_script = "+loader_script+", browser_monitoring_key = "+browser_monitoring_key+", name = "+name+"]";
    }
}

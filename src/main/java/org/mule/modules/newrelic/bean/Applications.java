/**
 *
 */
package org.mule.modules.newrelic.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class Applications.
 */
public class Applications
{
	
	/** The id. */
	private String id;

    /** The last_reported_at. */
    private String last_reported_at;

    /** The settings. */
    private Settings settings;

    /** The name. */
    private String name;

    /** The application_summary. */
    private Application_summary application_summary;

    /** The links. */
    private Links links;

    /** The reporting. */
    private String reporting;

    /** The end_user_summary. */
    private End_user_summary end_user_summary;

    /** The health_status. */
    private String health_status;

    /** The language. */
    private String language;

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
     * Gets the last_reported_at.
     *
     * @return the last_reported_at
     */
    public String getLast_reported_at ()
    {
        return last_reported_at;
    }

    /**
     * Sets the last_reported_at.
     *
     * @param last_reported_at the new last_reported_at
     */
    public void setLast_reported_at (String last_reported_at)
    {
        this.last_reported_at = last_reported_at;
    }

    /**
     * Gets the settings.
     *
     * @return the settings
     */
    public Settings getSettings ()
    {
        return settings;
    }

    /**
     * Sets the settings.
     *
     * @param settings the new settings
     */
    public void setSettings (Settings settings)
    {
        this.settings = settings;
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
     * Gets the reporting.
     *
     * @return the reporting
     */
    public String getReporting ()
    {
        return reporting;
    }

    /**
     * Sets the reporting.
     *
     * @param reporting the new reporting
     */
    public void setReporting (String reporting)
    {
        this.reporting = reporting;
    }

    /**
     * Gets the end_user_summary.
     *
     * @return the end_user_summary
     */
    public End_user_summary getEnd_user_summary ()
    {
        return end_user_summary;
    }

    /**
     * Sets the end_user_summary.
     *
     * @param end_user_summary the new end_user_summary
     */
    public void setEnd_user_summary (End_user_summary end_user_summary)
    {
        this.end_user_summary = end_user_summary;
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
        return "ClassPojo [id = "+id+", last_reported_at = "+last_reported_at+", settings = "+settings+", name = "+name+", application_summary = "+application_summary+", links = "+links+", reporting = "+reporting+", end_user_summary = "+end_user_summary+", health_status = "+health_status+", language = "+language+"]";
    }
}
			
			
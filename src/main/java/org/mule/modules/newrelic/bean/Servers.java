/**
 *
 */
package org.mule.modules.newrelic.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class Servers.
 */
public class Servers {
	
	/** The summary. */
	private Summary summary;

    /** The id. */
    private String id;

    /** The last_reported_at. */
    private String last_reported_at;

    /** The host. */
    private String host;

    /** The account_id. */
    private String account_id;

    /** The name. */
    private String name;

    /** The links. */
    private Links links;

    /** The reporting. */
    private String reporting;

    /** The health_status. */
    private String health_status;

    /**
     * Gets the summary.
     *
     * @return the summary
     */
    public Summary getSummary ()
    {
        return summary;
    }

    /**
     * Sets the summary.
     *
     * @param summary the new summary
     */
    public void setSummary (Summary summary)
    {
        this.summary = summary;
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
     * Gets the account_id.
     *
     * @return the account_id
     */
    public String getAccount_id ()
    {
        return account_id;
    }

    /**
     * Sets the account_id.
     *
     * @param account_id the new account_id
     */
    public void setAccount_id (String account_id)
    {
        this.account_id = account_id;
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

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [summary = "+summary+", id = "+id+", last_reported_at = "+last_reported_at+", host = "+host+", account_id = "+account_id+", name = "+name+", links = "+links+", reporting = "+reporting+", health_status = "+health_status+"]";
    }
}

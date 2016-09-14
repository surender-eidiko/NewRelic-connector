/**
 *
 */
package org.mule.modules.newrelic.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class ServerListGetResponse.
 */
public class ServerListGetResponse extends StatusResponse{
	
	/** The servers. */
	private Servers[] servers;

    /** The links. */
    private Links links;

    /**
     * Gets the servers.
     *
     * @return the servers
     */
    public Servers[] getServers ()
    {
        return servers;
    }

    /**
     * Sets the servers.
     *
     * @param servers the new servers
     */
    public void setServers (Servers[] servers)
    {
        this.servers = servers;
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
        return "ClassPojo [servers = "+servers+", links = "+links+"]";
    }
}

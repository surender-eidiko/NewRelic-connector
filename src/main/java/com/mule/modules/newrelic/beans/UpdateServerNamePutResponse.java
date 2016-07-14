/**
 *
 */
package com.mule.modules.newrelic.beans;

// TODO: Auto-generated Javadoc
/**
 * The Class UpdateServerNamePutResponse.
 */
public class UpdateServerNamePutResponse extends StatusResponse {
	
	/** The links. */
	private Links links;

    /** The server. */
    private Server server;

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
     * Gets the server.
     *
     * @return the server
     */
    public Server getServer ()
    {
        return server;
    }

    /**
     * Sets the server.
     *
     * @param server the new server
     */
    public void setServer (Server server)
    {
        this.server = server;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [links = "+links+", server = "+server+"]";
    }
}

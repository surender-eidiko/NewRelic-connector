/**
 *
 */
package com.mule.modules.newrelic.beans;

// TODO: Auto-generated Javadoc
/**
 * The Class UpdateServerNameRequest.
 */
public class UpdateServerNameRequest {
	
	/** The server. */
	private Server server;

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
        return "ClassPojo [server = "+server+"]";
    }
}

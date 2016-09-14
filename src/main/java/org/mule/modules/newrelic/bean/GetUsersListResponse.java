/**
 *
 */
package org.mule.modules.newrelic.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class GetUsersListResponse.
 */
public class GetUsersListResponse extends StatusResponse {
	 
 	/** The users. */
 	private Users[] users;

	    /**
    	 * Gets the users.
    	 *
    	 * @return the users
    	 */
    	public Users[] getUsers ()
	    {
	        return users;
	    }

	    /**
    	 * Sets the users.
    	 *
    	 * @param users the new users
    	 */
    	public void setUsers (Users[] users)
	    {
	        this.users = users;
	    }

	    /* (non-Javadoc)
    	 * @see java.lang.Object#toString()
    	 */
    	@Override
	    public String toString()
	    {
	        return "ClassPojo [users = "+users+"]";
	    }
}

/**
 *
 */
package org.mule.modules.newrelic.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class User.
 */
public class User {
	 
 	/** The id. */
 	private String id;

	    /** The first_name. */
    	private String first_name;

	    /** The email. */
    	private String email;

	    /** The last_name. */
    	private String last_name;

	    /** The role. */
    	private String role;

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
    	 * Gets the first_name.
    	 *
    	 * @return the first_name
    	 */
    	public String getFirst_name ()
	    {
	        return first_name;
	    }

	    /**
    	 * Sets the first_name.
    	 *
    	 * @param first_name the new first_name
    	 */
    	public void setFirst_name (String first_name)
	    {
	        this.first_name = first_name;
	    }

	    /**
    	 * Gets the email.
    	 *
    	 * @return the email
    	 */
    	public String getEmail ()
	    {
	        return email;
	    }

	    /**
    	 * Sets the email.
    	 *
    	 * @param email the new email
    	 */
    	public void setEmail (String email)
	    {
	        this.email = email;
	    }

	    /**
    	 * Gets the last_name.
    	 *
    	 * @return the last_name
    	 */
    	public String getLast_name ()
	    {
	        return last_name;
	    }

	    /**
    	 * Sets the last_name.
    	 *
    	 * @param last_name the new last_name
    	 */
    	public void setLast_name (String last_name)
	    {
	        this.last_name = last_name;
	    }

	    /**
    	 * Gets the role.
    	 *
    	 * @return the role
    	 */
    	public String getRole ()
	    {
	        return role;
	    }

	    /**
    	 * Sets the role.
    	 *
    	 * @param role the new role
    	 */
    	public void setRole (String role)
	    {
	        this.role = role;
	    }

	    /* (non-Javadoc)
    	 * @see java.lang.Object#toString()
    	 */
    	@Override
	    public String toString()
	    {
	        return "ClassPojo [id = "+id+", first_name = "+first_name+", email = "+email+", last_name = "+last_name+", role = "+role+"]";
	    }
}

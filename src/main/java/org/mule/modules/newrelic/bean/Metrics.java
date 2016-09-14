/**
 *
 */
package org.mule.modules.newrelic.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class Metrics.
 */
public class Metrics {
	
	/** The values. */
	private String[] values;

    /** The name. */
    private String name;

    /**
     * Gets the values.
     *
     * @return the values
     */
    public String[] getValues ()
    {
        return values;
    }

    /**
     * Sets the values.
     *
     * @param values the new values
     */
    public void setValues (String[] values)
    {
        this.values = values;
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
        return "ClassPojo [values = "+values+", name = "+name+"]";
    }
}

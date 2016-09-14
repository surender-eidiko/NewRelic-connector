/**
 *
 */
package org.mule.modules.newrelic.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class End_user_summary.
 */
public class End_user_summary
{
	 
 	/** The response_time. */
 	private String response_time;

	    /** The apdex_target. */
    	private String apdex_target;

	    /** The apdex_score. */
    	private String apdex_score;

	    /** The throughput. */
    	private String throughput;
	  

	    /**
    	 * Gets the response_time.
    	 *
    	 * @return the response_time
    	 */
    	public String getResponse_time ()
	    {
	        return response_time;
	    }

	    /**
    	 * Sets the response_time.
    	 *
    	 * @param response_time the new response_time
    	 */
    	public void setResponse_time (String response_time)
	    {
	        this.response_time = response_time;
	    }

	    /**
    	 * Gets the apdex_target.
    	 *
    	 * @return the apdex_target
    	 */
    	public String getApdex_target ()
	    {
	        return apdex_target;
	    }

	    /**
    	 * Sets the apdex_target.
    	 *
    	 * @param apdex_target the new apdex_target
    	 */
    	public void setApdex_target (String apdex_target)
	    {
	        this.apdex_target = apdex_target;
	    }

	    /**
    	 * Gets the apdex_score.
    	 *
    	 * @return the apdex_score
    	 */
    	public String getApdex_score ()
	    {
	        return apdex_score;
	    }

	    /**
    	 * Sets the apdex_score.
    	 *
    	 * @param apdex_score the new apdex_score
    	 */
    	public void setApdex_score (String apdex_score)
	    {
	        this.apdex_score = apdex_score;
	    }

	    /**
    	 * Gets the throughput.
    	 *
    	 * @return the throughput
    	 */
    	public String getThroughput ()
	    {
	        return throughput;
	    }

	    /**
    	 * Sets the throughput.
    	 *
    	 * @param throughput the new throughput
    	 */
    	public void setThroughput (String throughput)
	    {
	        this.throughput = throughput;
	    }

	    /* (non-Javadoc)
    	 * @see java.lang.Object#toString()
    	 */
    	@Override
	    public String toString()
	    {
	        return "ClassPojo [response_time = "+response_time+", apdex_target = "+apdex_target+", apdex_score = "+apdex_score+", throughput = "+throughput+"]";
	    }
}
			
			
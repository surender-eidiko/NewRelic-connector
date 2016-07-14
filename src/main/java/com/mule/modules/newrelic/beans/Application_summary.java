/**
 *
 */
package com.mule.modules.newrelic.beans;

// TODO: Auto-generated Javadoc
/**
 * The Class Application_summary.
 */
public class Application_summary
{
	
	/** The response_time. */
	private String response_time;

    /** The apdex_target. */
    private String apdex_target;

    /** The apdex_score. */
    private String apdex_score;

    /** The instance_count. */
    private String instance_count;

    /** The error_rate. */
    private String error_rate;

    /** The throughput. */
    private String throughput;
    
    
    /** The host_count. */
    private String host_count;

   
    /** The concurrent_instance_count. */
    private String concurrent_instance_count;

  
 
    
    
    /**
     * Gets the host_count.
     *
     * @return the host_count
     */
    public String getHost_count() {
		return host_count;
	}

	/**
	 * Sets the host_count.
	 *
	 * @param host_count the new host_count
	 */
	public void setHost_count(String host_count) {
		this.host_count = host_count;
	}

	/**
	 * Gets the concurrent_instance_count.
	 *
	 * @return the concurrent_instance_count
	 */
	public String getConcurrent_instance_count() {
		return concurrent_instance_count;
	}

	/**
	 * Sets the concurrent_instance_count.
	 *
	 * @param concurrent_instance_count the new concurrent_instance_count
	 */
	public void setConcurrent_instance_count(String concurrent_instance_count) {
		this.concurrent_instance_count = concurrent_instance_count;
	}

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
     * Gets the error_rate.
     *
     * @return the error_rate
     */
    public String getError_rate ()
    {
        return error_rate;
    }

    /**
     * Sets the error_rate.
     *
     * @param error_rate the new error_rate
     */
    public void setError_rate (String error_rate)
    {
        this.error_rate = error_rate;
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
        return "ClassPojo [response_time = "+response_time+", apdex_target = "+apdex_target+", apdex_score = "+apdex_score+", error_rate = "+error_rate+", throughput = "+throughput+"]";
    }
    

    /**
     * Gets the instance_count.
     *
     * @return the instance_count
     */
    public String getInstance_count ()
    {
        return instance_count;
    }

    /**
     * Sets the instance_count.
     *
     * @param instance_count the new instance_count
     */
    public void setInstance_count (String instance_count)
    {
        this.instance_count = instance_count;
    }

   
}
			
			
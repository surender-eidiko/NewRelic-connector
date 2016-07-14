/**
 *
 */
package com.mule.modules.newrelic.beans;

// TODO: Auto-generated Javadoc
/**
 * The Class Settings.
 */
public class Settings
{
	
	/** The app_apdex_threshold. */
	private String app_apdex_threshold;

    /** The enable_real_user_monitoring. */
    private String enable_real_user_monitoring;

    /** The use_server_side_config. */
    private String use_server_side_config;

    /** The end_user_apdex_threshold. */
    private String end_user_apdex_threshold;
    
   
    
    
    /**
     * Gets the app_apdex_threshold.
     *
     * @return the app_apdex_threshold
     */
    public String getApp_apdex_threshold ()
    {
        return app_apdex_threshold;
    }

    /**
     * Sets the app_apdex_threshold.
     *
     * @param app_apdex_threshold the new app_apdex_threshold
     */
    public void setApp_apdex_threshold (String app_apdex_threshold)
    {
        this.app_apdex_threshold = app_apdex_threshold;
    }

    /**
     * Gets the enable_real_user_monitoring.
     *
     * @return the enable_real_user_monitoring
     */
    public String getEnable_real_user_monitoring ()
    {
        return enable_real_user_monitoring;
    }

    /**
     * Sets the enable_real_user_monitoring.
     *
     * @param enable_real_user_monitoring the new enable_real_user_monitoring
     */
    public void setEnable_real_user_monitoring (String enable_real_user_monitoring)
    {
        this.enable_real_user_monitoring = enable_real_user_monitoring;
    }

    /**
     * Gets the use_server_side_config.
     *
     * @return the use_server_side_config
     */
    public String getUse_server_side_config ()
    {
        return use_server_side_config;
    }

    /**
     * Sets the use_server_side_config.
     *
     * @param use_server_side_config the new use_server_side_config
     */
    public void setUse_server_side_config (String use_server_side_config)
    {
        this.use_server_side_config = use_server_side_config;
    }

    /**
     * Gets the end_user_apdex_threshold.
     *
     * @return the end_user_apdex_threshold
     */
    public String getEnd_user_apdex_threshold ()
    {
        return end_user_apdex_threshold;
    }

    /**
     * Sets the end_user_apdex_threshold.
     *
     * @param end_user_apdex_threshold the new end_user_apdex_threshold
     */
    public void setEnd_user_apdex_threshold (String end_user_apdex_threshold)
    {
        this.end_user_apdex_threshold = end_user_apdex_threshold;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [app_apdex_threshold = "+app_apdex_threshold+", enable_real_user_monitoring = "+enable_real_user_monitoring+", use_server_side_config = "+use_server_side_config+", end_user_apdex_threshold = "+end_user_apdex_threshold+"]";
    }
}
			
			
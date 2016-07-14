/**
 *
 */
package org.mule.modules.newrelic;

import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Processor;
import org.mule.api.annotations.lifecycle.Start;
import org.mule.api.annotations.param.Default;
import org.mule.api.annotations.param.Optional;
import org.mule.modules.newrelic.config.ConnectorConfig;

import com.mule.modules.newrelic.beans.ApplicationInstancesGetResponse;
import com.mule.modules.newrelic.beans.ApplicationPostResponce;
import com.mule.modules.newrelic.beans.BrowserAppListGetResponse;
import com.mule.modules.newrelic.beans.HostListGetResponse;
import com.mule.modules.newrelic.beans.MetricNamesGetResponse;
import com.mule.modules.newrelic.beans.GetUsersListResponse;
import com.mule.modules.newrelic.beans.ServerListGetResponse;
import com.mule.modules.newrelic.beans.UpdateApplicationNameRequest;
import com.mule.modules.newrelic.beans.UpdateAppplicationPutResponse;
import com.mule.modules.newrelic.beans.UpdateServerNamePutResponse;
import com.mule.modules.newrelic.beans.UpdateServerNameRequest;
import com.mule.modules.newrelic.beans.UserDetailsGetResponse;

// TODO: Auto-generated Javadoc
/**
 * The Class NewRelicConnector.
 */

/**
 * This is Pager Duty Connector Class.
 *
 * @author Surender
 */

@Connector(name="new-relic", friendlyName="NewRelic")
public class NewRelicConnector {

    /** The config. */
    @Config
    ConnectorConfig config;

    /**
     * Custom processor.
     *
     * @return A greeting message
     */
    private NewRelicClient client;
 
    /**
     * Inits the.
     */
    @Start
    public void init() {
      setClient(new NewRelicClient(this));
    }

    
    
    /**
     * Gets the client.
     *
     * @return the client
     */
    public NewRelicClient getClient() {
		return client;
	}

	/**
	 * Sets the client.
	 *
	 * @param client the new client
	 */
	public void setClient(NewRelicClient client) {
		this.client = client;
	}

	/**
	 * Gets the config.
	 *
	 * @return the config
	 */
	public ConnectorConfig getConfig() {
        return config;
    }

    /**
     * Sets the config.
     *
     * @param config the new config
     */
    public void setConfig(ConnectorConfig config) {
        this.config = config;
    }

    /**
     * Gets the applications service.
     *
     * @param api_Key the api_ key
     * @param applicationName the application name
     * @param host the host
     * @param language the language
     * @param pageIndex the page index
     * @return the applications service
     */
    @Processor
    
    public ApplicationPostResponce getApplicationsService(String api_Key,@Optional String applicationName,@Optional String host,@Optional String language,@Optional String pageIndex) {
		// TODO Auto-generated method stub
    	return getClient().getApplications(api_Key, applicationName, host, language, pageIndex);
	}
    
    
    /**
     * Gets the list users.
     *
     * @param api_key the api_key
     * @param filter_userIds the filter_user ids
     * @param filter_Email the filter_ email
     * @param page the page
     * @return the list users
     */
    @Processor
    public GetUsersListResponse getListUsers(String api_key,@Optional String filter_userIds,@Optional String filter_Email,@Optional String page)
    {
    	
    	return getClient().getListUsers( api_key, filter_userIds,filter_Email, page);
    	
    }
    
    /**
     * Gets the metric names.
     *
     * @param api_key the api_key
     * @param applicationId the application id
     * @param applicationName the application name
     * @param page the page
     * @return the metric names
     */
    @Processor
    public MetricNamesGetResponse getMetricNames(String api_key,String applicationId,@Optional String applicationName,@Optional String page)
    {
    	
    	return getClient().getMetricNames(api_key,applicationId,applicationName,page);
    	
    	
    }
    
    
    /**
     * Gets the application instance list.
     *
     * @param api_Key the api_ key
     * @param application_id the application_id
     * @param hostName the host name
     * @param applicationInstanceIds the application instance ids
     * @param page the page
     * @return the application instance list
     */
    @Processor
    public ApplicationInstancesGetResponse getApplicationInstanceList(String api_Key,String application_id,@Optional String hostName,@Optional String applicationInstanceIds,@Optional String page)
    {
    	return getClient().getApplicationInstanceList(api_Key,application_id,hostName,applicationInstanceIds,page);
    	
    	
    	
    }
    
    
   /**
    * Gets the servers list.
    *
    * @param apikey the apikey
    * @param serverName the server name
    * @param host the host
    * @param serverIdsList the server ids list
    * @param labels the labels
    * @param page the page
    * @return the servers list
    */
   @Processor
   public ServerListGetResponse getServersList(String apikey,@Optional String serverName,@Optional String host,@Optional String serverIdsList,@Optional String labels,String page)
  {
	   return getClient().getServersList(apikey,serverName,host,serverIdsList,labels,page);
	   
	   
  }
    
   /**
    * Gets the host list.
    *
    * @param apikey the apikey
    * @param applicationId the application id
    * @param hostName the host name
    * @param applicationHostIds the application host ids
    * @param page the page
    * @return the host list
    */
   @Processor
   
   public HostListGetResponse getHostList(String apikey,String applicationId,@Optional String hostName,@Optional String applicationHostIds,@Optional String page)
   {
	   
	   return getClient().getHostList(apikey, applicationId, hostName, applicationHostIds, page);
   }
    
    
   /**
    * Gets the browser app list.
    *
    * @param apikey the apikey
    * @param applicationName the application name
    * @param appIds the app ids
    * @param page the page
    * @return the browser app list
    */
   @Processor
    public BrowserAppListGetResponse getBrowserAppList(String apikey,@Optional String applicationName,@Optional String appIds,@Optional String page)
   {
	   return getClient().getBrowserAppList(apikey,applicationName,appIds,page);
	   
	   
   }
    
    
    /**
     * Update server name.
     *
     * @param requestData the request data
     * @param apikey the apikey
     * @param serverId the server id
     * @return the update server name put response
     */
    @Processor
    public UpdateServerNamePutResponse updateServerName(@Default("#[payload]") UpdateServerNameRequest requestData,String apikey,String serverId)
    {
    	return getClient().updateServerName(requestData,apikey,serverId);
    }
    
    /**
     * Update application name.
     *
     * @param requestData the request data
     * @param apikey the apikey
     * @param applicationId the application id
     * @return the update appplication put response
     */
    @Processor
    
    public UpdateAppplicationPutResponse updateApplicationName(@Default("#[payload]") UpdateApplicationNameRequest requestData,String apikey,String applicationId)
    {
    	return getClient().updateApplicationName(requestData,apikey,applicationId);
    	
    	
    }
    
    
    /**
     * Gets the user details.
     *
     * @param apikey the apikey
     * @param userId the user id
     * @return the user details
     */
    @Processor
    public UserDetailsGetResponse getUserDetails(String apikey,String userId)
    {
    	
    	return getClient().getUserDetails(apikey,userId);
    	
    }
    
    


}
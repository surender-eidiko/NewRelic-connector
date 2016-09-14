/**
 *
 */
package org.mule.modules.newrelic;

import java.lang.reflect.Constructor;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import org.codehaus.jackson.map.ObjectMapper;
import org.mule.api.annotations.param.Optional;
import org.mule.modules.newrelic.config.ConnectorConfig;

import org.mule.modules.newrelic.bean.*;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;
import com.sun.jersey.core.util.MultivaluedMapImpl;

public class NewRelicClient {
	
	
	  ConnectorConfig config;
	
	  private Client client;
	  private WebResource apiResource;
	  private NewRelicConnector connector;
	 
	  private static final Logger log = Logger.getLogger(NewRelicClient.class
	    .getName());

	  public NewRelicClient(NewRelicConnector connector) {
	    setConnector(connector);

	    ClientConfig clientConfig = new DefaultClientConfig();
	    clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING,
	      Boolean.TRUE);
	    this.client = Client.create(clientConfig);
	    this.apiResource = this.client.resource(getConnector().getConfig().getUrl());
	  }
	 

	  public ConnectorConfig getConfig() {
		    return config;
		  }

		  /**
		 * @param config
		 */
		public void setConfig(ConnectorConfig config) {
		    this.config = config;
		  }

		  /**
		 * @return SparkClient Object
		 */
		



	    public ApplicationPostResponce getApplications(String api_Key,@Optional String applicationName,@Optional String host,@Optional String language,@Optional String pageIndex)
	    {
	    	
	    	WebResource webResource = getApiResource().path("applications.json");
	    	
	    	 MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
	    	    if (applicationName != null) {
	    	      queryParams.add("applicationName", applicationName);
	    	    }
	    	    if (host != null) {
	    	      queryParams.add("host", host);
	    	    }
	    	   
	    	    if (language != null) {
	    	      queryParams.add("language",language);
	    	    }
	    	    if(pageIndex!=null)
	    	    {
	    	    	
		    	      queryParams.add("id", pageIndex);

	    	    }
	    	    webResource = webResource.queryParams(queryParams);
	        return (ApplicationPostResponce) getData(webResource,
	          ApplicationPostResponce.class, api_Key);
	    	
	    }
	    
	    
	    
	  
	
	

	  
	   

	    private WebResource.Builder addHeader(WebResource webResource, String token) {
		    WebResource.Builder builder = webResource
		      .accept(MediaType.APPLICATION_JSON);
		    String authToken = null;
			if(token == null)
		    	authToken = connector.getConfig().getAuthorization();
		    builder.header("X-Api-Key", authToken);
		    return builder;
		  }


	    private Object buildResponseObject(Class<?> returnClass,
	      ClientResponse clientResponse) {
	      StatusResponse statusResponse = null;
	      if (clientResponse.getStatus() == 200) {
	        statusResponse = (StatusResponse) clientResponse
	          .getEntity(returnClass);
	        statusResponse.setStatusCode("200");
	      } else {
	       
	        String strResponse = clientResponse.getEntity(String.class);
	        try {
	          Constructor<?> ctor = returnClass.getConstructor();
	          statusResponse = (StatusResponse) ctor.newInstance();
	          statusResponse.setStatusCode(String.valueOf(clientResponse
	            .getStatus()));
	          statusResponse.setStatusMessage(strResponse);
	        } catch (Exception ex) {
	          log.log(Level.SEVERE, "Error", ex);
	        }
	      }
	    
	      return statusResponse;
	     
	    }

	  private String convertObjectToString(Object request, ObjectMapper mapper) {
	    String input = "";

	    try {
	      input = mapper.writeValueAsString(request);

	    } catch (Exception ex) {
	      log.log(Level.SEVERE, "Error", ex);
	    }
	    log.info("Input String = " + input);
	    return input;
	  }

	  public Client getClient() {
	    return client;
	  }

	  public void setClient(Client client) {
	    this.client = client;
	  }

	  public WebResource getApiResource() {
	    return apiResource;
	  }

	  public void setApiResource(WebResource apiResource) {
	    this.apiResource = apiResource;
	  }

	  public NewRelicConnector getConnector() {
	    return connector;
	  }

	  public void setConnector(NewRelicConnector connector) {
	    this.connector = connector;
	  }


	public GetUsersListResponse getListUsers(String api_key,
			String filter_userIds, String filter_Email, String page) {
		
		WebResource webResource = getApiResource().path("users.json");
    	
   	 MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
   	    if (filter_userIds != null) {
   	      queryParams.add("filter_userIds", filter_userIds);
   	    }
   	    if (filter_Email != null) {
   	      queryParams.add("filter_Email", filter_Email);
   	    }
   	   
   	    if (page != null) {
   	      queryParams.add("page",page);
   	    }
   	   
   	    webResource = webResource.queryParams(queryParams);
       return (GetUsersListResponse) getData(webResource,
    		   GetUsersListResponse.class, api_key);
		
		
		
		
	}


	//getmetric names method
	
	public MetricNamesGetResponse getMetricNames(String api_key,
			String applicationId, String name, String page) {
		WebResource webResource = getApiResource().path("metrics.json");
    	
	   	 MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
	   	   
	   	 
	   	    if (applicationId != null) {
	   	      queryParams.add("applicationId", applicationId);
	   	    }
	   	   
	   	    if (name != null) {
	   	      queryParams.add("name", name);
	   	    }
	   	    if (page != null) {
	   	      queryParams.add("page", page);
	   	    }
	   	   
	   	   
	   	    webResource = webResource.queryParams(queryParams);
	       return (MetricNamesGetResponse) getData(webResource,
	    		   MetricNamesGetResponse.class, api_key);
	}

	
	

	public ApplicationInstancesGetResponse getApplicationInstanceList(
			String api_Key, String application_id, String hostName,
			String applicationInstanceIds, String page) {
		WebResource webResource = getApiResource().path("applications/"+application_id+"/instances.json");
    	log.info("webresource**************************"+webResource);
	   	 MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
	   	   
	   	 
	   	   
	   	   
	   	    if (application_id != null) {
	   	      queryParams.add("application_id", application_id);
	   	    }
	   	    if (hostName != null) {
	   	      queryParams.add("hostName", hostName);
	   	    }
	   	    if(applicationInstanceIds!=null)
	   	    {
		   	      queryParams.add("applicationInstanceIds", applicationInstanceIds);

	   	    }
	   	   if(page!=null)
	   	   {
		   	      queryParams.add("page", page);

	   	   }
	   	   
	   	    webResource = webResource.queryParams(queryParams);
	       return (ApplicationInstancesGetResponse) getData(webResource,
	    		   ApplicationInstancesGetResponse.class, api_Key);
	}


	public ServerListGetResponse getServersList(String apikey, String name,
			String host, String serverIdsList, String labels, String page) {
		WebResource webResource = getApiResource().path("servers.json");
    	log.info("webresource**************************"+webResource);
	   	 MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
	   	   
	   	 
	   	   
	   	   
	   	    if (name != null) {
	   	      queryParams.add("name", name);
	   	    }
	   	    if (host != null) {
	   	      queryParams.add("host", host);
	   	    }
	   	    if(serverIdsList!=null)
	   	    {
		   	      queryParams.add("serverIdsList", serverIdsList);

	   	    }
	   	 if(labels!=null)
	   	   {
		   	      queryParams.add("labels", labels);

	   	   }
	   	    
	   	    
	   	 if(page!=null)
	   	   {
		   	      queryParams.add("page", page);

	   	   }
	   	   
	   	    webResource = webResource.queryParams(queryParams);
	       return (ServerListGetResponse) getData(webResource,
	    		   ServerListGetResponse.class, apikey);
	}


	public HostListGetResponse getHostList(String apikey, String applicationId,
			String hostName, String applicationHostIds, String page) {
		WebResource webResource = getApiResource().path("applications").path(""+applicationId+"").path("hosts.json");
    	log.info("webresource**************************"+webResource);
	   	 MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
	   	   
	   	 
	   	   
	   	   
	   	    if (hostName != null) {
	   	      queryParams.add("hostName", hostName);
	   	    }
	   	    if (applicationHostIds !=null) {
	   	      queryParams.add("applicationHostIds", applicationHostIds);
	   	    }
	   	    if(page!=null)
	   	    {
		   	      queryParams.add("page", page);

	   	    }
	   	 	   	   
	   	    webResource = webResource.queryParams(queryParams);
	       return (HostListGetResponse) getData(webResource,
	    		   HostListGetResponse.class, apikey);
	}


	public BrowserAppListGetResponse getBrowserAppList(String apikey,
			String applicationName, String appIds, String page) {

		WebResource webResource = getApiResource().path("browser_applications.json");
    	log.info("webresource**************************"+webResource);
	   	 MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
	   	   
	   	 
	   	   
	   	   
	   	    if (applicationName != null) {
	   	      queryParams.add("applicationName", applicationName);
	   	    }
	   	    if (appIds !=null) {
	   	      queryParams.add("appIds", appIds);
	   	    }
	   	    if(page!=null)
	   	    {
		   	      queryParams.add("page", page);

	   	    }
	   	 	   	   
	   	    webResource = webResource.queryParams(queryParams);
	       return (BrowserAppListGetResponse) getData(webResource,
	    		   BrowserAppListGetResponse.class, apikey);
	}


	public UpdateServerNamePutResponse updateServerName(UpdateServerNameRequest requestData, String apikey,
			String serverId) {
		
		    WebResource webResource = getApiResource().path("servers").path(""+serverId+".json");
		    
		    return (UpdateServerNamePutResponse) putData(requestData,
		      webResource, UpdateServerNamePutResponse.class, apikey);
	
	}

	private Object getData(WebResource webResource, Class<?> returnClass,String token) {

	    WebResource.Builder builder = addHeader(webResource, token);

	    ClientResponse clientResponse = builder.get(ClientResponse.class);
	    return buildResponseObject(returnClass, clientResponse);
	  }

	  private Object putData(Object request, WebResource webResource,
	    Class<?> returnClass, String token) {
	    WebResource.Builder builder = addHeader(webResource, token);
	    builder.type(MediaType.APPLICATION_JSON);
	    ObjectMapper mapper = new ObjectMapper();
	    String input = convertObjectToString(request, mapper);
	    
	    ClientResponse clientResponse = builder
	      .put(ClientResponse.class, input);
	    

	    return buildResponseObject(returnClass, clientResponse);
	  }

	public UpdateAppplicationPutResponse updateApplicationName(
			UpdateApplicationNameRequest requestData, String apikey,
			String applicationId) {
			
		WebResource webResource = getApiResource().path("applications").path(""+applicationId+".json");
		    
		    return (UpdateAppplicationPutResponse) putData(requestData,
		  
		    		
		    		webResource, UpdateAppplicationPutResponse.class, apikey);
	}


	public UserDetailsGetResponse getUserDetails(String apikey, String userId) {
		WebResource webResource = getApiResource().path("users").path(""+userId+".json");
	   	 
	       return (UserDetailsGetResponse) getData(webResource,
	    		   UserDetailsGetResponse.class, apikey);
	}
}

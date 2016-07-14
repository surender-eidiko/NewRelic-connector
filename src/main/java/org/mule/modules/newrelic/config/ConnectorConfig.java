/**
 *
 */
package org.mule.modules.newrelic.config;

import org.mule.api.annotations.components.Configuration;
import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.param.Default;
import org.mule.api.annotations.param.Optional;
import org.mule.api.annotations.rest.RestHeaderParam;

@Configuration(friendlyName = "Configuration")
public class ConnectorConfig {

	  @Configurable
	  @Optional
	  @Default("https://api.newrelic.com/v2")
	  private String url = "https://api.newrelic.com/v2";

	  @Configurable
	  @Optional
	  @RestHeaderParam("Authorization")
	  private String authorization = "50d21105110edbed5bc2f7c147ec2b409397312a154012d";

	  public String getUrl() {
	    return url;
	  }

	  public void setUrl(String url) {
	    this.url = url;
	  }

	  public String getAuthorization() {
	    return authorization;
	  }

	  public void setAuthorization(String authorization) {
	    this.authorization = authorization;
	  }

	}


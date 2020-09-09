package com.cloud.config.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.config.pojo.ServerConfig;
import com.cloud.config.propsconfig.CloudConfigProps;

/*
 * @RefreshScope here added for any changes make reflected in here
 * Here :
 * endpoints:
    web:
      exposure:
        include:
          - health
          - refresh    # update the client if any changes happen in git properites file.
 */
@RestController
@RefreshScope
public class CloudController {

	
 @Autowired
 CloudConfigProps cloudProps;
	/*
 * This API will fetch server details from Spring cloud server
 * @here : check bootstrap.yml 
 * 
 */
 
	@GetMapping("/cloudserver")
	public ServerConfig getCloudServerDetails() {
		
	 return new ServerConfig(cloudProps.getAppName(), cloudProps.getDbName(), 
			           cloudProps.getDriverName(), cloudProps.getPort(), 
			           cloudProps.getUrl(),cloudProps.getUserName());
	}

	@GetMapping("/healthcheck")
	public String getHealthCheck() {
	 return "OK";
	}
	
}

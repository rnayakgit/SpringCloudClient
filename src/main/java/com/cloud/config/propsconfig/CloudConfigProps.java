package com.cloud.config.propsconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
/*
 * prefix mean properites or field  first starting given name
 */
@Configuration
@ConfigurationProperties(prefix ="service")
public class CloudConfigProps {
	/**
	 * @here default value is given not defined if value not found from git hub
	 */
    @Value("${service.datasource.username: not defined }")
	private String userName;
    @Value("${service.datasource.dbname:  not defined }")
	private String dbName;
    @Value("${service.datasource.driver: not defined }")
	private String driverName;	
    @Value("${service.datasource.port: not defined }")
	private String port;
    @Value("${service.name: not defined }")
	private String appName;
    @Value("${service.url : not defined }")
	private String url;
	
	
	
	public CloudConfigProps() {
		
	}
	public CloudConfigProps(String userName, String dbName, String driverName, String port, String appName, String url) {
		this.userName = userName;
		this.dbName = dbName;
		this.driverName = driverName;
		this.port = port;
		this.appName = appName;
		this.url = url;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getDbName() {
		return dbName;
	}
	public void setDbName(String dbName) {
		this.dbName = dbName;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
	
	
}

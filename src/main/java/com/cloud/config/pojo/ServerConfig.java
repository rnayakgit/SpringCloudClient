package com.cloud.config.pojo;
/**
 * Note :if we are returning Pojo class as response body then Pojo class must be
 * getter and setter method available
 * can cause Exception :- ‘No converter found for return value of type’:
 * 
 */
public class ServerConfig {
					
	private String userName;
	private String dbName;
	private String driverName;	
	private String port;
	private String appName;
	private String url;
	/**
	 * @param userName
	 * @param dbName
	 * @param driverName
	 * @param port
	 * @param appName
	 * @param url
	 */
	public ServerConfig(String userName, String dbName, String driverName, String port, String appName, String url) {
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

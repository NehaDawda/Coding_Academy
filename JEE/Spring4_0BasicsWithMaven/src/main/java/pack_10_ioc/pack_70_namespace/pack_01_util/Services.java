package pack_10_ioc.pack_70_namespace.pack_01_util;

import java.util.Properties;

public class Services {
	private Properties serverIps;

	public void setServerIps(Properties serverIps) {
		this.serverIps = serverIps;
	}
	
	public String getIp(String serverName){
		return serverIps.getProperty(serverName);
	}
}

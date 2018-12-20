package com.jp.hr.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.stereotype.Component;

@Component("connectionFactory")
public class ConnectionFactory {
	private Connection connect;
	
	public ConnectionFactory() 
			throws ClassNotFoundException, SQLException{
		
		String driverName = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String userName = "scott";
		String password = "lion";
		
		Class.forName(driverName);
		connect = DriverManager.getConnection(url, userName, password);
	}
	
	public Connection getConnection(){
		return connect;
	}
	
	public void closeConnection() throws SQLException {
		connect.close();
	}
}

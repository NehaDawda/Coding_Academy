/**
 * 
 */
package com.lnt.day16.jdbc.connection01;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * @author smita
 *
 */
public class MyConnection {
	private static Connection con;
	public static Connection getConnection() {
		String driver, url, username, password;
		try {
	File file = new File("src/database.properties");
			FileInputStream fis = 
					new FileInputStream(file);
			Properties prop = new Properties();
		prop.load(fis);// loaded the property file
		fis.close();
		//get the property from file
			driver = prop.getProperty("driver");
			url = prop.getProperty("url");
			username = prop.getProperty("username");
			password = prop.getProperty("password");			
			//loading and registering the driver
			Class.forName(driver);
			//getting connection
		con= DriverManager
			.getConnection(url, username, password);
			if(con!=null)
				System.out.println("connection "
						+ "Obtained!!");
			else
			   System.out.println("sorry boss "
		+ "something went wrong with connection!!");
					
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}//end of method
	public static void closeConnection() {
		try {
			if (con != null)
				con.close();
			else
				System.out.println("Connection already closed!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

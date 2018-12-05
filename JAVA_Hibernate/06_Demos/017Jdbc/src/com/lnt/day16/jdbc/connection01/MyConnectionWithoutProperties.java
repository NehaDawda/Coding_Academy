/**
 * 
 */
package com.lnt.day16.jdbc.connection01;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * @author brije
 *
 */
public class MyConnectionWithoutProperties {
	private static Connection con;
	public static Connection getConnection() {		
		//#driver class name (fully qualified , package name.classname
		String	driver="oracle.jdbc.driver.OracleDriver";
		//Database url
		String	url="jdbc:oracle:thin:@localhost:1521:orahome";
		//db username
		String	user="system";
		//db password
		String	password="system";		
		try {//step1 - load and register the driver4
			Class.forName(driver);//loading the driver class dynamically
			//step2 - Obtain Connection
			con=DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		System.out.println("obtaining the connection !!!");
		return con;		
	}
	//closing the connection
	public static void closeConnection() {
		if(con!=null) {
			try {
				System.out.println("closing the connection !!!");
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			System.out.println("connection already closed!!!");
		}
	}
}

package com.lnt.day16.jdbc.connection01;

import java.sql.Connection;

public class TestConnection {

	public static void main(String[] args) {
		/*Connection con = MyConnectionWithoutProperties.getConnection();*/
		Connection con = MyConnection.getConnection();
		if(con!=null)
			System.out.println("Connection Obtained "+con);
		else
			System.out.println("Connection Not Obtained ");
		
	}

}

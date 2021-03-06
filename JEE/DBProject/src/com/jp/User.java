package com.jp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class User {
	private String name;
	private String password;
	
	public User(String name, String pwd){
		this.name = name;
		this.password = pwd;
	}
	
	public boolean validUser() {
		boolean flag = false;
		
		Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
		
        try{
        	Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl","hr","hr");
            pstmt = con.prepareStatement("SELECT count(*) from EMPLOYEES WHERE first_name = ? and last_name = ?");
            
            pstmt.setString(1, this.name);
            pstmt.setString(2, this.password);
            
            
            rs = pstmt.executeQuery();
            rs.next();
            
            int count = rs.getInt(1);
            
            if(count >= 1){
            	flag = true;
            }
            rs.close();
        	pstmt.close();
        	con.close();
        }catch(SQLException | ClassNotFoundException e){
        	e.printStackTrace();
        }
        //finally{
        	//try{
        	//rs.close();
        	///pstmt.close();
        	///con.close();
        	//}catch(SQLException e){
        		//e.printStackTrace();
        	//}
        //}

        return flag;
        
	}

}

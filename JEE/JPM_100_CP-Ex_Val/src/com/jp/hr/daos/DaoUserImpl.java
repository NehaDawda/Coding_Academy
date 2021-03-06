package com.jp.hr.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.jp.hr.entities.User;
import com.jp.hr.exceptions.HrException;
import com.jp.hr.utilities.ConnectionFactoryTomcat;

public class DaoUserImpl implements DaoUser{
	private DataSource dataSource;
	
	public DaoUserImpl() throws HrException{
		try {
			//ConnectionFactory factory = ConnectionFactory.getConnectionFactory();
			ConnectionFactoryTomcat factory = ConnectionFactoryTomcat.getConnectionFactory();
			dataSource = factory.getDataSource();
		} catch (Exception e) {
			throw new HrException("Problem in procurring connection",e);
		} 
	}
	
	
	@Override
	public User getUserDetails(String userId) throws HrException {
		String qry = "SELECT user_id,password,full_name,role FROM USER_MASTER where lower(user_id) = ?";
		Connection connect = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			connect = dataSource.getConnection();
			pstmt = connect.prepareStatement(qry);
			pstmt.setString(1, userId.toLowerCase());
			rs = pstmt.executeQuery();
			
			if(rs.next()){
				String password = rs.getString("password");
				String fullName = rs.getString("full_name");
				String role = rs.getString("role");
				return new User(userId,password,fullName,role);
			}
			else{
				return null;
			}
		} catch (SQLException e) {
			throw new HrException("Problem in fetching.",e);
		} finally {
			try {
				if(rs != null){
					rs.close();
				}
				if(pstmt != null){
					pstmt.close();
				}
				if(connect != null){
					connect.close();
				}
			} catch (SQLException e) {
				throw new HrException("Problem in closing resources.", e);
			}
		}
	}

}

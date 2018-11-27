package com.jp.hr.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.jp.hr.entities.Employee;
import com.jp.hr.exceptions.HrException;

/*
 * The ClassNotFound
 */

public class DaoEmployeeImpl implements DaoEmployee{

	private Connection getConnection() throws HrException, ClassNotFoundException, SQLException{
		String driverName = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521/orcl";
		String userName = "hr";
		String password = "hr";
		
		Class.forName(driverName);
		return DriverManager.getConnection(url, userName, password);
	}
	
	private void closeConnection(Connection connection) throws SQLException{
		connection.close();
	}
	
	@Override
	public ArrayList<Employee> getEmpList() throws HrException {
		ArrayList<Employee> empList = new ArrayList();
		Connection connect = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			connect = getConnection();
			stmt = connect.createStatement();
			rs = stmt.executeQuery("SELECT employee_id,first_name,last_name FROM EMPLOYEES");
			
			while(rs.next()){
				int empId = rs.getInt("Employee_id");
				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");
				empList.add(new Employee(empId,firstName,lastName));
			}
		} catch (ClassNotFoundException | SQLException e) {
			throw new HrException("Problem in fetching.",e);
		} finally {
			try {
				rs.close();
				stmt.close();
				closeConnection(connect);
			} catch (SQLException e) {
				throw new HrException("Problem in closing resources.", e);
			}
		}
		
		return empList;
	}

	
}

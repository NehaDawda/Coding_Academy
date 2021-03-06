package com.jp.hr.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.jp.hr.entities.Employee;
import com.jp.hr.exceptions.HrException;
import com.jp.hr.utilities.ConnectionFactory;

/*
 * The ClassNotFoundException and SQLException should not come out of Dao class.
 * the database specific entities must come out of the class (Like Exception & ResultSet).
 * Each and every resource (Connection, Statement and ResultSet) must be closed proper before coming out.
 * Always prefer Statement over PreparedStatement for non interactive queries.
 * Fetch the data page wise.
 * Prefer mentioning column names instead of column position in getXXX() method. 
 */

public class DaoEmployeeImpl implements DaoEmployee{
	private ConnectionFactory factory;
	
	public DaoEmployeeImpl() throws HrException{
		try {
			factory = new ConnectionFactory();
		} catch (Exception e) {
			throw new HrException("Problem in procurring connection",e);
		} 
	}
	
	@Override
	public ArrayList<Employee> getEmpList() throws HrException {
		ArrayList<Employee> empList = new ArrayList();
		Connection connect = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			connect = factory.getConnection();
			stmt = connect.createStatement();
			rs = stmt.executeQuery("SELECT employee_id,first_name,last_name FROM EMPLOYEE");
			
			while(rs.next()){
				int empId = rs.getInt("Employee_id");
				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");
				empList.add(new Employee(empId,firstName,lastName));
			}
		} catch (SQLException e) {
			throw new HrException("Problem in fetching.",e);
		} finally {
			try {
				if(rs != null){
					rs.close();
				}
				if(stmt != null){
					stmt.close();
				}
				//factory.closeConnection();
			} catch (SQLException e) {
				throw new HrException("Problem in closing resources.", e);
			}
		}
		
		return empList;
	}

	@Override
	public Employee getEmpDetails(int empId) throws HrException {
		String qry = "SELECT employee_id,first_name,last_name FROM EMPLOYEE where employee_id = ?";
		Connection connect = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			connect = factory.getConnection();
			pstmt = connect.prepareStatement(qry);
			pstmt.setInt(1, empId);
			rs = pstmt.executeQuery();
			
			if(rs.next()){
				
				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");
				return new Employee(empId,firstName,lastName);
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
				//factory.closeConnection();
			} catch (SQLException e) {
				throw new HrException("Problem in closing resources.", e);
			}
		}
	}

	@Override
	public boolean insertNewRecord(Employee emp) throws HrException {
		String qry = "INSERT INTO EMPLOYEE(employee_id,first_name,last_name) VALUES (?,?,?)";
		Connection connect = null;
		PreparedStatement pstmt = null;
		
		try {
			connect = factory.getConnection();
			pstmt = connect.prepareStatement(qry);
			pstmt.setInt(1, emp.getEmpId());
			pstmt.setString(2, emp.getFirstName());
			pstmt.setString(3, emp.getLastName());
			
			int recInserted = pstmt.executeUpdate();
			
			return recInserted == 1 ? true : false;
			
		} catch (SQLException e) {
			throw new HrException("Problem in fetching.",e);
		} finally {
			try {
				if(pstmt != null){
					pstmt.close();
				}
				//factory.closeConnection();
			} catch (SQLException e) {
				throw new HrException("Problem in closing resources.", e);
			}
		}
	}

	@Override
	protected void finalize() throws Throwable {
		factory.closeConnection();
		super.finalize();
	}
	
}

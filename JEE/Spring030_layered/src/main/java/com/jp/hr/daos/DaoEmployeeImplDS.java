package com.jp.hr.daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jp.hr.entities.Employee;
import com.jp.hr.exceptions.HrException;

@Repository("daoDS")
public class DaoEmployeeImplDS implements DaoEmployee {
	@Autowired // By Type autowiring.
	private DataSource dataSource;
	
	@Override
	public ArrayList<Employee> getEmpList() throws HrException {
		ArrayList<Employee> empList = new ArrayList<>();
		Connection connect = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			connect = dataSource.getConnection();
			stmt = connect.createStatement();
			rs = stmt.executeQuery("SELECT empid,ename,address FROM employee_details");
			
			while(rs.next()){
				int empId = rs.getInt("empid");
				String firstNm = rs.getString("ename");
				String lastNm = rs.getString("address");
				empList.add(new Employee(empId, firstNm, lastNm));
			}
			
		} catch (SQLException e) {
			throw new HrException("Problem in fetching.", e);
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				connect.close();
			} catch (SQLException e) {
				throw new HrException("Problem in closing resources.", e);
			}
		}
		
		return empList;
	}

	@Override
	public Employee getEmpDetails(int empId) throws HrException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertNewRecord(Employee emp) throws HrException {
		// TODO Auto-generated method stub
		return false;
	}

}

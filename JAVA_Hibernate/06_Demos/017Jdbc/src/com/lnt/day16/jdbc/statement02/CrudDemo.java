/**
 * 
 */
package com.lnt.day16.jdbc.statement02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import com.lnt.day16.jdbc.connection01.MyConnection;

/**
 * @author brije
 *
 */

/*
 * MySql create table emp123 (emp_id integer, first_name varchar(30) primary
 * key, last_name varchar(30), phone_no varchar(30), email varchar(30));
 */
/*
 * Oracle create table emp123 (emp_id number, first_name varchar2(30) primary
 * key, last_name varchar2(30), phone_no varchar2(30), email varchar2(30));
 */
public class CrudDemo {
	// retrieve /fetch / list all the employee records
	public static void selectRecord(Connection con) throws SQLException {
		String selectSql = "select * from emp123";
		Statement st = null;
		ResultSet rs = null;
		try {
			st = con.createStatement();// obtaining statement object
			// exeute sql statement
			rs = st.executeQuery(selectSql);
			// executing select query which will return result (row and column)
			// and that result will be stored in ResultSet interface ref

			// now we will iterate the resultSet by first checking the rs
			while (rs.next()) {
				System.out.println(rs.getInt("EMP_ID") + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t"
						+ rs.getString(4) + "\t" + rs.getString(5));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (st != null)
				st.close();

		}
	}

	// insert /create / add a employee records
	public static int insertRecord(Connection con, Employee emp) throws SQLException {
		String insertSql = "insert into emp123 values(?,?,?,?,?)";
		PreparedStatement pst = null;
		int noOfRecordsInserted = 0;
		try {
			// create obj of preparedStatement
			pst = con.prepareStatement(insertSql);// pre-compiled statement
			// set the placeholder ,i.e dynamic values
			pst.setInt(1, emp.getEmpId());
			pst.setString(2, emp.getFirstName());
			pst.setString(3, emp.getLastName());
			pst.setString(4, emp.getPhoneNo());
			pst.setString(5, emp.getEmail());
			// executeUpdate pst (insert , update or delete) DML data
			// manipulation language
			noOfRecordsInserted = pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (pst != null)
				pst.close();

		}
		return noOfRecordsInserted;
	}

	// remove / delete recors from the database
	public static int deleteRecord(Connection con, int empId) throws SQLException {
		String deleteSql = "delete from emp123 where emp_Id=?";
		PreparedStatement pst = null;
		int noOfRecordDeleted = 0;
		try {
			// create obj of preparedStatement
			pst = con.prepareStatement(deleteSql);// pre-compiled statement
			// set the placeholder ,i.e dynamic value empId
			pst.setInt(1, empId);
			// executeUpdate() pst (insert , update or delete)
			// DML data manipulation language
			noOfRecordDeleted = pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (pst != null)
				pst.close();

		}
		return noOfRecordDeleted;
	}

	// update /modify / an employee records
	public static int updateRecord(Connection con, Employee updateEmployee) throws SQLException {
		String updateSql = "update emp123 set phone_No=? where emp_id=?";
		PreparedStatement pst = null;
		int noOfRecordsUpdated = 0;
		try {
			// create obj of preparedStatement
			pst = con.prepareStatement(updateSql);// pre-compiled statement
			// set the placeholder ,i.e dynamic values
			pst.setString(1, updateEmployee.getPhoneNo());// phone_no place
															// holder is 1
			pst.setInt(2, updateEmployee.getEmpId());
			// executeUpdate pst (insert , update or delete) DML data
			// manipulation language
			noOfRecordsUpdated = pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (pst != null)
				pst.close();

		}
		return noOfRecordsUpdated;
	}

	// search/find records from the database
	public static void searchRecord(Connection con, int empId) throws SQLException {
		String selectSql = "select * from emp123 where emp_Id=?";
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			// create obj of preparedStatement
			pst = con.prepareStatement(selectSql);// pre-compiled statement
			// set the placeholder ,i.e dynamic value empId
			pst.setInt(1, empId);
			// executeQuery() pst (select query)
			// DQL data Query language
			rs = pst.executeQuery();
			// executing select query which will return result (row and column)
			// and that result will be stored in ResultSet interface ref

			// now we will iterate the resultSet by first checking the rs
			if (rs.next()) {
				System.out.println(rs.getInt("EMP_ID") + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t"
						+ rs.getString(4) + "\t" + rs.getString(5));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (pst != null)
				pst.close();

		}
	}

	public static void main(String[] args) throws SQLException {
		// obtained connection
		Connection con = MyConnection.getConnection();
		// create emp object
		Employee emp = new Employee("Diya", "Sen", "9998887770", "diya@gmail.com", new Date());
		int empId = emp.getEmpId();// getting the empId of the emp which we have
									// inserted
		// Employee emp = AccepInputFromUSer.acceptEmpDetails();
		// invoking insertRecord method to insert record in db
		int recInserted = insertRecord(con, emp);
		if (recInserted > 0) {
			System.out.println(recInserted + " records Inserted with emp Id " + empId);
		} else
			System.out.println("No records Inserted");

		System.out.println("************List of all Employee from table emp123************");
		CrudDemo.selectRecord(con);
		// lets update the phone no of the current employee
		emp.setPhoneNo("9879876660");
		// lets invoke method to update the record in db
		int recUpdated = updateRecord(con, emp);
		if (recUpdated > 0) {
			System.out.println(recUpdated + " records Updated with empId : " + empId);
		} else
			System.out.println("No records Updated");

		System.out.println("************Updated Employee after updating phoneNo************");
		CrudDemo.searchRecord(con, empId);

		// lets try to delete the record
		int recDeleted = deleteRecord(con, empId);
		if (recDeleted > 0) {
			System.out.println(recDeleted + " records Deleted with empId : " + empId);
		} else
			System.out.println("No records Deleted");

		System.out.println("************List of all Employee from table emp123 after deleting record************");
		CrudDemo.selectRecord(con);

		if (con != null)
			con.close();
	}
}

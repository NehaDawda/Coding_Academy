package com.jp.hr.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.jp.hr.entities.Employee;
import com.jp.hr.entities.Product;
import com.jp.hr.exceptions.HrException;

public class DaoProductImpl implements DaoProduct{

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
	public ArrayList<Product> getProductList() throws HrException {
		ArrayList<Product> productList = new ArrayList();
		Connection connect = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			connect = getConnection();
			stmt = connect.createStatement();
			rs = stmt.executeQuery("SELECT id,name,category,price FROM PRODUCT");
			
			while(rs.next()){
				int productId = rs.getInt("id");
				String productName = rs.getString("name");
				String productCategory = rs.getString("category");
				double productPrice = rs.getDouble("price");
				productList.add(new Product(productId,productName,productCategory,productPrice));
			}
		} catch (ClassNotFoundException | SQLException e) {
			throw new HrException("Problem in fetching.",e);
		} finally {
			try {
				if(rs != null){
					rs.close();
				}
				if(stmt != null){
					stmt.close();
				}
				closeConnection(connect);
			} catch (SQLException e) {
				throw new HrException("Problem in closing resources.", e);
			}
		}
		
		return productList;
	}

	@Override
	public Product getProductDetails(int productId) throws HrException {
		String qry = "SELECT id,name,category,price FROM PRODUCT where id = ?";
		Connection connect = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			connect = getConnection();
			pstmt = connect.prepareStatement(qry);
			pstmt.setInt(1, productId);
			rs = pstmt.executeQuery();
			
			if(rs.next()){
				
				String productName = rs.getString("name");
				String productCategory = rs.getString("category");
				double productPrice = rs.getDouble("price");
				return new Product(productId,productName,productCategory,productPrice);
			}
			else{
				return null;
			}
		} catch (ClassNotFoundException | SQLException e) {
			throw new HrException("Problem in fetching.",e);
		} finally {
			try {
				if(rs != null){
					rs.close();
				}
				if(pstmt != null){
					pstmt.close();
				}
				closeConnection(connect);
			} catch (SQLException e) {
				throw new HrException("Problem in closing resources.", e);
			}
		}
	}

	@Override
	public boolean insertNewProduct(Product p) throws HrException {
		String qry = "INSERT INTO Product(id,name,category,price) VALUES (?,?,?,?)";
		Connection connect = null;
		PreparedStatement pstmt = null;
		
		try {
			connect = getConnection();
			pstmt = connect.prepareStatement(qry);
			pstmt.setInt(1, p.getProductId());
			pstmt.setString(2, p.getProductName());
			pstmt.setString(3, p.getProductCategory());
			pstmt.setDouble(4, p.getProductPrice());
			
			int recInserted = pstmt.executeUpdate();
			
			return recInserted == 1 ? true : false;
			
		} catch (ClassNotFoundException | SQLException e) {
			throw new HrException("Problem in fetching.",e);
		} finally {
			try {
				if(pstmt != null){
					pstmt.close();
				}
				closeConnection(connect);
			} catch (SQLException e) {
				throw new HrException("Problem in closing resources.", e);
			}
		}
	}

	@Override
	public boolean updateProduct(Product p) throws HrException {
		String qry = "update Product set name=?,category=?,price=? where id=?";
		Connection connect = null;
		PreparedStatement pstmt = null;
		
		try {
			connect = getConnection();
			pstmt = connect.prepareStatement(qry);
			pstmt.setInt(4, p.getProductId());
			pstmt.setString(1, p.getProductName());
			pstmt.setString(2, p.getProductCategory());
			pstmt.setDouble(3, p.getProductPrice());
			
			int recInserted = pstmt.executeUpdate();
			
			return recInserted == 1 ? true : false;
			
		} catch (ClassNotFoundException | SQLException e) {
			throw new HrException("Problem in fetching.",e);
		} finally {
			try {
				if(pstmt != null){
					pstmt.close();
				}
				closeConnection(connect);
			} catch (SQLException e) {
				throw new HrException("Problem in closing resources.", e);
			}
		}
	}

	@Override
	public boolean deleteProduct(int productId) throws HrException {
		String qry = "delete from Product where id=?";
		Connection connect = null;
		PreparedStatement pstmt = null;
		
		try {
			connect = getConnection();
			pstmt = connect.prepareStatement(qry);
			pstmt.setInt(1, productId);
			
			int recInserted = pstmt.executeUpdate();
			
			return recInserted == 1 ? true : false;
			
		} catch (ClassNotFoundException | SQLException e) {
			throw new HrException("Problem in fetching.",e);
		} finally {
			try {
				if(pstmt != null){
					pstmt.close();
				}
				closeConnection(connect);
			} catch (SQLException e) {
				throw new HrException("Problem in closing resources.", e);
			}
		}
	}
	
}

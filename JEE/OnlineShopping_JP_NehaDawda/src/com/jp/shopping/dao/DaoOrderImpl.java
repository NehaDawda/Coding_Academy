package com.jp.shopping.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.sql.DataSource;

import com.jp.shopping.entities.Item;
import com.jp.shopping.entities.Order;
import com.jp.shopping.exception.ShoppingException;
import com.jp.shopping.utilities.ConnectionFactoryTomcat;

public class DaoOrderImpl implements DaoOrder{
	private DataSource dataSource;
	
	public DaoOrderImpl() throws ShoppingException{
		try {
			//ConnectionFactory factory = ConnectionFactory.getConnectionFactory();
			ConnectionFactoryTomcat factory = ConnectionFactoryTomcat.getConnectionFactory();
			dataSource = factory.getDataSource();
		} catch (Exception e) {
			throw new ShoppingException("Problem in procurring connection",e);
		} 
	}
	
	@Override
	public boolean insertNewOrder(Order order) throws ShoppingException {
		
		String qry = "INSERT INTO ORDER_MASTER(customer_id,order_id,item_id) VALUES (?,?,?)";
		
		Connection connect = null;
		PreparedStatement pstmt = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			connect = dataSource.getConnection();
			
			stmt = connect.createStatement();
			rs = stmt.executeQuery("select order_seq.nextval from dual");
			rs.next();
			int order_id = rs.getInt(1);
			System.out.println("Order Id:" + order_id);
			pstmt = connect.prepareStatement(qry);
			pstmt.setInt(1, order.getCustomerId());
			pstmt.setInt(2, order_id);
			
			ArrayList<Item> items = order.getItems();
			
			boolean flag = true;
			connect.setAutoCommit(false);
			
			for(int i=0;i<items.size();i++){
				Item item = items.get(i);
				pstmt.setString(3, item.getItemId());
				int recInserted = pstmt.executeUpdate();
				if(recInserted != 1){
					flag = false;
				}		
			}
			if(flag){
				connect.commit();
			}
			else{
				connect.rollback();
			}
			
			return flag;
			
		} catch (SQLException e) {
			throw new ShoppingException("Problem in adding order details.",e);
		} finally {
			try {
				if(pstmt != null){
					pstmt.close();
				}
				if(connect != null){
					connect.close();
				}
			} catch (SQLException e) {
				throw new ShoppingException("Problem in closing resources.", e);
			}
		}
	}
	
}

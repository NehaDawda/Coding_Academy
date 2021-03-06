package com.jp.shopping.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.sql.DataSource;

import com.jp.shopping.utilities.ConnectionFactoryTomcat;
import com.jp.shopping.entities.Item;
import com.jp.shopping.exception.ShoppingException;

public class DaoItemImpl implements DaoItem{
	private DataSource dataSource;
	
	public DaoItemImpl() throws ShoppingException{
		try {
			ConnectionFactoryTomcat factory = ConnectionFactoryTomcat.getConnectionFactory();
			dataSource = factory.getDataSource();
		} catch (Exception e) {
			throw new ShoppingException("Problem in procurring connection",e);
		} 
	}
	
	@Override
	public ArrayList<Item> getItemList() throws ShoppingException {
		ArrayList<Item> itemList = new ArrayList<Item>();
		Connection connect = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			connect = dataSource.getConnection();
			stmt = connect.createStatement();
			rs = stmt.executeQuery("SELECT item_id,name,category,price,item_in_stock FROM ITEM_MASTER");
			
			while(rs.next()){
				String itemId = rs.getString("item_id");
				String name = rs.getString("name");
				String category = rs.getString("category");
				double price = rs.getDouble("price");
				int itemInStock = rs.getInt("item_in_stock");
				itemList.add(new Item(itemId,name,category,price,itemInStock));
			}
		} catch (SQLException e) {
			throw new ShoppingException("Problem in fetching Item List.",e);
		} finally {
			try {
				if(rs != null){
					rs.close();
				}
				if(stmt != null){
					stmt.close();
				}
				if(connect != null){
					connect.close();
				}
			} catch (SQLException e) {
				throw new ShoppingException("Problem in closing resources.", e);
			}
		}
		
		return itemList;
	}

	@Override
	public Item getItemDetails(String itemId) throws ShoppingException {
		String qry = "SELECT item_id,name,category,price,item_in_stock FROM ITEM_MASTER where item_id = ?";
		Connection connect = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			connect = dataSource.getConnection();
			pstmt = connect.prepareStatement(qry);
			pstmt.setString(1, itemId);
			rs = pstmt.executeQuery();
			
			if(rs.next()){
				
				String name = rs.getString("name");
				String category = rs.getString("category");
				double price = rs.getDouble("price");
				int itemInStock = rs.getInt("item_in_stock");
				return new Item(itemId,name,category,price,itemInStock);
			}
			else{
				return null;
			}
		} catch (SQLException e) {
			throw new ShoppingException("Problem in fetching Item Details.",e);
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
				throw new ShoppingException("Problem in closing resources.", e);
			}
		}
	}

	@Override
	public boolean updateItemInStock(Item item) throws ShoppingException {
		String qry = "update ITEM_MASTER set item_in_stock=? where item_id=?";
		Connection connect = null;
		PreparedStatement pstmt = null;
		
		try {
			connect = dataSource.getConnection();
			pstmt = connect.prepareStatement(qry);
			pstmt.setString(2, item.getItemId());
			pstmt.setInt(1, item.getItemInStock());
			
			int recInserted = pstmt.executeUpdate();
			
			return recInserted == 1 ? true : false;
			
		} catch (SQLException e) {
			throw new ShoppingException("Problem in updating Item_In_Stock .",e);
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

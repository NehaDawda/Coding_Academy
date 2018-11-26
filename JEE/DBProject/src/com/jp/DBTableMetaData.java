package com.jp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

public class DBTableMetaData {
	String tableName;
	String schemaName;
	int columnCount;
	LinkedList<DBTableColumnMetaData> columns;  
	
	public DBTableMetaData(String tableName,String schemaName){
		this.tableName = tableName;
		this.schemaName = schemaName;
		setColumnMetaData();
	}

	private void setColumnMetaData(){
		Connection con = null;
        ResultSet rs = null;
		int no = 0;
        LinkedList<DBTableColumnMetaData> cols = new LinkedList();
        
        try{
        	Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl","hr","hr");
            
            String[] types = {"TABLE"};
            
            rs = con.getMetaData().getColumns(null, this.schemaName, this.tableName, null);
            
            while(rs.next()){
            	String name = rs.getString(4);
            	String datatype = rs.getString(5);
            	no++;
            	DBTableColumnMetaData col = new DBTableColumnMetaData(name,datatype);
            	cols.add(col);
            }
            
        }catch(SQLException | ClassNotFoundException e){
        	e.printStackTrace();
        }finally{
        	try{
        	rs.close();
        	con.close();
        	}catch(SQLException e){
        		e.printStackTrace();
        	}
        }
        this.columnCount = no;
        this.columns = cols;
	}
	
	public String getTableName(){
		return this.tableName;
	}
	
	public String getSchemaName(){
		return this.schemaName;
	}
	
	public int getColumnCount(){
		return this.columnCount;
	}
	
	public LinkedList<DBTableColumnMetaData> getColumnMetaData(){
		return this.columns;
	}
}

package com.jp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

public class DBTables {
	private String tableName;
	private String tableSchema;
	private String tableType;
	
	public DBTables(String tableName, String tableSchema, String tableType){
		this.tableName = tableName;
		this.tableSchema = tableSchema;
		this.tableType = tableType;
	}
	
	public String getDBTableName(){
		return this.tableName;
	}
	
	public String getDBTableSchema(){
		return this.tableSchema;
	}
	
	public String getDBTableType(){
		return this.tableType;
	}
	public static LinkedList<DBTables> getDBTables(){
		
		Connection con = null;
        ResultSet rs = null;
		
        LinkedList<DBTables> tables = new LinkedList();
        
        try{
        	Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl","hr","hr");
            
            String[] types = {"TABLE"};
            rs = con.getMetaData().getTables(null, "HR", null, types);
            
            while(rs.next()){
            	String name = rs.getString(3);
            	String schema = rs.getString(2);
            	String type = rs.getString(4);
            	
            	DBTables table = new DBTables(name,schema,type);
            	tables.add(table);
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
        return(tables);
	}
}

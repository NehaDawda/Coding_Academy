package com.jp;

public class DBTableColumnMetaData {
	String columnName;
	String dataType;

	public DBTableColumnMetaData(String columnName, String dataType){
		this.columnName = columnName;
		this.dataType = dataType;
	}
	
	public String getColumnName(){
		return this.columnName;
	}
	
	public String getDataType(){
		return this.dataType;
	}
}

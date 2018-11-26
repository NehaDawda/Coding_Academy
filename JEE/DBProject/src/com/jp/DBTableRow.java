package com.jp;

import java.util.LinkedList;

public class DBTableRow {
	private LinkedList<String> dataRow;
	
	public DBTableRow(){
		this.dataRow = new LinkedList();
	}
	
	public void setDataRow(LinkedList row){
		this.dataRow = row;
	}
	
	public LinkedList getDataRow(){
		return this.dataRow;
	}
}

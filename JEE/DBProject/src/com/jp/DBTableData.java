package com.jp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

public class DBTableData {
	private String tableName;
	private String schemaName;
	private LinkedList<DBTableRow> datarows;

	public DBTableData(String tableName, String schemaName) {
		this.tableName = tableName;
		this.schemaName = schemaName;
		setDBTableData();
	}

	private void setDBTableData() {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		LinkedList<DBTableRow> rows = new LinkedList();

		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "hr", "hr");

			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from " + this.tableName);

			int total_cols = rs.getMetaData().getColumnCount();

			while (rs.next()) {
				DBTableRow row = new DBTableRow();
				LinkedList<String> cols = new LinkedList();

				for (int i = 1; i <= total_cols; i++) {
					cols.add(rs.getString(i));
				}

				row.setDataRow(cols);
				rows.add(row);
			}

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		this.datarows = rows;
	}

	public LinkedList<DBTableRow> getDBTableData() {
		return this.datarows;
	}
}

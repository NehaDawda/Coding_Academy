package com.jp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.LinkedList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DBTableServlet
 */
@WebServlet("/DBTableServlet")
public class DBTableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DBTableServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String tableName = request.getParameter("tablename");
		String schemaName = request.getParameter("schemaname");
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.write("<h2> Schema:" + schemaName + "</h2>");
		out.write("<h2> Table:" + tableName + "</h2>");
		
		DBTableMetaData metadata = new DBTableMetaData(tableName,schemaName);
		LinkedList<DBTableColumnMetaData> columns =  metadata.getColumnMetaData();
		
		Iterator<DBTableColumnMetaData> it = columns.iterator();
		int col_no = metadata.getColumnCount();
		
		out.write("<h2> Table:" + col_no + "</h2>");
		
		out.write("<div>");
		out.write("<table border='1px'>");
		
		out.write("<thead>");
		out.write("<tr>");
		
		while(it.hasNext()){
			DBTableColumnMetaData colMeta = it.next();
			out.write("<th>" + colMeta.getColumnName() + "</th>");
		}
		out.write("</tr>");
		out.write("</thead>");
		
		out.write("<tbody>");
		
		DBTableData tabledata = new DBTableData(tableName,schemaName);
		LinkedList<DBTableRow> rows = tabledata.getDBTableData();
		
		Iterator<DBTableRow> iter = rows.iterator();
		
		while(iter.hasNext()){
			out.write("<tr>");
			DBTableRow row = iter.next();
			
			LinkedList<String> rowdata = row.getDataRow();
			
			Iterator iter1 = rowdata.iterator();
			while(iter1.hasNext()){
				String value = (String)iter1.next();
				out.write("<td>" + value + "</td>");
			}
			out.write("</tr>");
		}
		
		out.write("</tbody>");
		
		out.write("</table>");
		out.write("</div>");
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

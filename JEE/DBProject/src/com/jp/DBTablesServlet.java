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
 * Servlet implementation class DBTablesServlet
 */
@WebServlet("/DBTablesServlet")
public class DBTablesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DBTablesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		LinkedList<DBTables> tables = DBTables.getDBTables();
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.write("<h3>Table Count:"+ tables.size() +"<h3>");
		
		out.write("<table border='1px'>");
		out.write("<thead><th>Name</th><th>Schema</th><th>Type</th></thead>");
		Iterator<DBTables> it = tables.iterator();
		
		while(it.hasNext()){
			out.write("<tr>");
			DBTables tab = it.next();
			
			out.write("<td><a href='DBTableServlet?tablename=" + tab.getDBTableName() + "&schemaname=" + tab.getDBTableSchema() + "'>" + tab.getDBTableName() + "</a></td>");
			out.write("<td>" + tab.getDBTableSchema()+"</td>");
			out.write("<td>" + tab.getDBTableType()+"</td>");
			
			out.write("</tr>");
			
		}
		
		out.write("</table>");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

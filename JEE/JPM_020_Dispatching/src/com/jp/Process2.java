package com.jp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/process2")
public class Process2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String param1 = request.getParameter("param1");
		//PrintWriter out = response.getWriter();
		System.out.println("In Servlet Process2 " + param1);
		
		RequestDispatcher dispatch = request.getRequestDispatcher("/jsps/Welcome.jsp");
		dispatch.forward(request, response); //Send the control to another servlet/jsp.
		System.out.println("In servlet process2 " + param1);
	}

}

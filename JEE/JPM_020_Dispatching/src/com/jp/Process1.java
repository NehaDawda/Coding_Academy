package com.jp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
* The response if altered by this servlet does not reach to next in chain bacause
* the forward dispatching wipes off the old response.
* In the forward chain, the last entity to generate full and final response.
* 
* the request if altered, is sent to the next in chain as altered.
* 
* Query String: User entries passed through address bar when method type is GET.
* 				Separated by '?' from URI.
* 				Separated by '&' from another field.
* 				Prefer get if data is small in size and not sensitive.
* Form Data: User entries passed through separated connection when method type is POST.
* 			Form data is not exposed in address bar.
* 			Always send sensitive data/data of large size as Form Data.
* 
* GET gives better performance as it does not create new connective.
* 
* Request.getParameter(): Brings every data is String form.
* 							One method to bring Query String or Form data.
*/

@WebServlet("/process1")
public class Process1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String param1 = request.getParameter("param1");
		//PrintWriter out = response.getWriter();
		System.out.println("In Servlet Process1 " + param1);
		
		RequestDispatcher dispatch = request.getRequestDispatcher("/process2");
		dispatch.forward(request, response); //Send the control to another servlet/jsp.
		System.out.println("In servlet process1 " + param1);
	}

}

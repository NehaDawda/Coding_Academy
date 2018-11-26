package com.jp;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServLifeCycle
 */
@WebServlet("/lifeCycle")
public class ServLifeCycle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServLifeCycle() {
    	System.out.println("Message from Construtor.");
    }

    @Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		System.out.println("Message from init(param).");
	}

    @Override
    public void init(){
    	System.out.println("Message from init().");
    }
	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("Message from destroy().");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Message from doGet().");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Message from doPost().");
	}  

}

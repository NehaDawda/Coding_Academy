package com.jp.hr.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jp.hr.entities.Employee;
import com.jp.hr.entities.Product;
import com.jp.hr.entities.User;
import com.jp.hr.exceptions.HrException;
import com.jp.hr.services.ServiceEmployee;
import com.jp.hr.services.ServiceEmployeeImpl;
import com.jp.hr.services.ServiceProduct;
import com.jp.hr.services.ServiceProductImpl;
import com.jp.hr.services.ServiceUser;

/*
 *	Front Controller: A JEE design pattern.
 *	Command pattern (GoF Pattern).
 *	 
 */	

@WebServlet("*.do")  //A generic url.
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServiceEmployee services;
	private ServiceProduct productService;
	private ServiceUser userService;
	
	@Override
	public void init() throws ServletException {
		try {
			services = new ServiceEmployeeImpl();
			productService = new ServiceProductImpl();
		} catch (HrException e) {
			throw new ServletException("Init method failed",e);
		}
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String command = getCommand(request.getRequestURI());
		RequestDispatcher dispatch = null;
		String jspName = null;
		String preFix = "/WEB-INF/jsps/";
		String postFix = ".jsp";
		
		try {
			switch(command){
				case "*":
				case "home" :{
								jspName = "Home";
								break;
				}
				case "login" :{
								jspName = "Login";
								break;
				}
				case "authenticate" :{
								String username = request.getParameter("username");
								String password = request.getParameter("password");
								
							//	User user = userService.authenticateUser(username, password);
								
								if(username.equals("a") && password.equals("a")){
									
									//String userFullName = user.getFullName();
									//HttpSession session = request.getSession();
									//session.setAttribute("userFullName", userFullName);
									jspName = "MainMenu";
								}
								else{
									String msg = "Wrong Credentials. Please enter again";
									request.setAttribute("message", msg);
									jspName = "Login";
								}
								break;
				}
				case "mainMenu":{
								jspName = "MainMenu";
								break;
				}
				case "logout":{
								HttpSession session = request.getSession();
								request.setAttribute("userFullName", session.getAttribute("userFullName"));
								session.invalidate();
								jspName = "ThanksPage";
								break;
				}
				case "empList":{
								ArrayList<Employee> empList = services.getEmpList();
								request.setAttribute("empList", empList);
								jspName = "EmpList";
								
								break;
				}
				case "empDetails":{
								String idStr = request.getParameter("id"); // empDetails.do?id=x
								int empId = Integer.parseInt(idStr);
								Employee emp = services.getEmpDetails(empId);
								request.setAttribute("empDetails", emp);
								jspName = "EmpDetails";
								break;
				}
				case "submitJoinee" :{
								//String empIdStr = request.getParameter("empId");
								String firstName = request.getParameter("firstName");
								String lastName = request.getParameter("lastName");
								//int empId = Integer.parseInt(empIdStr);
								//Employee emp = new Employee(empId, firstName, lastName);
								Employee emp = new Employee(firstName, lastName);
								boolean isSuccessful = services.joinNewEmployee(emp);
								String msg = isSuccessful ? "Employee Inserted" : "Insertion Failed";
								request.setAttribute("message", msg);
								jspName = "NewJoining";
								break;
				}
				case "newJoining":{
								jspName = "NewJoining";
								break;
				}
				case "productList":{
					ArrayList<Product> productList = productService.getProductList();
					request.setAttribute("productList", productList);
					jspName = "ProductList";
					
					break;
				}
				case "productDetails":{
					String idStr = request.getParameter("id");
					int productId = Integer.parseInt(idStr);
					Product product = productService.getProductDetails(productId);
					request.setAttribute("productDetails", product);
					jspName = "ProductDetails";
					break;
				}
				case "submitProduct" :{
					String productIdStr = request.getParameter("productId");
					String productName = request.getParameter("productName");
					String productCategory = request.getParameter("productCategory");
					String productPriceStr = request.getParameter("productPrice");
					
					int productId = Integer.parseInt(productIdStr);
					double productPrice = Double.parseDouble(productPriceStr);
					
					Product product = new Product(productId, productName, productCategory,productPrice);
					boolean isSuccessful = productService.addNewProduct(product);
					String msg = isSuccessful ? "Product Inserted" : "Insertion Failed";
					request.setAttribute("message", msg);
					jspName = "NewProduct";
					break;
				}
				case "newProduct":{
					jspName = "NewProduct";
					break;
				}
				case "removeProduct" :{
					String productIdStr = request.getParameter("id");
										
					int productId = Integer.parseInt(productIdStr);
					
					boolean isSuccessful = productService.removeProduct(productId);
					String msg = isSuccessful ? "Product Deleted" : "Deletion Failed";
					request.setAttribute("message", msg);
					ArrayList<Product> productList = productService.getProductList();
					request.setAttribute("productList", productList);
					jspName = "ProductList";
					break;
				}
				case "updateProductDetails" :{
					String productIdStr = request.getParameter("id");
					int productId = Integer.parseInt(productIdStr);
					
					Product product = productService.getProductDetails(productId);
					
					request.setAttribute("product", product);
					jspName = "UpdateProduct";
					break;
				}
				case "updateProduct" :{
					String productIdStr = request.getParameter("productId");
					System.out.println(productIdStr);
					String productName = request.getParameter("productName");
					String productCategory = request.getParameter("productCategory");
					String productPriceStr = request.getParameter("productPrice");
					
					int productId = Integer.parseInt(productIdStr);
					double productPrice = Double.parseDouble(productPriceStr);
					
					Product product = new Product(productId, productName, productCategory,productPrice);
					boolean isSuccessful = productService.updateProductDetails(product);
					String msg = isSuccessful ? "Product Updated" : "Updation Failed";
					request.setAttribute("message", msg);
					request.setAttribute("productDetails", product);
					jspName = "ProductDetails";
					break;
				}
			}
		} catch (HrException e) { 	
			System.out.println(e.getMessage());
			//jspName = "Errors";
			//request.setAttribute("exception", e);
			//request.setAttribute("msg", e.getMessage());
			//throw new ServletException(e.getMessage());
		}
		
		dispatch = request.getRequestDispatcher(preFix + jspName + postFix);
		dispatch.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	private String getCommand(String uri){
		int leftPosi = uri.lastIndexOf("/");
		int rightPosi = uri.lastIndexOf(".");
		
		if(rightPosi <= leftPosi ){
			return "home";
		}
		else{
			return uri.substring(leftPosi+1, rightPosi);
		}
		
	}
}

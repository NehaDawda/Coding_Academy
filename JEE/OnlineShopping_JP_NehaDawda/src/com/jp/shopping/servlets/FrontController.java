package com.jp.shopping.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jp.shopping.entities.Cart;
import com.jp.shopping.entities.Item;
import com.jp.shopping.entities.Order;
import com.jp.shopping.exception.ShoppingException;
import com.jp.shopping.services.ServiceItem;
import com.jp.shopping.services.ServiceItemImpl;
import com.jp.shopping.services.ServiceOrder;
import com.jp.shopping.services.ServiceOrderImpl;

@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServiceItem serviceItem;
	private ServiceOrder serviceOrder;
	Cart myCart;
	
	@Override
	public void init() throws ServletException {
		
		myCart = new Cart(new ArrayList<Item>());
		
		try {
			serviceItem = new ServiceItemImpl();
			serviceOrder = new ServiceOrderImpl();
		} catch (ShoppingException e) {
			throw new ServletException("Init method failed",e);
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.setAttribute("customerId", "12345");
		session.setAttribute("myCart", myCart);
		
		String command = getCommand(request.getRequestURI());
		RequestDispatcher dispatch = null;
		String jspName = null;
		String preFix = "/WEB-INF/jsps/";
		String postFix = ".jsp";
		
		try {
			switch(command){
				case "*":
				case "mainMenu":{
								jspName = "MainMenu";
								break;
				}
				case "itemList":{
								ArrayList<Item> itemList = serviceItem.getItemList();
								request.setAttribute("itemList", itemList);
								jspName = "ItemList";
								
								break;
				}
				case "itemDetails":{
								String itemId = request.getParameter("id"); 
								Item item = serviceItem.getItemDetails(itemId);
								request.setAttribute("itemDetails", item);
								jspName = "ItemDetails";
								break;
				}
				case "myCart":{
								jspName = "MyCart";
								break;
				}
				case "addToCart":{
								String itemId = request.getParameter("id");
								Item item = serviceItem.getItemDetails(itemId);
								myCart = (Cart)session.getAttribute("myCart");
								myCart.addItems(item);
								session.setAttribute("myCart", myCart);
								request.setAttribute("msg", "Item added in Cart");
								request.setAttribute("itemList", serviceItem.getItemList());
								jspName = "ItemList";
								break;
				}
				case "placeOrder" :{
								ArrayList<Item> items = myCart.getItems();
								int customerId = Integer.parseInt((String)session.getAttribute("customerId"));
					
								Order order = new Order(customerId, items);
								boolean isSuccessful = serviceOrder.createNewOrder(order);
								String msg = isSuccessful ? "Order Placed" : "Order didn't place";
								myCart = new Cart(new ArrayList<Item>());
								request.setAttribute("msg", msg);
								
								jspName = "PlaceOrder";
								break;
				}
				
			}
		} catch (ShoppingException e) { 	
			System.out.println(e.getMessage());
			jspName = "Errors";
			request.setAttribute("exception", e);
			request.setAttribute("msg", e.getMessage());
			throw new ServletException(e.getMessage());
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

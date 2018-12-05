/**
 * 
 */
package com.lnt.day8.interafces.client;

import java.util.Date;

import com.lnt.class_inheritance01.model.emp.manager.Manager;
import com.lnt.day8.abstractDemo.shape.circle.Circle;
import com.lnt.day8.interafces.print.IPrintable;

/**
 * @author Smita
 *
 */
public class InterfaceClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Interface are used to provide further extensibility of code
		//by adding additional role or services to the current object
		//interface can be implemented by any class , 
		//i.e weather it is in the inheritance hierarchy or not , it dosent affect
		IPrintable printableObj;//created a reference of IPrintable
		//the actual object will of implemented class
		printableObj = new Circle(3.5f);
		printableObj.print();
		//printableObj.area();//compilation errror coz area() is not the method of IPrintable,
		//we can invoke only method which are available the reference class as the reference is of IPrinatable
		
		
		printableObj = new Manager("Zara", "Khan", "9999988880", "zara@gmail.com", 999.99, new Date(), "IT", 99.9);
		printableObj.print();
		//printableObj.getSalary();//compilation errror coz area() is not the method of IPrintable,
		//we can invoke only method which are available the reference class as the reference is of IPrinatable
				
	}

}

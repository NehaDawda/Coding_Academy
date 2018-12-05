/**
 * 
 */
package com.lnt.customer_project.client;

import static org.testng.Assert.assertThrows;

import java.util.List;
import java.util.Scanner;

import org.testng.Assert;

import com.lnt.customer_project.dao.CustomerException;
import com.lnt.customer_project.model.Customer;
import com.lnt.customer_project.service.CustomerServiceImpl;
import com.lnt.customer_project.service.ICustomerService;

/**
 * @author brije
 *
 */
public class CustomerClient {

	//prep-work
	//ref of service layer interface
	private static ICustomerService customerService;
	private static Long custId;
	private static Customer customer;
	private static Scanner sc ;
	private static int choice;
	//static block
	static {
		// obj of service layer impl class
		customerService = new CustomerServiceImpl();
		sc = new Scanner(System.in);
		choice = 0;
	}
	public static void main(String[] args) throws CustomerException {
		
		
		try {
			while (true) {		
				//prompting the user to enter his choice
				switchMenuChoice();				
			}
		} catch (CustomerException e) {
			System.err.println(
					  "\n=====================Something Went Wrong====================================================================================\n"
					+ "\n             Kindly Enter your choice Again!!\n"
					+ "\n======================================================================================================================================\n");
			//switchMenuChoice();
		}	

	}
	
	private static void switchMenuChoice() throws CustomerException {
		choice=showMenu();
		switch (choice) {
		case 1:
			add();
			break;
		case 2:
			list();
			break;
		case 3:
			update();
			break;
		case 4:
			delete();
			break;
		case 5:
			search();
			break;
		case 6:
			end();
			break;

		default:
			System.err.println(
					  "\n=====================You have entered wrong choice====================================================================================\n"
					+ "\n             Kindly Enter your choice Again!!\n"
					+ "\n======================================================================================================================================\n");
			break;
		}			
	}

	private static int showMenu() throws CustomerException{
		
		System.out.println(
				   "\n===================Customer Services Menu=========================================================================================================================\n"

				+ " \n    Select option from (1- 5) And 6 to Exit Application \n" 
				+ " \n==================================================================================================================================================================\n"
				+ " \n                   1.  Add Customer"
				+ " \n                   2.  List Customer" 
				+ " \n                   3.  Update Customer"
				+ " \n                   4.  Delete Customer" 
				+ " \n                   5.  Search Customer"
				+ " \n                   6.  Exit Customer App"
				+ "\n===================================================================================================================================================================\n");
	
		try {
			choice = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Input can be only nummeric value.....");
			//showMenu();
		}
		return choice;
	}
	private static void add() {
		try {
			// calling service to add customer
			customer = new Customer("Austin", "austin@lnt.com", "9879877770");
			custId = customerService.addCustomer(customer);

			// setting the auto-generated id
			customer.setCustId(custId);
			if (custId > 0) {
				System.out.println("Customer Record added successfully.... with a unique Customer Id :" + custId);
			} else
				System.err.println("Sorry Boss! not able to add Customer Record");
		} catch (CustomerException e) {
			System.err.println("Sorry Boss! not able to add Customer Record");
		}
	}
	private static void list() {
		try {
			List<Customer> customerList = customerService.getCustomerList();

			if (customerList != null) {
				for (Customer customer : customerList) {
					System.out.println(customer);
				}
			} else {
				System.err.println("Sorry Boss! no Customer Record found !!");
			}
		} catch (CustomerException e) {
			System.err.println("Sorry Boss! no Customer Record found !!");
		}
	}

	private static void update() {
		try {
			System.out.println("Enter Customer Id to be Searched : ");
			custId = sc.nextLong();
			Customer customer = customerService.getCustomerById(custId);
			System.out.println("Customer before update :" + customer);
			customer.setCustName("Justin Fred");
			customer.setEmail("fred@gmail.com");
			customer.setPhone("6786786780");
			Customer updatedCustomer = customerService.updateCustomer(customer);
			if (updatedCustomer != null) {
				System.out.println("\n**********Customer Record Updated successfully **********\n" + updatedCustomer);
			} else {
				System.err.println("Sorry Boss! no Customer Record Updated !!");
			}
		} catch (CustomerException e) {
			System.err.println("Sorry Boss! no Customer Record Updated !!");
		}
	}
	private static void delete() {
		try {
			System.out.println("Enter Customer Id to be Deleted : ");
			custId = sc.nextLong();
			int result = customerService.deleteCustomerById(custId);
			if (result > 0) {
				System.out.println("Customer Record deleted successfully.... with a Customer Id :" + custId);
			} else
				System.err.println("Sorry Boss! not able to delete Customer Record");
		} catch (CustomerException e) {
			System.err.println("Sorry Boss! not able to delete Customer Record");
		}
	}
	private static void search() {
		try {
			System.out.println("Enter Customer Id to be Searched : ");

			custId = sc.nextLong();
			customer = customerService.getCustomerById(custId);

			if (customer != null) {
				System.out.println("\n**********Customer Record Found **********\n" + customer);
			} else {
				System.err.println("Sorry Boss! no Customer Record found !!");
			}
		} catch (CustomerException e) {
			System.err.println("Sorry Boss! no Customer Record found !!");
		}
	}
	private static void end() {
		System.out.println(
				  "\n=====================Thank you for Using our Application====================================================================================\n"
				+ "\n                         Do Visit Again!!!!\n"
				+ "\n======================================================================================================================================\n");
		//customerService.exitApp();
		System.exit(0);
	}
}

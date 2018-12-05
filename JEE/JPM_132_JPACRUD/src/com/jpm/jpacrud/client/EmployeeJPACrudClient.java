/**
 * 
 */
package com.jpm.jpacrud.client;

import java.util.Scanner;

import com.jpm.jpacrud.entities.Employee;
import com.jpm.jpacrud.exception.EmployeeException;
import com.jpm.jpacrud.service.EmployeeService;
import com.jpm.jpacrud.service.IEmployeeService;

/**
 * @author brije
 *
 */
public class EmployeeJPACrudClient {
	//prep-work
		//ref of service layer interface
		private static IEmployeeService employeeService;
		private static Long empId;
		private static Employee employee;
		private static Scanner sc ;
		private static int choice;
		//static block
		static {
			// obj of service layer impl class
			employeeService = new EmployeeService();
			sc = new Scanner(System.in);
			choice = 0;
		}
	public static void main(String[] args) {
		try {
			while (true) {		
				//prompting the user to enter his choice
				switchMenuChoice();				
			}
		} catch (EmployeeException e) {
			System.err.println(
					  "\n=====================Something Went Wrong====================================================================================\n"
					+ "\n             Kindly Enter your choice Again!!\n"
					+ "\n======================================================================================================================================\n");
			//switchMenuChoice();
		}	
	}

	private static void switchMenuChoice() throws EmployeeException {
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

	private static int showMenu() throws EmployeeException{
		System.out.println(
				   "\n===================Employee Services Menu=========================================================================================================================\n"

				+ " \n    Select option from (1- 5) And 6 to Exit Application \n" 
				+ " \n==================================================================================================================================================================\n"
				+ " \n                   1.  Add Employee"
				+ " \n                   2.  List Employee" 
				+ " \n                   3.  Update Employee"
				+ " \n                   4.  Delete Employee" 
				+ " \n                   5.  Search Employee"
				+ " \n                   6.  Exit Employee App"
				+ "\n===================================================================================================================================================================\n");
	
		try {
			choice = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Input can be only nummeric value.....");
			//showMenu();
		}
		return choice;
	}

	private static void add() throws EmployeeException {
		Employee employee= new Employee();//transient state
		System.out.println("Enter Employee Name to be added");
		employee.setName(sc.next());
		System.out.println("Enter Employee Salary to be added");
		employee.setSalary(sc.nextDouble());
		//call the service method to add employee
		Long empId = employeeService.addEmployee(employee);
		if(empId>0) {
			System.out.println("Employee Record Persisted successfully with unique Employee Id : "+empId);
		}else {
		System.err.println("Sorry !!! Employee Record NOT Persisted ");
		}
	}

	private static void list() {
		// TODO Auto-generated method stub
		
	}

	private static void update() {
		// TODO Auto-generated method stub
		
	}

	private static void delete() {
		// TODO Auto-generated method stub
		
	}

	private static void search() {
		// TODO Auto-generated method stub
		
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

/**
 * 
 */
package com.lnt.emp_project.client;

import java.util.List;
import java.util.Scanner;

import com.lnt.emp_project.model.Address;
import com.lnt.emp_project.model.Employee;
import com.lnt.emp_project.service.EmployeeServiceImpl;
import com.lnt.emp_project.service.IEmployeeService;

/**
 * @author Smita
 *
 */
public class EmployeeClientMenu {
	// prep work --- service layer object
	private static IEmployeeService employeeService;
	static Long empId = 1L;
	static Employee employee = null;
	static {
		// employeeService object
		employeeService = new EmployeeServiceImpl();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		try {
			while (true) {						
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
				choice = sc.nextInt();
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
					System.out.println(
							  "\n=====================Thank you for Using our Application====================================================================================\n"
							+ "\n                         Do Visit Again!!!!\n"
							+ "\n======================================================================================================================================\n");
					employeeService.exitApp();
					System.exit(0);
					break;

				default:
					System.err.println(
							  "\n=====================You have entered wrong choice====================================================================================\n"
							+ "\n             Kindly Enter your choice Again!!\n"
							+ "\n======================================================================================================================================\n");
					break;
				}			
			}
		} catch (Exception e) {
			System.err.println(
					  "\n=====================Something Went Wrong====================================================================================\n"
					+ "\n             Kindly Enter your choice Again!!\n"
					+ "\n======================================================================================================================================\n");
		
		}	

	}

	private static void add() {
		// need to write the code to accept the Employee value from the user
		// ...use either scanner or BufferReader to accept value from user
		Address address = new Address("Sky App", "400708", "Mumbai");
		employee = new Employee("Smita", 999.99, address);

		employee.setAddress(address);
		address.setEmployee(employee);
		//setting the auto-generated id
		employee.setEmpId(empId);
		if (empId > 0) {
			System.out.println("Employee Record added successfully.... with a unique Employee Id :" + empId);
		} else
			System.out.println("Sorry Boss! not able to add Employee Record");

	}

	private static void list() {
		List<Employee> empList = employeeService.getEmpList();
		if (empList != null) {
			for (Employee emp : empList) {
				System.out.println(emp);
			}
		} else
			System.out.println("Sorry Boss! not able to find Employee Records");
	}

	private static void update() {
		// accept the emp values to be Updated from User
		employee = employeeService.updateEmp(employee);
		System.out.println("Updated Employee is : " + employee);
		if (employee != null) {
			System.out.println("Employee updated successfully !! " + employee);

		} else
			System.out.println("Sorry Boss! not able to update Employee Records");

	}

	private static void delete() {
		// accept the empId from User
		int res = employeeService.deleteEmpById(empId);
		if (res > 0) {
			System.out.println("Employee Record deleted successfully.... with a unique Employee Id :" + empId);
		} else
			System.out.println("Sorry Boss! not able to delete Employee Record");

	}

	private static void search() {
		// accept the empId from User
		employee = employeeService.getEmpById(empId);
		if (employee != null) {
			System.out.println("Employee record found !! " + employee);

		} else
			System.out.println("Sorry Boss! not able to find Employee Record with id " + empId);
	}

}

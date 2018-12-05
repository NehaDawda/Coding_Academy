/**
 * 
 */
package com.lnt.day8.interafces.client;

import java.util.Date;

import com.lnt.class_inheritance01.model.emp.Employee;
import com.lnt.day8.interafces.service.EmployeeServiceImpl;
import com.lnt.day8.interafces.service.IEmployeeService;

/**
 * @author brije
 *
 */
public class EmployeeClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//we can't instantiate an interface
		IEmployeeService employeeService = new EmployeeServiceImpl();
		//ref of an interface and actual object of an implemented class
		Employee employee = new Employee("Zara", "Khan", "9999988880", "zara@gmail.com", 999.99, new Date());
		employeeService.addEmployee(employee);
		employeeService.lisAllEmployee();
		employeeService.updateEmployee(employee);
		employeeService.searchEmployeeById(1);
		employeeService.deleteEmployeeById(1);

	}

}

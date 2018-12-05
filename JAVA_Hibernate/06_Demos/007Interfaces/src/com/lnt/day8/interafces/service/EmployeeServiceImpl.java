/**
 * 
 */
package com.lnt.day8.interafces.service;

import java.util.ArrayList;
import java.util.List;

import com.lnt.class_inheritance01.model.emp.Employee;

/**
 * @author Smita
 *
 */
//golden rule- a class implementing an interface must override all the methods or declare the class itself a abstract
public class EmployeeServiceImpl implements IEmployeeService{

	@Override
	public int addEmployee(Employee employee) {
		System.out.println("Adding the Employee .... ");
		return 1;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		System.out.println("Updating the Employee .... ");
		return employee;
	}

	@Override
	public Employee searchEmployeeById(int empId) {
		System.out.println("Searing the Employee .... ");
		return new Employee();
	}

	@Override
	public int deleteEmployeeById(int empId) {
		System.out.println("Deleting the Employee .... ");
		return 1;
	}

	@Override
	public List<Employee> lisAllEmployee() {
		System.out.println("List all the Employee Records.... ");
		return new ArrayList<>();
	}

}

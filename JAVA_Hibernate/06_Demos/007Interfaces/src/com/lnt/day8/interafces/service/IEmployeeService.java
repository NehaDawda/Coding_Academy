/**
 * 
 */
package com.lnt.day8.interafces.service;

import java.util.List;

import com.lnt.class_inheritance01.model.emp.Employee;
/**
 * @author Smita
 *
 */
public interface IEmployeeService{
	//creating interface to provide additional service to the exiting employee object
	public int addEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public Employee searchEmployeeById(int empId);
	public int deleteEmployeeById(int empId);
	public List<Employee> lisAllEmployee();	
}

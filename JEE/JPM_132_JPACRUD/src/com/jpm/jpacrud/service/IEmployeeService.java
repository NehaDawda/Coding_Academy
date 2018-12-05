package com.jpm.jpacrud.service;

import java.util.List;

import com.jpm.jpacrud.entities.Employee;
import com.jpm.jpacrud.exception.EmployeeException;

public interface IEmployeeService {
	public Long addEmployee(Employee employee) throws EmployeeException;
	public List<Employee> getEmployeeList()throws EmployeeException;//R All Employee -retrieve
	public Employee getEmployeeById(Long empId)throws EmployeeException;//S-search

	public Employee updateEmployee(Employee employee)throws EmployeeException;//U-update
	public Long deleteEmployeeById(Long empId)throws EmployeeException;//D-delete
}

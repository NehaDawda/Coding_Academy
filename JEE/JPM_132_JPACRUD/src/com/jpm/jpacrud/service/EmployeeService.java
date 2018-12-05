/**
 * 
 */
package com.jpm.jpacrud.service;

import java.util.List;

import com.jpm.jpacrud.dao.EmployeeDao;
import com.jpm.jpacrud.dao.IEmployeeDao;
import com.jpm.jpacrud.entities.Employee;
import com.jpm.jpacrud.exception.EmployeeException;

/**
 * @author Administrator
 *
 */
public class EmployeeService implements IEmployeeService {
	private IEmployeeDao employeeDao;
	
	public EmployeeService() {
		employeeDao = new EmployeeDao();
	}
	
	/* (non-Javadoc)
	 * @see com.jpm.jpacrud.service.IEmployeeService#addEmployee(com.jpm.jpacrud.entities.Employee)
	 */
	@Override
	public Long addEmployee(Employee employee) throws EmployeeException {
		return employeeDao.addEmployee(employee);
	}

	@Override
	public List<Employee> getEmployeeList() throws EmployeeException {
		return employeeDao.getEmployeeList();
	}

	@Override
	public Employee getEmployeeById(Long empId) throws EmployeeException {
		return employeeDao.getEmployeeById(empId);
	}

	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeException {
		return employeeDao.updateEmployee(employee);
	}

	@Override
	public Long deleteEmployeeById(Long empId) throws EmployeeException {
		return employeeDao.deleteEmployeeById(empId);
	}

}

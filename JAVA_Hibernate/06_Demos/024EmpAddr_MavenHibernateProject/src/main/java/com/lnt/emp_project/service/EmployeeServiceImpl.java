/**
 * 
 */
package com.lnt.emp_project.service;

import java.util.List;

import com.lnt.emp_project.dao.EmployeeDaoImpl;
import com.lnt.emp_project.dao.IEmployeeDao;
import com.lnt.emp_project.model.Employee;

/**
 * @author Smita
 *
 */
public class EmployeeServiceImpl implements IEmployeeService {
//prep-word -need the object of Dao
	//inorder to achieve loose coupling we take the reference of interface always
	private IEmployeeDao employeeDao;
	public EmployeeServiceImpl() {
		//Obtain the object of Dao
		employeeDao= new EmployeeDaoImpl();
	}
	/* (non-Javadoc)
	 * @see com.lnt.emp_project.service.IEmployeeService#addEmployee(com.lnt.emp_project.model.Employee)
	 */
	public Long addEmployee(Employee employee) {
		// call and return
		//call the method of dao and return to the client
		Long empId= employeeDao.addEmployee(employee);//call the method of dao
		return empId;//return to the client
	}

	/* (non-Javadoc)
	 * @see com.lnt.emp_project.service.IEmployeeService#getEmpList()
	 */
	public List<Employee> getEmpList() {
		// call the method of dao and return to the client
		return employeeDao.getEmpList();
	}

	/* (non-Javadoc)
	 * @see com.lnt.emp_project.service.IEmployeeService#updateEmp(com.lnt.emp_project.model.Employee)
	 */
	public Employee updateEmp(Employee employee) {
		// call the method of dao and return to the client
		return employeeDao.updateEmp(employee);
	}

	/* (non-Javadoc)
	 * @see com.lnt.emp_project.service.IEmployeeService#deleteEmpById(java.lang.Long)
	 */
	public int deleteEmpById(Long empId) {
		// call the method of dao and return to the client
			return employeeDao.deleteEmpById(empId);
	}

	/* (non-Javadoc)
	 * @see com.lnt.emp_project.service.IEmployeeService#getEmpById(java.lang.Long)
	 */
	public Employee getEmpById(Long empId) {
		// call the method of dao and return to the client
			return employeeDao.getEmpById(empId);
	}
	public void exitApp() {
		employeeDao.exitEmpApp();
		
	}

}

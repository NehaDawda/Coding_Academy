/**
 * 
 */
package com.lnt.emp_project.dao;

import java.util.List;

import com.lnt.emp_project.model.Employee;

/**
 * @author SMita
 *
 */
//Data Access layer is accessible only by database 
//request will be accepted by service layer
//and interact will DB to perform cruds operation
//and give back the response to the service layer
//cannot be directly accessed by the client 
//only service layer can interact with it.
public interface IEmployeeDao {
	//Chef who will accept the order from Waiter and prepares the food , present it, and give it to the Waiter
	//CRUDS Operation
	public Long addEmployee(Employee employee);//C-create
	public List<Employee> getEmpList();//R All employees -retrieve
	public Employee updateEmp(Employee employee);//U-update
	public int deleteEmpById(Long empId);//D-delete
	public Employee getEmpById(Long empId);//S-search
	public void exitEmpApp();
}

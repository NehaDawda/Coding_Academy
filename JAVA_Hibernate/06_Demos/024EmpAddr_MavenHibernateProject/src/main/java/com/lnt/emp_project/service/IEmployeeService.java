/**
 * 
 */
package com.lnt.emp_project.service;

import java.util.List;

import com.lnt.emp_project.model.Employee;

/**
 * @author SMita
 *
 */
//service layer is accessible only by client 
//Waiter-accept your service order
public interface IEmployeeService {
	//CRUDS Operation
	public Long addEmployee(Employee employee);//C-create
	public List<Employee> getEmpList();//R All employees -retrieve
	public Employee updateEmp(Employee employee);//U-update
	public int deleteEmpById(Long empId);//D-delete
	public Employee getEmpById(Long empId);//S-search
	public void exitApp();//S-search
}

package com.jp.hr.services;

import com.jp.hr.exceptions.HrException;
import java.util.List;

import com.jp.hr.entities.Employee;

public interface ServiceEmployee {
	public List<Employee> getEmpList() throws HrException;
	public Employee getEmpDetails(int empId) throws HrException;
	public int joinNewEmployee(Employee emp) throws HrException;
}

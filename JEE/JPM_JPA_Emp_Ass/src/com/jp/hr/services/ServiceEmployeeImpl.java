package com.jp.hr.services;

import java.util.List;

import com.jp.hr.daos.DaoEmployee;
import com.jp.hr.daos.DaoEmployeeImpl;
import com.jp.hr.entities.Employee;
import com.jp.hr.exceptions.HrException;


public class ServiceEmployeeImpl implements ServiceEmployee{
	
	private DaoEmployee daoEmp;
	
	public ServiceEmployeeImpl() throws HrException{
		daoEmp = new DaoEmployeeImpl();
	}
	
	@Override
	public List<Employee> getEmpList() throws HrException {
		return daoEmp.getEmpList();
	}

	@Override
	public Employee getEmpDetails(int empId) throws HrException {
		return daoEmp.getEmpDetails(empId);
	}

	@Override
	public int joinNewEmployee(Employee emp) throws HrException {
		daoEmp.beginTransaction();
		int empId = daoEmp.insertNewRecord(emp);
		daoEmp.commitTransaction();
		return empId;
	}

	
}

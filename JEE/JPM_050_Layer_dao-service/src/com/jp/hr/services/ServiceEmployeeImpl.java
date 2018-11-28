package com.jp.hr.services;

import java.util.ArrayList;

import com.jp.hr.daos.DaoEmployee;
import com.jp.hr.daos.DaoEmployeeImpl;
import com.jp.hr.entities.Employee;
import com.jp.hr.exceptions.HrException;

/*
 * One layer will refers to another layer through interface only.
 * Implementation of a business rule should be done here in absence of BL layer.
 * This layer will also ensures only Custom exceptions to come out. 
 * 
 * Features:
 * 		* Only one gateway with preserving privacy of all inner classes.
 * 		* One point for implementing security, transaction management, caching.
 * 		* Multiple interfaces per client to give restricted view of all services.
 * 		* Facade Pattern (GoF(Gang of Four) Pattern).
 * 		* DAO is a JEE pattern.
 * 		* Implemented singleton by creating single object of outer most class.
 * 		* Delegates and controls Cross Cutting Concerns.
 */

public class ServiceEmployeeImpl implements ServiceEmployee{
	
	private DaoEmployee daoEmp;
	
	//Resolving Dependency.
	public ServiceEmployeeImpl(){
		daoEmp = new DaoEmployeeImpl();
	}
	
	@Override
	public ArrayList<Employee> getEmpList() throws HrException {
		return daoEmp.getEmpList();
	}

	@Override
	public Employee getEmpDetails(int empId) throws HrException {
		return daoEmp.getEmpDetails(empId);
	}

	@Override
	public boolean joinNewEmployee(Employee emp) throws HrException {
		return daoEmp.insertNewRecord(emp);
	}

	
}

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

}

package com.jp.hr.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.jp.hr.daos.DaoEmployee;
import com.jp.hr.entities.Dept;
import com.jp.hr.entities.Emp;
import com.jp.hr.exceptions.HrException;

@Service("service")
public class ServiceEmployeeImpl implements ServiceEmployee {
	private DaoEmployee daoEmp;
	
	// Resolving Dependency.
	public ServiceEmployeeImpl() throws HrException{
		//daoEmp = new DaoEmployeeImpl();
	}
	
	@Autowired //By Name
	public ServiceEmployeeImpl(@Qualifier("daoDS") DaoEmployee daoEmp) throws HrException{
		this.daoEmp = daoEmp;
	}
	
	@Override
	public List<Emp> getEmpList() throws HrException {
		return daoEmp.getEmpList();
	}

	@Override
	public List<Dept> getDeptList() throws HrException {
		return daoEmp.getDeptList();
	}

	@Override
	public Emp getEmpDetails(int empId) throws HrException {
		return daoEmp.getEmpDetails(empId);
	}

	@Override
	public Dept getDeptDetails(int deptId) throws HrException {
		return daoEmp.getDeptDetails(deptId);
	}
	
	/*
	@Override
	public boolean joinNewEmployee(Employee emp) throws HrException {
		return daoEmp.insertNewRecord(emp);
	}*/
}

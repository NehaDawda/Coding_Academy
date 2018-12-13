package com.verd.appl.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verd.appl.daos.EmployeeDao;
import com.verd.appl.entities.Employee;
import com.verd.appl.exceptions.EmpException;

@Service
public class EmployeeServicesImpl implements EmployeeServices {
	@Autowired
	private EmployeeDao dao;

	@Override
	public int insertNewRecord(Employee emp) throws EmpException {
		return dao.insertNewRecord(emp);
	}

	@Override
	public void closeResources() {
		dao.closeResources();
	}
}

package com.verd.appl.services;

import com.verd.appl.entities.Employee;
import com.verd.appl.exceptions.EmpException;

public interface EmployeeServices {
	public int insertNewRecord(Employee emp) throws EmpException;
	void closeResources();
}

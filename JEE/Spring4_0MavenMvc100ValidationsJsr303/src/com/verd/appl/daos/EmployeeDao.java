package com.verd.appl.daos;

import java.util.List;

import com.verd.appl.entities.Employee;
import com.verd.appl.exceptions.EmpException;

public interface EmployeeDao {
	public int insertNewRecord(Employee emp) throws EmpException;
	void closeResources();
}

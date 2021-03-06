package com.jp.hr.daos;

import java.util.List;

import com.jp.hr.entities.Employee;
import com.jp.hr.exceptions.HrException;;

public interface DaoEmployee {
	public List<Employee> getEmpList() throws HrException;
	public Employee getEmpDetails(int empId) throws HrException;
	public int insertNewRecord(Employee emp) throws HrException;
	public void commitTransaction();
	public void beginTransaction();
}
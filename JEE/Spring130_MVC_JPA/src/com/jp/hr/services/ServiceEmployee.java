package com.jp.hr.services;

import java.util.List;

import com.jp.hr.entities.Dept;
import com.jp.hr.entities.Emp;
import com.jp.hr.exceptions.HrException;

public interface ServiceEmployee {
	public List<Emp>  getEmpList() throws HrException;
	public List<Dept> getDeptList() throws HrException;
	public Emp getEmpDetails(int empId) throws HrException;
	public Dept getDeptDetails(int deptId) throws HrException;
	/*public boolean joinNewEmployee(Employee emp) throws HrException;*/
}

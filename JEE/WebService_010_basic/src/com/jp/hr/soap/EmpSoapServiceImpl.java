package com.jp.hr.soap;

import java.util.ArrayList;

import javax.jws.WebService;

import com.jp.hr.entities.Employee;
import com.jp.hr.exceptions.HrException;
import com.jp.hr.interfaces.EmpSoapServices;
import com.jp.hr.services.ServiceEmployee;
import com.jp.hr.services.ServiceEmployeeImpl;

@WebService(endpointInterface="com.jp.hr.interfaces.EmpSoapServices")
public class EmpSoapServiceImpl implements EmpSoapServices {
	
	private ServiceEmployee services;
	
	public EmpSoapServiceImpl() throws HrException {
		services = new ServiceEmployeeImpl();
	}
	
	@Override
	public int getTestInteger(int x) throws HrException {
		 return services.getTestInteger(x);
		 
	}

	@Override
	public Employee getEmpDetails(int empId) throws HrException {
		Employee emp = services.getEmpDetails(empId);
		return emp;
	}

	@Override
	public ArrayList<Employee> getEmpList() throws HrException {
		ArrayList<Employee> empList = services.getEmpList();
		return empList;
	}

	@Override
	public boolean joinNewEmployee(Employee emp) throws HrException {
		boolean flag = services.joinNewEmployee(emp);
		return flag;
	}
}

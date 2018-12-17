package com.jp.hr.soap;

import javax.jws.WebService;

import com.jp.hr.entities.Employee;
import com.jp.hr.exceptions.HrException;
import com.jp.hr.services.ServiceEmployee;
import com.jp.hr.updateInterfaces.EmpSoapServicesUpdate;
import com.jp.hr.utilities.ServiceFactory;

@WebService(endpointInterface="com.jp.hr.updateInterfaces.EmpSoapServicesUpdate")
public class EmpSoapServicesUpdateImpl implements EmpSoapServicesUpdate {
	private ServiceEmployee services;
	
	public EmpSoapServicesUpdateImpl() throws HrException {
		services = ServiceFactory.getService();
	}
	
	@Override
	public Employee getEmpDetails(int empId) throws HrException {
		Employee emp = services.getEmpDetails(empId);
		return emp;
	}

	@Override
	public boolean joinNewEmployee(Employee emp) throws HrException {
		boolean flag = services.joinNewEmployee(emp);
		return flag;
	}

}

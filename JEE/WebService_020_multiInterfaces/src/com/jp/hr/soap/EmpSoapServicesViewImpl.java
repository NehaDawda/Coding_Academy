package com.jp.hr.soap;

import java.util.ArrayList;

import javax.jws.WebService;

import com.jp.hr.entities.Employee;
import com.jp.hr.exceptions.HrException;
import com.jp.hr.viewInterfaces.EmpSoapServicesView;
import com.jp.hr.services.ServiceEmployee;
import com.jp.hr.utilities.ServiceFactory;

@WebService(endpointInterface="com.jp.hr.viewInterfaces.EmpSoapServicesView")
public class EmpSoapServicesViewImpl implements EmpSoapServicesView {
	
	private ServiceEmployee services;
	
	public EmpSoapServicesViewImpl() throws HrException {
		services = ServiceFactory.getService();
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
}

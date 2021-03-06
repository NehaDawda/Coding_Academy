package com.jp.hr.viewInterfaces;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.jp.hr.entities.Employee;
import com.jp.hr.exceptions.HrException;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface EmpSoapServicesView {
	
	@WebMethod
	public Employee getEmpDetails(int empId) throws HrException;
	
	@WebMethod
	public ArrayList<Employee> getEmpList() throws HrException;
}

package com.jp.fin.services;

import java.util.ArrayList;

import com.jp.fin.exceptions.FinException;
import com.jp.fin.locator.LocateServices;
import com.jp.hr.entities.Employee;
import com.jp.hr.exceptions.HrException;
import com.jp.hr.interfaces.EmpSoapServices;

public class FinancialServicesImpl implements FinancialServices {
	
	private EmpSoapServices soapServices;
	
	public FinancialServicesImpl() throws FinException {
		soapServices = LocateServices.getEmpServices();
	}
	
	@Override
	public int getEmpCount() throws FinException {
		ArrayList<Employee> empList;
		try {
			empList = soapServices.getEmpList();
		} catch (HrException e) {
			throw new FinException("Soap Service getEmpList() failed", e);
		}
		return empList.size();
	}

}

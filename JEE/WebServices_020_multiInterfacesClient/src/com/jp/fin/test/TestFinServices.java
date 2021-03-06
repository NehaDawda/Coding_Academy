package com.jp.fin.test;

import com.jp.fin.exceptions.FinException;
import com.jp.fin.locator.LocateServices;
import com.jp.hr.exceptions.HrException;
import com.jp.hr.updateInterfaces.EmpSoapServicesUpdate;
import com.jp.hr.viewInterfaces.EmpSoapServicesView;
public class TestFinServices {
	public static void main(String[] args) {
		try {
			EmpSoapServicesView services = LocateServices.getEmpViewServices();
			System.out.println(services.getEmpDetails(4));
			System.out.println(services.getEmpList());
			
			EmpSoapServicesUpdate updateServices = LocateServices.getEmpUpdateServices();
			System.out.println(updateServices.getEmpDetails(1));
			
			
		} catch (FinException e) {
			e.printStackTrace();
		} catch (HrException e) {
			e.printStackTrace();
		} 
	}	
}

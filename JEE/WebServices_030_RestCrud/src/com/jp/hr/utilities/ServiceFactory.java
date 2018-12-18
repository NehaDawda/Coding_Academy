package com.jp.hr.utilities;

import com.jp.hr.exceptions.HrException;
import com.jp.hr.services.ServiceEmployee;
import com.jp.hr.services.ServiceEmployeeImpl;

public class ServiceFactory {
	private static ServiceEmployee service;
	
	static{
		try {
			service = new ServiceEmployeeImpl();
		} catch (HrException e) {
			e.printStackTrace();
		}
	}
	
	public static ServiceEmployee getService(){
		return service;
	}
}

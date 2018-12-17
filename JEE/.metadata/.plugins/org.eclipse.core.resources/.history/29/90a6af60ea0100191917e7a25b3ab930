package com.jp.fin.test;

import com.jp.fin.exceptions.FinException;
import com.jp.fin.services.FinancialServices;
import com.jp.fin.services.FinancialServicesImpl;

public class TestFinServices {
	public static void main(String[] args) {
		try {
			FinancialServices services = new FinancialServicesImpl();
			System.out.println(services.getEmpCount());
		} catch (FinException e) {
			e.printStackTrace();
		} 
	}	
}

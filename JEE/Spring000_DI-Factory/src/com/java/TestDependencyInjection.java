package com.java;

public class TestDependencyInjection {

	public static void main(String[] args) {
		ObjectFactory factory = new ObjectFactory();
		
		// Constructor Injection
		//MyApplDao dao = factory.getDao();
		//MyApplServices services = factory.getService();
		
		MyApplDao dao = (MyApplDao)factory.getBean("dao");
		MyApplServices services = (MyApplServices) factory.getBean("service");
	}
}

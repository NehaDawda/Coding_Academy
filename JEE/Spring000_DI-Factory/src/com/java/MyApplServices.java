package com.java;

public class MyApplServices {
	private MyApplDao dao;
	
	public MyApplServices(){
		// This code owns a responsibility of creating an object and holding a reference.
		dao = new MyApplDao();
		System.out.println("Object of class MyApplServices() is created.");
	}
	
	// Dependency injection using Constructor
	public MyApplServices(MyApplDao dao){
		this.dao = dao;
		System.out.println("Object of class MyApplServices(dao) is created.");
	}	
}

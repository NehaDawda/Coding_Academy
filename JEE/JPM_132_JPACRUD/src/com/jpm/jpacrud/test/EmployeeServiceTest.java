package com.jpm.jpacrud.test;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.jpm.jpacrud.service.EmployeeService;
import com.jpm.jpacrud.service.IEmployeeService;

public class EmployeeServiceTest {
	private static IEmployeeService employeeService;
	
	@BeforeClass
	public static void testServiceObject(){
		employeeService = new EmployeeService();
		Assert.assertNotNull("employeeDao is Null", employeeService);
	}
	
	@Test
	public void testAddEmployee(){
		
	}
}

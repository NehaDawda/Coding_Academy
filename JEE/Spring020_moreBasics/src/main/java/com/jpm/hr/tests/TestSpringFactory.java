package com.jpm.hr.tests;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jpm.hr.daos.MyApplDao;
import com.jpm.hr.services.MyApplServices;

/*
 * 1. Creation of an application context.
 * 2. The ClassPathXmlApplicationContext refers to config file which is relative to a path on ClassPath.
 * 3. Beans are being created eagerly by default.
 * 		To create objects lazily, use 'lazy-init' attribute in configuration.
 * 4. Beans are being created as Singleton by default.
 * 		To create stateful objects use scope as 'prototype'.
 * 
 * 5. Prototypes are always on demand.  Nothing like eager creation.
 * 6. By default, it calls Default Constructor.  If does not exists, throws exception.
 * 7. The <constructor-arg> tag decides the constructor to be invoked while creating a bean.
 * 8. The <value> is for defining initial value while <ref> is for injection.
 * 9. Order of the bean creation is not customizable.  Spring decides it.
 */

public class TestSpringFactory {

	public static void main(String[] args) {
		// Create a Spring context
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		
		System.out.println("Context created.");
		MyApplDao dao1 = (MyApplDao)ctx.getBean("dao");
		System.out.println("dao1: " + dao1.hashCode());
		
		MyApplDao dao2 = (MyApplDao)ctx.getBean("dao");
		System.out.println("dao2: " + dao2.hashCode());
		
		MyApplServices service1 = (MyApplServices)ctx.getBean("service");
		System.out.println("service1: " + service1.hashCode());
	}
}
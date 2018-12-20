package com.jp.hr.tests;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jp.hr.services.MyServices;

public class TestAop {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		
		MyServices services = ctx.getBean(MyServices.class);
		services.abcMethod1();
		services.abcMethod2(10);
		services.abcMethod3(10, 20);
	}
}

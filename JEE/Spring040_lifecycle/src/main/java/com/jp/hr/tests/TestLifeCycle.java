package com.jp.hr.tests;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jp.hr.beans.ServiceBean;

public class TestLifeCycle {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		
		ServiceBean bean = (ServiceBean)  ctx.getBean("service");
		System.out.println(bean);
	}
}

package com.verd.appl.tests;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.verd.appl.daos.EmployeeDao;
import com.verd.appl.exceptions.EmpException;

public class TestHibernateDao {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		
		EmployeeDao dao = ctx.getBean(EmployeeDao.class);
		try {
			System.out.println(dao.getAllEmployees());
		} catch (EmpException e) {
			e.printStackTrace();
		} finally {
			ctx.close();
		}
	}
}

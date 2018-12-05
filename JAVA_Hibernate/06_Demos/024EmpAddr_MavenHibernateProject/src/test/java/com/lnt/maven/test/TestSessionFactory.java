/**
 * 
 */
package com.lnt.maven.test;

import org.hibernate.SessionFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.lnt.emp_project.util.HibernateUtil;

/**
 * @author brije
 *
 */
public class TestSessionFactory {
	private SessionFactory sessionFactory;
	@Test
	public void testSessionFactory(){
		sessionFactory=HibernateUtil.getSessionFactory();
		Assert.assertNotNull(sessionFactory,"Session Factory is Null");
	}
}

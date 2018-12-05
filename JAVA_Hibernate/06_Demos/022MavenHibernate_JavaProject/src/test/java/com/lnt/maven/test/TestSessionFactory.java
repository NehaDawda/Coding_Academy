/**
 * 
 */
package com.lnt.maven.test;

import org.hibernate.SessionFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.synergetics.hibernate.util.HibernateUtil;

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

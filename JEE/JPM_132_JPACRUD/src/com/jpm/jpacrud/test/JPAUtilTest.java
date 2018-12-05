package com.jpm.jpacrud.test;

import javax.persistence.EntityManager;

import org.junit.Assert;
import org.junit.Test;

import com.jpm.jpacrud.util.JPAUtil;

/*
 * @author Neha
 */
public class JPAUtilTest {
	@Test
	public void testEntityManager(){
		EntityManager em = JPAUtil.getEntityManager();
		Assert.assertNotNull("Entity Manager is Null", em);
	}
}

/**
 * 
 */
package com.jp.inheritence.clients;

import javax.persistence.EntityManager;

import com.jp.inheritence.entities.Employee;
import com.jp.inheritence.entities.Manager;
import com.jp.inheritence.entities.SalesManager;
import com.jpm.inheritence.util.JPAUtil;

/**
 * @author Neha
 *
 */
public class ClientTPC {
	public static void main(String[] args){
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		
		Employee emp = new Employee("Zara", 99.99);
		em.persist(emp);

		Manager mgr = new Manager("Tara",89.98,10.01);
		em.persist(mgr);
		
		SalesManager salesMgr = new SalesManager("Mara", 78.99, 12.22, 5.55);
		em.persist(salesMgr);
		//commit transaction
		em.getTransaction().commit();
		em.close();
	}
}

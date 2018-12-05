package com.lti.methods.demos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateCacheExample2 extends Thread {

	public static void main(String[] args) throws InterruptedException {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		System.out.println("Employee is calling with get()");      
		Employee e1 =(Employee) session.get(Employee.class,new Integer(720)) ;
		System.out.println("Printing Employee first Name___"+e1.getFirstName());        
		System.out.println("Printing Employee first Name___"+e1.getLastName());
		
		System.out.println("Employee is calling with load()");        
		Employee e2 =(Employee) session.load(Employee.class,new Integer(720));    
		System.out.println("Printing Employee first Name___"+e2.getFirstName());        
		System.out.println("Printing Employee first Name___"+e2.getLastName());
		
		
		t.commit();
		factory.close();

	}

}

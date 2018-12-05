package com.lti.methods.demos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateCacheExample extends Thread {

	public static void main(String[] args) throws InterruptedException {

		SessionFactory factory = null;
		Transaction transaction=null;
		try {
			factory = new Configuration().configure().buildSessionFactory();
			// Get session from Sesson factory
			Session session = factory.openSession();

			// Begin transaction
			 transaction= session.beginTransaction();

			// Get employee with id=1
			Employee emp810 = (Employee) session.get(Employee.class, new Integer(810));
			System.out.println(emp810.getEmployeeId() + " | " + emp810.getAge());
			// waiting for sometime to change the data in backend

			// Fetch same data again, check logs that no query fired
			Employee emp810n = (Employee) session.load(Employee.class, new Integer(810));
			System.out.println(emp810n.getEmployeeId() + " | " + emp810n.getAge());

			
			/*// Create new session
			Session newSession = factory.openSession();
			// Get employee with id=1, notice the logs for query
			Employee emp2 = (Employee) newSession.load(Employee.class, new Integer(720));
			System.out.println(emp2.getEmployeeId()+ " | " +emp2.getAge());
			
			// START: evict example to remove specific object from hibernate first
			// level cache 
			// Get employee with id=212, first time hence query in logs
			Employee emp3 = (Employee) session.load(Employee.class, new Integer(722));
			System.out.println(emp3.getEmployeeId()+ " | " +emp3.getAge());

			// evict the employee object with id=210
			 session.evict(emp2);
			System.out.println("Session Contains Employee with 	 id=210?"+session.contains(emp2));

			// since object is removed from first level cache, you will see query in
			// logs
			Employee emp4 = (Employee) session.load(Employee.class, new Integer(710));
			System.out.println(emp4.getEmployeeId()+ " | " +emp4.getAge());

			// this object is still present, so you won'transaction see query in logs
			Employee emp5 = (Employee) session.load(Employee.class, new Integer(722));
			System.out.println(emp5.getEmployeeId()+ " | " +emp5.getAge());

			// END: evict example

			// START: clear example to remove everything from first level cache
			session.clear();
			Employee emp6 = (Employee) session.load(Employee.class, new Integer(710));
			Employee emp7 = (Employee) session.load(Employee.class, new Integer(722));
			System.out.println("Session Contains Employee emp6  with id= "+ session.contains(emp6));
			System.out.println("Session Contains Employee emp7 with id= " + session.contains(emp7));
	*/
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if(transaction!=null)
				transaction.rollback();
		} finally {
			factory.close();
		}

	}

}

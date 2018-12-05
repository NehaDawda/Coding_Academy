package com.lti.methods.demos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

///Update and Merge both will update the record 
//but difference is update raise the error if use record not availale 
//but merge can't instead it will create the record.

//Update():- if you are sure that the session does not contains an already persistent instance 
//with the same identifier,then use update to save the data in hibernate 

//Merge():-if you want to save your modificatiions at any time 
//with out knowing about the state of an session, then use merge() in hibernate.

public class HibernateCacheExample extends Thread {

	public static void main(String[] args) throws InterruptedException {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		Employee me = (Employee) session.get(Employee.class, new Integer(580));
		session.close();// object is in detached state 

		me.setFirstName("Updated Name");//we changed the name property of that detached object. 

		Session newSession = factory.openSession();
		Employee updatedMe = (Employee) newSession.get(Employee.class, new Integer(580));

		Transaction tx = newSession.beginTransaction(); 

		// newSession.merge(me); // will run fine //changes  will be merged and will finally be saved into the database. 
		 newSession.update(me); // will throw exception
		// exception because before reattachment, 
		 //another instance that represents the same database row has already been loaded 
		 //into the persistence context of that Session 
		 //and Hibernate will get confused which object represents the current state. 
			
		 newSession.close();
		 
		 factory.close();

	}

}


/*

Hibernate does not keep a reference to a detached object,

 i.e. detached objects are not part of any session, 
 and their garbage collection is not impeded in any way.

The cause of a NonUniqueObjectException is that 
two different objects for the same database row have become associated with the same session. 
That's bad because Hibernate automatically detects changes to objects in the session, 
and writes these changes back to the database. 
If several objects for the same row are in the same session,
 it is ambiguous which object's state should be written. Because this would result in hard to find bugs, 
 Hibernate refuses such a situation.

Usually, Hibernate ensures that all queries for a row in a given session return the same object,
 so this situation can not arise.
  However, if you use an object obtained from a different session with a new session, 
  it becomes associated with the new session,
   which can fail if the new session already contains an object for that row.

This is why the newer EntityManager API no longer features an update method, 
that associates a pre-existing object with the session, but a merge method, 
that copies the contents of the object into the object associated with the session.
*/
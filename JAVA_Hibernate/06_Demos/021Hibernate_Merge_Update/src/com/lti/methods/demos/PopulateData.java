package com.lti.methods.demos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PopulateData {
public static void main(String[] args) {
	SessionFactory factory = new Configuration().configure().buildSessionFactory();		
	
    // Get session from Sesson factory
    Session session = factory.openSession();
 
    // Begin transaction
    Transaction t = session.beginTransaction();
   
    //Create Employee  data
    Employee employee1 = new Employee();
    employee1.setFirstName("John");
    employee1.setLastName("KC");
    employee1.setAge(28);
    employee1.setEducation("PG");
    employee1.setSalary(25000);
   
    Employee employee2 = new Employee();
    employee2.setFirstName("Jacob");
    employee2.setLastName("JC");
    employee2.setAge(30);
    employee2.setEducation("PG");
    employee2.setSalary(30000);
   
    Employee employee3 = new Employee();
    employee3.setFirstName("Martin");
    employee3.setLastName("A");
    employee3.setAge(24);
    employee3.setEducation("UG");
    employee3.setSalary(20000);   
   
    session.save(employee1);
    session.save(employee2);
    session.save(employee3);
    
    // Commit the transaction and close the session
    t.commit();
   
    session.close();
    System.out.println("successfully persisted Employee details");
 
    
    Session session1 = factory.openSession();
    
    // Get the Employee details whose Id is 210
    System.out.println("Calling Session.get() method");
    session1.get(Employee.class, new Integer(210));
    session1.close();
    
    Session session2 = factory.openSession();
        // Load the Employee details whose Id is 210
    System.out.println("\n Calling Session.load() method");
    session2.load(Employee.class, new Integer(210));
    session2.close();
    
   }
 
}

/*

Get() method always fires the query immediately to DB or hits DB , just like eager loading.
// returns fully inititalized object or null objejct 
Load() method fires query to DB only when the object is used by the application, just like Lazy loading.
it returns proxy object 
*/







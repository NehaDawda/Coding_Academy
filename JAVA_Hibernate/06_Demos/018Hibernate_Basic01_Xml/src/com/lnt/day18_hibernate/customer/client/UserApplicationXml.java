package com.lnt.day18_hibernate.customer.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.lnt.day18_hibernate.customer.model.Customer;
public class UserApplicationXml {
	public static void main(String[] args) {
		//Customer customer = new Customer(1111L, "Smita", "Smita@gmail.com", "9879879879");
		//Customer customer = new Customer(2222L, "Sia", "Sia@gmail.com", "9879878888");
		Customer customer = new Customer(3333L, "Ria", "Ria@gmail.com", "9879878555");
		// step 1 : create session Factory
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = null;
		Transaction transaction = null;
		try {
			// //step 2 : open session
			session = factory.openSession();
			// step 3 : In case of DML operations (Data manipulation insert
			// update and delete)
			// then begin transactions
			transaction = session.beginTransaction();
			// step 4 : saving the customer -insert/create
			Long id = (long) session.save(customer);
			System.out.println(" Customer record inserted with Id : " + id);
			// step 5 : committing transaction
			transaction.commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			if (transaction != null)
				transaction.rollback();
		} finally {
			if (factory != null)
				factory.close();
		}
	}
}

// Create a new Configuration ,
// for current application which has specific information about properties and
// mapping documents to be used
// With configure() API method use the mappings and properties specified in an
// application resource named hibernate.cfg.xml .

// if class is customer file name should be customer.hbm.xml... automatically
// configuration().configure() method takes data from this file

// creating session is lightweight process, multiple sessions can be created and
// no need to bother deallocation.

// buildSessionFactory(); method depricated in hibernate 4
// suggesting to use alternative ServiceRegistry object
/*
 * private static SessionFactory sessionFactory; private static ServiceRegistry
 * serviceRegistry; Configuration configuration = new Configuration();
 * configuration.configure(); serviceRegistry = new
 * ServiceRegistryBuilder().applySettings(configuration.getProperties()).
 * buildServiceRegistry(); sessionFactory =
 * configuration.buildSessionFactory(serviceRegistry);
 * 
 */

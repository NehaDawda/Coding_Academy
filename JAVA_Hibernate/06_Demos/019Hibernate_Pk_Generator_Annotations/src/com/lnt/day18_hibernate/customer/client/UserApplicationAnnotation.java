package com.lnt.day18_hibernate.customer.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.lnt.day18_hibernate.customer.model.Customer;

public class UserApplicationAnnotation {

	public static void main(String[] args) {

		// Customer customer = new Customer(1111, "Shiv", "shiv@g.com", "9879879666");
		Customer customer = new Customer("Sia", "sia@g.com", "9879879876");
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		// step 1 : session Factory
		Session session = null;

		Transaction transaction = null;
		try {// step 2 : opening session
			session = factory.openSession();
			// step 3 : Beginning transactions
			transaction = session.beginTransaction();
			// step 4 : saving the customer -insert
			Long id = (Long) session.save(customer);
			System.out.println("inserted Customer: " + id);// commiting
															// transaction
			// step 5: commiting the tx
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

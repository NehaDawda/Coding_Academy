package com.lti.mapping.mto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.lnt.hibernate.util.HibernateUtil;

public class HibernateManyToOne {

	public static void main(String[] args) {

		try {
			Session session = HibernateUtil.getSession();
			session.beginTransaction();// create the transaction from the
										// session object

			UserDetails user = new UserDetails( "Smita");

			Vehicle vehicle1 = new Vehicle(); // create a vehicle1 entity
			Vehicle vehicle2 = new Vehicle(); // create second vehicle1 entity

			vehicle1.setVehicleName("BMW Car"); // set BMW car
			vehicle1.setUser(user); // set user for that car

			vehicle2.setVehicleName("AUDI Car"); // set second car Audi
			vehicle2.setUser(user);// set user for that car
			
			session.save(vehicle1);
			session.save(vehicle2);
			session.save(user);

			session.getTransaction().commit(); // close the transaction
			session.close(); // close the session
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			HibernateUtil.closeSessionFactory();
		}
	}

}
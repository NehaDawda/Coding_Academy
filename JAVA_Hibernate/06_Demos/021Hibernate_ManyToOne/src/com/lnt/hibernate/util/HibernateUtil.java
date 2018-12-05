/**
 * 
 */
package com.lnt.hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author Smita
 *
 */
public class HibernateUtil {
	private static final SessionFactory sessionFactory = 
    		buildSessionFactory();
    private static SessionFactory buildSessionFactory() {
        try {
        	SessionFactory factory =new Configuration()
    		.configure()
            .buildSessionFactory();
            // Create the SessionFactory from hibernate.cfg.xml
            return factory;
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation"
            		+ " failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    } 
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
	public static Session getSession() {
		// TODO Auto-generated method stub
		return buildSessionFactory().openSession();
	}
	public static void closeSessionFactory() {
		sessionFactory.close();
	}
}

package com.lti.mapping.oto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.lnt.hibernate.util.HibernateUtil;
public class HibernateTestDemo {
	
public static void main(String[] args) {
	
	try
	{
Session session = HibernateUtil.getSession();
session.beginTransaction();//create the transaction from the session object

UserDetails user = new UserDetails(); //create the user entity
Vehicle vehicle = new Vehicle(); //create the vehicle entity

vehicle.setVehicleName("BMW"); //set vehicle name
user.setUserName("Prathamesh Uphale"); //set the user name
user.setVehicle(vehicle); //set the vehicle entity to the field of the user entity i.e. vehicle entity inside the user entity

session.save(vehicle); // save the vehicle entity to the database
session.save(user); // save the user entity to the database

session.getTransaction().commit(); //close the transaction
session.close(); //close the session
	}
	catch(Exception e) {System.out.println(e.getMessage());
	}	}

}
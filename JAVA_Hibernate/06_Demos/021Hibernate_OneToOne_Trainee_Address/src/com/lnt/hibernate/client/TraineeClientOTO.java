package com.lnt.hibernate.client;
import java.sql.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.lnt.hibernate.oto.model.Address;
import com.lnt.hibernate.oto.model.Trainee;
import com.lnt.hibernate.util.HibernateUtil;
/**
 * @author Smita
 *
 */
public class TraineeClientOTO {
	// step I sessionFactory
	static SessionFactory factory = HibernateUtil.getSessionFactory();
	public static void main(String[] args) {
		// create 3 address object
		Address adr1 = 
new Address("Sky Appt,Sector-8A", "Mumbai", "MH", "India");
		Address adr2 = 
new Address("Happy Homes,Street-78", "Pune", "MH", "India");

		Trainee t1 = new Trainee("Smita", "Kumar", 
				new Date(2011, 11, 11), "9879879876");
		Trainee t2 = new Trainee("Mona", "Gupta", 
				new Date(2011, 11, 11), "9879879876");
		//setting trainee s address
		t1.setAddress(adr1);
		t2.setAddress(adr2);
		// create set of trainees
		Set<Trainee> traineeSet = new HashSet<>();
		traineeSet.add(t1);
		traineeSet.add(t2);
		// now set the trainee of each address
		adr1.setTrainee(t1);
		adr2.setTrainee(t2);
		/****************** INSERT TRAINEE **************************/
		// 1>open session
		Session session = factory.openSession();
		// 2>begin tx
		Transaction tx = session.beginTransaction();
		// 3>perform insert operation
		session.save(t1);
		session.save(t2);
		// 4>commit tx
		tx.commit();
		/******************* GET TRAINEE RECORD *************************/
		List<Trainee> traineeList = 
			session.createQuery("FROM Trainee").list();
		for (Trainee trainee : traineeList) {
			System.out.println(trainee);
		}
		session.close();
		factory.close();/****************** DELETE TRAINEE RECORD *************************/
		/*
		 * session= factory.openSession(); tx= session.beginTransaction();
		 * session.delete(s1); tx.commit(); session.close();
		 */
		// step II close Factory at the last

	}
}

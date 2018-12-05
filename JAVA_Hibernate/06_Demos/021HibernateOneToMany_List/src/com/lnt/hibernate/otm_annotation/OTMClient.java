package com.lnt.hibernate.otm_annotation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.lnt.hibernate.util.HibernateUtil;

public class OTMClient {
	public static void main(String[] args) {
		Session session = null;
		Transaction tx = null;
		try {
			 session = HibernateUtil.getSession();
			 tx = session.beginTransaction();
			Question q1 = new Question();
			q1.setQname("What is Hibernate?");

			Answer ans1 = new Answer();
			ans1.setAnswername("Hibernate is opensource ORM " + "Framework.");
			ans1.setPostedBy("Mona");
			Answer ans2 = new Answer();
			ans2.setAnswername("Hibernate is a ORM tool " + "which implements JPA");			
			ans2.setPostedBy("Rama");
			
			
			List<Answer> ansList1 = new ArrayList<>();
			ansList1.add(ans1);
			ansList1.add(ans2);
			
			// now set the ansList to Question
			q1.setAnswers(ansList1);
			// lets persists question
			session.persist(q1);
			
			tx.commit();

			System.out.println("Question and Answeres Saved!!!");
			List<Question> qList = session.createQuery("from Question").list();//hql
			for (Question question : qList) {
				System.out.println(question.getId() + "\tx" + question.getQname());
				List<Answer> ansList3 = question.getAnswers();
				for (Answer a1 : ansList3) {
					System.out.println(a1);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
			HibernateUtil.closeSessionFactory();
		}
	}
}

package com.lnt.hibernate.otm_annotation;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class FetchData {
@SuppressWarnings({ "unchecked", "deprecation" })
public static void main(String[] args) {
	
	Session session=new Configuration()
	.configure("hibernate.cfg.xml")
	.buildSessionFactory().openSession();
	System.out.println("Fecthing all Questions and Answres List");
	List<Question> list=session.createQuery("from Question").list();
	
	Iterator<Question> itr=list.iterator();
	
	while(itr.hasNext()){
		Question q=itr.next();
		System.out.println("Question Name: "+q.getQname());
		
		//printing answers
		List<Answer> list2=q.getAnswers();
		Iterator<Answer> itr2=list2.iterator();
		while(itr2.hasNext()){
			System.out.println(itr2.next());
		}
		
	}
	session.close();
}
}

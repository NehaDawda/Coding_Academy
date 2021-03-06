package com.jpm.lifecycle.client;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpm.lifecycle.entities.Greet;
import com.jpm.lifecycle.util.JPAUtil;

public class ClientObjectLifeCycle {

	public static void main(String[] args) {
		
		
		// Step 2: Create EntityManager Object
		EntityManager em = JPAUtil.getEntityManager();
		// Step 3: begin Transaction
		em.getTransaction().begin();
		// Step 4: create the entity object and persist entity
		Greet greet = new Greet();
		greet.setMessage("Welcome to JPA Session");
		System.out.println("Before persist: " + greet);
		em.persist(greet); 
		System.out.println("After persist: " + greet);
		System.out.println("Adding Greet object on to the DB");
		// Step 5: commit transaction
		em.getTransaction().commit();
		
		//fetch the record from DB with the help of primary key
		Greet g1 = em.find(Greet.class, greet.getMessageId());
		System.out.println("Employee : " +g1);
		// step 6: close EntityManager
		em.close();
		
	}

}

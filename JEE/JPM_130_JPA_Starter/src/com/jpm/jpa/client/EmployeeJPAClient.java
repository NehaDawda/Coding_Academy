/**
 * 
 */
package com.jpm.jpa.client;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpm.jpa.entities.Employee;

/**
 * @author Administrator
 *
 */
public class EmployeeJPAClient {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*System.out.println("Enter Employee Id :");
		int empId = scanner.nextInt();*/
		System.out.println("Enter Employee Name :");
		String empName = scanner.next();
		System.out.println("Enter Employee Salary :");
		double empSal = scanner.nextDouble();
		
		String persistenceUnitName = "JPA-PU";
		// Step 1: Create EntityManagerFactory Object
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory(persistenceUnitName);
		// Step 2: Create EntityManager Object
		EntityManager em = emFactory.createEntityManager();
		// Step 3: begin Transaction
		em.getTransaction().begin();
		// Step 4: create the entity object and persist entity
		Employee emp = new Employee(empName, empSal);
		em.persist(emp); //persisting the emp object in DB
		// Step 5: commit transaction
		em.getTransaction().commit();
		
		//fetch the record from DB with the help of primary key
		Employee e1 = em.find(Employee.class, emp.getEmployeeId());
		System.out.println("Employee : " +e1);
		// step 6: close EntityManager
		em.close();
		// step 7: close EntityManagerFactory
		emFactory.close();
	}

}

/**
 * 
 */
package com.jpm.otm.client;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;

import com.jpm.ota.util.JPAUtil;
import com.jpm.otm.entity.Department;
import com.jpm.otm.entity.Employee;

/**
 * @author Neha
 *
 */
public class OTMClient {
	public static void main(String[] args) {
		//Step 1: obtain entityManager object
		EntityManager entityManager = JPAUtil.getEntityManager();
		
		//create the object to be persisted
		//--dept obj
		Department department = new Department();
		department.setDeptId(10L);
		department.setDeptName("Sales");
		
		//--emp obj
		Employee e1 = new Employee();
		e1.setEmpId(101L);
		e1.setEmpName("Zara");
		e1.setEmpSal(99.99);
		//set the department
		e1.setDepartment(department);
		
		Employee e2 = new Employee();
		e2.setEmpId(102L);
		e2.setEmpName("Tara");
		e2.setEmpSal(88.88);
		//set the department
		e2.setDepartment(department);
		
		//create the set of employees and set to the department
		Set<Employee> employees = new HashSet<>();
		employees.add(e1);
		employees.add(e2);
		
		//set the employee set in Department object
		department.setEmployees(employees);
		
		//begin transaction
		entityManager.getTransaction().begin();
		
		//persist the department obejct
		entityManager.persist(department);
		
		//commit transaction
		entityManager.getTransaction().commit();
		
		//close em
		entityManager.close();
	}

}

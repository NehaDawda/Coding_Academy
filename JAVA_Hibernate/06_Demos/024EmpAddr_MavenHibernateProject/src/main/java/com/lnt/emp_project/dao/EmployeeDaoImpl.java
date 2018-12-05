/**
 * 
 */
package com.lnt.emp_project.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.lnt.emp_project.model.Employee;
import com.lnt.emp_project.util.HibernateUtil;

/**
 * @author Smita
 *
 */
public class EmployeeDaoImpl implements IEmployeeDao{
	//Prep work-//need the object of Hibernate SessionFactory
	private SessionFactory sessionFactory =null;
	private Session session = null;
	private  Transaction tx = null;
	private Query query=null;
	public EmployeeDaoImpl() {
		//Obtain the object of Hibernate SessionFactory
		sessionFactory = HibernateUtil.getSessionFactory();
	}
//Create or Add/Save
	public Long addEmployee(Employee employee) {
		session = sessionFactory.openSession();
		tx=session.beginTransaction();
		Long empId=(Long) session.save(employee);
		tx.commit();
		session.close();
		return empId;
	}
//Retrieve -list all
	public List<Employee> getEmpList() {
		session = sessionFactory.openSession();	
		query = session.createQuery("from Employee");
		List<Employee> empList = query.list();
		session.close();
		return empList;
	}
//Update - modify
	public Employee updateEmp(Employee employee) {
		session = sessionFactory.openSession();
		tx=session.beginTransaction();
		session.update(employee);
		tx.commit();
		session.close();
		return employee;
	}
//Delete -remove
	public int deleteEmpById(Long empId) {
		session = sessionFactory.openSession();
		tx=session.beginTransaction();
		
		query = session.createQuery("delete from Employee where empId= :empId");
		query.setLong("empId", empId);
		int result = query.executeUpdate();
		//System.out.println("Address Delete Status="+result);
		tx.commit();
		session.close();
		return result;		
	}
//Search
	public Employee getEmpById(Long empId) {
		session = sessionFactory.openSession();	
		Employee employee = (Employee) session.get(Employee.class, empId);
		session.close();
		return employee;
	}
	public void exitEmpApp() {
		HibernateUtil.closeSessionFactory();//exit the app		
	}

}

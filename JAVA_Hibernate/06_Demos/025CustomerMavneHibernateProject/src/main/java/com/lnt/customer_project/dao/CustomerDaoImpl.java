/**
 * 
 */
package com.lnt.customer_project.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.lnt.customer_project.model.Customer;
import com.lnt.customer_project.util.HibernateUtil;

/**
 * @author brije
 *
 */
public class CustomerDaoImpl implements ICustomerDao{
	private SessionFactory sessionFactory;
	private Session session;
	private Transaction trasaction;
	private Query query;
	private Long custId;
	public CustomerDaoImpl() {
		sessionFactory=HibernateUtil.getSessionFactory();
	}
	public Long addCustomer(Customer customer) {
		//add the customer record in the db
		session = sessionFactory.openSession();
		//begin tx
		trasaction=session.beginTransaction();
		//save
		custId= (Long) session.save(customer);
		//commit tx
		trasaction.commit();
		//close session
		session.close();
		return custId;
	}
	public List<Customer> getCustomerList() {
		//we use transaction only with DML operations
		//not with DQL 
		session = sessionFactory.openSession();
		query= session.createQuery("from Customer");
		List<Customer> customerList=query.list();
		//close session
		session.close();
		return customerList;
	}
	public Customer getCustomerById(Long custId) {
		//we use transaction only with DML operations
		//not with DQL 
		session = sessionFactory.openSession();
		Customer customer = (Customer) session.get(Customer.class, custId);
		session.close();
		return customer;
	}
	public Customer updateCustomer(Customer customer) {		
		//add the customer record in the db
		session = sessionFactory.openSession();
		//begin tx
		trasaction=session.beginTransaction();
		//update
		session.update(customer);
		//commit tx
		trasaction.commit();
		//close session
		session.close();
		return customer;
	}
	public int deleteCustomerById(Long custId) {
		//add the customer record in the db
		session = sessionFactory.openSession();
		//begin tx
		trasaction=session.beginTransaction();
		query = session.createQuery("delete from Customer where custId=:custId");
		//set the named parameter
		query.setLong("custId", custId);
		//delete query execution
		int result= query.executeUpdate();
		//commit tx
		trasaction.commit();
		//close session
		session.close();
		return result;
	}

}

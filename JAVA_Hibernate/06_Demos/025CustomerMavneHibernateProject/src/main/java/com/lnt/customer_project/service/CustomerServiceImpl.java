/**
 * 
 */
package com.lnt.customer_project.service;

import java.util.List;

import com.lnt.customer_project.dao.CustomerDaoImpl;
import com.lnt.customer_project.dao.CustomerException;
import com.lnt.customer_project.dao.ICustomerDao;
import com.lnt.customer_project.model.Customer;

/**
 * @author brije
 *
 */
public class CustomerServiceImpl  implements ICustomerService {
//prep work - ref of ICustomerDao and obj of CustomerDaoImpl
	//to achieve loose coupling we use interface reference
	private ICustomerDao customerDao;
	
	public CustomerServiceImpl() {
		customerDao= new CustomerDaoImpl();
	}
	
	public Long addCustomer(Customer customer) throws CustomerException{
		// TODO Auto-generated method stub
		return customerDao.addCustomer(customer);
	}

	public List<Customer> getCustomerList() throws CustomerException{
		// TODO Auto-generated method stub
		return customerDao.getCustomerList();
	}

	public Customer getCustomerById(Long custId) throws CustomerException{
		// TODO Auto-generated method stub
		return customerDao.getCustomerById(custId);
	}

	public Customer updateCustomer(Customer customer) throws CustomerException{
		// TODO Auto-generated method stub
		return customerDao.updateCustomer(customer);
	}

	public int deleteCustomerById(Long custId) throws CustomerException{
		// TODO Auto-generated method stub
		return customerDao.deleteCustomerById(custId);
	}

}

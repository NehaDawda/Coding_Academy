package com.lnt.customer_project.test;
import java.util.List;

import org.hibernate.SessionFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.lnt.customer_project.dao.CustomerDaoImpl;
import com.lnt.customer_project.dao.CustomerException;
import com.lnt.customer_project.dao.ICustomerDao;
import com.lnt.customer_project.model.Customer;
import com.lnt.customer_project.util.HibernateUtil;

/**
 * @author brije
 *
 */
public class TestCustomerDao {
	private Long custId;
	private Customer customer;
	private ICustomerDao customerDao;
	
	@BeforeClass
	public void testCustomerDao()throws CustomerException{
		customerDao= new CustomerDaoImpl();
		Assert.assertNotNull(customerDao, "customerDao object not obtained!!");
	}
	@Ignore
	@Test
	public void testAddCustomer()throws CustomerException{
		customer =new Customer("Justin", "justin@lnt.com", "9879879870");
		custId=customerDao.addCustomer(customer);
		Assert.assertTrue(custId>0);
	}
	@Ignore
	@Test
	public void testGetCustomerList()throws CustomerException{
		List<Customer> customerList=customerDao.getCustomerList();
		Assert.assertNotNull(customerList, "customerList is empty!!");
		for (Customer customer : customerList) {
			System.out.println(customer);
		}
	}
	@Ignore
	@Test
	public void testGetCustomerById()throws CustomerException{
		custId=44L;
		Customer customer=customerDao.getCustomerById(custId);
		Assert.assertNotNull(customer, "Customer not found!!");
		System.out.println(customer);
	}
	@Ignore
	@Test
	public void testDeleteCustomer()throws CustomerException{
		custId=44L;
		int result=customerDao.deleteCustomerById(custId);
		Assert.assertTrue(result>0,"Customer not deleted!!!");
		System.out.println("delete : "+result);
	}
	@Test
	public void testUpdateCustomer()throws CustomerException{
		Customer customer=customerDao.getCustomerById(8L);
		System.out.println("Customer before update :"+customer);
		customer.setCustName("Justin Fred");
		customer.setEmail("fred@gmail.com");
		customer.setPhone("6786786780");
		Customer updatedCustomer = customerDao.updateCustomer(customer);
		Assert.assertNotNull(updatedCustomer, "Customer not Not!!");
		System.out.println("updatedCustomer : "+updatedCustomer);
	}
}

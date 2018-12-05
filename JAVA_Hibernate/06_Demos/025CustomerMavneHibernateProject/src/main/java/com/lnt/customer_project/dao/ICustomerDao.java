/**
 * 
 */
package com.lnt.customer_project.dao;

import java.util.List;

import com.lnt.customer_project.model.Customer;

/**
 * @author Smita
 *
 */
public interface ICustomerDao {
	//CRUDS Operation
		public Long addCustomer(Customer customer)throws CustomerException;//C-create
		public List<Customer> getCustomerList()throws CustomerException;//R All Customer -retrieve
		public Customer getCustomerById(Long custId)throws CustomerException;//S-search
		public Customer updateCustomer(Customer customer)throws CustomerException;//U-update
		public int deleteCustomerById(Long custId)throws CustomerException;//D-delete
}

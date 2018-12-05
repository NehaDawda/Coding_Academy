/**
 * 
 */
package com.lnt.day14_reflection01;
/**
 * @author Smita
 *
 */
public class Customer {
	private int customerId;
	private String fname;
	private String lname;
	private String phone;
	
	public Customer() {
		System.out.println("Customer no_arg Constr");
	}

	public Customer(int customerId, String fname, String lname, String phone) {
		super();
		System.out.println("Customer Overoaded Constr");
		this.customerId = customerId;
		this.fname = fname;
		this.lname = lname;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", fname=" + fname + ", lname=" + lname + ", phone=" + phone + "]";
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}

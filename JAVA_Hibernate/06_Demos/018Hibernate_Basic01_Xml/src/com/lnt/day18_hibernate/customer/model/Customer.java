package com.lnt.day18_hibernate.customer.model;

/*
 *   create table  mycustomer
  (	
		custId float,
		custName varchar2(20),
		email varchar2(20),
		phone varchar2(20)
 );
 */
public class Customer {

	private Long custId;
	private String custName;
	private String email;
	private String phone;

	public Customer() {
		super();
	}

	public Customer(Long custId, String custName, String email, String phone) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.email = email;
		this.phone = phone;
	}

	public Long getCustId() {
		return custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", email=" + email + ", phone=" + phone + "]";
	}

}

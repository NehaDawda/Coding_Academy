package com.jpm.bank.app.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="BA_ACCOUNT")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="ACCOUNT_TYPE",discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue(value="ACCOUNT")
public class Account {
	
	@Id
	@Column(name="ACCOUNT_ID")
	private Long accountId;
	
	@Column(name="BALANCE")
	private double balance;

	@ManyToOne
	@JoinColumn(name="CUSTOMER_ID")
	private Customer customer;

	public Account() {
		super();
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", balance=" + balance + ", customerID=" + customer.getCustomerId() + "]";
	}
	
}

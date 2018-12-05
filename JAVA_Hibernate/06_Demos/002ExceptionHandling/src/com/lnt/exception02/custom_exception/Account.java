/**
 * 
 */
package com.lnt.exception02.custom_exception;

/**
 * @author Smita
 *
 */
public class Account {
	private int accNo;
	private String accHolderName;
	private double balance;

	// constructors
	public Account() {
		// TODO Auto-generated constructor stub
	}

	// overloaded constructor
	public Account(int accNo, String accHolderName, double balance) {
		super();
		this.accNo = accNo;
		this.accHolderName = accHolderName;
		this.balance = balance;
	}

	// getters and setters
	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	// toString() method - which return the object value in string format
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accHolderName=" + accHolderName + ", balance=" + balance + "]";
	}

	public void withdraw(double amount)throws LowBalanceException {
		if (balance <= amount) {
			//delegating the execution to the user defined exception class, 
			//the the method must be informed that the particular exception class will be handling the exception
			//using throws or try-catch block 
			throw new LowBalanceException("Amount can't be withdrawn as balance is low : " + checkBal());
		} else {
			balance -= amount;
			System.out.println("Amount withdrawn successfully , you current bal is : " + checkBal());
		}
	}

	public void deposit(double amount) {
		balance += amount;
		System.out.println("Amount deposited successfully , you current bal is : " + checkBal());
	}

	public double checkBal() {
		return balance;
	}

}

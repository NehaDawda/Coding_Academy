package com.lnt.core.week1.tanushree;

public class SavingsAccount extends Account{
	public final double  minBalance = 500;
	double bal;
	
	//parameterized constructor
	public SavingsAccount(String name, float age, double balance, double bal) {
		super(name, age, balance);
		this.bal = getBalance(); 
	}
	
	public SavingsAccount(double bal) {
		super();
		this.bal = bal;
	}

	public SavingsAccount() {
		super();
	}

	
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}
	public double getMinBalance() {
		return minBalance;
	}
	
	
	@Override
	public String toString() {
		return "SavingsAccount [minBalance=" + minBalance + ", bal=" + bal + "]";
	}
	
	public SavingsAccount getObject() {
		return new SavingsAccount();
	}
	
	

	@Override
	void details() {
		System.out.println("Name : "+getName()+ ", AccNo : "+getAccNo()+ ", age : "+getAge()+ ", Balalnce : "+getBalance());
	}

	@Override
	void withdraw(double amount) {
		//super.withdraw(amount);
		System.out.println("Amount to be withdrawn : "+amount);
		if(bal>=minBalance) {
			bal-=amount;
			System.out.println("Balance after withdrawl : "+bal);
		}
		else {
			System.out.println("but withdrawl is not possible with a min balance of < 500");
		}
	}
	
	
	



	
}
	

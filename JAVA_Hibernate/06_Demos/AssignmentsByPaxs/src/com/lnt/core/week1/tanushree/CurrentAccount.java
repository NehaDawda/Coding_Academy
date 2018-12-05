package com.lnt.core.week1.tanushree;

public class CurrentAccount extends Account{
	private final double overDraft = 1_00_000;
	private boolean overDraftLimit;
	double cBal;
	
	{
		cBal=getBalance();
	}
	public CurrentAccount() {
		super();
	}

	public CurrentAccount(String name, float age, double balance, boolean overDraftLimit) {
		super(name, age, balance);
		this.overDraftLimit = overDraftLimit;
	}
	
	public CurrentAccount(String name, float age, double balance) {
		super(name, age, balance);
	}

	public boolean isOverDraftLimit() {
		return overDraftLimit;
	}

	public void setOverDraftLimit(boolean overDraftLimit) {
		this.overDraftLimit = overDraftLimit;
	}

	public double getOverDraft() {
		return overDraft;
	}

	@Override
	public String toString() {
		return "CurrentAccount [overDraft=" + overDraft + ", overDraftLimit=" + overDraftLimit + "]";
	}

	@Override
	void withdraw(double amount) {
		if(amount>=overDraft) {
			System.out.println("Amount to be withdrawn : "+amount);
			cBal-=amount;
			overDraftLimit = true;
			System.out.println("Balance is : "+cBal);
			System.out.println("overDraftLimit has been reached : "+overDraftLimit);
		}
	}

	@Override
	void details() {
		System.out.println("Name : "+getName()+ ", AccNo : "+getAccNo()+ ", age : "+getAge()+ ", Balalnce : "+getBalance());
	}
	
	
	
	
	
	
	
	
	
}

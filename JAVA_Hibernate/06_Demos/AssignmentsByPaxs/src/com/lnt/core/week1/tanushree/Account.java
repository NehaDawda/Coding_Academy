package com.lnt.core.week1.tanushree;

public class Account extends Person{
		private long accNum;
		private double balance;
		private String accHolder;
		
		
		public Account() {
			super();
		}

		//parameterized constructor		
			public Account(String name, float age, double balance) {
			super(name, age);
			this.accNum = getAccNo();
			this.balance = balance;
			this.accHolder = getName();
		}


		@Override
		public String toString() {
			return "Account [accNum=" + accNum + ", balance=" + balance + ", accHolder=" + accHolder + "]";
		}

		
		
		//getters and setters
		public long getAccNum() {
			return accNum;
		}
		public void setAccNum(long accNum) {
			this.accNum = accNum;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		public String getAccHolder() {
			return accHolder;
		}
		public void setAccHolder(String accHolder) {
			this.accHolder = accHolder;
		}
		
		public Account getObject() {
			return new Account();
		}
		
		
		void deposit (double amount) {
			balance+=amount;
			System.out.println("Deposited amount is : "+amount+ " and current balance is  : "+balance);
		}
		
		void withdraw (double amount) {
			balance-=amount;
			System.out.println("Withdrawn amount is : "+amount+ " and current balance is  : "+balance);
		}
		
		void getBalance (double balance) {
			System.out.println("Balance is :"+balance);
		}
		
		void details () {
			//super.details();
			System.out.println("accHolder : "+getName()+	", accNum=" + accNum + ", balance=" + balance);
		}
}
 
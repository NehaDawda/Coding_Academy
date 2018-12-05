package com.lnt.core.week1.tanushree;

public class AccountMain {

	public static void main(String[] args) {
		
		System.out.println("=====Excercise 4.1======");
		
		Account p1 = new Account("Smith", 25, 2000);
		p1.details();
		p1.deposit(2000);
		System.out.println(p1);
		System.out.println("======================================");
		
		Account p2 = new Account("Kathy", 27, 3000);
		p2.details();
		p2.withdraw(2000);
		System.out.println(p2);
		System.out.println("======================================");

		/*SavingsAccount p3 = new SavingsAccount();
		System.out.println(p3);
		p3.withdraw(5000);*/

		System.out.println("===========Excercise 4.2==========");
		System.out.println("Savings Account");
		SavingsAccount p = new SavingsAccount("Sita", 30, 6000, 0);
		p.details();
		p.withdraw(600);
		
		System.out.println("======================================");
		System.out.println("Current Account");
		CurrentAccount c = new CurrentAccount("Gita", 45, 20);
		c.details();
		c.withdraw(200000);
		
	}

}

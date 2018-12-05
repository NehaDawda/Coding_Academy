package com.lnt.day13_thread04_inter_thread_communication;

public class AccessCustomerAccount {
	public static void main(String args[]) {
		 
		CustomerAccount acc1= new CustomerAccount();
		Thread t1 = new MomAccount(acc1);t1.setName("MomAccount Thread");
		Thread t2 = new DadAccount(acc1);t2.setName("DadAccount Thread");
		t1.start();
		t2.start();
	}
}

// thread 1
class MomAccount extends Thread {
	CustomerAccount acc1;
	public MomAccount(CustomerAccount acc1) {
		this.acc1= acc1;
	}
	public void run() {
		acc1.withdraw(15000);
	}
}

// thread 1
class DadAccount extends Thread {
	CustomerAccount acc1;
	public DadAccount(CustomerAccount acc1) {
		this.acc1= acc1;
	}
	public void run() {
		acc1.deposit(10000);
	}
}
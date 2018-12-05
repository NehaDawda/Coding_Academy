/**
 * 
 */
package com.lnt.day13_thread04_inter_thread_communication;

/**
 * @author brije
 *
 */
public class CustomerAccount {
	float balance = 10000.00f;
//wait, notify and notifyAll always works with synchronized environment
	synchronized void withdraw(int amount) {
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + "..going to withdraw...");

		if (this.balance < amount) {
			System.out.println("Less balance; waiting for dad to deposit the amount...");
			try {
				wait();//release the lock and the lock will be obtained y next waiting thread
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		this.balance -= amount;
		System.out.println(threadName + "..sufficient amount now ....withdrawal completed...");
	}

	synchronized void deposit(int amount) {
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + "..going to deposit...");
		this.balance += amount;
		System.out.println(threadName + "..deposit completed... ");
		notify();//current waiting thread will be notified
		System.out.println(threadName + "..notified waiting thread (MOM) that deposit completed... ");
	}
}
/**
 * 
 */
package com.lnt.day13_thread02_synchronized_method;

/**
 * @author brije
 *
 */
// Shared Resource
public class SynchronizedPrinter {
	/*
	 * Synchronized method is used to lock an object for any shared resource.

When a thread invokes a synchronized method, it automatically acquires the lock 
for that object and releases it when the thread completes its task.
	 */
	// printing table of any number passed
	synchronized void printTable(int n) {// method not synchronized
		
		String threadName=Thread.currentThread().getName();
		System.out.println(threadName+" -> accessing the printTable()\n");
		System.out.println(threadName+" -> acquired the lock or monitor ...started printing table\n" );
		for (int i = 1; i <= 10; i++) {
			System.out.println(threadName+ " : "+n * i);
			try {
				Thread.sleep(400);// 0.4 secs
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println(threadName+" -> releasing the lock or monitor ...finished printing table\n" );
	}
}

class Desktop1 extends Thread {
	SynchronizedPrinter printer;

	public Desktop1(SynchronizedPrinter printer) {
		this.printer = printer;
	}

	public void run() {
		printer.printTable(9);
	}

}
class Desktop2 extends Thread {
	SynchronizedPrinter printer;

	public Desktop2(SynchronizedPrinter printer) {
		this.printer = printer;
	}

	public void run() {
		printer.printTable(100);
	}
}
class Desktop3 extends Thread {
	SynchronizedPrinter printer;

	public Desktop3(SynchronizedPrinter printer) {
		this.printer = printer;
	}

	public void run() {
		printer.printTable(2);
	}
}
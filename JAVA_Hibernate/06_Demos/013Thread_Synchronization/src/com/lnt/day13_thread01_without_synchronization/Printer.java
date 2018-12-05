/**
 * 
 */
package com.lnt.day13_thread01_without_synchronization;

/**
 * @author brije
 *
 */
// Shared Resource
public class Printer {
	// printing table of any number passed
	void printTable(int n) {// method not synchronized
		String threadName=Thread.currentThread().getName();
		for (int i = 1; i <= 10; i++) {
			System.out.println(threadName+ " : "+n * i);
			try {
				Thread.sleep(400);// 0.4 secs
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

class Desktop1 extends Thread {
	Printer printer;

	public Desktop1(Printer printer) {
		this.printer = printer;
	}

	public void run() {
		printer.printTable(9);
	}

}
class Desktop2 extends Thread {
	Printer printer;

	public Desktop2(Printer printer) {
		this.printer = printer;
	}

	public void run() {
		printer.printTable(100);
	}
}
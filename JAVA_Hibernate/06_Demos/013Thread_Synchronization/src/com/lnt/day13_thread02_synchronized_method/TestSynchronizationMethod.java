/**
 * 
 */
package com.lnt.day13_thread02_synchronized_method;

/**
 * @author brije
 *
 */
public class TestSynchronizationMethod {
	public static void main(String args[]) {
		SynchronizedPrinter printer = new SynchronizedPrinter();// only one object
		// both desktop1 and desktop2 is sharing the same printer resource
		Thread t1 = new Desktop1(printer);t1.setName("Desktop-1");
		Thread t2 = new Desktop2(printer);t2.setName("Desktop-2");
		Thread t3 = new Desktop3(printer);t3.setName("Desktop-3");
		t1.start();
		t2.start();
		t3.start();
	}
}

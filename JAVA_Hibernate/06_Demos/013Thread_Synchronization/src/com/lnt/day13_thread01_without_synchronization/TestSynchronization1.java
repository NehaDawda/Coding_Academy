/**
 * 
 */
package com.lnt.day13_thread01_without_synchronization;

/**
 * @author brije
 *
 */
public class TestSynchronization1 {
	public static void main(String args[]) {
		Printer printer = new Printer();// only one object
		// both desktop1 and desktop2 is sharing the same printer resource
		Thread t1 = new Desktop1(printer);t1.setName("Desktop1");
		Thread t2 = new Desktop2(printer);t2.setName("Desktop2");
		t1.start();
		t2.start();
	}
}

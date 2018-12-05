/**
 * 
 */
package com.lnt.day13_thread06_deadlock;

/**
 * @author brije
 *
 */
public class TestDeadlockExample {
	public static void main(String[] args) {
		final String pvr = "ratan jaiswal";
		final String phoenix = "vimal jaiswal";
		// t1 tries to lock pvr then phoenix
		Thread t1 = new Thread() {
			public void run() {
				synchronized (pvr) {
					System.out.println(pvr+" Thread 1: waiting at  pvr 1");

					try {
						Thread.sleep(100);
					} catch (Exception e) {
						e.printStackTrace();
					}

					synchronized (phoenix) {
						System.out.println(phoenix+ "Thread 1: waiting at  phoenix 2");
					}
				}
			}
		};

		// t2 tries to lock phoenix then pvr
		Thread t2 = new Thread() {
			public void run() {
				synchronized (phoenix) {
					System.out.println(phoenix+" Thread 2: waiting at  phoenix 2");

					try {
						Thread.sleep(100);
					} catch (Exception e) {
						e.printStackTrace();
					}

					synchronized (pvr) {
						System.out.println(pvr+"T hread 2: waiting at  pvr 1");
					}
				}
			}
		};

		t1.start();
		t2.start();
	}
}
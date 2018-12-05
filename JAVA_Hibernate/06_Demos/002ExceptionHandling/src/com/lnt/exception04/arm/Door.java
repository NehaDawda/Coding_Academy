/**
 * 
 */
package com.lnt.exception04.arm;

/**
 * @author brije
 *
 */
public class Door implements AutoCloseable{
	public void open() {
		System.out.println("Opening the door ....!");
	}
	@Override
	public void close() {
		System.out.println("Closing the door ....!");
	}
}

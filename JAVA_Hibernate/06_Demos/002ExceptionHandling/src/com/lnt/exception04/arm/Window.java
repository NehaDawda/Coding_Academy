/**
 * 
 */
package com.lnt.exception04.arm;

/**
 * @author Smita
 *
 */
public class Window implements AutoCloseable{
	public void open() {
		System.out.println("Opening the Window ....!");
	}
	public void close() {
		System.out.println("Closing the Window ....!");
	}
}

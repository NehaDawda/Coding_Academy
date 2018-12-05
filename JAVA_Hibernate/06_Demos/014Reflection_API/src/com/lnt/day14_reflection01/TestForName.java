/**
 * 
 */
package com.lnt.day14_reflection01;

/**
 * @author brije
 *
 */
public class TestForName {
	
	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		// How to dynamically load the class (at runtime)
		Class myClass = Class.forName("com.lnt.day14_reflection01.Person");
		//Class.forName() throws ClassNotFoundException
		System.out.println("The Dynamically loaded class is :"+myClass.getName());
	}

}

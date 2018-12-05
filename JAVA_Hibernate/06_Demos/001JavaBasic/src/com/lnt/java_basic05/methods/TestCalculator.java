/**
 * 
 */
package com.lnt.java_basic05.methods;

/**
 * @author Smita
 *
 */
public class TestCalculator {

	public static void main(String[] args) {
		// how to create object in java - by using new keyword
		//in order to invoke a method , we need the object of the specific class
		int i;
		Calculator c1 = new Calculator();//c1 is the instance of the class i.e object of a class
		//dot '.' operator which is used to invoke a method using objectName.methodName
		System.out.println("Sum of two integer : "
		+c1.add(10, 20));
		//calling multiply method of Calculator class
		c1.multiply(10, 20);
		//calling multiply method of Calculator class
		c1.display();
	}
	

}

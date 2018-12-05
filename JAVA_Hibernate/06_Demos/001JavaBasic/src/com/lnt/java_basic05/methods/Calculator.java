/**
 * 
 */
package com.lnt.java_basic05.methods;

/**
 * @author Smita
 *
 */
//top level class in java must be marked as public
public class Calculator {
	public int add(int n1, int n2) {
		int sum = n1+ n2;
		return sum;
	}
	//error - only changing th return type of the method is not overloading
	/*public double add(int n1, int n2) {
		int sum = n1+ n2;
		return sum;
	}*/
	//method Overloading 
	/*
	 * same method name with different signature/arguments list
	 * 1> different number of arguments
	 * 2> different data type of arguments
	 * 3> different sequence of arguments
	 * note : return type dosen't affects the method overloading
	 */
	public double add(double n1, int n2) {//different data type of arguments
		double sum = n1+ n2;
		return sum;
	}
	public double add(int n1, double n2) {//different sequence of arguments
		double sum = n1+ n2;
		return sum;
	}
	public int add(int n1, int n2,int n3) {//different number of arguments
		int sum = n1+ n2+n3;
		return sum;
	}
	public void multiply(int n1, int n2) {
		int result = n1*n2;
		System.out.println("Multiplication of two integer : "+result);
	}
	//method which does not have any parameters list can have empty parenthesis
	public void display() {
		System.out.println("displaying Calculator....");
	}
}

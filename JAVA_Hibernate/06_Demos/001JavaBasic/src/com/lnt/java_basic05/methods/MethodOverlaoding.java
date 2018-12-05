/**
 * 
 */
package com.lnt.java_basic05.methods;

/**
 * @author Smita
 *
 */
//top level class in java must be marked as public
public class MethodOverlaoding {
	public int add(int n1, int n2) {
		int sum = n1+ n2;
		return sum;
	}
	//error - only changing the return type of the method is not overloading
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
}

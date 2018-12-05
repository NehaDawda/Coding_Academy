/**
 * 
 */
package com.lnt.day8.interafces.print;

/**
 * @author Smita
 *
 */
//Create an interface which will have a print method to print the object
public interface IPrintable {
	int MAX_COPIES=10;//by default all var in an interface are public,static and final
	//what is final variable......final variable must be initialized and cannot be re-initialized
	public void print();
}
/* Interfaces till JAVA 7
 * 1> an interface are pure abstract class in java , i.e it cannot be instantiated,
 * 2> by default all interface are abstract
 * 3> by default in interface all method are public and abstract
 * 4> by default in interface all variable are public ,static and final
 * 5> a class can implement many interfaces at a time
 * 6> golden rule- a class implementing an interface must override all the method
 * 7> no constructor in an interface
 * 8> no concrete methods 
 * 
 */

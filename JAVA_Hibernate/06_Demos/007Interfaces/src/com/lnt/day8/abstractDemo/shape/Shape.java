/**
 * 
 */
package com.lnt.day8.abstractDemo.shape;

import com.lnt.day8.interafces.print.IPrintable;

/**
 * @author Smita
 *
 */
//how to create an abstract class , by marking it will a non-access specifies 'abstract'
//abstract class cannot be instantiated
//abstract class is used to be further extended , in order to achieve inheritance and polymorphism
public abstract class Shape implements IPrintable {
	
	//abstract class can have both abstract method as well as concrete method (method with body)
	public abstract double area();
	public abstract void print();
	//abstract method has no body i.e no implementation
	//marked with abstract keyword
	//terminated with a semicolon , no body i.e no braces {}
	//abstract method is used for further implementation/overridden by the extended class as per its requirement
	
	//abstract class can also have concrete method(method with body)
	public void classInfo() {
		System.out.println("Its is a Shape class....");
	}
	//abstract class can have constructors too...
	public Shape() {
		System.out.println("Shape No-Arg Constructor......");
	}
}

/**
 * 
 */
package com.lnt.day8.abstractDemo.shape.square;

import com.lnt.day8.abstractDemo.shape.Shape;

/**
 * @author Smita
 *
 */
//golden rule of an abstract class 
//- a class extending an abstract class must override all the abstract method
//or declare the class itself as abstract class
public class Square extends Shape {
	
	private float sides;
	public Square() {
		System.out.println("Square No-Arg Constructor......");
	}
	//overloaded constructor
	public Square(float sides) {
		super();
		System.out.println("Square overloaded Constructor......");
		this.sides = sides;
	}

	/* (non-Javadoc)
	 * @see com.lnt.day8.abstractDemo.Shape#area()
	 */
	@Override
	public double area() {
		float result=sides* sides;
		System.out.println("Area of a Square is : "+result);
		return result;
	}
	@Override
	public void print() {
		System.out.println("Printing a Square with a sides of :"+sides 
				+ "  and Area of a Square is : "+area());
		
	}
	//compiler will not force to override non-abstract or concrete method, i.e
	//you may or may not override concrete method
	@Override
	public void classInfo() {
		System.out.println("Its is a Square class....");
	}
	
}

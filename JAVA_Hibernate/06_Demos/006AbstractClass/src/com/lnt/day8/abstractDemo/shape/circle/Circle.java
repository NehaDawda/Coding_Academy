/**
 * 
 */
package com.lnt.day8.abstractDemo.shape.circle;

import com.lnt.day8.abstractDemo.shape.Shape;

/**
 * @author Smita
 *
 */
//golden rule of an abstract class 
//- a class extending an abstract class must override all the abstract method
//or declare the class itself as abstract class
public class Circle extends Shape {
	private static final float PI =3.14f;
	private float radius;
	public Circle() {
		System.out.println("Circle No-Arg Constructor......");
	}
	//overloaded constructor
	public Circle(float radius) {
		super();
		System.out.println("Circle overloaded Constructor......");
		this.radius = radius;
	}

	/* (non-Javadoc)
	 * @see com.lnt.day8.abstractDemo.Shape#area()
	 */
	@Override
	public double area() {
		float result=PI*radius*radius;
		System.out.println("Area of a circle is : "+result);
		return result;
	}
	@Override
	public void print() {
		System.out.println("Printing a circle with a radius of :"+radius 
				+" and PI value : "+PI
				+ "  and Area of a circle is : "+area());
		
	}
	//compiler will not force to override non-abstract or concrete method, i.e
	//you may or may not override concrete method
	@Override
	public void classInfo() {
		System.out.println("Its is a Circle class....");
	}
	
}

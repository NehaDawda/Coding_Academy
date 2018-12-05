/**
 * 
 */
package com.lnt.day8.abstractDemo.client;

import com.lnt.day8.abstractDemo.shape.Shape;
import com.lnt.day8.abstractDemo.shape.circle.Circle;
import com.lnt.day8.abstractDemo.shape.square.Square;

/**
 * @author Smita
 *
 */
public class ShapeClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// abstract class cannot be instantiated... i.e we cannot create an object of abstract class
		//compilation error//Shape shape = new Shape();
		Shape shape;//reference variable of type SHape
		
		shape = new Circle(4.5f);//creating the object of Circle class on the reference of its superclass Shape
		//and passing the radius value in float
		
		//lets invoke circle class method of shape reference
		shape.area();
		shape.print();
		shape.classInfo();
		
		//lets create an object of Square class with a reference of Shape class
		shape = new Square(6.3f);//and passing the sides value in float and creating Square object
		//lets invoke square class method of shape reference
		shape.area();//compile will decide at runtime which area() method has to be invoked
		//dynamic polymorphism 
		shape.print();
		shape.classInfo();

	}

}

/**
 * 
 */
package com.lnt.java_basic07.constructor;

/**
 * @author Smita
 *
 */
public class TestPerson {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// lets create person object and invoke print method
		Person p1 = new Person();
		//invoking a constructor then a java compiler provide/generates a default constructor
		//if a programmer does not provide any constructor
		p1.print();
		
		//lets create another Person Object
		Person p2 = new Person();
		p2.print();
		//lets create another Person Object
		Person p3 = new Person();
		p3.print();
		//creating person obj by calling overlaoded constructor
		Person p4 = new Person(101, "Zara", "Khan", "9879879876", "zara@gmail.com");
		p4.print();
		//compilation error
		//p4.phoneNo="9876980000";//private cannot be accessed outside the class
		//in certain scenarios when we want to provide access to private var outside the class
		//we have a concept of accessor and mutator also known as getters and setters method
		p4.setPhoneNo("9876980000");
		System.out.println("Phone number of "+p4.getFirstName()+ " has been modified : "+p4.getPhoneNo());
	}

}

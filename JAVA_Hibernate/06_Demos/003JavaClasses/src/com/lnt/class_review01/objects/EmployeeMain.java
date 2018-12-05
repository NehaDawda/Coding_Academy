/**
 * 
 */
package com.lnt.class_review01.objects;
import java.util.Date;/** * @author Smita * */
public class EmployeeMain {
	public static void main(String[] args) {
		// lets create a object of Employee
		Employee e1 = new Employee();//calling no-arg constructor
		//whenever we try to print an object, there is callback made to toString() method
		//if there is no toSTring() method in employee class then it invokes the toSTring() method of Object class
		System.out.println(e1);
		e1.setFirstName("Zara");
		e1.setLastName("Khan");
		e1.setEmail("zara@gmail.com");
		e1.setPhoneNo("9879879876");
		e1.setDoj(new Date(11,11,2001));
		System.out.println("e1 after setting the values");
		System.out.println(e1);
		// lets create a object of Employee
		Employee e2 = new  Employee("Sia", "Gupta", "7897897890", "sia@gmail.com", new Date());
		//calling constructor with fields i.e overloaded constructor
		System.out.println("e2 create calling constructor with fields");
		System.out.println(e2);
	}
}

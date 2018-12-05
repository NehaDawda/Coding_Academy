/**
 * 
 */
package com.lnt.class_encapsulation01.client;
import com.lnt.class_encapsulation01.model.emp.Employee;
import com.lnt.class_encapsulation01.model.emp.manager.Manager;
/**
 * @author Smita
 *
 */
public class EmployeeClient {
	public static void main(String[] args) {
		Employee e1 = new Employee("Zara", "88767", 999.99);//created an object of employee class with the help of new keyword
		//reference of  Employee and the actual object is of Employee
		//e1.print();//invoking a method of employee class with the help of '.' dot operator
		e1=new Manager("Sia", "9h98909", 9999.99, "IT");//polymorphism
		//reference of superclass Employee and the actual object is of Manager		
		e1.print();	//different object responding to same method differently 
		//if print method is not there in employee class then , 
		//it will give compilation error, as the reference 'e1'
		//if of superclass employee so it will first goto employee class 
		//and checks for print method , 
		//then if present then check for subclass manager print method , 
		//if print() is there in manager the invoked manager print() method
		//if print() not overridden in Manager class then invoked Employee class print()
	}

}


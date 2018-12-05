/**
 * 
 */
package com.lnt.class_inheritance01.main;
import java.util.Date;

import com.lnt.class_inheritance01.model.emp.Employee;
import com.lnt.class_inheritance01.model.emp.manager.Manager;
import com.lnt.class_inheritance01.model.emp.manager.sales.SalesManager;/** * @author Smita * */
public class EmployeeMain {
	public static void main(String[] args) {		
		/*// lets create a object of Employee
		Employee e2 = new  Employee("Sia", "Gupta", "7897897890", "sia@gmail.com",9999.99, new Date());
		//calling constructor with fields i.e overloaded constructor
		System.out.println("e2 create calling constructor with fields");
		System.out.println(e2);
	*/
		//at the time of creation of sub-class object , the call to constructor is from super-class to sub-class
		/*Manager m1 =new Manager();
		System.out.println(m1);*/
		
		/*SalesManager sm1 = new SalesManager();
		System.out.println(sm1);*/
		Manager m2 = new Manager("Om", "Kapoor", "768768990", "om@gmail.com", 9999.99, new Date(), "Training", 888);
		//System.out.println(m2);
		m2.print();
		
		SalesManager sm2 = new SalesManager("Sia", "Gupta", "7897897890", "sia@gmail.com",9999.99, new Date(), "IT", 999, 99);
		sm2.print();
	}
}

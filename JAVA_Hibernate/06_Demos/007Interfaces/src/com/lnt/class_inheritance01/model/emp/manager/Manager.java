/**
 * 
 */
package com.lnt.class_inheritance01.model.emp.manager;

import java.util.Date;

import com.lnt.class_inheritance01.model.emp.Employee;
//we can import only public class
/**
 * @author Smita
 *
 */

//inheritance in java with extends keyword , we can extends from only one class at a time in java
public class Manager extends Employee {//we created a class Manager which is subclass/child class of employee
	//it inherits all the properties and method of superclass /parent class
	/*private int empId;
	private String firstName;
	private String lastName;
	private String phoneNo;
	private String email;
	private double salary;
	private Date doj;//date of joining
*/	private String deptName;
	private double bonus;
	//no-arg consstructor
	public Manager() {
		super();//by default super is available and giving a call to super class no-arg constructor
		System.out.println("****no_arg Manager constuctor ****executed for every object created using default constructor ");
	}
	//overloaded constructors
	
	@Override
	public String toString() {//super keyword is used to invoke super class method or constructor
		return   super.toString()+ ", " + "deptName=" + deptName + ", bonus=" + bonus;
	}
	public Manager(String firstName, String lastName, String phoneNo, String email, double salary, Date doj,
			String deptName, double bonus) {
		super(firstName, lastName, phoneNo, email, salary, doj);//calling super class overloaded constructor
		System.out.println("****Overloaded Manager constuctor ****executed for every object created using Overloaded constructor ");
		this.deptName = deptName;
		this.bonus = bonus;
	}
	//getters and setters
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
//covariant return , where the return type of a overridden method in subclass can return the subclass type
	@Override
	public Manager getObject() {
		// TODO Auto-generated method stub
		return new Manager();
	}

	@Override//getsaly mthod to calculate the manager salary (salary+bonus)
	public double getSalary() {
		// TODO Auto-generated method stub
		double totalSal=super.getSalary()+bonus;
		super.setSalary(totalSal);
		return totalSal;
	}

	@Override//method of superclass overridden or re-written in the sub-class to provide different implementation
	//annotations in java which is used to convey additional information 
	//about the code to the compiler as well as the programmer
	//annotations start with @
	public void print() {
		// TODO Auto-generated method stub
		super.print();//super class print method
		System.out.println("			Manager Department  : "+deptName
		           +"\n                        Manager Bonus        : "+bonus
		           +"\n__________________________________________________________________________\n");
	}
}

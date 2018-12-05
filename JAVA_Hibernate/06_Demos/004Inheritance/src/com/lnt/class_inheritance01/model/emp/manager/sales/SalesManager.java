/**
 * 
 */
package com.lnt.class_inheritance01.model.emp.manager.sales;

import java.util.Date;

import com.lnt.class_inheritance01.model.emp.manager.Manager;

/**
 * @author Smita
 *
 */
public class SalesManager extends Manager{
	/*private int empId;
	private String firstName;
	private String lastName;
	private String phoneNo;
	private String email;
	private double salary;
	private Date doj;//date of joining
	private String deptName;
	private double bonus;*/
	private double commission;
	//no-arg consstructor
	public SalesManager() {
		super();
		//by default super() is available in constructor, whether u write it or not
		//super keyword is used to call super class constructor or method
		//call to constructor using super must be the first statement of constructor code
		System.out.println("****no_arg SalesManager constuctor ****executed for every object created using default constructor ");
		
	}
	
	public SalesManager(String firstName, String lastName, String phoneNo, String email, double salary, Date doj,
			String deptName, double bonus, double commission) {
		super(firstName, lastName, phoneNo, email, salary, doj, deptName, bonus);
		System.out.println("****Overloaded SalesManager constuctor ****executed for every object created using Overloaded constructor ");
		this.commission = commission;
	}
	//covariant return , where the return type of a overridden method in subclass can return the subclass type
	@Override
	public SalesManager getObject() {
		// TODO Auto-generated method stub
		return new SalesManager();
	}
	@Override//getsaly mthod to calculate the manager salary (salary+bonus)
	public double getSalary() {
		// TODO Auto-generated method stub
		double totalSal=super.getSalary()+commission;
		super.setSalary(totalSal);
		return totalSal;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("                       SalesManager commission  : "+commission
		           +"\n__________________________________________________________________________\n");
	}

	@Override
	public String toString() {//super keyword is used to invoke super class method or constructor
		return   super.toString()+ ", " + "commission=" + commission ;
	}
	//getters and setters
	public double getCommission() {
		return commission;
	}
	public void setCommission(double commission) {
		this.commission = commission;
	}
	
	
}

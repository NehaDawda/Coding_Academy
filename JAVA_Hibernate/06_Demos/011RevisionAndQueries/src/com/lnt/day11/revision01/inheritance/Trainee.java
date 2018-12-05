/**
 * 
 */
package com.lnt.day11.revision01.inheritance;
//layman term package is just a folder/directory where you will keep related classes and interfaces
//step 1: package statement - one or none
//step 2: import statement - many or none
/**
 * @author Smita
 *
 */
//step 3:public class
public class Trainee implements Comparable<Trainee>{//class is structure or a blue print to create same type of obj
	//proeprties/attributes/instance variable .... 
	//instance variable are used by the object to store its state. are declared outside the method declaration.
	//all instance/object have their own copy of instance variable
	//step 4:instance variable
	protected int traineeId;
	protected String fname;
	protected String lname;
	protected String phone;
	protected String email;
	
	//step 5:static variable- single copy per class ,sharable variable,class variable
	protected static final String CO_NAME ;//final is used to declared constant in java,
	//final var name is all in UPPERCASE
	//final variable must be initialized and cannot be re-initialized
	static {//static initialize block- used to declare only static varible
		CO_NAME="Lnt Infotech";
		System.out.println("***************Trainee static init block");
	}
	//what is constructor- used to initialize newly created object
	//no_arg constructor
	//parameterized constructor/ overloaded constructor
	//same name of the class
	//no return type
	public Trainee() {
		System.out.println("***************Trainee No-Arg Constructor");
		this.traineeId = 0;
		this.fname = "unknown";
		this.lname = "unknown";
		this.phone = "unknown";
		this.email = "unknown";
	}
	public Trainee(int traineeId, String fname, String lname, String phone, String email) {
		super();//what is role of super
		System.out.println("***************Trainee overloaded Constructor");
		this.traineeId = traineeId;
		this.fname = fname;
		this.lname = lname;
		this.phone = phone;
		this.email = email;
	}
	public void print() {
		System.out.println( "___________________________________________________________________________\n"
				   +"\n                         Trainee Details                                  \n"						   
		           +"___________________________________________________________________________\n"
		           +"\n 			Trainee Id    : "+traineeId
		           +"\n 			First Name   : "+fname
		           +"\n 			Last Name    : "+lname
		           +"\n 			Phone Number : "+phone
		           +"\n 			Email        : "+email
		           +"\n 			Company Name : "+CO_NAME
		           +"\n__________________________________________________________________________\n");
	}
	@Override
	public String toString() {//return the string representation of the object , callback method
		//whenever we try print an object , a callback is given to toString() method
		//automatically the toString() method will be invoked
		return "Trainee [traineeId=" + traineeId + ", fname=" + fname + ", lname=" + lname + ", phone=" + phone
				+ ", email=" + email + "]";
	}
	//overriding say 
	/* 1>same method name, 
	 * 2>same arg-list, 
	 * 3>same return type, only the method implementation/method body will change in sub class
	 * 4> return type in case of inheritance may be covariant i.e can be of subtype
	 */
	
	public Trainee searchTraineeById(int traineeId) {
		Trainee t1 = new Trainee(traineeId, "Zara", "Khan", "9879879870", "zara@lnt.com");
		return t1;
	}/*
	public Trainee searchTraineeByFirstName(String fname) {
		Trainee t1 = new Trainee(traineeId, fname, "Khan", "9879879870", "zara@lnt.com");
		return t1;
	}*/
	@Override
	public int compareTo(Trainee o) {
		// TODO Auto-generated method stub
		return this.traineeId-o.traineeId;
	}
}

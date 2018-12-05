/**
 * 
 */
package com.lnt.java_basic07.constructor;

/**
 * @author Smita
 *
 */
//structure or a blueprint of an object is known as class
//all the top level class in java must be public
public class Person {
	//list if properties/attributes/instance variables
	//all the instance variables must be marked as private
	//all instance variables have a default value
	private int personId;//unique id //default value for int is 0
	private String firstName;//default value for String/any Object is null
	private String lastName;
	private String phoneNo;
	private String email;
	private static String coName;//sharable variable, single copy per class
	//all instance have their own copy of instance variable
	//inorder to initialize static variable , we have static initializer block/static init block
	static {
		//use to initialize only static variable, invoked before constructor
		System.out.println("static initializer block.....");
		System.out.println("...use to initialize only static variable, invoked before constructor... and only once");
		coName="Lnt Infotech";
		//email="smita@gmail.com";//compilation error , can't access any non-static var
	}
	public Person() {
		// constructor is a special kind of method 
		/*
		 * 1> which has the same name of the class name
		 * 2> no return type, that is does not return anything not also void
		 * 3> used to initialize the newly created object
		 * 4> can be overloaded/ can have argument list
		 * 5> cannot be inherited
		 * 6> can have access modifiers
		 * 7> can throw exceptions
		 */
		System.out.println("No Argument constructor of Person class..... invoked for every object");
		personId=0;
		firstName="unknown";
		lastName="unknown";
		phoneNo="not mentioned";
		email="not mentioned";
		
	}
	//local variable -passed through arg list or defined within the method
	//local var name and instance var name are same
	//in such case we use explicitly this keyword to refer to instance var
	public Person(int personId, String firstName, String lastName, String phoneNo, String email) {
		super();//Inheritance 
		this.personId = personId;//this is a keyword which refers to current object in java
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
		this.email = email;
	}

	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public static String getCoName() {
		return coName;
	}
	public static void setCoName(String coName) {
		Person.coName = coName;
	}
	public void print() {
		System.out.println( "___________________________________________________________________________\n"
						   +"\n                         Person Details                                  \n"						   
				           +"___________________________________________________________________________\n"
				           +"\n 			Person Id    : "+personId
				           +"\n 			First Name   : "+firstName
				           +"\n 			Last Name    : "+lastName
				           +"\n 			Phone Number : "+phoneNo
				           +"\n 			Email        : "+email
				           +"\n 			Company Name : "+coName
				           +"\n__________________________________________________________________________\n");
	}
}

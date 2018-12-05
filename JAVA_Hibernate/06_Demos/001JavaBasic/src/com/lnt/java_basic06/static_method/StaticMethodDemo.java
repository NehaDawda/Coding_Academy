/**
 * 
 */
package com.lnt.java_basic06.static_method;

/**
 * @author brije
 *
 */
public class StaticMethodDemo {

	private int id;
	private String name;
	private static String coName;
	//static method
	public static void setDetails() {
		coName="Lnt";//access static member directly
		//compilation errror
		//name="smita";//non static members cannot be accessed within static method/ context
		
	}//non-static method, both static and non-static members can be accesses
	public void print() {
		System.out.println( "___________________________________________________________________________\n"
						   +"\n                         Information Details                                  \n"						   
				           +"___________________________________________________________________________\n"
				           +"\n 		           Id    : "+id
				           +"\n 			      Name   : "+name
				           +"\n 			Company Name : "+coName
				           +"\n__________________________________________________________________________\n");
	}
	public static void main(String[] args) {
		//static method are called/invoked using className.methodName
		StaticMethodDemo.setDetails();
		StaticMethodDemo s1 = new StaticMethodDemo();
		//objectName.methodName
		s1.print();
		s1.setDetails();//static method using object reference then it gives a warning
	}

}

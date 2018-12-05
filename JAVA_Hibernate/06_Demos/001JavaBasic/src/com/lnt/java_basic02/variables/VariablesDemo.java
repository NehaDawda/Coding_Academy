/**
 * 
 */
package com.lnt.java_basic02.variables;

/**
 * @author Smita
 *
 */
public class VariablesDemo {
	
	public static void main(String[] args) {
		//local variable are declared within a method or passed through parameters of methods
		//local variable can be used only within the method boundary
		byte option=0b0100_0010;//binary literal must be prefixed by '0b' or '0B'
		short age=1;
		int zipCode=1;
		long phoneNo=98765987651L;//long literals must be suffixed by 'l' or 'L'
		float height=5.5f;
//all decimal are by default double, that y float literals must be suffixed by 'f' else compilation error
		double salary=9999.99;
		char gender='F';//single quotes
		boolean status=true;
		System.out.println("The status is : "+status);
		// print all the variables as a practice
		//local variable must be initialized before used, bcoz it doesn't have any default value
		char grade='A';
		System.out.println("The grade is : "+grade);//compilation error if var not initialized
		
		String fname="Zara";//double quotes
		//String are class in java , every ClassName is in PascalCase
		//it can be declared and used as primitives, that no compulsion of using new keyword to declare String object
		System.out.println("HEllo : "+fname);
		int amount=1_00_000;// amount = 1,00,000
		System.out.println("Amount : "+amount);
		String lname="Khan";//string can be treated as prmitives also
		
		String str1 = new String("Hello"); 
		String fullName=fname+lname;
		System.out.println("FullName : "+fullName);
	}

}

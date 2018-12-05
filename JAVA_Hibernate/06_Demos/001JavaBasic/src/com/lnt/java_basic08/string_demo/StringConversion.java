/**
 * 
 */
package com.lnt.java_basic08.string_demo;

/**
 * @author SMita
 *
 */
public class StringConversion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String paymentMode="1";//number
		
		
		int mode=Integer.parseInt(paymentMode);//String to int
		System.out.println("Mode of payment is: "+mode);
		String age="99";//if the string is not a number then it will throw  java.lang.NumberFormatException:
		Integer ageObj = Integer.valueOf(age);
		System.out.println("Integer.valueOf(age): "+ageObj);//string to Integer using valueOf
		
		//boxing and unboxing
		//auto-boxing- converts primitive to object
		//auto-unboxing- converts object to primitive
		/*  •	Float.parseFloat()
			•	Float.valueOf()
			•	new Float()
			*/
		String salary="9999.99";//decimal
		System.out.println("parseFloat : "+Float.parseFloat(salary));
		
		String numberAsString = "153";//must be a number else will throw NumberFormatException
		//implicit type casting in case of int to float 
		Float number = Float.valueOf(numberAsString);
		System.out.println("The number is: " + number);
		//3rd way
		Float floatObject = new Float(numberAsString);
		 System.out.println("floatObject: " + floatObject);


		
	}

}

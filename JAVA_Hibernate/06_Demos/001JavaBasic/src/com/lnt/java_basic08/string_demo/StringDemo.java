/**
 * 
 */
package com.lnt.java_basic08.string_demo;

/**
 * @author Smita
 *
 */
public class StringDemo {
	public static void main(String[] args) {
		String str1  =  new String("lnt");//lnt
		char[] chArr = {'l', 'n', 't'};
		String str2  =  new String(chArr);//lnt
		
		System.out.println("str1.equals(str2) : "+str1.equals(str2));//.equals() compares value
		System.out.println("str1==(str2) : "+str1==str2);//== compares references
		
		String str3 ="India";
		String str4 ="India";
		System.out.println("str4.equals(str3) : "+str4.equals(str3));//.equals() compares value
		boolean status = (str4==str3);
		System.out.println("str4==(str3) : "+status);//== compares references

	}

}





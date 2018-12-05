/**
 * 
 */
package com.lnt.java_basic08.string_demo;

/**
 * @author Smita
 *
 */
public class StringAreInmmutable {
	public static void main(String[] args) {
		String coName  = "lnt";
		System.out.println("coName : "+coName);
//whenever an object is created in java, every object gets a unique code known as hashcode
		System.out.println("coName hashcode : "+coName.hashCode());
		coName+="Infotech";
		//any chages made to a string object creates a new object , that is string are immutable in java
		System.out.println("Altered coName : "+coName);
		System.out.println("Altered coName hashcode : "+coName.hashCode());
	}

}





/**
 * 
 */
package com.lnt.exception02.throws_demo;

/**
 * @author Smita
 *
 */
public class ThrowsDemo {
	public static void main(String[] args) throws ClassNotFoundException {
		String className="com.lnt.exception02.throws_demo.ThrowsDemo";
		//try {
			Class.forName(className);
			System.out.println("Class Loaded successfully!");
			//double div=10/0;//unchecked exception , it will be checked at runtime
		/*} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("\"Class not Loaded !\"");
		}*///forName method is used to load the class dynamically
		//throws compileTime Exception
		
	}
}

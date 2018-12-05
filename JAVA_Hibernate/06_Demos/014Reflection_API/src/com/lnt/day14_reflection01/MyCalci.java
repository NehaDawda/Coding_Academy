/**
 * 
 */
package com.lnt.day14_reflection01;

/**
 * @author brije
 *
 */
/*Another example to call parameterized private method from another class
Let's see the example to call parameterized private method from another class
*/
public class MyCalci{  
	private void cube(int n){
		System.out.println("....invoking private method cube with parameters");
		System.out.println("The Cube of "+n+" is : "+n*n*n);
	}  
	private void print(String name,int n){
		System.out.println("....invoking private method print with parameters");
		System.out.println("Hello  "+name+" your age is : "+n);
	}  
}  



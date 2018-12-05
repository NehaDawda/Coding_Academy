/**
 * 
 */
package com.lnt.final_demo;

/**
 * @author brije
 *
 */
public class FinalVariableDemo {
	private static final float PI_VALUE=3.14f;//final var must be initialized
	//final is also treated as constant in java
	//usually we declare final var as static too ... static var means single copy per class
	public static void main(String[] args) {
		//static is referenced with class name . var or method name
		//compilation error 
		//FinalVariableDemo.PI_VALUE=3.15f;//final var cannot be re-initialized
		System.out.println("Pi value : "+FinalVariableDemo.PI_VALUE);

	}

}

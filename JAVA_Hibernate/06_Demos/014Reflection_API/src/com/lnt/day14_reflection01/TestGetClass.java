/**
 * 
 */
package com.lnt.day14_reflection01;

import java.lang.reflect.InvocationTargetException;

/**
 * @author brije
 *
 */
public class TestGetClass {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		Person personObj = new Person(111, "Zara", "Khan", "9879879876");
		GetClassInfo.printObjectInfo(personObj);
		
		/*Customer customerObj = new Customer(121, "Smita", "Kumar", "9879879877");
		GetClassInfo.printObjectInfo(customerObj );*/
	}

}

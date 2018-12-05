/**
 
 */
package com.lnt.day14_reflection01;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author brije
 *
 */
public class TestCalciPrivateMethod {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		//1st way of get Class class object -> forName()
		//2nd way of get Class class object -> getClass()
		//3rd way of get Class class object -> .class
		Class classObj = MyCalci.class;
		
		System.out.println("the fully qualified class name is : "+classObj.getName());
		System.out.println("the Simple class name is : "+classObj.getSimpleName());
		Class [] paramArr ={int.class};
		//get the private method with parameters
		Method method =classObj.getDeclaredMethod("cube",paramArr); 
		//private void cube(int n) 
		//throws NoSuchMethodException and SecurityException
		
		//inorder to access private method 
		//1> sestAccessible(true
		//2> invoke()
		method.setAccessible(true);
		Object obj = classObj.newInstance();//the intance of the class loaded dynamically
		//newIntance() throws InstantiationException 
		method.invoke(obj, 5);//passing the parameter arg
		// invoke() throws IllegalArgumentException
		
		//invoking private method with two arg
		Class [] twoParamArr ={String.class,int.class};
		//get the private method with parameters
		 method =classObj.getDeclaredMethod("print",twoParamArr); 
		//private void print(int n) 
		//throws NoSuchMethodException and SecurityException
		
		//inorder to access private method 
		//1> sestAccessible(true
		//2> invoke()
		method.setAccessible(true);
		method.invoke(obj,"Smita", 99);//passing the parameter arg
		// invoke() throws IllegalArgumentException
		
	}
}

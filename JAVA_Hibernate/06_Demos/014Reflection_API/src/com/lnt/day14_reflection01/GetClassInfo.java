/**
 * 
 */
package com.lnt.day14_reflection01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author brije
 *
 */
public class GetClassInfo {
	public static void printObjectInfo(Object obj) throws NoSuchMethodException, SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		Class classObj = obj.getClass();
		//check the obj reference is of class or an interface??
		System.out.println("*****Is an Interface?? "+classObj.isInterface());
		//creating the obj of Class class with the help of the method getClass()
		System.out.println("The Class name is : "+classObj.getName());
		//getting the superclass
		System.out.println("*****SuperClass name : "+classObj.getSuperclass().getName());
		//lets check the constructor information of the object at runtime
		Constructor<?> constructor = classObj.getConstructor();
		//The getConstructors() method is used to get the public constructors of the class to which an object belongs.
		System.out.println("*****The constructor Name is : "+constructor.getName());
		
		//declared constructor
		Constructor [] constructors = classObj.getDeclaredConstructors();
		//The getConstructors() method is used to get the public constructors of the class to which an object belongs.
		System.out.println("*****The getDeclaredConstructor Name are : ");
		for (int i = 0; i < constructors.length; i++) {
			System.out.println(i+1 +" : "+constructors[i]);
		}
		// Getting methods of the class through the object 
        // of the class by using getMethods 
		System.out.println("*****The methods Name are ");
		Method [] methods = classObj.getMethods();
		for (int i = 0; i < methods.length; i++) {
			System.out.println(i+1 +" : "+methods[i]);
		}
		System.out.println("*****The Declared methods Name are ");
		//not list the method of super class, only overridden method and declared method of current class will be listed
		methods = classObj.getDeclaredMethods();
		for (int i = 0; i < methods.length; i++) {
			System.out.println(i+1 +" : "+methods[i]);
		}
		
		// creates object of the desired field by providing 
        // the name of field as argument to the  
        // getDeclaredField method 
		System.out.println("*****The Fields/properties/intance Variables Name are ");
		Field [] fields = classObj.getFields();//list of only public fields
		for (int i = 0; i < fields.length; i++) {			
			System.out.println(i+1 +" : "+fields[i]);
		}
		System.out.println("*****The Declared Fields/properties/intance Variables Name are ");
		fields = classObj.getDeclaredFields();//list of all the fields
		for (int i = 0; i < fields.length; i++) {			
			System.out.println(i+1 +" : "+fields[i]);
		}
		
		System.out.println(" \n*****Object value before field modification is : "+obj);
		// creates object of the desired field by providing 
        // the name of field as argument to the  
        // getDeclaredField method 
        Field field = classObj.getDeclaredField("fname"); 
  
        // allows the object to access the field irrespective 
        // of the access specifier used with the field 
        field.setAccessible(true); 
  
        // takes object and the new value to be assigned 
        // to the field as arguments 
        field.set(obj, "Tara"); 
        
        System.out.println("*****Object value after field Modified field name is : "+obj);
        
     // Creates object of desired method by providing the 
        // method name as argument to the getDeclaredMethod 
        Method methodcall2 = classObj.getDeclaredMethod("print"); 
  
        // invokes the method at runtime 
        methodcall2.invoke(obj); 
  
        // Creates object of the desired method by providing 
        // the name of method as argument to the  
        // getDeclaredMethod method 
        Method methodcall3 = classObj.getDeclaredMethod("method3"); 
  
        // allows the object to access the method irrespective  
        // of the access specifier used with the method 
        methodcall3.setAccessible(true); 
  
        // invokes the method at runtime 
        methodcall3.invoke(obj); 
        
        
	}
	
}
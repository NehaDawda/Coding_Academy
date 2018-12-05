/**
 * 
 */
package com.lnt.day10_collection4_Iteration;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * @author Smita
 *
 */
public class CollectionIterationDemo {
	public static void main(String[] args) {
		//generics which enforce type safety in java
		List<String> nameList = new ArrayList<>();
		//creating a nameList which will allow only String object to be added/manipulated
		nameList.add("Diya");
		nameList.add("Bill");
		nameList.add("Cena");
		nameList.add("Aish");
		//nameList.add(99.99);//compilation error as we have used generic to ensure collection type safety
		Iterator<String> iter = nameList.iterator();
		System.out.println("\n************Printing the NameList with Iteartor************\n");
		while(iter.hasNext()) {//iterator hasNext() method checks for avilability of the next element in the list
			System.out.println(iter.next());		//printing the next value in the list1	
		}
		System.out.println("\n************Printing the NameList with enhanced for loop************\n");
		for(String value : nameList ) {
			System.out.println(value);
		}
		
		System.out.println("\n************Printing the NameList with forEach() java8************\n");
		nameList.forEach(value -> System.out.println(value));
		
        Vector<String> dayNames = new Vector<>(); 
        dayNames.add("Sunday"); 
        dayNames.add("Monday"); 
        dayNames.add("Tuesday"); 
        dayNames.add("Wednesday"); 
        dayNames.add("Thursday"); 
        dayNames.add("Friday"); 
        dayNames.add("Saturday"); 
  //remove elements  is avilable only with Iterator not with Enumeration
        // Creating enumeration  
        Enumeration<String> days = dayNames.elements(); 
        System.out.println("\n************Printing the dayNames with Enumeration legacy before java5************\n");
        // Retrieving elements of enumeration 
        while (days.hasMoreElements()) //instead of hasNext()
            System.out.println(days.nextElement()); //instead of next()
	}
}









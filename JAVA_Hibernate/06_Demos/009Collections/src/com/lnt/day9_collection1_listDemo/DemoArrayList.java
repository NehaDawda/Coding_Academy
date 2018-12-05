/**
 * 
 */
package com.lnt.day9_collection1_listDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author Smita
 *
 */
public class DemoArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// create ArrayList
		List list1 = new ArrayList();
		//lets add hetrogeneous data element to the arrayList
		list1.add("Zara");
		list1.add(101);
		list1.add(99.9);
		list1.add(true);
		
		//visiting each element in a collection is known as iteration
		//lets create an obj of Iterator interface by invoking iterator method on list1 obj
		Iterator iter = list1.iterator();
		while(iter.hasNext()) {//iterator hasNext() method checks for avilability of the next element in the list
			System.out.println(iter.next());		//printing the next value in the list1	
		}
		
		//generics which enforce type safety in java
		List<String> nameList = new ArrayList<>();
		//creating a nameList which will allow only String object to be added/manipulated
		nameList.add("Diya");
		nameList.add("Bill");
		nameList.add("Cena");
		nameList.add("Aish");
		//nameList.add(99.99);//compilation error as we have used generic to ensure collection type safety
		iter = nameList.iterator();
		System.out.println("Printing the NameList");
		while(iter.hasNext()) {//iterator hasNext() method checks for avilability of the next element in the list
			System.out.println(iter.next());		//printing the next value in the list1	
		}
		System.out.println("Printing the Sorted NameList");
		//Collections.sort() method
		Collections.sort(nameList);//sort method has a contract with Comparable or Compartor
		iter = nameList.iterator();
		while(iter.hasNext()) {//iterator hasNext() method checks for avilability of the next element in the list
			System.out.println(iter.next());		//printing the next value in the list1	
		}
	}

}




















package com.lnt.day9_collection2_setDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.lnt.day9_collection1_listDemo.Employee;

public class DemoHashSet {
	public static void main(String[] args) {
		//when we want to maintain unique collection- go for SET
		//hashSet
		Set<String> nameSet = new HashSet<>();	
		
		nameSet.add("Aish");
		nameSet.add("Bill");
		nameSet.add("Cena");
		nameSet.add("Diya");
		nameSet.add("Diya");//overlapping will be done, no error
		System.out.println("\n*************Iterating through nameSet*****************\n");
		Iterator iter = nameSet.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());		//printing the next value in the set	
		}	
		
		Employee e1 = new Employee(101, "Zara", 3333);
		Employee e2 = new Employee(103, "Yara", 1111);
		Employee e3 = new Employee(102, "Xenith", 2222);
		Employee e4 = new Employee(101, "Zara", 3333);
		//the value of e1 and e4 is same ... still set is allowing , although set are unique collection
		Set<Employee> empSet = new HashSet<>();	
		empSet.add(e1);
		empSet.add(e2);
		empSet.add(e3);
		empSet.add(e4);
		//set is internally comparing the hashcode of e1 and e4 , not the value
		//solution is whenever operating with set , always override hashcode and equals method
		iter = empSet.iterator();
		System.out.println("\n*************Iterating through empSet*****************\n");
		while(iter.hasNext()) {
			System.out.println(iter.next());		//printing the next value in the set	
		}	
		/*
		 * whenever we try to add object in set, it check the hashCode of the object to compare the object
		 * rather than the value
		 * every object in java get a unique hashcode when it is create  
		 */
	}
}












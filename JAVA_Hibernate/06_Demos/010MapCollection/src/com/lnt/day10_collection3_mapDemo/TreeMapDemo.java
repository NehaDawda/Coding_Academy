package com.lnt.day10_collection3_mapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		// Lets Create a Map
		Map<String, String> map1 = new TreeMap<>();
		map1.put("2", "Zara");
		map1.put("3", "Yara");
		map1.put("1", "Xenith");
		//there is not iterator available for Map interface 
		//how to iterate through map???
		//solution is , lets take the hep of Set interface to obtain iterator
		//1> we will put the map into set
		Set<Map.Entry<String, String>> set1 = map1.entrySet();//we need to type cast
		//2> obtain the iterator for set
		Iterator iter = set1.iterator();
		//3> iterate through the set
		while (iter.hasNext()) {
			Map.Entry mapEntry=(Entry) iter.next();
			//4> get the key and get the value
			System.out.println(mapEntry.getKey()+":"+mapEntry.getValue()); 			
		}
		
		Employee e1 = new Employee(101, "Zara", 3333);
		Employee e2 = new Employee(103, "Yara", 1111);
		Employee e3 = new Employee(102, "Xenith", 2222);
		// Lets Create a Map of employee object with a key of Integer
		Map<Integer, Employee> empMap = new TreeMap<>();
		//we have put 3 pait of k:v in empMap
		empMap.put(e1.getEmpId(), e1);//putting the empId as the key
		empMap.put(e2.getEmpId(), e2);
		empMap.put(e3.getEmpId(), e3);
		//i want to iterate through empMap
		//for iterate through map we need?? 
		//direct iterating through map collection is not possible
		//1> we need to enter the map into set
		//then 2> iterate using Iterator or for loop
		/*for (Map.Entry mapEntry:empMap.entrySet()) { 
            System.out.println(mapEntry.getKey()+" : "+mapEntry.getValue()); 
        } */
		System.out.println("**********************Employee TreeMap**********************");
		//java 8 syntax for lambda expression and forEach() 
		empMap.forEach((key,value) -> System.out.println(key + " = " + value));   
		//let us store Student in Map
		Student s1 = new Student(333, "Aish", 9999);
		Student s2 = new Student(222, "Ciya", 7777);
		Student s3 = new Student(111, "Beera", 8888);
		
		//Now i will put these Student in a TreeMap - SortedMap
		//remember sort() method has a contract with ??? interfaces Comparable or Comparator  
		Map<Integer,Student> studentMap = new TreeMap<>();
		studentMap.put(s1.getStudentId(), s1);
		studentMap.put(s2.getStudentId(), s2);
		studentMap.put(s3.getStudentId(), s3);
		studentMap.put(s3.getStudentId(), s3);
		//studentMap.put(null, s3);//in TreeMap null is not allowed
		System.out.println("\n**********************Student TreeMap**********************\n");
		//java 8 syntax for lambda expression and forEach() 
		studentMap.forEach((key,value) -> System.out.println(key + " = " + value));   
		
		System.out.println("\n**********************Student HashMap**********************\n");
		Map<Integer,Student> studentHashMap = new HashMap<>();
		studentHashMap.put(s1.getStudentId(), s1);
		studentHashMap.put(s2.getStudentId(), s2);
		studentHashMap.put(s3.getStudentId(), s3);
		
		studentHashMap.put(null, s3);
		System.out.println("**********************in HashMap null allowed**********************");
		//java 8 syntax for lambda expression and forEach() 
		studentHashMap.forEach((key,value) -> System.out.println(key + " = " + value));   
		
	}
}





















package com.lnt.day10_collection3_mapDemo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
public class MapDemo {
	public static void main(String[] args) {
		// Lets Create a Map
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(2, "Zara");
		map1.put(3, "Yara");
		map1.put(1, "Xenith");
		//there is not iterator available for Map interface 
		//how to iterate through map???
		//solution is , lets take the hep of Set interface to obtain iterator
		//1> we will put the map into set
		Set<Map.Entry<Integer, String>> set1 = map1.entrySet();//we need to type cast
		//2> obtain the iterator for set
		Iterator iter = set1.iterator();
		//3> iterate through the set
		while (iter.hasNext()) {
			Map.Entry mapEntry=(Entry) iter.next();
			//4> get the key and get the value
			System.out.println(mapEntry.getKey()+":"+mapEntry.getValue()); 			
		}
		//let us store Student in Map
		Student s1 = new Student(333, "Aish", 9999);
		Student s2 = new Student(222, "Ciya", 7777);
		Student s3 = new Student(111, "Beera", 8888);
		Student s4 = new Student(444, "Diya", 6666);
		Student s5 = new Student(666, "Fizal", 4444);
		Student s6 = new Student(555, "Esha", 5555);
		//HashMap
		System.out.println("\n**********************Student HashMap**********************\n");
		Map<Integer,Student> studentHashMap = new HashMap<>();
		studentHashMap.put(s1.getStudentId(), s1);
		studentHashMap.put(s2.getStudentId(), s2);
		studentHashMap.put(s3.getStudentId(), s3);
		studentHashMap.put(s4.getStudentId(), s4);
		studentHashMap.put(s5.getStudentId(), s5);
		studentHashMap.put(s6.getStudentId(), s6);
		
		studentHashMap.put(null, s3);
		System.out.println("**********************in studentHashMap null is allowed**********************");
		//java 8 syntax for lambda expression and forEach() 
		studentHashMap.forEach((key,value) -> System.out.println(key + " = " + value));  
		
		//LinkedHashMap
		System.out.println("\n**********************Student LinkedHashMap**********************\n");
		Map<Integer,Student> studentLinkedHashMap = new LinkedHashMap<>();
		studentLinkedHashMap.put(s1.getStudentId(), s1);
		studentLinkedHashMap.put(s2.getStudentId(), s2);
		studentLinkedHashMap.put(s3.getStudentId(), s3);
		studentLinkedHashMap.put(s4.getStudentId(), s4);
		studentLinkedHashMap.put(s5.getStudentId(), s5);
		studentLinkedHashMap.put(s6.getStudentId(), s6);
		
		studentLinkedHashMap.put(null, s3);
		System.out.println("**********************in LinkedHashMap null is allowed**********************");
		//java 8 syntax for lambda expression and forEach() 
		studentLinkedHashMap.forEach((key,value) -> System.out.println(key + " = " + value));   
		
		//TreeMap
		System.out.println("\n**********************Student TreeMap**********************\n");
		Map<Integer,Student> studentTreeMap = new TreeMap<>();
		studentTreeMap.put(s1.getStudentId(), s1);
		studentTreeMap.put(s2.getStudentId(), s2);
		studentTreeMap.put(s3.getStudentId(), s3);
		studentTreeMap.put(s4.getStudentId(), s4);
		studentTreeMap.put(s5.getStudentId(), s5);
		studentTreeMap.put(s6.getStudentId(), s6);
		
		//studentTreeMap.put(null, s3);//null is not allowd in TreeMap
		System.out.println("**********************in TreeMap null is NOT allowed**********************");
		//java 8 syntax for lambda expression and forEach() 
		studentTreeMap.forEach((key,value) -> System.out.println(key + " = " + value));  
		
	}
}

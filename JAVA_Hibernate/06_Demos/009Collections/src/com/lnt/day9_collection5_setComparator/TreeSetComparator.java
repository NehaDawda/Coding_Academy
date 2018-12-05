/**
 * 
 */
package com.lnt.day9_collection5_setComparator;

import java.util.Set;
import java.util.TreeSet;


/**
 * @author Smita
 *
 */
public class TreeSetComparator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//let us store Student in Map
		Student s1 = new Student(333, "Aish", 9999);
		Student s2 = new Student(222, "Ciya", 7777);
		Student s3 = new Student(111, "Beera", 8888);
		Student s4 = new Student(444, "Diya", 6666);
		Student s5 = new Student(666, "Fizal", 4444);
		Student s6 = new Student(555, "Esha", 5555);
		
		Set<Student> studentTreeSet = new TreeSet<>();
		studentTreeSet.add(s1);studentTreeSet.add(s2);studentTreeSet.add(s3);
		studentTreeSet.add(s4);studentTreeSet.add(s5);studentTreeSet.add(s6);
		
		System.out.println("\n***********************studentTreeSet sorted by studentId************************\n");
		studentTreeSet.forEach(student-> System.out.println(student));
		
		System.out.println("\n***********************studentTreeSet sorted by studentName************************\n");

		Set<Student> studentTreeSetByName = new TreeSet<Student>(new SortStudentByName());
		studentTreeSetByName.add(s1);studentTreeSetByName.add(s2);studentTreeSetByName.add(s3);
		studentTreeSetByName.add(s4);studentTreeSetByName.add(s5);studentTreeSetByName.add(s6);
		
		studentTreeSetByName.forEach(student-> System.out.println(student.getName()));
		
		System.out.println("\n***********************studentTreeSet sorted by student Marks************************\n");

		Set<Student> studentTreeSetByMarks = new TreeSet<Student>(new SortStudentByMarks());
		studentTreeSetByMarks.add(s1);studentTreeSetByMarks.add(s2);studentTreeSetByMarks.add(s3);
		studentTreeSetByMarks.add(s4);studentTreeSetByMarks.add(s5);studentTreeSetByMarks.add(s6);
		
		studentTreeSetByMarks.forEach(student-> System.out.println(student.getMarks()));
	}

}












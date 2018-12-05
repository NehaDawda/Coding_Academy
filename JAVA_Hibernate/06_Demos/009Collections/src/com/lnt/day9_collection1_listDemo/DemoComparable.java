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
public class DemoComparable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// create an ArrayList of Employee Object
		List<Employee> empList = new ArrayList<>();
		Employee e1 = new Employee(101, "Zara", 3333);
		Employee e2 = new Employee(103, "Yara", 1111);
		Employee e3 = new Employee(102, "Xenith", 2222);
		// add the employee to the empList
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		// iterating through empList
		Iterator<Employee> iter = empList.iterator();
		System.out.println("\n***********Printing the empList***********\n");
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		// print the sorted emplist
		iter = empList.iterator();
		Collections.sort(empList);
		// sort is giving compilation error , as sort method can sort only those list
		// which object is of either Comparable or Comparator type
		System.out.println("\n***********Sorted empList by EmpID***********\n");
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		// print the sorted emplist by name
		iter = empList.iterator();
		Collections.sort(empList, new SortEmployeeByName());
		// sort is giving compilation error , as sort method can sort only those list
		// which object is of either Comparable or Comparator type
		System.out.println("\n***********Sorted empList by EMployee Name ***********\n");
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		// print the sorted emplist by name
		iter = empList.iterator();
		Collections.sort(empList, new SortEmployeeBySalary());
		// sort is giving compilation error , as sort method can sort only those list
		// which object is of either Comparable or Comparator type
		System.out.println("\n***********Sorted empList by EMployee Salary ***********\n");
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}

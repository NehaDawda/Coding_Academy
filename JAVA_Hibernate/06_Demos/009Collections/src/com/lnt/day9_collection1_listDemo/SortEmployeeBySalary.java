/**
 * 
 */
package com.lnt.day9_collection1_listDemo;

import java.util.Comparator;

/**
 * @author brije
 *
 */
public class SortEmployeeBySalary implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// compare method , compares the two value and returns int
		//if first value is greater than 1
		//if first value is smaller than -1
		//if both value is equal than 0
		return (int) (o1.getEmpSal()-o2.getEmpSal());
		//type casting from double to int
	}

}


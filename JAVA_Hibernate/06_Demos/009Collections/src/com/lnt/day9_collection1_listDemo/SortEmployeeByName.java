/**
 * 
 */
package com.lnt.day9_collection1_listDemo;

import java.util.Comparator;

/**
 * @author brije
 *
 */
public class SortEmployeeByName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		//comparing by empName
		return o1.getEmpName().compareTo(o2.getEmpName());
	}

}

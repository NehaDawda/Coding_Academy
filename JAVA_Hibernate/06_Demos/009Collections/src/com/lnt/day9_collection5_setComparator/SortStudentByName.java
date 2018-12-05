/**
 * 
 */
package com.lnt.day9_collection5_setComparator;

import java.util.Comparator;

/**
 * @author Smita
 *
 */
public class SortStudentByName implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// sorting with the name of the student
		return o1.getName().compareTo(o2.getName());
	}

}

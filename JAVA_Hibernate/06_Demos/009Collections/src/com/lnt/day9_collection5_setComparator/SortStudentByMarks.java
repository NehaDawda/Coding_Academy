/**
 * 
 */
package com.lnt.day9_collection5_setComparator;

import java.util.Comparator;

/**
 * @author Smita
 *
 */
public class SortStudentByMarks implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return (int) (o1.getMarks()-o2.getMarks());//type cast double to int
		//comparing the two object with the help of marks attribute/property
	}

}

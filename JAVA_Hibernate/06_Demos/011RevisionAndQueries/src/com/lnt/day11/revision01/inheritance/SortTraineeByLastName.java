/**
 * 
 */
package com.lnt.day11.revision01.inheritance;

import java.util.Comparator;

/**
 * @author brije
 *
 */
public class SortTraineeByLastName implements Comparator<Trainee>{
/*
 * we created a class for sorting all the trainees by their lname
 * (non-Javadoc)
 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
 */
	@Override
	public int compare(Trainee o1, Trainee o2) {
		// TODO Auto-generated method stub
		return o1.lname.compareTo(o2.lname);
	}

}

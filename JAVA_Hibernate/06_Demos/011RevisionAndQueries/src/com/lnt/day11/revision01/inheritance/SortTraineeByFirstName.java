/**
 * 
 */
package com.lnt.day11.revision01.inheritance;

import java.util.Comparator;

/**
 * @author brije
 *
 */
public class SortTraineeByFirstName implements Comparator<Trainee>{
/*
 * we created a class for sorting all the trainees by their fname
 * (non-Javadoc)
 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
 */
	@Override
	public int compare(Trainee o1, Trainee o2) {
		// TODO Auto-generated method stub
		return o1.fname.compareTo(o2.fname);
	}

}

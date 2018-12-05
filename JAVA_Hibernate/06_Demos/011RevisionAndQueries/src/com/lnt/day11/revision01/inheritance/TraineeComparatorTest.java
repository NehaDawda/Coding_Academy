/**
 * 
 */
package com.lnt.day11.revision01.inheritance;

import java.awt.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Smita
 *
 */
public class TraineeComparatorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Trainee t1 = new Trainee(102,"Tara","Ben","9879879888","tara@gmail.com");
		Trainee t2 = new Trainee(101,"Zara","Khan","9879879879","zara@gmail.com");
		Trainee t3 = new Trainee(103,"Yara","Raj","9879879777","yara@gmail.com");
		
		Set<Trainee> traineeSet	 = new TreeSet<>();//contract with comparable/comparator
		traineeSet.add(t1);traineeSet.add(t2);traineeSet.add(t3);traineeSet.add(t3);
		System.out.println("\n****************Trainee Sorted by Trainee Id*************\n");
		for (Trainee trainee : traineeSet) {
			System.out.println(trainee);
		}
		System.out.println("\n****************Trainee Sorted by First Name*************\n");
		Set<Trainee> traineeSet2 = new TreeSet<>(new SortTraineeByFirstName());//comparator
		traineeSet2.add(t1);
		traineeSet2.add(t2);
		traineeSet2.add(t3);
		traineeSet2.add(t3);
		
		for (Trainee trainee : traineeSet2) {
			System.out.println(trainee);
		}
		
		System.out.println("\n****************Trainee Sorted by Last Name*************\n");
		Set<Trainee> traineeSet3 = new TreeSet<>(new SortTraineeByLastName());//comparator
		traineeSet3.add(t1);
		traineeSet3.add(t2);
		traineeSet3.add(t3);
		traineeSet3.add(t3);
		
		for (Trainee trainee : traineeSet3) {
			System.out.println(trainee);
		}
	}

}

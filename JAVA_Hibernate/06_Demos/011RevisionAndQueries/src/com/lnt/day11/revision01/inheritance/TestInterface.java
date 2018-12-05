/**
 * 
 */
package com.lnt.day11.revision01.inheritance;

import java.util.TreeSet;

/**
 * @author Smita
 *
 */
public class TestInterface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//ITraineeService obj1 = new ITraineeService();
		//interfaces are by default abstract that s why can't be instantiated
		//they can only be implemented by the implementing class
		ITraineeService obj1 = new TraineeServiceImpl();
		Trainee t1 = obj1.searchTraineeByFirstName("zara");
		if(t1!=null) {
			System.out.println("trainee Found ** ");
			t1.print();
		}else
			System.out.println("trainee NOT Found ** ");
		TreeSet ts = new TreeSet<>();

	}

}

/**
 * 
 */
package com.lnt.day11.revision01.inheritance;

/**
 * @author brije
 *
 */
public class TraineeClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Trainee t1 = new Trainee();//no-arg constructor
		//default constructor will be provided by the java compiler only when there is no constructor aviable in the program
		Trainee t2 = new Trainee(101,"Zara","Khan","9879879879","zara@gmail.com");//parameterized constructor
		//System.out.println(t2);
		t2.print();

	}

}

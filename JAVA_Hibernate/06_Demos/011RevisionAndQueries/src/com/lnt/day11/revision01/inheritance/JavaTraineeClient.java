/**
 * 
 */
package com.lnt.day11.revision01.inheritance;

/**
 * @author brije
 *
 */
public class JavaTraineeClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		JavaTrainee j1 = new JavaTrainee();
	//constructor in inheritance are invoked super-to-sub hierarchy
		//System.out.println(j1);//callback to toString()
		j1.print();
	}

}

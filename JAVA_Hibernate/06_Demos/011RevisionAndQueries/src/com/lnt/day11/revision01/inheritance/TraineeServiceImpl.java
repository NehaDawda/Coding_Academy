/**
 * 
 */
package com.lnt.day11.revision01.inheritance;

/**
 * @author Smit
 *
 */
//a class implenting and interface must override all the methods
public class TraineeServiceImpl implements ITraineeService {

	/* (non-Javadoc)
	 * @see com.lnt.day11.revision01.inheritance.ITraineeService#searchTraineeByFirstName(java.lang.String)
	 */
	@Override
	public Trainee searchTraineeByFirstName(String fname) {
		Trainee t1 = new Trainee(101, fname, "Khan", "9879879870", "zara@lnt.com");
		return t1;
	}

}

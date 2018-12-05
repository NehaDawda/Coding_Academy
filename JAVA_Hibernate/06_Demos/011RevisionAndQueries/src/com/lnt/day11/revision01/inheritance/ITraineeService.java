/**
 * 
 */
package com.lnt.day11.revision01.inheritance;

/**
 * @author brije
 *
 */
//pure abstract class in java
//no need of putting abstract keyword,  by default it is abstract
//abstract can't be instantiated i.e we can't create an object of abstract
//by default all the methods of an interface are public and abstract
//by default all the properties of an interface are public static and final
public interface ITraineeService {
	public Trainee searchTraineeByFirstName(String fname);
}

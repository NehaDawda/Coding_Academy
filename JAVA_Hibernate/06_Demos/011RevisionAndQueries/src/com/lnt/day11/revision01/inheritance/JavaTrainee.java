/**
 * 
 */
package com.lnt.day11.revision01.inheritance;

/**
 * @author Smita
 *
 */
public class JavaTrainee extends Trainee{
	//no need to redefined the properties again, rather inherit it
	/*private int traineeId;
	private String fname;
	private String lname;
	private String phone;
	private String email;*/
	protected String projects;
	//constructor in sub_class
	public JavaTrainee() {
		//super();//super in constructor gives a call to parent class constructor
		//and must be first statement in construct call
		//whether you provide super or not, super() is by default available
		projects="No projects alloated yet!!";
		System.out.println("***************JavaTrainee No-Arg Constructor");
	}
	
	public JavaTrainee(int traineeId, String fname, String lname, String phone, String email, String projects) {
		super(traineeId, fname, lname, phone, email);//super class overloaded constructor
		this.projects = projects;
		System.out.println("***************JavaTrainee overloaded Constructor");
	}

	@Override
	public String toString() {
		return "JavaTrainee [projects=" + projects + ", toString()=" + super.toString() + "]";
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();//super is also used to invoke super class method
		//we can invoke parent class method anywhere inside a method
		System.out.println("\n 			JavaTrainee Projects : "+projects
		           +"\n__________________________________________________________________________\n");
	}
	//overriding say 
		/* 1>same method name, 
		 * 2>same arg-list, 
		 * 3>same return type, only the method implementation/method body will change in sub class
		 * 4> return type in case of inheritance may be covariant 
		 * i.e return type of the overridden method in child class
		 * can return sub-type
		 */
	//we can change the return type Trainee to sub-type JavaTrainee
		@Override
		public JavaTrainee searchTraineeById(int traineeId) {
			JavaTrainee j1 = new JavaTrainee(traineeId, "Zara", "Khan", "9879879870", "zara@lnt.com","Employee Management Project");
			return j1;
		}
}

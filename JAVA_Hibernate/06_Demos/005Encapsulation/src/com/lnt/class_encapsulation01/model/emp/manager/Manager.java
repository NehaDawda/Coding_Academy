/**
 * 
 */
package com.lnt.class_encapsulation01.model.emp.manager;
import com.lnt.class_encapsulation01.model.emp.Employee;
/** * @author Smita * */
//in java a class can inherit from only one class  using extends keyword
public class Manager extends Employee {
	private String deptName;
	public Manager() {
		super();
		//because by default there is super() - call to super class no-arg constructor
		System.out.println("****Manager no_arg  constuctor ****executed for every object created using default constructor ");
	}
	public Manager(String name, String ssn, double salary, String deptName) {
		super(name, ssn, salary);
		this.deptName = deptName;
	}
	@Override
	public String toString() {
		return "Manager deptName=" + deptName +super.toString();//super is also used to invoke super class method
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("\n                         Manager Details                                  \n"						   
		           +"___________________________________________________________________________\n"
		           +"			Manager Department Name          : "+deptName
				   +"\n__________________________________________________________________________\n");
	}
	//getters and setters
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	

}

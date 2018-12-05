/**
 * 
 */
package com.lnt.class_inheritance01.model.emp;
import java.util.Date;/** * @author SMita * */
public class Employee {
	private int empId;
	private String firstName;
	private String lastName;
	private String phoneNo;
	private String email;
	private double salary;
	private Date doj;//date of joining
	//step 4 : private static variables
	private static int numId;//automatic id generation
	//step 5 : static initializer block
	static {
		System.out.println("****Employee Static Initializer Block**** executed only once and before constuctor");
		//automatic id generation
		numId=10000+(int) (Math.random()*1224.1234);//explicitly type cast long to int
	}
	//step 6: initializer block
	{
		System.out.println("****Employee Initializer Block****executed for every object and before constuctor");
		empId=++numId;//assigned the auto-generated numId to custId
	}
	public Employee() {
		System.out.println("****no_arg Employee constuctor ****executed for every object created using default constructor ");
	}
	public Employee(String firstName, String lastName, String phoneNo, String email, double salary,Date doj) {
		System.out.println("****Overloaded Employee constuctor ****executed for every object created using Overloaded constructor ");

		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
		this.email = email;
		this.salary=salary;
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNo="
				+ phoneNo + ", email=" + email +", salary=" + salary + ", doj=" + doj;
	}//generate getters and setters
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee getObject() {
		return new Employee();
	}
	public void print() {
		System.out.println( "___________________________________________________________________________\n"
						   +"\n                         Employees Details                                  \n"						   
				           +"___________________________________________________________________________\n"
				           +"\n 			Employee Id     : "+empId
				           +"\n 			First Name      : "+firstName
				           +"\n 			Last Name       : "+lastName
				           +"\n 			Phone Number    : "+phoneNo
				           +"\n 			Email           : "+email
				           +"\n 			Salary          : "+getSalary()
				           +"\n 			Date of Joining : "+doj
				           +"\n__________________________________________________________________________\n");
	}
}

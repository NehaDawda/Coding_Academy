//step 1: package declare (one or none)
package com.lnt.class_encapsulation01.model.emp;

/** * @author SMita * */
//step 3: top level class must always be marked as public, 
//else it will become default/package access  level
//(it will not be accessible outside the package)
//top level class cannot be marked private or protected , 
//can only have public or default access level
//default is just a access level, not a keyword to be used with class/method declaration
public class Employee {
	private int empId;
    private String name;
    private String ssn;
    private double salary;

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
	//step 7: No_arg Constructor
	public Employee() {
		System.out.println("****Employee no_arg constuctor ****executed for every object created using default constructor ");
	}
	//step 8: overloaded constructor
	public Employee(String name, String ssn, double salary) {
		super();//this is used to refer to the current object
		System.out.println("****Employee Overloaded  constuctor ****executed for every object created using Overloaded constructor ");
		this.name = name;
//when the local var name and the instance var name are same then we explicitly use this to refer to instance variable
		this.ssn = ssn;
		this.salary = salary;
	}
	//step 9 : Override   toString() method
	@Override
	public String toString() {
		return "empId=" + empId + ", name=" + name + ", ssn=" + ssn + ", salary=" + salary ;
	}
	//step 11 : generate  accessors/getters method mutator/setters
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	//step 11 : other business method
	public void print() {
		System.out.println( "___________________________________________________________________________\n"
						   +"\n                         Employees Details                                  \n"						   
				           +"___________________________________________________________________________\n"
				           +"\n 			Employee Id     : "+empId
				           +"\n 			Employee Name   : "+name
				           +"\n 			SSN             : "+ssn
				           +"\n 			Salary          : "+getSalary()
				           +"\n__________________________________________________________________________\n");
	}
}

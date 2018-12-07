package com.jpm.collection.entity;

public class Employee implements Comparable<Employee>{
	private int empId;
	private String empName;
	private double empSal;
	private static int numId;
	private static final String COMPANY_NAME;//blank final
	//static variable and methods have class reference.
	
	//static block which is used to initialize only static variable
	static{
		numId = (int) (1000 + Math.random()*123.123);
		COMPANY_NAME = "JP Morgan";
	}
	
	//initializer block - used to initialize instance var before creation of an object
	{
		empId = numId++;
	}

	
	public Employee() {
		super();
	}

	public Employee(String empName, double empSal) {
		super();
		this.empName = empName;
		this.empSal = empSal;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	public static String getCompanyName() {
		return COMPANY_NAME;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}

	@Override
	public int compareTo(Employee emp) {
		// TODO Auto-generated method stub
		return this.empId - emp.empId;
	}

	
	
}

/**
 * 
 */
package com.lnt.day10_collection3_mapDemo;

/**
 * @author brije
 *
 */
//Comparable Interface has a compareTo method
public class Employee implements Comparable<Employee>{
	private int empId;
	private String empName;
	private double empSal;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String empName, double empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	@Override
	public int compareTo(Employee o) {
		// return int value 
		return this.empId-o.empId;//comparing the employee with id
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
	@Override
	public int hashCode() {
		//generating empId as hashcode
		return this.empId;//if the empId is same than the object will be treated as equals
	}
	@Override
	public boolean equals(Object obj) {
		//comparing the hascode of two object
		return this.hashCode()==obj.hashCode();
	}
	
}

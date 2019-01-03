package com.jpm.hr.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMP_MASTER")
public class Employee implements Serializable{
	private static final long serialVersionUID = -673958716898800135L;
	
	@Id
	@Column(name="EMPLOYEEID")
	private int empNo;
	
	@Column(name="NAME")
	private String empName;
	
	@Column(name="SALARY")
	private Float empSal;
		
	public Employee() {
		super();
	}

	public Employee(int empNo, String empName, Float empSal) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empSal = empSal;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Float getEmpSal() {
		return empSal;
	}

	public void setEmpSal(Float empSal) {
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	
}

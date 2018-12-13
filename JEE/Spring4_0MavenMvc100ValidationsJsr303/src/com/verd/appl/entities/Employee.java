package com.verd.appl.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

@Entity(name="empBean")
@Table(name="Emp")
public class Employee {
	@Id
	private int empNo;
	
	@Size(min = 3, max = 20, message="Name not meeting size constraints.")
	@Pattern(regexp = "[a-z-A-Z]*", message = "Name has invalid characters")
	private String empNm;
	
	@Min(value=18, message="Age can not be below 18.")
	@Max(value=60, message="Age can not be above 60.")
	private int age;
	
	@NotNull
	@NotBlank
	@Pattern(regexp = "[0-9]*", message = "Contact number has invalid digits")
	private String contactNo;
	
	@Email
	@NotNull
	@NotBlank
	private String email;
	
	public Employee(){
		
	}

	public int getEmpNo() {  // PropertyName: empNo
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpNm() {  // empNm
		return empNm;
	}

	public void setEmpNm(String empNm) {
		this.empNm = empNm;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empNm=" + empNm + ", age=" + age + ", contactNo=" + contactNo
				+ ", email=" + email + "]";
	}
}

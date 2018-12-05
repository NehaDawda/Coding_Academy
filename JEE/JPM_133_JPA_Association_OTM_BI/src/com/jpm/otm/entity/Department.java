package com.jpm.otm.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Neha
 *
 */
@Entity
@Table(name="DEPT_OTM")
public class Department {
	
	@Id
	@Column(name="DEPT_ID")
	private Long deptId;
	
	@Column(name="DEPT_NAME")
	private String deptName;
	
	@OneToMany(mappedBy="department", cascade=CascadeType.ALL)
	private Set<Employee> employees;
	
	//no_arg constructor
	//getters and setters
	//toString()
		
	public Department() {
		// TODO Auto-generated constructor stub
	}
	
	public Long getDeptId() {
		return deptId;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
}

package com.jp.hr.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="empRecNew")
@Table(name="EMP")
public class Emp {
	private int empNo;
	private String empNm;
	private Float empSal;
	
	// Association field
	private Dept dept;
	private List<Project> projects;
	
	@Id
	@Column(name="EMPNO")
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	
	@Column(name="ENAME")
	public String getEmpNm() {
		return empNm;
	}
	public void setEmpNm(String empNm) {
		this.empNm = empNm;
	}
	
	@Column(name="SAL")
	public Float getEmpSal() {
		return empSal;
	}
	public void setEmpSal(Float empSal) {
		this.empSal = empSal;
	}
	
	@OneToOne
	@JoinColumn(name="DEPTNO") // Foreign key column in EMP table.
	public Dept getDept() { // dept
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(
			name = "EMP_PROJECT",
			joinColumns = @JoinColumn(name = "empNo"),
			inverseJoinColumns = @JoinColumn(name = "PROJECTID")
	)
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	
	@Override
	public String toString() {
		return "Emp [empNo=" + empNo + ", empNm=" + empNm + ", empSal=" + empSal + ", projects=" + projects + "]";
	}
	
	
}

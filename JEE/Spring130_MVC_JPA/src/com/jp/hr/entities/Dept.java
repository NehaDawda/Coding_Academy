package com.jp.hr.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name="dept")
@Table(name="DEPT")
public class Dept {
	private int deptNo;
	private String deptNm;
	
	// Association
	Set<Emp> empList;
	
	@Id
	@Column(name="DEPTNO")
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	
	@Column(name="DNAME")
	public String getDeptNm() { // deptNm
		return deptNm;
	}
	public void setDeptNm(String deptNm) {
		this.deptNm = deptNm;
	}
	
	@OneToMany(mappedBy="dept", fetch=FetchType.EAGER)
	public Set<Emp> getEmpList() {
		return empList;
	}
	public void setEmpList(Set<Emp> empList) {
		this.empList = empList;
	}
	@Override
	public String toString() {
		return "Dept [deptNo=" + deptNo + ", deptNm=" + deptNm + "]";
	}
}

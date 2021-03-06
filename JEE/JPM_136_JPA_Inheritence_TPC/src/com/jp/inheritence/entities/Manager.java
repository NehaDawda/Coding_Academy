package com.jp.inheritence.entities;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Neha
 *
 */
@Entity
@Table(name="MGR_TPC")
@AttributeOverrides({
		@AttributeOverride(column=@Column(name="MGR_ID"),name="empId"),
		@AttributeOverride(column=@Column(name="MGR_NAME"),name="empName"),
		@AttributeOverride(column=@Column(name="MGR_SAL"),name="empSal"),
})
public class Manager extends Employee {
	
	private Double bonus;
	
	public Manager() {
		// TODO Auto-generated constructor stub
	}
	
	public Manager(String empName, Double empSal, Double bonus) {
		super(empName, empSal);
		this.bonus = bonus;
	}

	public Double getBonus() {
		return bonus;
	}

	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Manager [bonus=" + bonus + ", toString()=" + super.toString() + "]";
	}

	@Override
	public Double getEmpSal() {
		// TODO Auto-generated method stub
		return super.getEmpSal() + bonus;
	}
	
	
}

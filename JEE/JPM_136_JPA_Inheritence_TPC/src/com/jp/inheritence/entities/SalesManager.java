/**
 * 
 */
package com.jp.inheritence.entities;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Administrator
 *
 */
@Entity
@Table(name="SALESMGR_TPC")
@AttributeOverrides({
		//@AttributeOverride(column=@Column(name="MGR_ID"),name="empId"),
		//@AttributeOverride(column=@Column(name="MGR_NAME"),name="empName"),
		//@AttributeOverride(column=@Column(name="MGR_SAL"),name="empSal"),
		//@AttributeOverride(column=@Column(name="MGR_BONUS"),name="bonus"),
})
public class SalesManager extends Manager {
	private Double commision;
	
	public SalesManager() {
		super();
	}

	public SalesManager(String empName, Double empSal, Double bonus, Double commision) {
		super(empName, empSal, bonus);
		this.commision = commision;
	}

	public Double getCommision() {
		return commision;
	}

	public void setCommision(Double commision) {
		this.commision = commision;
	}

	@Override
	public String toString() {
		return "SalesManager [commision=" + commision + ", toString()=" + super.toString() + "]";
	}

	@Override
	public Double getEmpSal() {
		return super.getEmpSal() + commision;
	}
	
	
	
}

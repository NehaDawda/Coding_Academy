/**
 * 
 */
package com.jp.inheritence.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author Administrator
 *
 */
@Entity
@DiscriminatorValue(value="SALES_MANAGER")
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

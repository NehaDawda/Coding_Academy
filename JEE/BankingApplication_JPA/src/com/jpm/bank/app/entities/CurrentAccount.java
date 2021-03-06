package com.jpm.bank.app.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="CURRENT_ACCOUNT")
public class CurrentAccount extends Account{
	
	@Column(name="OVER_DRAFT_LIMIT")
	private double overDraftLimit;

	public CurrentAccount() {
		super();
	}
	
	public double getOverDraftLimit() {
		return overDraftLimit;
	}

	public void setOverDraftLimit(double overDraftLimit) {
		this.overDraftLimit = overDraftLimit;
	}

	@Override
	public String toString() {
		return "CurrentAccount [overDraftLimit=" + overDraftLimit + ", toString()=" + super.toString() + "]";
	}
	
	
}

package com.jpm.bank.app.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="SAVING_ACCOUNT")
public class SavingAccount extends Account{
	@Column(name="ROI")
	private float rateOfInterest;

	public SavingAccount() {
		super();
	}

	public float getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(float rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	@Override
	public String toString() {
		return "SavingAccount [rateOfInterest=" + rateOfInterest + ", toString()=" + super.toString() + "]";
	}
	
	
}

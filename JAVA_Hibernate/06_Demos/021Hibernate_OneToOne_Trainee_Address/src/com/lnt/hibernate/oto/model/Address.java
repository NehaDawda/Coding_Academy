package com.lnt.hibernate.oto.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
/**
 * @author Smita
 *
 */
@Entity
@Table(name="ADDRESS_OTO")
public class Address {
	
	@Id
	@Column(name="trainee_id", 	unique=true, nullable=false)
	@GeneratedValue(generator="gen")@GenericGenerator(name="gen", strategy="foreign", parameters=@Parameter(name="property",value="trainee"))
	private Integer traineeId;
	
	@Column(name="street")
	private String street;

	@Column(name="city")
	private String city;

	@Column(name="state")
	private String state;

	@Column(name="country")
	private String country;
	
	@Override
	public String toString() {
		return "Address [traineeId=" + traineeId + ", street=" + street + ", city=" + city + ", state=" + state
				+ ", country=" + country + "]";
	}
	@OneToOne
	@PrimaryKeyJoinColumn
	private Trainee trainee;

	public Integer getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(Integer traineeId) {
		this.traineeId = traineeId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Trainee getTrainee() {
		return trainee;
	}

	public void setTrainee(Trainee trainee) {
		this.trainee = trainee;
	}
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public Address(String street, String city, 
			String state, String country) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
	}

}

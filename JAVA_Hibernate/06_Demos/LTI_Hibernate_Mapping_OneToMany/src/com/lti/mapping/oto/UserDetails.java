package com.lti.mapping.oto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.OrderColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table (name="USER_DETAILS")
public class UserDetails
{
@Id
@Column(name="USER_ID")
@GeneratedValue(strategy=GenerationType.AUTO)
private int    userId;

@Column(name="USER_NAME") 
private String userName;

@OneToOne
@JoinColumn(name="VEHICLE_ID")
private Vehicle vehicle;



public UserDetails() {
	super();
}
public UserDetails(int userId, String userName, Vehicle vehicle) {
	super();
	this.userId = userId;
	this.userName = userName;
	this.vehicle = vehicle;
}
public Vehicle getVehicle() {
return vehicle;
}
public void setVehicle(Vehicle vehicle) {
this.vehicle = vehicle;
}
public int getUserId() {
return userId;
}
public void setUserId(int userId) {
this.userId = userId;
}
public String getUserName() {
return userName;
}
public void setUserName(String userName) {
this.userName = userName;
}
}
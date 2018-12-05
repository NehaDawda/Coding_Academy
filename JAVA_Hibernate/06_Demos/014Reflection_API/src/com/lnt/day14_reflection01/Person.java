/**
 * 
 */
package com.lnt.day14_reflection01;
/**
 * @author Smita
 *
 */
public class Person extends Thread{
	private int personId;
	private String fname;
	private String lname;
	private String phone;
	public int count =1;
	
 	public Person() {
		System.out.println("Person no_arg Constr");
	}

	public Person(int personId, String fname, String lname, String phone) {
		super();
		System.out.println("Person Overoaded Constr");
		this.personId = personId;
		this.fname = fname;
		this.lname = lname;
		this.phone = phone;
	}
	// creating a private method 
    private void method3() { 
        System.out.println("Private method invoked of Person class"); 
    } 
 // creating a public method 
    public void print() { 
        System.out.println("Print method invoked of Person class"); 
    } 
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", fname=" + fname + ", lname=" + lname + ", phone=" + phone + "]";
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}

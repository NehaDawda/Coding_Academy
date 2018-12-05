package com.lnt.core.week1.tanushree;

public class Person {
	private int accNo;
	private String name;
	private float age;
	private static int numId;
	
	static {
		setNumId((int) (Math.random()*5));
	}
	
	{
		accNo = ++numId;
	}
	
	
	public Person() {
		super();
	}



	//parameterized constructor
	
	
	public Person(int accNo, String name, float age) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.age = age;
	}	
	

	public Person(String name, float age) {
		super();
		this.name = name;
		this.age = age;
	}



	@Override
	public String toString() {
		return "Person [accNo=" + accNo + ", name=" + name + ", age=" + age + "]";
	}



	//getters and setters

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	public static int getNumId() {
		return numId;
	}
	public static void setNumId(int numId) {
		Person.numId = numId;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}


	public Person getObject() {
		return new Person();
	}
	
	void details() {
		System.out.println("Name : "+name+ ", Age  : "+age+ ", accNo : "+accNo);
	}

}
	


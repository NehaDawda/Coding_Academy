package com.lnt.final_demo;

import java.time.LocalDate;

public class FinalMethodDemo {
	final void displayCurrentDate() {
		System.out.println("Today is : "+LocalDate.now());//java 8 we have java.time.LocalDate
	}
	void sayHello() {
		System.out.println("Hello from FinalMethodDemo class");
	}
}

class SubClass extends FinalMethodDemo{
	//compilation error because final method  cannot be Overridden 
	/*@Override
	void displayCurrentDate() {
		System.out.println("Today is : "+LocalDate.now());//java 8 we have java.time.LocalDate
	}*/
	@Override
	void sayHello() {
		System.out.println("Hello from SubClass of FinalMethodDemo class");
	}
}

package com.lnt.java_basic04.loops;

import java.util.Scanner;

public class LoopsDemo {
	//while
	//do while
	//for
	//for each - iterating through an array or collections
	
	public static void main(String[] args) {//command line argument in java
		//to run command line arguments through eclipse 
		/*
		 * rt click -> run as -> run configuration -> pass the arguments in arguments tab 
		 * seprating them with white space
		 */
		//for- it provides a consise way of writing the loop 
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}	
		
		int n1=19;
		System.out.println("Printing table of "+n1);
		for(int i=1;i<=10;i++) {
			System.out.println("9 * "+i+" = "+(9*i));
		}
		
		System.out.println("printing command line arguments through while loop :");
		int n2=0;
		while (n2<args.length) {
			System.out.println(args[n2]);
			n2++;
			//provide increment or decrement else it will go for infinite loop
		}
		//do while 
		n2=21;
		do {
			System.out.println("Value of n2 : "+n2);
			//provide increment or decrement else it will go for infinite loop
			n2++;
		}while (n2<=30);// although the condition is false then also the loop will execute alteast once
		// coz loop executes first then the condition is checked
		
		//ask the user to enter input
		//Scanner class which is present in java.util package
		//default package in java is java.lang
		Scanner sc = new Scanner(System.in);
		/*
		 * System is a class in java
		 * which has 3 static properties
		 * in  - System.in - associated with standard input devices to accept input
		 * out - System.out - associated with standard output devices to display outputs
		 * err - System.err - associated with standard output devices to display errors
		 */
		
		do {
			System.out.println("Enter your payment Mode :\n cash \n debit card \n credit card \n Enter 0 to exit the application");
			String paymentMode=sc.next();//to accept String inputs
			switch (paymentMode) {
			case "cash":
				System.out.println("you have select cash payemnt mode");
				break;
			case "debit card":
				System.out.println("you have select debit card payemnt mode");
				break;
			case "credit card":
				System.out.println("you have select credit card payemnt mode");
				break;
			case "0":
				System.out.println("You have Selected the Exit Option \n Thank you Bye Bye");
				System.exit(0);//to terminate the program
			default:
				System.out.println("you have wrong payemnt mode");
			}
		}while(true);		
	}
}




















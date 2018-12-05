/**
 * 
 */
package com.lnt.java_basic03.constructs;

/**
 * @author Smita
 *
 */
public class ConstructsDemo {
	public static void main(String[] args) {
		// ifElse
		int age = 19;
		if (age >= 18) {
			System.out.println("You are elegible to vote");
		} else {
			System.out.println("You are NOT elegible to vote as your are below 18");
		}
		// ternary operator
		int num1 = 11;
		if (num1 % 2 == 0) {
			System.out.println("Number is even ");
		} else {
			System.out.println("Number is Odd ");
		}
		// ?:		
		System.out.println((num1 % 2)==0 ? "Number is even " : "Number is Odd ");

		// if else if
		int n1 = 10, n2 = 20;
		if (n1 < 0) {
			System.out.println("n1 is negetive");
		} else if (n2 > 0) {
			System.out.println("Now you can go ahead....");
		} else {
			System.out.println("You cant operate with negative numbers....");
		}
		// multiple condition with if else if
		String paymentOption = "cash";
		if (paymentOption.equals("cash")) {
			System.out.println("you have select cash payemnt mode");
		} else if (paymentOption.equals("debit card")) {
			System.out.println("you have select debit card payemnt mode");
		} else if (paymentOption.equals("credit card")) {
			System.out.println("you have select credit card payemnt mode");
		} else if (paymentOption.equals("net banking")) {
			System.out.println("you have select net banking payemnt mode");
		} else if (paymentOption.equals("wallet")) {
			System.out.println("you have select wallet payemnt mode");
		} else {
			System.out.println("you have wrong payemnt mode");
		}

		// multiple condition with switch case
		switch (paymentOption) {
		case "cash":
			System.out.println("you have select cash payemnt mode");
			break;
		case "debit card":
			System.out.println("you have select debit card payemnt mode");
			break;
		case "credit card":
			System.out.println("you have select credit card payemnt mode");
			break;
		default:
			System.out.println("you have wrong payemnt mode");
		}

	}

}

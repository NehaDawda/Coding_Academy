/**
 * 
 */
package com.lnt.day16.jdbc.statement02;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Scanner;

import com.lnt.day16.jdbc.statement02.Employee;


/**
 * @author brije
 *
 */
public class AccepInputFromUSer {
	public static Employee acceptEmpDetails() {
		String firstName;String lastName;String phoneNo;String email;Employee e1 = null;
		String address;
		Scanner sc = new Scanner(System.in);// java 5 onward
		System.out.println("Enter Your firstName : ");// next is used to accept STring input
		firstName = sc.next();
		System.out.println("Enter Your lastName : ");// next is used to accept STring input
		lastName = sc.next();
		System.out.println("Enter Your Phone No : " );// next is used to accept STring input
		phoneNo = sc.next();
		System.out.println("Enter Your email : ");// next is used to accept STring input
		email = sc.next();
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {// legacy
			System.out.println("Enter You Address");// multiple line from user ,v vl use BufferedReader
			address = br.readLine();
			System.out.println("Address is :"+address);
			e1 = new Employee(firstName, lastName, phoneNo, email, new Date());

		} catch (Exception e) {
			e.printStackTrace();
		}
		return e1;
	}
}

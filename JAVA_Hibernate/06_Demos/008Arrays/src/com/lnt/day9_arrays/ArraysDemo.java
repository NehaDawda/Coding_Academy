/**
 * 
 */
package com.lnt.day9_arrays;
// Java program to illustrate creating an array 
// of integers,  puts some values in the array, 
// and prints each value to standard output. 
public class ArraysDemo {
	public static void main(String[] args) {
		// declares an Array of integers.
		int[] arr;
		// allocating memory for 5 integers.
		arr = new int[5];
		// initialize the first elements of the array
		// array index starts with 0
		arr[0] = 10;
		// initialize the second elements of the array
		arr[1] = 20;
		// so on...
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		// accessing the elements of the specified array
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Element at index " + i + " : " + arr[i]);
		}
		//enhanced for loop java 5 onward- only for iteration on array and collection
		System.out.println("Iterating through arr with enhanced for loop");
		for(int value : arr) {
//start with 0 position of arr , by deafult increment by 1 , iterate till length of the array
//data type of the variable must be same of the arr datatype
			System.out.println(value);
		}		
		String [] nameArr= new String[3];
		nameArr[0]="Zara";
		nameArr[1]="Sia";
		nameArr[2]="Raj";
		System.out.println("Iterating through nameArr");
		for(String value: nameArr)		{
			System.out.println(value);
		}
	}
}

























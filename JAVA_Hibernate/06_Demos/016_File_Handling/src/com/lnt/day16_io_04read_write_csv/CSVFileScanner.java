package com.lnt.day16_io_04read_write_csv;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//A CSV file is used to store tabular data in plain text form.
//identify and separate different data tokens in file, a delimiter is used.
//These files are used by consumer, business, and scientific applications. 

public class CSVFileScanner {
	
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File(".//src//SampleCSVFile.csv");
		//way 1:
		Scanner sc = new Scanner(file); 
		sc.useDelimiter(";"); //Set the delimiter used in file
        //Get all tokens and store them in some data structure and print
       
        while (sc.hasNext())
        {
            System.out.print(sc.next() + "|");
        }
        sc.close();
	}
}

//2 ways to read CSV files in Java.

//First way is by using java.io.BufferedReader and 
//split() method from java.lang.String class, 

//As Java doesn’t support parsing of CSV files natively, 
//we have to rely on third party library. 
//There are many API available on net 

//and second way is by using Apache Commons CSV library's CSVParser class.

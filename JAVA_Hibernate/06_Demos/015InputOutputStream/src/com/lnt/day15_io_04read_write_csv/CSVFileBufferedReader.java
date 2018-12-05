package com.lnt.day15_io_04read_write_csv;

import java.io.BufferedReader;
import java.io.FileReader;
//First way is by using java.io.BufferedReader and split() method from java.lang.String class, 
public class CSVFileBufferedReader {
	public static void main(String[] args) {	
		String myFile = ".//src//email.csv";
		BufferedReader fileReader = null;		
		final String DELIMITER = ";";
		
		try {
			String line = "";			
			fileReader = new BufferedReader(new FileReader(myFile));
			// Read the file line by line
			while ((line = fileReader.readLine()) != null) {				
				String[] tokens = line.split(DELIMITER);				
				for (String token : tokens)
				{
					System.out.println(token);
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
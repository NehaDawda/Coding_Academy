package com.lnt.day15_io_stream01;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
//java PrintWriter class is the implementation of Writer class. 
//used to print the formatted representation of objects(than prim types or bytes) 
//to the text-output stream.
//
public class PrintWriterEx {
	public static void main(String[] args) {
		
		Path booksPath = Paths.get( "D:\\IOStreamFiles\\dummy.txt" );
	     File booksFile = booksPath.toFile();
	     //Write data to the file
	     try
	     {
	         PrintWriter outp = new PrintWriter( // output formatting functionality
	                            new BufferedWriter( // implements stream buffer for character output
	                            new FileWriter(booksFile))); // basic writing of character files
	         // character output:
	         outp.println("book\tBeginning Java Programming\n49.50");
	         //common methods of PrintWriter class are flush(),print,println ,close 
	         
	         outp.print("This application was run on ");
	         Date today = new Date();
	         outp.println(today);
	         
	         Employee e1= new Employee();
	         e1.setEmpId(1001);
	         e1.setFirstName("Tom");
	         
	         outp.println(e1.getEmpId() +"\t"+e1.getFirstName());
	        	         
	         outp.close();
	     }
	     catch (IOException e)
	     {
	         System.out.println(e);
	     }
	}
	 

}

package com.lnt.day15_io_06PrintWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

import com.lnt.day15_io_file_iostream01.Employee;
//java PrintWriter class is the implementation of Writer class. 
//used to print the formatted representation of objects(than primitive types or bytes) 
//to the text-output stream.
public class PrintWriterEx {
	public static void main(String[] args) {		
		Path booksPath = Paths.get( ".\\src\\emp.txt" );
	     File booksFile = booksPath.toFile();
	     //Write data to the file
	     try     {
	         PrintWriter pw = new PrintWriter( // output formatting functionality
	                            new BufferedWriter( // implements stream buffer for character output
	                            new FileWriter(booksFile))); // basic writing of character files
	         // character output:
	         pw.println("book\tBeginning Java Programming\n49.50");
	         //common methods of PrintWriter class are flush(),print,println ,close 	         
	         pw.print("This application was running on .....date : ");
	         Date today = new Date();
	         pw.println(today);	         
	         Employee e1= new Employee();
	         e1.setEmpId(1001);
	         e1.setFirstName("Tom");
	         //System.out.println(e1.getEmpId() +"\t"+e1.getFirstName());//print on the console
	         pw.println(e1.getEmpId() +"\t"+e1.getFirstName());//printing on the associated destination  	         
	         pw.close();
	     }
	     catch (IOException e)	     {
	         System.out.println(e);
	     }
	}
}

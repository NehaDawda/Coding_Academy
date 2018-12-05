package com.lnt.day15_io_stream01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class DataOutputStreamEx {
	public static void main(String[] args) throws IOException 
	{
		FileOutputStream file = new FileOutputStream("test.txt");  		
        DataOutputStream data = new DataOutputStream(file);  
        
        //Converts the double argument to an int using the floatToIntBits method in class Float, 
        //and then writes that int value to the underlying output stream as a 4-byte quantity,
      
        data.writeDouble(1.1); 
        data.writeInt(55); 
        data.writeBoolean(true); 
        data.writeChar('4');        
       
        data.flush();
        
        data.close();  
        System.out.println("Succcess...");  
        
        //DataOutputStream and DataInputStream are often used together
        //to print the file see below code
        

			try ( DataInputStream din = new DataInputStream(new FileInputStream("test.txt")) ) 
			{ 
			double a = din.readDouble(); 
			int b = din.readInt(); 
			boolean c = din.readBoolean(); 
			char d=din.readChar(); 
			System.out.println("Values: " + a + " " + b + " " + c+" " + d); 
			} 
			catch(FileNotFoundException e) 
			{ 
			System.out.println("Cannot Open the Input File"); 
			return; 
			} 
			        
        
	}

}

/*

try ( DataInputStream din = 
        new DataInputStream(new FileInputStream("test.txt")) ) 
{ 
double a = din.readDouble(); 
int b = din.readInt(); 
boolean c = din.readBoolean(); 
char d=din.readChar(); 
System.out.println("Values: " + a + " " + b + " " + c+" " + d); 
} 
catch(FileNotFoundException e) 
{ 
System.out.println("Cannot Open the Input File"); 
return; 
} */
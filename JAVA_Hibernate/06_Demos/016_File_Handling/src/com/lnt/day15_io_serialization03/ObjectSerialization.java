/**
 * 
 */
package com.lnt.day15_io_serialization03;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

import com.lnt.day16_io_01_emp.Employee;

/**
 * @author Smita
 *
 */
public class ObjectSerialization {
	//serialization- storing the state of an object to the persistent storage
	public static void writeObject(Object obj,File file) {		
		// inorder to write objects we have ObjectOutputStream
		try(FileOutputStream out = new FileOutputStream(file);
				ObjectOutputStream oos = new ObjectOutputStream(out);){
			oos.writeObject(obj);
			oos.flush();
			System.out.println("Object serialized and persiste in file located at  : "+file.getAbsolutePath());
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	//de-serialization - - reading the state of an object from the persistent storage
	public static Object readObject(File file) {
		Object obj=null;
		try(FileInputStream in = new FileInputStream(file);
				ObjectInputStream ois = new ObjectInputStream(in);){			
			System.out.println("Reading Object form the file located at  : "+file.getAbsolutePath());
			obj=ois.readObject();//readObject method return object			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return obj;	
	}
	
	public static void main(String[] args) {
		File file = new File("src//emp.dat");
		Employee e1 = new Employee("Zara", "Khan", "9998887776", "zara@gmail.com", new Date());
		//System.out.println(e1);
		//store the current state of the employee object , we will store in a file
		//writing in the file
		ObjectSerialization.writeObject(e1,file);//calling a method to save/persist/serialize obj in a file
		Employee obj=(Employee)ObjectSerialization.readObject(file);
		if(obj!=null) {
			System.out.println(obj);
		}else {
			System.out.println("Cannot read the object !!!");
		}
	}

}

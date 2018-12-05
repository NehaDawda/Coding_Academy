/**
 * 
 */
package com.lnt.day15_io_outptStream01;

import java.io.File;
import java.io.FileInputStream;
import java.io.SequenceInputStream;

/**
 * @author brije
 *
 */
public class SequenceDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File file1 = new File("./src/Employee.java");
		File file2 = new File("./src/Customer.java");	
		try(FileInputStream s1 = new FileInputStream(file1);
		FileInputStream s2 = new FileInputStream(file2);
		SequenceInputStream sis = new SequenceInputStream(s1, s2);){
			int b=0;
			while((b=sis.read())!=-1) {
				System.out.print((char)b);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}

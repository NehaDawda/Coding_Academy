/**
 * 
 */
package com.lnt.day15_io_outptStream01;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

/**
 * @author brije
 *
 */
public class ByteArrayOSDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File inputFile = new File("./src/Employee.java");
		File file1 = new File("./src/f1.txt");
		File file2 = new File("./src/f2.txt");	
		try(FileInputStream fis = new FileInputStream(inputFile);
				FileOutputStream s1 = new FileOutputStream(file1);
			FileOutputStream s2 = new FileOutputStream(file2);
		ByteArrayOutputStream bos = new ByteArrayOutputStream();){
			bos.write(65);//storing a copy internally
			bos.writeTo(s1);
			bos.writeTo(s2);
			int b=0;
			while((b=fis.read())!=-1) {
				bos.write(b);
				bos.writeTo(s1);
				bos.writeTo(s2);
				bos.flush();	
			}
					
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}

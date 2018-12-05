/**
 * 
 */
package com.lnt.day15_io_file_iostream01;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author brije
 *
 */
public class BufferedDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		File file = new File("./src/com/lnt/day15_io_outptStream01/Employee.java");
		if (!file.exists()) {
			System.out.println("File Does not exists!!");
			file.createNewFile();
			System.out.println("Creating a new File......File created successfully!!...");
		}
		
		try(FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr);){
					//created obj of bis to read from file using fis into buffer
					String line ="";
					while((line=br.readLine())!=null){
						System.out.println(line);
					}
					
				}catch (Exception e) {
					e.printStackTrace();
				}
	}

}

/**
 * 
 */
package com.lnt.day15_io_reader_writer02;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
/**
 * @author brije
 *
 */
public class FileCopyBufferedReaderWriter {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File sourcefile = new File("./src/Employee.java");
		File destfile = new File("./src/Employee_Copy.txt");		
		try(FileReader fr= new FileReader(sourcefile);//char by char using buffer
		BufferedReader br = new BufferedReader(fr);
				FileWriter fw = new FileWriter(destfile);
				BufferedWriter bw = new BufferedWriter(fw);){
			//created obj of bis to read from file using fis into buffer
			String str ="";
			while((str=br.readLine())!=null){
				System.out.println(str);
				bw.write(str+"\n");		
			}	
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}


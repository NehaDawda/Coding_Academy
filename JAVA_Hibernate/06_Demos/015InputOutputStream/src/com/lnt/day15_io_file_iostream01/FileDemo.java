/**
 * 
 */
package com.lnt.day15_io_file_iostream01;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * @author Smita
 *
 */
public class FileDemo {
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// File class provide method to only get the info about the file
		//and create a new file
		//it does not provide any method , to manipulate the file
		File file = new File("src//demoFile.txt");
		if (!file.exists()) {
			System.out.println("File Does not exists!!");
			file.createNewFile();
			System.out.println("Creating a new File......File created successfully!!..."
					 );
		}
			System.out.println("File already exists!!");			
				//let write on the file
		//first lets create an object of FileOutPutStream
		FileOutputStream fos = new FileOutputStream(file);
		fos.write(65);
		fos.write('B');
		byte [] byteArr= {'h','e','l','l','o'};
		fos.write(byteArr);
		System.out.println("byte written on  File "+file.getName()+" kindly check at "+file.getAbsolutePath());
		fos.flush();
		fos.close();
		System.out.println("colsing File !!");
		
		//try with resource block-closes the resources automatically
		//Reading byte by byte from the file 
		File file1 = new File("./src/com/lnt/day15_io_outptStream01/Employee.java");
		try(FileInputStream fis = new FileInputStream(file1)){
			char ch=0;
			while((ch=(char) fis.read())!=-1) {//-1 End of file
				System.out.print(ch);
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}

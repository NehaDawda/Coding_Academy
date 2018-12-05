/**
 * 
 */
package com.lnt.day15_io_outptStream01;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
/**
 * @author brije
 *
 */
public class FileCopyBufferedStream {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File sourcefile = new File("./src/saraswati.jpg");
		File destfile = new File("./src/saraswati_copy.jpg");		
		try(FileInputStream fis = new FileInputStream(sourcefile);
		BufferedInputStream bis = new BufferedInputStream(fis);
				FileOutputStream fos = new FileOutputStream(destfile);
				BufferedOutputStream bos = new BufferedOutputStream(fos);){
			//created obj of bis to read from file using fis into buffer
			int i =0;
			while((i=bis.read())!=-1){
				System.out.print(i);
				bos.write(i);				
			}
			bos.flush();//flushes the current output stream.			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}

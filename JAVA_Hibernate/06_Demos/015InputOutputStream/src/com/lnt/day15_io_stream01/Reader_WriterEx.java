package com.lnt.day15_io_stream01;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

//Reader/Writer hierarchy -- character streams
//The classes designed for processing plain text files://pgm:Bufferedlines
//BufferedReader  implements buffered reading from character stream   
//FileReader   //implements low-level input from character files

public class Reader_WriterEx {
	
	public static void main(String[] args) {
		try {
			
			Reader srcFile = new FileReader("D:\\IOStreamFiles\\Dummy.txt" );
			
			Writer destFile = new FileWriter("D:\\IOStreamFiles\\DataNew.txt" );
			
			int ch;
			while((ch= srcFile.read()) != -1)
			{
			destFile.write(ch);
			}
			srcFile.close();			
					destFile.close();
			}	
		
			catch(IOException e)
			{
			System.out.println(e);
			System.exit(-1);
			}
			
	}

}

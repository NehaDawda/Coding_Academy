package com.lnt.day15_io_stream01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Class java.io.BufferedReader
//extends java.io.Reader class
//implements character-based input stream


class Buffreadlines 
{
	public static void main(String args[]) throws IOException 
	
	{
	  String s;
	  
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 
	  System.out.println("Enter lines of text, 'stop' to quit");
		  do 
		  {
		   s = br.readLine();
		   
		   System.out.println(s);
		  } 
		  while (!s.equals("stop"));
	
	  }
 }

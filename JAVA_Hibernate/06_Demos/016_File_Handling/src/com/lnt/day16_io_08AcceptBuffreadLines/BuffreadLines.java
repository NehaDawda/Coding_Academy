package com.lnt.day16_io_08AcceptBuffreadLines;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//Class java.io.BufferedReader
//extends java.io.Reader class
//implements character-based input stream
public class BuffreadLines {
	public static void main(String args[]) throws IOException
	{
		String str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter lines of text, 'stop' to quit");
		do {
			str = br.readLine();
			System.out.println(str);
		} while (!str.equalsIgnoreCase("stop"));
	}
}

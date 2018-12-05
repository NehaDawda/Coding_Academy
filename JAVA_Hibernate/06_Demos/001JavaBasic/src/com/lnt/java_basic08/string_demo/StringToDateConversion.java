/**
 * 
 */
package com.lnt.java_basic08.string_demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Smita
 *
 */
public class StringToDateConversion {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		String strDate="23/10/2018";  
		System.out.println("Todays date in String  : "+strDate);
		SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");//mm - minutes MM-month
		Date today = sf.parse(strDate);
		System.out.println("Todays date String converted into Date : "+today);	
		//convert date to string		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
		String todatStr = dateFormat.format(today);  
		System.out.println("Converted String from Date: " + todatStr);  
	}

}

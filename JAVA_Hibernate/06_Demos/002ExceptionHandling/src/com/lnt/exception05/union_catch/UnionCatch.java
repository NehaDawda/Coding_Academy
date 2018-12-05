/**
 * 
 */
package com.lnt.exception05.union_catch;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Smita
 *
 */
public class UnionCatch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String playerFile="e:/playerFile.txt";
		try (Scanner contents = new Scanner(new File(playerFile))) {
	        System.out.print(Integer.parseInt(contents.nextLine()));
	        //java 7 onwards we can use union operation to handle multiple catch operation
	        //object is declared only once within the catch block // catch (IOException e1| NumberFormatException e2)
	    } catch (IOException | NumberFormatException e) {
	        System.out.println("Failed to load score!"+ e);
	    }
	}
}

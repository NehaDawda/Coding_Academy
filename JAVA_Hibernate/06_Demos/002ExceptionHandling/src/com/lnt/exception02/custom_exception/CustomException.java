/**
 * 
 */
package com.lnt.exception02.custom_exception;
/**
 * @author Smita
 *
 */
public class CustomException {

	public static void main(String[] args) {
		Account acc1= new Account(101,"Zara",1000);
		try {
			acc1.withdraw(1200);
		} catch (LowBalanceException e) {
			System.out.println(e.getMessage());
		}//withdraw method is handling exception but main method has not been informed
		//so the main method need to be informed
		//either with throws or try-catch block

	}

}

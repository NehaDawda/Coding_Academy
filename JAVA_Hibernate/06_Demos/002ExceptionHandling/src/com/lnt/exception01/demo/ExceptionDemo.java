/**
 * 
 */
package com.lnt.exception01.demo;

/**
 * @author Smita
 *
 */
public class ExceptionDemo {

	public static void main(String[] args) {
		int n1, n2;
		double div = 0;
		String name = null;// not created the instance/object and trying to use the instance
		// lets handle the exception- my program will terminate gracefully
		try {
			//System.out.println("Length of name : " + name.length());// throw NullPointerException if the instance is not
																	// created
			n1 = Integer.parseInt(args[0]);// accepting the arg from cmd ling and converting String to int
			n2 = Integer.parseInt(args[1]);
			div = n1 / n2;
		} catch (ArithmeticException e) {// trying to divide number by zero
			System.err.println("Sorry Boss, Number Cannot be divisible by Zero!");
			// e.printStackTrace();//used only during development phase , helpful to the
			// programmer
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Sorry Boss, Array Index you are trying to access,does not exits!");
		} catch (NumberFormatException e) {
			System.err.println("Sorry Boss, You have extered wrong number format!");
		} catch (NullPointerException e) {
			System.err.println("Sorry Boss, You are trying to access object which is refering to null!");
		} catch (Exception e) {
			System.err.println("Sorry Boss, Something went wrong!");
		}finally {
			//code which must be executed , whether exception occurs or not
			//realizing of resources , such as closing db connection, closing file
			System.out.println("\n_____________________________________________________________\n"
					+ "Thanks for using our application, closing files and db ....\n"
					+ "and realsing all other resources before application exit!!\n"
					+ "\n_____________________________________________________________\n");
		}
		System.out.println("Division of two number : " + div);
	}
}

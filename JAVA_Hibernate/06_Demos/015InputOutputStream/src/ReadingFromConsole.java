import java.io.Console;

/**
 * 
 */

/**
 * @author brije
 *
 */
public class ReadingFromConsole {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// reading from console using Console class (java6 onwards)
		Console console = System.console();//console method of System class
		System.out.println("Enter your name : ");
		String name = console.readLine();//read String from console
		System.out.println("Welcome ... "+name);
		System.out.println("Enter your Password : ");
		char [] chArr=console.readPassword();//readPassword read the password from console in chArr format
		String pass = String.valueOf(chArr);//converting char arr to String
		System.out.println("Your Password is ... "+pass);

	}

}

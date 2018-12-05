/**
 * 
 */
package com.lnt.exception04.arm;

/**
 * @author brije
 *
 */
public class UseDoor {

	public static void main(String[] args) {
		//java 7 onwards
		//try with resource block automatically closes all the instantiated resource,
		//you don't have to close them explicitly
		//where we instantiate the resource inside try , only those resource which implements either
		//AutoClosable or Closable interface can be used with try-with-resource block
		try (Door d1 = new Door();
				Window w1 = new Window()){		
			d1.open();
			w1.open();
		}catch(Exception e) {
			e.printStackTrace();
		}
		//d1.close();

	}

}

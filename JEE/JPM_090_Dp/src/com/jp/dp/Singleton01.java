package com.jp.dp;

/*
 * 1. Declare self reference as static and private.
 * 2. Create private constructor.
 */

public class Singleton01 {
	private static Singleton01 singleton = null;
	
	private Singleton01(){
		System.out.println("Constructor executed");
	}
	
	public static Singleton01 getInstance(){
		if(singleton == null){
			singleton = new Singleton01();
		}
		return singleton;
	}
}

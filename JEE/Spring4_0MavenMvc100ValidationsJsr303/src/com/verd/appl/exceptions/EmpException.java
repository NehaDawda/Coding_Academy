package com.verd.appl.exceptions;

public class EmpException extends Exception {

	public EmpException(String message, Throwable cause) {
		super(message, cause);
	}

	public EmpException(String message) {
		super(message);
	}
}

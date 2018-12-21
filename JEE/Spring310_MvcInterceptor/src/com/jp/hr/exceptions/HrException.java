package com.jp.hr.exceptions;

public class HrException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2302664344065441732L;

	public HrException(String message, Throwable cause) {
		super(message, cause);
	}

	public HrException(String message) {
		super(message);
	}
}

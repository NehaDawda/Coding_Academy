package com.jp.shopping.exception;

public class ShoppingException extends Exception {
	public ShoppingException(String message, Throwable cause) {
		super(message, cause);
	}

	public ShoppingException(String message) {
		super(message);
	}
}

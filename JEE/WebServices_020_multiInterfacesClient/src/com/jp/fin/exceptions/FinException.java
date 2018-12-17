package com.jp.fin.exceptions;

public class FinException extends Exception {

	private static final long serialVersionUID = -1425748602302561097L;

	public FinException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public FinException(String arg0) {
		super(arg0);
	}

}

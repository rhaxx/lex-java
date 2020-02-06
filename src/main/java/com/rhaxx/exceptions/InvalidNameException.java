package com.rhaxx.exceptions;

public class InvalidNameException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4035617167619823872L;

	public InvalidNameException(String input) {
		super(input);
	}

}

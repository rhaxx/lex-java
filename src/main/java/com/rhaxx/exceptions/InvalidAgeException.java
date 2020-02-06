package com.rhaxx.exceptions;

public class InvalidAgeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5166883656511608095L;

	public InvalidAgeException(String input) {
		super(input);
	}

}

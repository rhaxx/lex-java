package com.rhaxx.exceptions;

public class InvalidPostException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7522285179537140823L;

	public InvalidPostException(String input) {
		super(input);
	}

}

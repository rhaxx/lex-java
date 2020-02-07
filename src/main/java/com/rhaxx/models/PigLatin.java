package com.rhaxx.models;

public class PigLatin {

	public StringBuilder pigLatinConverter(String inputString) {
		char firstChar = 'a';
		char lastChar = 'b';
		String result = "temp";
		if (inputString.length() > 0) {
			firstChar = inputString.charAt(0);
			lastChar = inputString.charAt(inputString.length() - 1);
		}
		result = new String(lastChar + inputString.subSequence(1, inputString.length() - 1).toString() + firstChar + "ay");
		StringBuilder strBui = new StringBuilder(result);
		System.out.println(strBui);
		return strBui;
	}

}

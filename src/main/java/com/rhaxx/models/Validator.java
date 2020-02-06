package com.rhaxx.models;

import com.rhaxx.exceptions.InvalidAgeException;
import com.rhaxx.exceptions.InvalidNameException;
import com.rhaxx.exceptions.InvalidPostException;

public class Validator {

	public Validator() {

	}

	public void validate(Applicant applicant) throws InvalidNameException, InvalidPostException, InvalidAgeException {
		if (!isValidName(applicant.getApplicantName())) {
			throw new InvalidNameException("invalid name");
		} else if (!isValidPost(applicant.getPostApplied())) {
			throw new InvalidPostException("invalid post");
		} else if (!isValidAge(applicant.getApplicantAge())) {
			throw new InvalidAgeException("invalid age");
		} else {
			System.out.println("all values are valid");
		}
	}

	public boolean isValidName(String name) {
		if (name != null) {
			if (name.length() != 0) {
				return true;
			}
		}
		return false;
	}

	public boolean isValidPost(String post) {
		if (post.equals("Probationary Officer") || post.equals("Assistant") || post.equals("Special Cadre Officer")) {
			return true;
		}
		return false;
	}

	public boolean isValidAge(int age) {
		if (age > 18 && age < 35) {
			return true;
		}
		return false;
	}

}

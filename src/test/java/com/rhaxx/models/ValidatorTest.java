package com.rhaxx.models;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.rhaxx.exceptions.InvalidAgeException;
import com.rhaxx.exceptions.InvalidNameException;
import com.rhaxx.exceptions.InvalidPostException;

public class ValidatorTest {

	private Applicant invalidNameApp = new Applicant("", "Assistant", 23);
	private Applicant invalidPostApp = new Applicant("Rex", "blah", 23);
	private Applicant invalidAgeApp = new Applicant("Rex", "Assistant", 16);
	private Validator validator = new Validator();

	@Rule
	public ExpectedException ee = ExpectedException.none();

	@Test
	public void invalidNameTest() throws Exception {
		ee.expect(InvalidNameException.class);
		ee.expectMessage("invalid name");
		validator.validate(invalidNameApp);
	}

	@Test
	public void invalidPostTest() throws Exception {
		ee.expect(InvalidPostException.class);
		ee.expectMessage("invalid post");
		validator.validate(invalidPostApp);
	}

	@Test
	public void invalidAgeTest() throws Exception {
		ee.expect(InvalidAgeException.class);
		ee.expectMessage("invalid age");
		validator.validate(invalidAgeApp);
	}
}

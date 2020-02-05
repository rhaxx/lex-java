package com.rhaxx.models;

import org.junit.Assert;
import org.junit.Test;

public class AddressTest {

	private String firstline = "2605 SE Lantern Street";
	private String secondline = "301";
	private String city = "Bentonville";
	private String state = "Arkansas";
	private int zipCode = 72712;

	private static Address address = new Address();

	@Test
	public void addressNoArgsTest() {
		Assert.assertNotNull(address);
	}

	@Test
	public void addressArgsTest() {
		Assert.assertNotNull(address = new Address(firstline, secondline, city, state, zipCode));
	}

	@Test
	public void getSetFirstlineTest() {
		address.setFirstline(firstline);
		Assert.assertEquals(address.getFirstline(), firstline);
	}

	@Test
	public void getSetSecondlineTest() {
		address.setSecondline(secondline);
		Assert.assertEquals(address.getSecondline(), secondline);
	}

	@Test
	public void getSetCityTest() {
		address.setCity(city);
		Assert.assertEquals(address.getCity(), city);
	}

	@Test
	public void getSetStateTest() {
		address.setState(state);
		Assert.assertEquals(address.getState(), state);
	}

	@Test
	public void getZipCodeTest() {
		address.setZipCode(zipCode);
		Assert.assertEquals(address.getZipCode(), zipCode);
	}

}

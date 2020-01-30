package com.rhaxx.models;

public class Address {

	private String firstline;
	private String secondLine;
	private String city;
	private String state;
	private int zipCode;

	public Address() {

	}

	public Address(String firstline, String secondLine, String city, String state, int zipCode) {
		super();
		this.firstline = firstline;
		this.secondLine = secondLine;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	public String getFirstline() {
		return firstline;
	}

	public void setFirstline(String firstline) {
		this.firstline = firstline;
	}

	public String getSecondLine() {
		return secondLine;
	}

	public void setSecondLine(String secondLine) {
		this.secondLine = secondLine;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

}

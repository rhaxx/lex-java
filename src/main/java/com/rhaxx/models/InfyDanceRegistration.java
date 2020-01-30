package com.rhaxx.models;

public class InfyDanceRegistration {
	
	private String name;
	private long contactNumber;
	private String city;
	
	private static int counter = 10001;

	public InfyDanceRegistration(String name, long contactNumber, String city) {
		this.name = name;
		this.setContactNumber(contactNumber);
		this.setCity(city);
		System.out.println("Hello " + this.name + " your reg num: " + generateRegistrationId());
		InfyDanceRegistration.counter++;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String generateRegistrationId() {
		return "D" + counter;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}

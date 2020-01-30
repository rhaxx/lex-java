package com.rhaxx.models;

public class Booking {

	private String customerEmail;
	private int seatsRequired;
	private boolean isBooked;
	private int seatsAvailable = 200;

	public Booking(String customerEmail, int seatsRequired) {
		this.customerEmail = customerEmail;
		if (seatsRequired <= seatsAvailable) {
			this.seatsAvailable -= seatsRequired;
			this.seatsRequired = seatsRequired;
			this.isBooked = true;
		} else {
			this.isBooked = false;
		}
	}

	public void showBookingStatus() {
		if (this.isBooked) {
			System.out.println(this.seatsRequired + " successfully booked for " + this.customerEmail);
		} else {
			System.out.println("not enough seats available");
		}
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public int getSeatsRequired() {
		return seatsRequired;
	}

	public void setSeatsRequired(int seatsRequired) {
		this.seatsRequired = seatsRequired;
	}

	public boolean isBooked() {
		return isBooked;
	}

	public void setBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}

	public int getSeatsAvailable() {
		return seatsAvailable;
	}

	public void setSeatsAvailable(int seatsAvailable) {
		this.seatsAvailable = seatsAvailable;
	}

}

package com.rhaxx.models;

public class UniversePlanetarium {

	private double baseFare;
	private int seatsAvailable;

	public UniversePlanetarium() {
		super();
		this.baseFare = 100.00;
		this.seatsAvailable = 250;
	}

	public void bookSeat(String name, int noOfSeats) {
		if (noOfSeats <= seatsAvailable) {
			seatsAvailable -= noOfSeats;
			System.out.println("Hello " + name + "!");
			System.out.println("Cost: " + baseFare * noOfSeats);
			System.out.println("Seats Available: " + seatsAvailable);
		} else {
			System.out.println("Sorry " + name + " not enough seats available.");
		}
	}

	public double getBaseFare() {
		return baseFare;
	}

	public void setBaseFare(double baseFare) {
		this.baseFare = baseFare;
	}

	public int getSeatsAvailable() {
		return seatsAvailable;
	}

	public void setSeatsAvailable(int seatsAvailable) {
		this.seatsAvailable = seatsAvailable;
	}

}

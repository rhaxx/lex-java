package com.rhaxx.models;

public class Trainee implements StudentInterface {

	int marksSecured;

	public Trainee(int marksSecured) {
		this.marksSecured = marksSecured;
	}

	@Override
	public void calculatePercentage() {
		float percent = (float) this.marksSecured / TOTAL_MAXIMUM_MARKS * 100;
		System.out.println("The total aggregate percentage secure by the intern is " + percent);
	}

}

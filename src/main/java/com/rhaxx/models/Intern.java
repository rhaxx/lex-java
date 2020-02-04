package com.rhaxx.models;

public class Intern implements StudentInterface {

	private int marksSecured;
	private int projectMarks;

	public Intern(int marksSecured, int projectMarks) {
		this.marksSecured = marksSecured;
		this.projectMarks = projectMarks;
	}

	@Override
	public void calculatePercentage() {
		int total = this.marksSecured + this.projectMarks;
		float percent = (float) total / TOTAL_MAXIMUM_MARKS * 100;
		System.out.println("The total aggregate percentage secure by the intern is " + percent);
	}

}

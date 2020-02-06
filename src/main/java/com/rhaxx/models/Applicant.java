package com.rhaxx.models;

public class Applicant {

	private String applicantName;
	private String postApplied;
	private int applicantAge;

	public Applicant(String applicantName, String postApplied, int applicantAge) {
		this.applicantName = applicantName;
		this.postApplied = postApplied;
		this.applicantAge = applicantAge;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public String getPostApplied() {
		return postApplied;
	}

	public void setPostApplied(String postApplied) {
		this.postApplied = postApplied;
	}

	public int getApplicantAge() {
		return applicantAge;
	}

	public void setApplicantAge(int applicantAge) {
		this.applicantAge = applicantAge;
	}
	
}

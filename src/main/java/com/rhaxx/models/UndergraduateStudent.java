package com.rhaxx.models;

public class UndergraduateStudent extends Student {

	public UndergraduateStudent(String name) {
		super(name);
	}

	@Override
	public void generateResult() {
		int[] test = getTest();
		int sum = 0;
		for (int result : test) {
			sum += result;
		}
		float average = (float) sum / test.length;
		if (average >= 60) {
			setResult("Pass");
		} else {
			setResult("Fail");
		}
	}

}

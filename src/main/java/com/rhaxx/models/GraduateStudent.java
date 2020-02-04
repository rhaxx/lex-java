package com.rhaxx.models;

public class GraduateStudent extends Student {

	public GraduateStudent(String name) {
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
		if (average >= 70) {
			setResult("Pass");
		} else {
			setResult("Fail");
		}
	}

}

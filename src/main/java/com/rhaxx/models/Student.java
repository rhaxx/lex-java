package com.rhaxx.models;

abstract class Student {

	private String name;
	private int[] test;
	private String result;

	public Student(String name) {
		this.name = name;
		this.test = new int[4]; // 4 tests
		this.result = "No test taken";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getTest() {
		return test;
	}

	public void setTestScore(int testNumber, int testScore) {
		if (testNumber >= 0 && testNumber <= this.test.length)
			this.test[testNumber] = testScore;
		else
			System.out.println("test number out of range");
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public abstract void generateResult();

}

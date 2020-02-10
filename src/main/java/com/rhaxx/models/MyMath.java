package com.rhaxx.models;

public class MyMath {

	public static double deviation(int... data) {
		double mean = mean(data);
		double sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum += Math.pow(data[i] - mean, 2);
		}
		double deviation = Math.sqrt(sum / data.length);
		return deviation;
	}

	public static double mean(int... data) {
		int sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		return (double) sum / data.length;
	}

	public MyMath() {

	}

}

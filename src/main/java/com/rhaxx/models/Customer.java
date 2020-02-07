package com.rhaxx.models;

public class Customer {

	String customerName;
	int applicableDiscount;

	public String getName() {
		return this.customerName;
	}

	public int getDiscount() {
		return this.applicableDiscount;
	}

	public void findDiscountAndName(String inputString) {
		String customerType = "";
		String customerName = "";
		boolean isPassColon = false;
		for (int i = 0; i < inputString.length(); i++) {
			if (inputString.charAt(i) == ' ') {
				continue;
			} else if (inputString.charAt(i) == ':') {
				isPassColon = true;
				continue;
			}
			if (isPassColon) {
				customerName += inputString.charAt(i);
			} else {
				customerType += inputString.charAt(i);
			}
		}
		this.customerName = customerName;
		if (customerType.equals("Regular")) {
			System.out.println("Hi " + customerName + "! 10% discount is applicable to you");
			this.applicableDiscount = 10;
		} else {
			System.out.println("Hi " + customerName + "! 20% discount is applicable to you");
			this.applicableDiscount = 20;
		}
	}

}

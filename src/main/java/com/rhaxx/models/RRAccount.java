package com.rhaxx.models;

public class RRAccount {

	private String customerName;
	private Address address;
	private double depositAmount;

	public RRAccount() {

	}

	public RRAccount(String customerName, Address address, double depositAmount) {
		super();
		this.customerName = customerName;
		this.depositAmount = depositAmount;
		this.address = address;
		if (isValidAddress()) {
			System.out.println("account successfully created");
		} else {
			System.out.println("zipCode is incorrect");
			this.address = new Address();
		}
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public double getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}

	public boolean isValidAddress() {
		// convert the integer to a String and check if length is 6
		if (String.valueOf(address.getZipCode()).length() == 6) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "RRAccount [customerName=" + customerName + ", address=" + address + ", depositAmount=" + depositAmount
				+ ", getCustomerName()=" + getCustomerName() + ", getAddress()=" + getAddress()
				+ ", getDepositAmount()=" + getDepositAmount() + ", isValidAddress()=" + isValidAddress()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}

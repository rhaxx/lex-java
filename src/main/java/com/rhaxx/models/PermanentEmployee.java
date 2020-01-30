package com.rhaxx.models;

public class PermanentEmployee extends Employee {

	private double basicPay;
	private double hra;
	private int experience;

	public PermanentEmployee() {

	}

	public PermanentEmployee(int empId, String name, double salary, double basicPay, double hra, int experience) {
		super(empId, name, salary);
		this.basicPay = basicPay;
		this.hra = hra;
		this.experience = experience;
	}

	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public void calculateSalary() {
		if (experience < 3) {
			super.setSalary(this.basicPay + this.hra);
		} else if (experience < 5) {
			super.setSalary((0.05 * this.basicPay) + this.basicPay + this.hra);
		} else if (experience < 10) {
			super.setSalary((0.07 * this.basicPay) + this.basicPay + this.hra);
		} else {
			super.setSalary((0.1 * this.basicPay) + this.basicPay + this.hra);
		}
	}

	@Override
	public String toString() {
		return "PermanentEmployee [basicPay=" + basicPay + ", hra=" + hra + ", experience=" + experience
				+ ", getBasicPay()=" + getBasicPay() + ", getHra()=" + getHra() + ", getExperience()=" + getExperience()
				+ ", getEmpId()=" + getEmpId() + ", getName()=" + getName() + ", getSalary()=" + getSalary()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}

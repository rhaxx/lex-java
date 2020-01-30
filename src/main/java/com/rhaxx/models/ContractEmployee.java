package com.rhaxx.models;

public class ContractEmployee extends Employee {

	private double wage;
	private int hours;

	public ContractEmployee() {

	}

	public ContractEmployee(int empId, String name, double salary, double wage, int hours) {
		super(empId, name, salary);
		this.wage = wage;
		this.hours = hours;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public void calculateSalary() {
		super.setSalary(wage * hours);
	}

	@Override
	public String toString() {
		return "ContractEmployee [wage=" + wage + ", hours=" + hours + ", getWage()=" + getWage() + ", getHours()="
				+ getHours() + ", getEmpId()=" + getEmpId() + ", getName()=" + getName() + ", getSalary()="
				+ getSalary() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}

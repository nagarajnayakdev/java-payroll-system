package com.payroll;

public class FullTime extends Employee {
	private double monthlySalary;

	public FullTime(String name, int id, double monthlySalary) {
		super(name, id);
		this.monthlySalary = monthlySalary;

	}

	@Override
	public double calculateSalary() {
         return monthlySalary;
	}

}

package com.payroll;

public class PartTime extends Employee {
	private int hoursWorked;
	
	private double hourlyRate;

	public PartTime(String name, int id,int hoursWorked,double hourlyRate ) {
		super(name, id);
		this.hoursWorked=hoursWorked;
		this.hourlyRate=hourlyRate;
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return hourlyRate*hoursWorked;
	}
	
	

}

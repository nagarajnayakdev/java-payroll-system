package com.payroll;

public class Main {
	public static void main(String[] args) {
		PayRollSystem payRollSystem = new PayRollSystem();
		FullTime emp1 = new FullTime("Vikas", 1, 30000);
		PartTime emp2 = new PartTime("Sharan", 2, 3, 200);
		
		payRollSystem.addEmployee(emp1);
		payRollSystem.addEmployee(emp2);
		
		System.out.println("Employee Details: ");
		payRollSystem.displayEmployees();
		
		System.out.println("Remove employee");
		payRollSystem.removeEmployee(2);
		
		System.out.println("Employee after delete");
		payRollSystem.displayEmployees();
	}

}

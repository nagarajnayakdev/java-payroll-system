package com.payroll;

import java.util.ArrayList;
import java.util.List;

public class PayRollSystem {
	private List<Employee> employees;



	public PayRollSystem() {
		employees = new ArrayList<Employee>();
	

	}

	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	public void removeEmployee(int id) {
		Employee employeeToRemove = null;
		for (Employee employee : employees) {
			if (employee.getId() == id) {
				employeeToRemove = employee;
				break;
			}
		}
		if (employeeToRemove != null) {
			employees.remove(employeeToRemove);
		}

	}
	
	public void displayEmployees() {
		for(Employee employee : employees) {
			System.out.println(employee);
		}
	}

}

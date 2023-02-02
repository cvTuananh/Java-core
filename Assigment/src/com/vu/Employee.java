package com.vu;

public class Employee extends Person {
	static final double COEFFICIENTS_SALARY = 1.0;
	@Override
	public double basicSalary(double salary) {
		double basicSalary = salary * COEFFICIENTS_SALARY;
		return basicSalary;
	}
	
	
}

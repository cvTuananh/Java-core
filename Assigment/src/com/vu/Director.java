package com.vu;

public class Director extends Person {
	static final double COEFFICIENTS_SALARY = 1.5;
	public Director() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public double basicSalary(double salary) {
		double basicSalary = salary * COEFFICIENTS_SALARY;
		return basicSalary;
	}
}

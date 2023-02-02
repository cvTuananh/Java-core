package com.vu;

public class BuHead extends Person {
	static final double COEFFICIENTS_SALARY = 1.3;
	public BuHead() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public double basicSalary(double salary) {
		double basicSalary = salary * COEFFICIENTS_SALARY;
		return basicSalary;
	}
}

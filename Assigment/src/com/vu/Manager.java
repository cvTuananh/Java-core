package com.vu;

public class Manager extends Person {
	static final double COEFFICIENTS_SALARY = 1.2;
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public double basicSalary(double salary) {
		double basicSalary = salary * COEFFICIENTS_SALARY;
		return basicSalary;
	}
}

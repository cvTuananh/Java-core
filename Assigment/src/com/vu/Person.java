package com.vu;

import java.io.Serializable;

public class Person extends Salary implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5189161788446098457L;
	
	private int codeStaff;
	private String firstName;
	private String lastName;
	private Double salary;
	private String workingPossition;
	
	public Person() {
		super();
	}

	public Person(int codeStaff, String firstName, String lastName, Double salary, String workingPossition) {
		super();
		this.codeStaff = codeStaff;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.workingPossition = workingPossition;
	}


	public int getCodeStaff() {
		return codeStaff;
	}

	public void setCodeStaff(int codeStaff) {
		this.codeStaff = codeStaff;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getWorkingPossition() {
		return workingPossition;
	}

	public void setWorkingPossition(String workingPossition) {
		this.workingPossition = workingPossition;
	}

	@Override
	public double basicSalary(double salary) {
		// TODO Auto-generated method stub
		System.out.print("Calulator salary each staff");
		return 0;
	}

	@Override
	public String toString() {
		return "Person [codeStaff=" + codeStaff + ", firstName=" + firstName + ", lastName=" + lastName + ", salary="
				+ salary + ", workingPossition=" + workingPossition + "]";
	}
	
	
}

package com.vu.exercise05;

public class Dev extends Employee {

	@Override
	void getTitle() {
		// TODO Auto-generated method stub
		System.out.println("Day la class Dev");
		
	}

	@Override
	void getTask() {
		// TODO Auto-generated method stub
		System.out.println("Task cua dev la lam feature");
		
	}

	@Override
	public String toString() {
		return "Dev [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}

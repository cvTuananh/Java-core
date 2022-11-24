package com.vu.exercise05;

public abstract class Employee {
	public void getWelcome() {
		System.out.println("Xin chao ca ban den voi VUS");
	}
	
	abstract void getTitle();
	
	abstract void getTask();
}

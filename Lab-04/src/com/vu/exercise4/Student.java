package com.vu.exercise4;

public class Student {
	private int msv;
	private String ten;
	private double avg;
	
	public Student(int msv, String ten, double avg) {
		super();
		this.msv = msv;
		this.ten = ten;
		this.avg = avg;
	}

	@Override
	public String toString() {
		return "Student [msv=" + msv + ", ten=" + ten + ", avg=" + avg + "]";
	}
	
	
	
}

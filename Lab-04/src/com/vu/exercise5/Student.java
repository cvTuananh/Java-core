package com.vu.exercise5;

public class Student implements Cloneable {
	public int msv;
	public String ten;
	public double avg;
	
	public Student(int msv, String ten, double avg) {
		super();
		this.msv = msv;
		this.ten = ten;
		this.avg = avg;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Student [msv=" + msv + ", ten=" + ten + ", avg=" + avg + "]";
	}
	
	
	
}

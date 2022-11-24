package com.vu.exercise01;

import java.util.Scanner;
public class Student extends Person {
	private static Scanner sc = new Scanner(System.in);
	private int msv;
	private double avg;
	
	
	
	public Student() {
		super();
	}

	public Student(int msv, double avg) {
		super();
		this.msv = msv;
		this.avg = avg;
	}

	public int getMsv() {
		return msv;
	}

	public void setMsv(int msv) {
		this.msv = msv;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	@Override
	public void input() {
		System.out.println("Enter ten sinh vien");
		String name = sc.nextLine();
		System.out.println("Enter tuoi sinh vien");
		int age = sc.nextInt();
		System.out.println("Enter phone sinh vien");
		int phone = sc.nextInt();
		System.out.println("Enter ma sinh vien");
		int msv = sc.nextInt();
		System.out.println("Enter diem trung binh sinh vien");
		double avg = sc.nextDouble();
		
		sc.close();
		
		this.setName(name);
		this.setAge(age);
		this.setPhone(phone);
		this.setMsv(msv);
		this.setAvg(avg);
		this.classification(avg);
		
	}
	
	public void classification (double avg) {
		if(avg > 8.0) {
			System.out.println("ban da du dieu kien nhan hoc bong");
		} else {
			System.out.println("ban khong du dieu kien nhan hoc bong");
		}
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + this.avg + "+" + this.msv;
	}
	
	
	
}

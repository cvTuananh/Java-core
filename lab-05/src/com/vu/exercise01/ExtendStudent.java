package com.vu.exercise01;

import java.util.Scanner;

public class ExtendStudent extends Person {
	private static Scanner sc = new Scanner(System.in);
	private int msv;
	private double avg;
	private String major;
	
	
	
		
	public ExtendStudent() {
		super();
	}


	public ExtendStudent(String name, int age, int phone,int msv, double avg, String major) {
		super(name, age, phone);
		// TODO Auto-generated constructor stub
		this.avg = avg;
		this.msv = msv;
		this.major = major;
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


	public String getMajor() {
		return major;
	}


	public void setMajor(String major) {
		this.major = major;
	}
	
	


	@Override
	public void input() {
		// TODO Auto-generated method stub
		System.out.println("Enter ten sinh vien");
		String name = sc.nextLine();
		System.out.println("Enter tuoi sinh vien");
		int age = sc.nextInt();
		System.out.println("Enter phone sinh vien");
		int phone = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter ma sinh vien");
		int msv = sc.nextInt();
		System.out.println("Enter diem trung binh sinh vien");
		double avg = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter chuyen nganh cua sinh vien");
		String major = sc.nextLine();
		
		sc.close();
		
		this.setName(name);
		this.setAge(age);
		this.setPhone(phone);
		this.setMsv(msv);
		this.setAvg(avg);
		this.setMajor(major);
	}


	@Override
	public String toString() {
		return "ExtendStudent [msv=" + msv + ", avg=" + avg + ", major=" + major + "] +" + super.toString();
	}
	
	
	
	
	
	
	
}

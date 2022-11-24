package com.vu.exercise03;

public class Triangle extends Shape {
	private double a,b,c;
	private double triangle;
	
	public Triangle(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
	
	
	@Override
	void calculattePerimeter() {
		// TODO Auto-generated method stub
		triangle = a + b + c;
		
	}

	@Override
	public String toString() {
		return "Triangle [triangle=" + triangle + "]";
	}
	
	
	
}

package com.vu.exercise03;

public class Cricle extends Shape {
	private double radius;
	private static final double Pi = 3.14;
	private double cricle;
	
	
	
	public Cricle(double radius) {
		super();
		this.radius = radius;
	}
	
	

	public double getRadius() {
		return radius;
	}





	public void setRadius(double radius) {
		this.radius = radius;
	}
	


	@Override
	void calculattePerimeter() {
		// TODO Auto-generated method stub
		cricle = 2 * Pi * radius;
		
	}



	@Override
	public String toString() {
		return "Cricle [cricle=" + cricle + "]";
	}
	
	
}

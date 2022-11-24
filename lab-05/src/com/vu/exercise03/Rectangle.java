package com.vu.exercise03;

public class Rectangle extends Shape {
	private double chieudai, chieurong;
	private double rectangle;
	
	public Rectangle(double chieudai, double chieurong) {
		super();
		this.chieudai = chieudai;
		this.chieurong = chieurong;
	}

	public double getChieudai() {
		return chieudai;
	}

	public void setChieudai(double chieudai) {
		this.chieudai = chieudai;
	}

	public double getChieurong() {
		return chieurong;
	}

	public void setChieurong(double chieurong) {
		this.chieurong = chieurong;
	}
	
	@Override
	void calculattePerimeter() {
		// TODO Auto-generated method stub
		rectangle = 2 * (chieudai + chieurong);
	}

	@Override
	public String toString() {
		return "Rectangle [rectangle=" + rectangle + "]";
	}
	
	
}

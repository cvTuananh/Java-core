package com.vu.exercise03;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cricle cricle = new Cricle(20.4);
		Triangle triangle = new Triangle(2,4,5);
		Rectangle rectangle = new Rectangle(40,40);
		cricle.calculattePerimeter();
		triangle.calculattePerimeter();
		rectangle.calculattePerimeter();
		
		System.out.println(cricle.toString());
		System.out.println(triangle.toString());
		System.out.println(rectangle.toString());

	}

}

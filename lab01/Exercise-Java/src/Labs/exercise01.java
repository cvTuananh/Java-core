package Labs;

import java.util.Scanner;

public class exercise01 {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("input number one");
		float numberA = scanner.nextFloat();
		System.out.println("input numer two");
		float numberB = scanner.nextFloat();
		System.out.printf("Min number is : " + Math.min(numberA,numberB));
		System.out.printf("\nMax number is :" + Math.max(numberA, numberB));
		findAcreage(numberA,numberB);
		findPerimeter(numberA,numberB);
		volumeOfCube();
		funstionSuperlative();
		quadraticEquation();
		

	}
	
	static void findAcreage(float longs, float width) {
		float acreage =(longs + width) * 2;
		System.out.printf("\nArea is : " + acreage + " and ");
		
	};
	
	static void findPerimeter(float longs, float width) {
		
		float perimeter = longs * width;
		System.out.printf("Perimeter is :" + perimeter);
	}
	
	static void volumeOfCube() {
		System.out.println("\nEdge input of cube");
		double edge = scanner.nextFloat();
		System.out.printf("volume of cube is : " + Math.pow(edge, 3));
	}
	
	static void funstionSuperlative() {
		System.out.println("\nInput number a and number b");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		if(a == 0 || b == 0 ) {
			System.out.println("a or b different 0");
		} else {
			int root = -a/b;
			System.out.printf("Superlavtive is :" + root);
		}
		
	}
	
	static void quadraticEquation() {
		System.out.println("\nInput number a and number b and number c");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		double delta = Math.pow(b, 2) - 4 * a *c;
		double squareRoot = Math.sqrt(delta);
		
		System.out.printf("Root Quadratic Equation is : " + delta);
		System.out.printf("\nSquare Root is : " + squareRoot);
		
	}
	

}

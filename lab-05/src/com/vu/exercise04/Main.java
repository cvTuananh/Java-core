package com.vu.exercise04;
import java.util.Scanner;
public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("nhap so thu nhat");
		int a = sc.nextInt();
		System.out.println("nhap so thu hai");
		sc.nextLine();
		int b = sc.nextInt();
		System.out.println("nhap so thu ba");
		int c = sc.nextInt();
		sc.close();
		Math math = new Math();
		math.findMax(a, b);
		math.findMax(a, b, c);
		
		

	}

}

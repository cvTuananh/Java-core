package com.vu.exercise4;
import java.util.Scanner;
public class ManageStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Code Student");
		int code = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name Student");
		String name = sc.nextLine();
		System.out.println("Enter medium score");
		double avg = sc.nextFloat();
		sc.close();
		Student student = new Student(code,name,avg);
		
		System.out.println(student);

	}

}

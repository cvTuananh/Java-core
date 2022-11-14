package com.vu.exercise5;
import java.util.Scanner;
public class ManageStudent implements Cloneable {

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
		try {
			Student student2 = (Student) student.clone();
			Student student3 = (Student) student.clone();
			Student student4 = (Student) student.clone();
			System.out.println("Student 2 befor update" + student2);
			System.out.println("Student 3 befor update" + student3);
			System.out.println("Student 4 befor update" + student4);
			System.out.println("===================================");
			
			student2.msv = 201;
			student3.msv = 203;
			student4.msv = 205;
			
			student2.ten= "NGUYEN VAN A";
			student3.ten= "NGUYEN VAN B";
			student4.ten= "NGUYEN VAN C";
			
			System.out.println("Student 2 after update" + student2);
			System.out.println("Student 3 after update" + student3);
			System.out.println("Student 4 after update" + student4);
			
			
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}

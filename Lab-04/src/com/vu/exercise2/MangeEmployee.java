package com.vu.exercise2;
import java.util.Scanner;
public class MangeEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Name");
		String name = sc.nextLine();
		
		System.out.println("Enter Salary");
		Double salary = sc.nextDouble(); 
		
		Employee employee = new Employee(id, name, salary);
		
		System.out.println(employee.toString());
		
		sc.close();
	}

}

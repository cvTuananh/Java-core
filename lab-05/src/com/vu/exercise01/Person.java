package com.vu.exercise01;
import java.util.Scanner;

public class Person {
	private static Scanner sc = new Scanner(System.in);
	
	private String name;
	private int age;
	private int phone;
	
	

	public Person() {
		super();
	}





	public Person(String name, int age, int phone) {
		super();
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	
	



	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public int getAge() {
		return age;
	}





	public void setAge(int age) {
		this.age = age;
	}





	public int getPhone() {
		return phone;
	}





	public void setPhone(int phone) {
		this.phone = phone;
	}





	public void input() {
		System.out.println("Enter ten person");
		String name = sc.nextLine();
		sc.nextLine();
		System.out.println("Enter tuoi person");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter phone person");
		int phone = sc.nextInt();
		
		this.setName(name);
		this.setAge(age);
		this.setPhone(phone);
	}





	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", phone=" + phone + "]";
	}
	
	
	
	
	
}

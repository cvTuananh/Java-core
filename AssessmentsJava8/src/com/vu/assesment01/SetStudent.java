package com.vu.assesment01;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetStudent {

	Set<Student> listStudent = new LinkedHashSet<Student>();
	
	public Student inputData() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name");
		String name = sc.nextLine();
		System.out.println("Enter Code");
		int code = sc.nextInt();
		System.out.println("Enter course");
		sc.nextLine();
		String course = sc.nextLine();
		
		return new Student(code,name,course);
	}
	
	
	public void createStudent() {
		Student student = inputData();
		listStudent.add(student);
	}
	
	public void changeStudent() {
		Student student = findStudent();
		if(student == null) {
			System.out.println("No Student you want update");
			return;
		}
		listStudent.remove(student);
		createStudent();
		
	}
	
	public Student get() {
		Set<Student> hashStudent = new HashSet<>(listStudent);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter code Student you want");
		int code = sc.nextInt();
		Student student = null;
		for(Student element : hashStudent) {
			if(element.getId() == code) {
				System.out.println(element);
				return student = element;
			}
		}
		
		return student;
	}
	
	
	
	public Student findStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter code Student you want");
		int code = sc.nextInt();
		Student student = null;
		for(Student element : listStudent) {
			if(element.getId() == code) {
				System.out.println(element);
				return student = element;
			}
		}
		
		return student;
	}
	
	public void deleteStudent() {
		Student student = findStudent();
		if(student == null) {
			System.out.println("Could not found student");
			return;
		}
		listStudent.remove(student);
		System.out.println("Succcess");
	}
	
	public void display() {
		listStudent.forEach(v -> System.out.println(v));
	}
	
	public void displayMenu() {
		System.out.println("Manager Student");
		System.out.println("1. Add Student");
		System.out.println("2. Find Student");
		System.out.println("3 Update Student");
		System.out.println("4 Delete Student");
		System.out.println("5 Show List Student");
		System.out.println("0 Exit");
		System.out.println("Enter number you want select");
	}
	
	
	public void menu() {
        displayMenu();
		Scanner sc = new Scanner(System.in);
		boolean exit = true;
		do {
	        int choice = sc.nextInt();
			switch(choice) {
				case 1: createStudent();
						break;
				case 2: get();
						break;
				case 3: changeStudent();
						break;
				case 4: deleteStudent();
						break;
				case 5: display();
						break;
				case 0: exit = false;
						System.out.println("Good Bye");
						break;
			}
			displayMenu();

		} while(exit != false);
	}

}

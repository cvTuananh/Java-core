package com.vu.assement02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilePermission;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Scanner;

public class MapCourse {
	Map<String, Course> linkedCourse = new LinkedHashMap<String, Course>();
	Map<String, Course>  readCourse = new LinkedHashMap<String, Course>();
	List<Course> listCourse = new ArrayList<Course>();
	
	public Course inputData() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name Course");
		String course = sc.nextLine();
		System.out.println("Enter Code");
		int code = sc.nextInt();
		System.out.println("Enter Decription");
		sc.nextLine();
		String description = sc.nextLine();
		
		return new Course(code,course,description);
	}
	
	
	public void createCourse() {
		Course course = inputData();
		listCourse.add(course);
	}
	
	public void addCourseToMap() {
		for(Course course : listCourse) {
			linkedCourse.put(course.getCourse(), course);
		}
		saveFile();
	}
	
	private void saveFile() {
		String fileName = "C:\\Users\\hr\\eclipse-workspace\\File\\Course.txt";
		FilePermission permission = new FilePermission(fileName, "write");
		try {
			FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(linkedCourse);
			System.out.println("Success");
			oos.close();
		}catch(Exception e) {
			System.out.println("Error");
			e.printStackTrace();
		}
	}
	
	public void changeStudent() {
		Course course = findCourse();
		if(course == null) {
			System.out.println("No Student you want update");
			return;
		}
		Course coursed = inputData();
		linkedCourse.put(course.getCourse(), coursed);
		saveFile();
		
	}
	
	public Course findCourse() {
		Map<String,Course> hashStudent = new HashMap<>(linkedCourse);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name course you want");
		String courseName = sc.nextLine();
		Course course = hashStudent.get(courseName);
		System.out.println(course);
		
		return course;
	}
	
	
	
	public void deleteCourse() {
		Course course = findCourse();
		if(course == null) {
			System.out.println("Could not found course");
			return;
		}
		linkedCourse.remove(course.getCourse());
		System.out.println("Succcess");
		saveFile();
	}
	
	public void display() {
		try {
		String fileName = "C:\\\\Users\\\\hr\\\\eclipse-workspace\\\\File\\\\Course.txt";
		FileInputStream fis = new FileInputStream(fileName);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Properties properties = new Properties();
		
			readCourse = (Map<String, Course>) ois.readObject();
			for(Entry<String, Course> entry: readCourse.entrySet()) {
				System.out.println("Key: " +entry.getKey()+ "," + " Value: " + entry.getValue() );
			}
			ois.close();
			fis.close(); 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	public void displayMenu() {
		System.out.println("Manager Student");
		System.out.println("1. Add Course");
		System.out.println("2. Find Course");
		System.out.println("3 Update Course");
		System.out.println("4 Delete Course");
		System.out.println("5 Show List Course");
		System.out.println("6 Sort data from file");
		System.out.println("0 Exit");
		System.out.println("Enter number you want select");
	}
	
	private void sortData() {
		List<Course> list = new ArrayList<Course>(readCourse.values());
		Collections.sort(list);
		for(Course course: list) {
			System.out.println(course);
		}
	}
	public void menu() {
        displayMenu();
		Scanner sc = new Scanner(System.in);
		boolean exit = true;
		do {
	        int choice = sc.nextInt();
			switch(choice) {
				case 1: createCourse();
						addCourseToMap();
						break;
				case 2: findCourse();
						break;
				case 3: changeStudent();
						break;
				case 4: deleteCourse();
						break;
				case 5: display();
						break;
				case 6: sortData();
						break;
				case 0: exit = false;
						System.out.println("Good Bye");
						break;
			}
			displayMenu();

		} while(exit != false);
	}

}

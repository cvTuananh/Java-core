package com.vu;

import java.util.LinkedHashSet;
import java.util.Set;

public class Exercise02 {

	public static final int NUM_OF_ELEMENT = 5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Student> setStudent = new LinkedHashSet<>();
		
		Student st1 = new Student(1, "VanA");
		Student st2 = new Student(2, "Van B");
		Student st3 = new Student(3, "Van C");
		Student st4 = new Student(4, "Van D");
		Student st5 = new Student(5, "Van E");
		Student st6 = new Student(6, "VanA");
		
		setStudent.add(st1);
		setStudent.add(st2);
		setStudent.add(st3);
		setStudent.add(st4);
		setStudent.add(st5);
		setStudent.add(st6);
		
		setStudent.forEach(v -> System.out.println(v));
	}

}

package com.vu;

import java.util.Set;
import java.util.TreeSet;

public class Exercise03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Course> course = new TreeSet< Course>();
		Course cou1 = new Course(5, "Java");
		Course cou2 = new Course(4, "C#");
		Course cou3 = new Course(3, "PHP");
		Course cou4 = new Course(2, "NODEJS");
		Course cou5 = new Course(1, "JAVASCRIPT");
		
		course.add(cou1);
		course.add(cou2);
		course.add(cou3);
		course.add(cou4);
		course.add(cou5);
		
		course.forEach(v -> System.out.println(v));
	}
}

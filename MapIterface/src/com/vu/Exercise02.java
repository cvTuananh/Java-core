package com.vu;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Exercise02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Course> course = new LinkedHashMap<Integer, Course>();
		Course cou1 = new Course(5, "Java");
		Course cou2 = new Course(4, "C#");
		Course cou3 = new Course(3, "PHP");
		Course cou4 = new Course(2, "NODEJS");
		Course cou5 = new Course(1, "JAVASCRIPT");
		
		course.put(1, cou1);
		course.put(2, cou2);
		course.put(3, cou3);
		course.put(4, cou4);
		course.put(5, cou5);
		
		for(Entry<Integer, Course> entry : course.entrySet()) {
			System.out.println(entry);
		}
	}

}

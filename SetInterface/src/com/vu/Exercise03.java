package com.vu;

import java.util.Set;
import java.util.TreeSet;

public class Exercise03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student> tree = new TreeSet<>();
		Student st1 = new Student(1, "Van A");
		Student st2 = new Student(2, "Van B");
		Student st3 = new Student(3, "Van D");
		Student st4 = new Student(4, "Van C");
		Student st5 = new Student(5, "Van E");
		Student st6 = new Student(6, "Van A");
		
		tree.add(st1);
		tree.add(st2);
		tree.add(st3);
		tree.add(st4);
		tree.add(st5);
		tree.add(st6);
		
		tree.forEach(v -> System.out.println(v));
	}

}

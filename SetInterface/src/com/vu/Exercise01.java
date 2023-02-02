package com.vu;

import java.util.HashSet;
import java.util.Set;

public class Exercise01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<>();
		set.add("a0");
		set.add("a1");
		set.add("a1");
		set.add("a2");
		set.add("a3");
		set.add("a5");
		set.add("a7");
		
		set.forEach(v -> System.out.println(v));
	}

}

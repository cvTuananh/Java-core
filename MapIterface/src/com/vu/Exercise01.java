package com.vu;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Exercise01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> course = new HashMap<Integer, String>();
		course.put(1, "Java");
		course.put(2, "JavaScript");
		course.put(3, "PHP");
		course.put(4, "C#");
		
		for(Entry<Integer, String> entry : course.entrySet()) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " " + value);
		}
	}

}

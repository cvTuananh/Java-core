package com.vu.exercise3;

import java.util.ArrayList;
import java.util.List;

public class MangeEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee01 = new Employee(213, "tuan anh a", 2.0000);
		Employee employee02 = new Employee(214, "tuan anh b", 3.0000);
		Employee employee03 = new Employee(215, "tuan anh c", 4.0000);
		
		List<Employee> emps = new ArrayList<>();
		emps.add(employee01);
		emps.add(employee02);
		emps.add(employee03);
		
		
		double maxSalary = emps.get(0).calculator();
		int maxIndex = 0;
		for(int i = 0; i< emps.size(); i++) {
			double empNetSalary = emps.get(i).calculator();
			if(empNetSalary > maxSalary) {
				maxIndex = i;
			}
		}
		
		System.out.println("Max net salary is" + emps.get(maxIndex));
	}

}

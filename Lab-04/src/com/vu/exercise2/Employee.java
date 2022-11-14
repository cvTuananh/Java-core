package com.vu.exercise2;

import java.text.DecimalFormat;

public class Employee {
		private int maNv; 
		private String name;
		private Double salary;
		
		public Employee(int maNv, String name, Double salary) {
			super();
			this.maNv = maNv;
			this.name = name;
			this.salary = salary;
		}
		
		public int getMaNv() {
			return maNv;
		}
		public void setMaNv(int maNv) {
			this.maNv = maNv;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public Double getSalary() {
			return salary;
		}
		public void setSalary(Double salary) {
			this.salary = salary;
		}
		
		public String getNetSalary() {
			DecimalFormat df = new DecimalFormat("$#,###,##0.00");
			double netSalary = this.salary - (this.salary * 0.15);
			return df.format(netSalary);
		}
		
		@Override
		public String toString() {
			return "Employee [maNv=" + maNv + ", name=" + name + ", salary=" + salary + getNetSalary() +"]";
		}
		
		
		
		
	}


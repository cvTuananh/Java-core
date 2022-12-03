package com.vu.assessment01;
import java.util.Scanner;

public class ManagerExpense {
	 static Scanner sc = new Scanner(System.in);
	 
	 public static double electricityBill() {
		 double totalMoney = 0;
		 System.out.println("Enter number electric you used");
		 int electricNumber = sc.nextInt();
		 
		 if( electricNumber < 50) {
			 totalMoney = electricNumber * 1000;
		 } else if(electricNumber >= 50) {
			 totalMoney = 50 * 1000 + (electricNumber - 50) * 1200;
		 }
		 System.out.println("Toal Electricity Bill of you are " + totalMoney + "$");
		 
		 return totalMoney;
	 }
	
	 public static double taxiBill( ) {
		 final double PRICE_OF_KM = 2000;
		 double bill = 0;
		 double km = 0;
		 double totalKm = 0;
		 System.out.println("Enter the number of times you have traveled by taxi");
		 int times = sc.nextInt();
		 for (int i = 1 ; i <= times; i++) {
			 System.out.println("times " + i + " Enter number of kilometers traveled");
			 km = sc.nextDouble();
			 totalKm += km;
		 }
		 
		 bill = totalKm * PRICE_OF_KM;
		 System.out.println("Toal Taxi Bill of you are " + bill + "$");
		 return bill;
		
		 
	 }
	 
	 public static double totalSalaryMonth() {
		 final double ten_percent_tax = 0.10;
		 final double five_teen_percent_tax = 0.15;
		 final double thirty_percent_tax = 0.20;
		 double totalSalary = 0.0;
		 double salary = 0;
		 System.out.println("Please Enter Salary you:");
		 salary = sc.nextDouble();
		 if(salary <= 9000) {
			 System.out.println("Salary of you are :" + salary + "$");
		 } else if(salary > 9000 && salary < 15000) {
			 totalSalary = salary - (salary * ten_percent_tax);
			 System.out.println("Salary of you are :" + totalSalary + "$");
		 }else if(salary > 15000 && salary < 30000) {
			 totalSalary = salary - (salary * five_teen_percent_tax);
			 System.out.println("Salary of you are :" + totalSalary + "$");
		 } else if(salary >= 30000 ) {
			 totalSalary = salary - (salary * thirty_percent_tax);
			 System.out.println("Salary of you are :" + totalSalary + "$");
		 }
		 return totalSalary;
	 }
	 
	 public static  void totalIncomeAtTheEndOfTheMonth() {
		 
		 double afterTaxSalary = totalSalaryMonth();
		 double electricityBill = electricityBill();
		 double taxiBill = taxiBill();
		 double toatalSalaryOfMonth = afterTaxSalary - electricityBill - taxiBill ;
		 
		 System.out.println("Total income at the end of the month you are : " + toatalSalaryOfMonth + "$");
	 }
	 
	 public static void menuOptions() {
		 System.out.println(" ===============Manager Personal spending================== ");
		 System.out.println(" ||  1: Calculator Electricity Bill                      || ");
		 System.out.println(" ||  2: Calculator Taxi Bill                             || ");
		 System.out.println(" ||  3: Calculator Salary After Tax                      || ");
		 System.out.println(" ||  4: Calculator Total Income Athe End Of The Month    || ");
		 System.out.println(" ||  0: Exit                                             || ");
		 System.out.println(" ||  Please Enter Number you want choice                 || ");
		 System.out.println(" ========================================================== ");
	 }
	 
	 
	 public static void showMenuAndSelectOpition() {
		 boolean cost = true;
		do {
		 menuOptions();
		 int choice = sc.nextInt();
		 switch (choice) {
		 	case 1 :
		 		electricityBill();
		 		break;
		 	case 2 :
		 		taxiBill();
		 		break;
		 	case 3: 
		 		totalSalaryMonth();
		 		break;
		 	case 4: 
		 		totalIncomeAtTheEndOfTheMonth();
		 		break;
		 		
		 	case 0: 
		 		System.out.println("Thank You Program Exited");
		 		cost = false;
		 		break;
		 }
		} while(cost);
	 }

	public static void main(String[] args) {
		showMenuAndSelectOpition();		
	}

}

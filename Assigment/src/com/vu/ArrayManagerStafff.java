package com.vu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayManagerStafff implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6298273813064788933L;
	private static final double TAX_10_PERCENT = 0.1;
	private static final double TAX_12_PERCENT = 0.12;
	/**
	 * 
	 */
	private ArrayList<Person> personList;

	public ArrayManagerStafff() {
		this.personList = new ArrayList<Person>();
	}

	public ArrayManagerStafff(ArrayList<Person> personList) {
		super();
		this.personList = personList;
	}
	
	public void displayStaff() {
		for(Person person: personList) {
			System.out.println(person);
		}
	}
	
	public void findStaff() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter code staff you want find");
		int code = sc.nextInt();
		for(Person person : personList) {
			if(person.getCodeStaff() == code) {
				System.out.println(person);
			}
		}
	}
	
	public void deleteStaff() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter code staff you want delete");
		int code = sc.nextInt();
		for(Person person : personList) {
			if(person.getCodeStaff() == code) {
				personList.remove(person);
				System.out.println("Deleted !!!");
				break;
			}
		}
	}
	
	public double incomeTax(double salary) {
		if(salary < 9000000) {
			return salary;
		}
		if(salary >= 9000000 && salary <= 15000000 ) {
			return salary * TAX_10_PERCENT;
		}
		if(salary > 15000000) {
			return salary * TAX_12_PERCENT;
		}
		return 0;
	}
	
	public Person inputData() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Code Staff");
		int code = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter First Name");
		String firstName = sc.nextLine();
		
		System.out.println("Enter Last Name");
		String lastName = sc.nextLine();
		
		System.out.println("Enter Working Position");
		String workingPosition = sc.nextLine();
		
		System.out.println("Enter Salary");
		Double salary = sc.nextDouble();
		
		double curentSalary = checkPosition(salary, workingPosition);
		
		return new Person(code, firstName, lastName, curentSalary, workingPosition);
	}
	
	public void addStaff() {		
		Person person = inputData();
		this.personList.add(person);
	}
	
	public double checkPosition(double salary, String workingPosition) {
		double curentSalary = 0.0;
		
		switch(workingPosition) {
		case "Employee":
				Employee employee = new Employee();
				curentSalary = employee.basicSalary(salary);
				break;
		case "Manager":
				Manager manager = new Manager();
				curentSalary = manager.basicSalary(salary);
				break;
		case "Bu Head":
				BuHead buHead = new BuHead();
				curentSalary = buHead.basicSalary(salary);
				break;
		case "Director":
				Director director = new Director();
				curentSalary = director.basicSalary(salary);
				break;
				}
		
		return curentSalary;
		
	}
	
	public void updateStaff() {
		int index = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Code Staff you want update");
		int code = sc.nextInt();
		
		Person person = inputData();
		
		for(Person persons: personList) {
			index++;
			if(persons.getCodeStaff() == code) {
				personList.set(index  - 1, person);
				System.out.println("Updated !!!");
				break;
			}
		}
	}
	
	public void findStaffBySalary() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter salary staff you want find");
		double salary = sc.nextDouble();
		for(Person person : personList) {
			if(person.getSalary() == salary) {
				System.out.println(person);
			}
		}
	}
	
	public void sortSalary() {
		Collections.sort(this.personList, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				if(o1.getSalary() < o2.getSalary()) {
					return 1;
				}else if(o1.getSalary() > o2.getSalary()) {
					return -1;
				}
				return 0;
			}
		});
	}
	
	public void sortByCodeStaff() {
		Collections.sort(this.personList, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				if(o1.getCodeStaff() < o2.getCodeStaff()) {
					return -1;
				}else if(o1.getCodeStaff() > o2.getCodeStaff()) {
					return 1;
				}
				return 0;
			}
		});
	}
	
	public void displayFiveStaff() {
		sortSalary();
		int count = 0;
		
		for(Person person : personList) {
			count ++;
			if(count == 6) {
				break;
			}
			System.out.println(person);
		}
	}
	
	public void saveFile() {
		String fileName = "C:\\Users\\hr\\eclipse-workspace\\File\\staff-txt.txt";
		try {
			FileOutputStream fes = new FileOutputStream(fileName);
			ObjectOutputStream obj = new ObjectOutputStream(fes);
			obj.writeObject(personList);
			System.out.println("Saved !!");
			obj.flush();
			obj.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void readFile()  {
		String fileName = "C:\\Users\\hr\\eclipse-workspace\\File\\staff-txt.txt";
		try {
			FileInputStream fis = new FileInputStream(fileName);
			ObjectInputStream obj = new ObjectInputStream(fis);
			this.personList = (ArrayList<Person>) obj.readObject();
			for(Person person: personList) {
				System.out.println(person);
			}
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
	
	public void menu() {
		System.out.println("1: Enter List Staff from keyboard");
		System.out.println("2: Display list Staff to screen");
		System.out.println("3: Find and display by code staff from keyboard");
		System.out.println("4: Delete staff by code staff");
		System.out.println("5: Update information staff by code staff");
		System.out.println("6: Find Staff by salary");
		System.out.println("7: Sort staff by code staff");
		System.out.println("8: Sort staff by salary");
		System.out.println("9: Display top 5 salary max");
		System.out.println("10: Save list staff to file");
		System.out.println("11: Display list from file saved");
		System.out.println("0: Exit program");
	}
	
	public void menuChoice() throws ClassNotFoundException, IOException {
		Scanner sc = new Scanner(System.in);
		menu();
		boolean cont = true;
		do {
			int choice = sc.nextInt();
			switch(choice) {
			case 1: addStaff();
					break;
			case 2: displayStaff();
					break;
			case 3: findStaff();
					break;
			case 4: deleteStaff();
					break;
			case 5: updateStaff();
					break;
			case 6: findStaffBySalary();
					break;
			case 7: sortByCodeStaff();
					break;
			case 8: sortSalary();
					break;
			case 9: displayFiveStaff();
					break;
			case 10: saveFile();
					break;
			case 11: readFile();
					break;
			case 0: System.out.println("Exited !! See you again");
					cont = false;
					break;
			}
			menu();
		
	   } while(cont);
   }

}

package com.vu.assessment02;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerContact {
	private ArrayList<Contact> contactList;

	public ManagerContact(ArrayList<Contact> contactList) {
		this.contactList = contactList;
	}

	public ManagerContact() {
		this.contactList = new ArrayList<Contact>();
	}
	
	public void displayContact() {
		for(Contact contact : contactList) {
			System.out.println(contact);
		}
	}
	
	public Contact inputData() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Id Contact");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name");
		String name = sc.nextLine();
		
		System.out.println("Enter phone number");
	    String phone = sc.nextLine();
		
		System.out.println("Enter email");
		String email = sc.nextLine();
		
		System.out.println("Enter address");
		String address = sc.nextLine();
		
		return new Contact(id,name,phone,email,address);
	}
	
	public void addContact() {
		Contact contact = inputData();
		this.contactList.add(contact);
	}
	
	public void deleteContact() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Id contact you want delete");
		int id = sc.nextInt();
		
		for(Contact contact : contactList) {
			if(contact.getId() == id) {
				contactList.remove(contact);
				System.out.println("Deleted");
				break;
			}
		}
	}
	
	public void findContact() {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter number phone you want find");
		String phone = sc.nextLine();
		
		for(Contact contact : contactList) {
			if(contact.getPhone().equals(phone)) {
				System.out.println(contact);
				break;
			}
		}
	}
	
	public void updateContact() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number id you want update");
		int id = sc.nextInt();
		
		Contact newContact = inputData();
		int index = 0;
		for(Contact contact : contactList) {
			index++;
			if(contact.getId() == id) {
				contactList.set(index - 1, newContact);
				System.out.println("updated");
				break;
			}
		}
	}
	
	public void menu() {
		System.out.println("Welcome to program");
		System.out.println("01: Add new contact");
		System.out.println("02: Update contact");
		System.out.println("03: Delete contact");
		System.out.println("04: Display contact");
		System.out.println("05: Find contact by phone number");
		System.out.println("06: Exit program");
		System.out.println("Enter number you want");
	}
	
	public void selectMenu() {
		Scanner sc = new Scanner(System.in);
		boolean cont = true;
		menu();
		
		do {
			int choice = sc.nextInt();
			switch (choice) {
			case 1: addContact();
					break;
			case 2: updateContact();
					break;
			case 3: deleteContact();
					break;
			case 4: displayContact();
					break;
			case 5: findContact();
					break;
			case 6: cont = false;
				System.out.println("Exited");
					break;
			}
			menu();
		} while (cont);
	}
	
}

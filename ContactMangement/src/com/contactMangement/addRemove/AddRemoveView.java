package com.contactMangement.addRemove;

import java.util.List;
import java.util.Scanner;

import com.contactMangement.home.HomeView;

public class AddRemoveView implements AddRemoveViewCallBack {

	private Scanner scanner = new Scanner(System.in);

	private AddRemoveControllerCallBack addRemoveController;

	public AddRemoveView() {
		addRemoveController = new AddRemoveController(this);
	}

	public static void main(String[] args) {
		AddRemoveView addRemoveView = new AddRemoveView();
	}

	// Option For Adding
	public void addContact() {
		System.out.println("Press--->1 For Exsisting Contact");
		System.out.println("Press--->2 For New Contact");
		System.out.println("Press--->3 Previous" );
		int option = scanner.nextInt();
		if(option==3)
		{
			HomeView homeView = new HomeView();
			homeView.start();
		}
		addRemoveController.optionForNewOrExsisting(option);

	}

	// Method To add New Contact
	@Override
	public void addNewContact() {
		System.out.println("Enter Name");
		String name = scanner.next();
		String phoneNumber = null;
		boolean value = true;
		while (value) {
			System.out.println("Enter Phone Number");
			phoneNumber = scanner.next();
			if (!phoneNumber.matches("[0-9]+") || phoneNumber.length() != 10) {
				System.out.println("Enter Valid Input");
			} else {
				value = false;
			}
		}
		String mailId = null;
		boolean mailvalue = true;
		while (mailvalue) {
			System.out.println("Enter mail ID");
			mailId = scanner.next();
			if (!mailId.matches("[A-Za-z0-9]+@.(.+)$")) {
				System.out.println("Enter Valid Input");
			} else {
				mailvalue = false;
			}
		}
		System.out.println("Enter Date Of Birth (yyyy-mm-dd)");
		String dateOfBirth = scanner.next();
		// Passing To Controller
		if (addRemoveController.addContact(name, phoneNumber, mailId, dateOfBirth)) {
			System.out.println("SuccessFully Added");
			addContact();
		} else {
			System.out.println("Already Exsist Account");
			addContact();
		}
	}

	// Method To Add Number To Exsisting Contact
	@Override
	public void addExsistingContact() {
		System.out.println("Enter Name That Already Exsist In Contact");
		String name = scanner.next();
		String phoneNumber = null;
		boolean value = true;
		while (value) {
			System.out.println("Enter Phone Number");
			phoneNumber = scanner.next();
			if (!phoneNumber.matches("[0-9]+") || phoneNumber.length() != 10) {
				System.out.println("Enter Valid Input");
			} else {
				value = false;
			}
		}
		if (addRemoveController.addInExsisitAccount(name, phoneNumber)) {
			System.out.println("SuccessFully Added");
			addContact();
		} else {
			System.out.println("No Such Contact Exsist");
			addContact();
		}
	}

	public void removeContact() {
		System.out.println("Press---> 1 For Delete Entire Contact");
		System.out.println("Press---> 2 For Delete Number In Contact");
		int option = scanner.nextInt();
		addRemoveController.removeOption(option);

	}

	@Override
	public void removeNumberInContact() {
		System.out.println("Enter Name");
		String name = scanner.next();
		List<String> contactList = addRemoveController.removeContact(name);
		if (contactList.size() == 0) {
			System.out.println("No Such Contact Exsist");
			HomeView homeView = new HomeView();
			homeView.start();
		} else {
			// Local Just To Serializing The Contact List
			int i = 1;
			for (String contacts : contactList) {
				System.out.println("Press--->" + (i++) + contacts);
			}
			int option = scanner.nextInt();
			String phoneNumber = addRemoveController.selectContact(option, contactList);
			if (addRemoveController.remove(phoneNumber, name))
				System.out.println("Deleted SuccessFully");
			else
				System.out.println("Not Such Cotact Found");
		}
	}

	// To Delete Entire Contact
	@Override
	public void removeEntireContact() {
		System.out.println("Enter Name");
		String name = scanner.next();
		if (addRemoveController.removeEntireContact(name)) {
			System.out.println("Removed Successfully");
			HomeView homeView = new HomeView();
			homeView.start();
		} else {
			System.out.println("No Such Contact");
		}
	}

}

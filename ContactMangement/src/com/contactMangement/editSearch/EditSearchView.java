package com.contactMangement.editSearch;

import java.util.Scanner;

import com.contactMangement.dto.ContactInfo;
import com.contactMangement.home.HomeView;

public class EditSearchView implements EditSearchViewCallBack {

	private Scanner scanner = new Scanner(System.in);

	private EditSearchControllerCallBack editSearchController;

	public EditSearchView() {
		editSearchController = new EditSearchController(this);
	}

	public static void main(String[] args) {
		EditSearchView editSearchView = new EditSearchView();
	}

	public void editContact() {
		System.out.println("Enter Name");
		String name = scanner.next();
		ContactInfo contact = editSearchController.editContact(name);
		if (contact == null) {
			System.out.println("No Such Contact Found");
			HomeView homeView = new HomeView();
			homeView.start();
		} else {
			System.out.println("Enter Number To Change");
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
				int i = 1;
				for (String phNo : contact.getPhoneNumber()) {
					System.out.println("Press--->" + (i++) +" "+ phNo);
				}
			int option=scanner.nextInt();	
			if(editSearchController.changeNumber(option,phoneNumber,name))
			{
				System.out.println("SuccessFully Changed");
				HomeView homeView = new HomeView();
				homeView.start();
			}
			else {
				System.out.println("No Such Elemnet Found");
				HomeView homeView = new HomeView();
				homeView.start();
			}

		}
	}

	public void serachContact() {
		System.out.println("Enter Name");
		String name = scanner.next();
		ContactInfo contact = editSearchController.searchContact(name);
		if (contact != null) {
			System.out.println("No Such Contact Found");
			HomeView homeView = new HomeView();
			homeView.start();
		} else {
			int i = 1;
			System.out.println("Name :" + contact.getName());
			System.out.println("MailId :" + contact.getMailId());
			System.out.println("MailId :" + contact.getDateOfBirth());
			for (String phNo : contact.getPhoneNumber()) {
				System.out.println("Number" + (i++) + phNo);
			}
			HomeView homeView = new HomeView();
			homeView.start();
		}
	}

}

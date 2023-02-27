package com.contactMangement.home;

import java.util.List;
import java.util.Scanner;

import com.contactMangement.addRemove.AddRemoveView;
import com.contactMangement.dto.ContactInfo;
import com.contactMangement.editSearch.EditSearchView;

public class HomeView implements HomeViewCallBack {

	private Scanner scanner = new Scanner(System.in);

	private HomeControllerCallBack homeController;

	public HomeView() {
		homeController = new HomeController(this);
	}

	public static void main(String[] args) {
		HomeView homeView = new HomeView();
		homeView.start();
	}

	public void start() {
		System.out.println("Press--->1 Adding Contact");
		System.out.println("Press--->2 Removing Contact");
		System.out.println("Press--->3 Searching Contact");
		System.out.println("Press--->4 Editing Contact");
		System.out.println("Press--->5 Viewing ContactList");
		int option = scanner.nextInt();
		homeController.optionSelect(option);

	}

	@Override
	public void addContact() {
		AddRemoveView addRemoveView = new AddRemoveView();
		addRemoveView.addContact();
	}

	@Override
	public void removeContact() {
		AddRemoveView addRemoveView = new AddRemoveView();
		addRemoveView.removeContact();
	}

	@Override
	public void serachContact() {
		EditSearchView editSearchView = new EditSearchView();
		editSearchView.serachContact();
	}

	@Override
	public void editContact() {
		EditSearchView editSearchView = new EditSearchView();
		editSearchView.editContact();
	}

	@Override
	public void viewContact() {
		List<ContactInfo> contactList = homeController.viewContact();
		if (contactList.size() == 0) {
			System.out.println("No Contacts");
			start();
		} else {
			for (ContactInfo contact : homeController.viewContact()) {
				System.out.println("Name :" + (contact.getName()));
				System.out.println("Mail Id  :" + contact.getMailId());
				System.out.println("DOB :" + contact.getDateOfBirth());
				for (String contacts : contact.getPhoneNumber()) {
					System.out.println("Number :" + contacts);
				}
			}
			start();
		}

	}

}

package com.contactMangement.addRemove;

import java.util.List;

public class AddRemoveController implements AddRemoveControllerCallBack, AddRemoveControllerModelCallBack {

	private AddRemoveViewCallBack addRemoveView;
	private AddRemoveModelCallBack addRemoveModel;

	public AddRemoveController(AddRemoveViewCallBack addRemoveView) {
		this.addRemoveView = addRemoveView;
		addRemoveModel = new AddRemoveModel(this);
	}

	@Override
	public void optionForNewOrExsisting(int option) {
		switch (option) {
		case 1:
			addRemoveView.addExsistingContact();
			break;
		case 2:
			addRemoveView.addNewContact();
			break;
		default:
			System.out.println("Enter Valid Input");
			addRemoveView.addContact();
		}

	}

	// Method To Pass To Model New Contact Info
	@Override
	public boolean addContact(String name, String phoneNumber, String mailId, String dateOfBirth) {
		return addRemoveModel.addContact(name, phoneNumber, mailId, dateOfBirth);

	}

//Method To Just To Just Pass To Model
	@Override
	public boolean addInExsisitAccount(String name, String phoneNumber) {
		return addRemoveModel.addInExsisitAccount(name, phoneNumber);

	}

	@Override
	public List<String> removeContact(String name) {
		return addRemoveModel.removeContact(name);
	}

	@Override
	public String selectContact(int option, List<String> contactList) {
		return contactList.get(option+1);
		
	}

	//Mrthod To Remove The Contact
	@Override
	public boolean remove(String phoneNumber,String name) {
		return addRemoveModel.remove(phoneNumber,name);
		
	}

	@Override
	public void removeOption(int option) {
		switch(option) {
		case 1:
			addRemoveView.removeEntireContact();
			break;
		case 2:
			addRemoveView.removeNumberInContact();
			break;
		default:
			System.out.println("Enter Valid Input");
			addRemoveView.removeContact();
		}
		
	}

	@Override
	public boolean removeEntireContact(String name) {
		return addRemoveModel.removeEntireContact(name);
		
	}

}

package com.contactMangement.addRemove;

import java.util.List;

import com.contactMangement.repository.ContactMangementRepository;

public class AddRemoveModel implements AddRemoveModelCallBack {

	private AddRemoveControllerCallBack addRemoveController;

	public AddRemoveModel(AddRemoveControllerCallBack addRemoveController) {
		this.addRemoveController = addRemoveController;
	}

	@Override
	public boolean addContact(String name, String phoneNumber, String mailId, String dateOfBirth) {
		return ContactMangementRepository.getInstance().addContact(name,phoneNumber,mailId,dateOfBirth);
	}

	@Override
	public boolean addInExsisitAccount(String name, String phoneNumber) {
		return ContactMangementRepository.getInstance().addInExsisitAccount(name, phoneNumber);
		
	}

	@Override
	public List<String> removeContact(String name) {
		return ContactMangementRepository.getInstance().removeContact(name);
		
	}

	@Override
	public boolean remove(String phoneNumber,String name) {
		return ContactMangementRepository.getInstance().remove(phoneNumber,name);
		
	}

	@Override
	public boolean removeEntireContact(String name) {
		return ContactMangementRepository.getInstance().removeEntireContact(name);
		
	}

}

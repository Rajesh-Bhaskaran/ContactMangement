package com.contactMangement.editSearch;

import com.contactMangement.dto.ContactInfo;
import com.contactMangement.repository.ContactMangementRepository;

public class EditSearchModel implements EditSearchModelCallBack {

	private EditSearchControllerCallBack editSearchController;

	public EditSearchModel(EditSearchControllerCallBack editSearchController) {
		this.editSearchController = editSearchController;
	}

	@Override
	public ContactInfo searchContact(String name) {
		return ContactMangementRepository.getInstance().searchContact(name);
		
	}

	@Override
	public ContactInfo editContact(String name) {
		return ContactMangementRepository.getInstance().editContact(name);
		
	}

	@Override
	public boolean changeNumber(int option, String phoneNumber,String name) {
		return ContactMangementRepository.getInstance().changeNumber(option,phoneNumber,name);
		
	}

}

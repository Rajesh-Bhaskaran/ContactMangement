package com.contactMangement.editSearch;

import com.contactMangement.dto.ContactInfo;

public class EditSearchController implements EditSearchControllerCallBack, EditSearchControllerModelCallBack {

	private EditSearchViewCallBack editSearchView;
	private EditSearchModelCallBack editSearchModel;

	public EditSearchController(EditSearchViewCallBack editSearchView) {
		this.editSearchView = editSearchView;
		editSearchModel = new EditSearchModel(this);
	}

	@Override
	public ContactInfo searchContact(String name) {
		return editSearchModel.searchContact(name);
		
	}

	@Override
	public ContactInfo editContact(String name) {
		return editSearchModel.editContact(name);
	}

	@Override
	public boolean changeNumber(int option, String phoneNumber,String name) {
		return editSearchModel.changeNumber(option,phoneNumber,name);
		
	}

}

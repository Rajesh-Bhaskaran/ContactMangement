package com.contactMangement.editSearch;

import com.contactMangement.dto.ContactInfo;

public interface EditSearchControllerCallBack {

	ContactInfo searchContact(String name);

	ContactInfo editContact(String name);

	boolean changeNumber(int option, String phoneNumber, String name);

}

package com.contactMangement.editSearch;

import com.contactMangement.dto.ContactInfo;

public interface EditSearchModelCallBack {

	ContactInfo searchContact(String name);

	ContactInfo editContact(String name);

	boolean changeNumber(int option, String phoneNumber, String name);

}

package com.contactMangement.addRemove;

import java.util.List;

public interface AddRemoveModelCallBack {

	boolean addContact(String name, String phoneNumber, String mailId, String dateOfBirth);

	boolean addInExsisitAccount(String name, String phoneNumber);

	List<String> removeContact(String name);

	boolean remove(String phoneNumber, String name);

	boolean removeEntireContact(String name);

}

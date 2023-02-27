package com.contactMangement.addRemove;

import java.util.List;

public interface AddRemoveControllerCallBack {

	void optionForNewOrExsisting(int option);

	boolean addContact(String name, String phoneNumber, String mailId, String dateOfBirth);

	boolean addInExsisitAccount(String name, String phoneNumber);

	List<String> removeContact(String name);

	String selectContact(int option, List<String> contactList);

	boolean remove(String phoneNumber, String name);

	void removeOption(int option);

	boolean removeEntireContact(String name);

	

	

	

}

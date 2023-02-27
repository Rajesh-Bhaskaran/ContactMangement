package com.contactMangement.repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.contactMangement.dto.ContactInfo;

public class ContactMangementRepository {

	private static ContactMangementRepository contactRepo;
    private List<ContactInfo> contactInfo=new ArrayList<>();
	
	public static ContactMangementRepository getInstance() {
		if(contactRepo==null)
		{
			contactRepo=new ContactMangementRepository();
			contactRepo.initialSetup();
		}
		return contactRepo;
	}

	private void initialSetup() {
		
	}

	public List<ContactInfo> viewContact() {
	return 	contactInfo;	
	}

	public boolean addContact(String name, String phoneNumber, String mailId, String dateOfBirth) {
		for(ContactInfo contacts:contactInfo) {
			if(name.equals(contacts.getName())) {
				return false;
			}
		}
		List<String> list=new ArrayList<>();
		list.add(phoneNumber);
		return contactInfo.add(new ContactInfo(name,list,mailId,dateOfBirth));
		
	}

	public boolean addInExsisitAccount(String name, String phoneNumber) {
		boolean value=false;
		for(ContactInfo contacts:contactInfo) {
			if(contacts.getName().equals(name)) {
				contacts.getPhoneNumber().add(phoneNumber);
				value=true;
			}
		}
		return value;
	}

	public List<String> removeContact(String name) {
		for(ContactInfo contacts:contactInfo) {
			if(name.equals(contacts.getName())) {
				return contacts.getPhoneNumber(); 
			}
	}
		return new ArrayList<String>();
	
	
}


	public boolean remove(String phoneNumber, String name) {
		for(ContactInfo contacts:contactInfo) {
			if(name.equals(contacts.getName())){
				for(String phNumber:contacts.getPhoneNumber()) {
					if(phNumber.equals(phoneNumber))
						contacts.getPhoneNumber().remove(phNumber);
					return true;
				}
			}
		}
		return false;
		
	}

	public boolean removeEntireContact(String name) {
		for(ContactInfo contacts:contactInfo) {
			if(contacts.getName().equals(name)) {
				return contactInfo.remove(contacts);
			}
		}
		return false;
	}

	public ContactInfo searchContact(String name) {
		for(ContactInfo contacts:contactInfo) {
			if(contacts.getName().equals(name)) {
				return contacts;
			}
		}
		return null;
		
	}

	public ContactInfo editContact(String name) {
		for(ContactInfo contacts:contactInfo) {
			if(contacts.getName().equals(name)) {
				return contacts;
			}
		}
		return null;
		
	}

	public boolean changeNumber(int option, String phoneNumber, String name) {
		for(ContactInfo contacts:contactInfo) {
			if(contacts.getName().equals(name)) {
				contacts.getPhoneNumber().set(option-1, phoneNumber);
				return true;
			}
		}
		return false;
	}
}

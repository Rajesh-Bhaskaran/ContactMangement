package com.contactMangement.dto;

import java.time.LocalDate;
import java.util.List;

public class ContactInfo {
	private String Name;
	private List<String>phoneNumber;
	private String mailId;
	private LocalDate dateOfBirth;

	public ContactInfo(String name, List<String>phoneNumber, String mailId, String dateOfBirth) {
		super();
		Name = name;
		this.phoneNumber = phoneNumber;
		this.mailId = mailId;
		this.dateOfBirth=LocalDate.parse(dateOfBirth);
		
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public List<String> getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(List<String> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}

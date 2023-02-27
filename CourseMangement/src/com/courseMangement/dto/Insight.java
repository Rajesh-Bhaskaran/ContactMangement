package com.courseMangement.dto;

public class Insight {
	
private String userName;
private Long phoneNumber;
private String mailId;

public Insight(String userName, Long phoneNumber, String mailId) {
	super();
	this.userName = userName;
	this.phoneNumber = phoneNumber;
	this.mailId = mailId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public Long getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(Long phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getMailId() {
	return mailId;
}
public void setMailId(String mailId) {
	this.mailId = mailId;
}
}

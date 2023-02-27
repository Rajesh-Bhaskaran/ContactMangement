package com.courseMangement.dto;

import java.util.List;

public class Trainer {
 
	private static int id=100;
	private String trainerId;
	private String trainerName;
	private long phoneNumber;
	private String trainerMail;
	
	public Trainer(String trainerName, long phoneNumber, String trainerMail, List<Course> courseList) {
		super();
		this.trainerName = trainerName;
		this.phoneNumber = phoneNumber;
		this.trainerMail = trainerMail;
		this.courseList = courseList;
		trainerId=trainerName+(id++);
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getTrainerMail() {
		return trainerMail;
	}
	public void setTrainerMail(String trainerMail) {
		this.trainerMail = trainerMail;
	}
	public List<Course> getCourseList() {
		return courseList;
	}
	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}
	private List<Course> courseList;
}

package com.courseMangement.dto;

import java.util.List;

public class Student {
	private static int id=500;
	private String studentId;
	private String studentName;
	private long phoneNumber;
	private String mail;
	private List<Course> courseList;

	public Student(String studentName, long phoneNumber, String mail, List<Course> courseList) {
		super();
		this.studentName = studentName;
		this.phoneNumber = phoneNumber;
		this.mail = mail;
		this.courseList = courseList;
		studentId=studentName+(id++);
	}

	public Student() {
		
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public List<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}
}

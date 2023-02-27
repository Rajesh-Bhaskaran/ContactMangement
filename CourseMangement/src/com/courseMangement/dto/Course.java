package com.courseMangement.dto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Course {

	private static int id=1;
	private String courseId;
	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Course.id = id;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	private String courseName;
	private String trainerName;
	private List<Student> studentList;
	private int duration;
	private LocalDate startDate;
	private LocalDate endDate;
	private LocalTime startTime;
	private LocalTime endTime;
	private int numberOfStudents;
	private int courseFee;
	private int amountCollected;

	public Course(String courseName, String trainerName, List<Student> studentList, int duration, String startDate,
			String endDate, String startTime, String endTime, int numberOfStudents, int courseFee,
			int amountCollected) {
		super();
		this.courseName = courseName;
		this.trainerName = trainerName;
		this.studentList = studentList;
		this.duration = duration;
		//Converting String To Date Format
		//LocalDate formatteddate=LocalDate.parse(startDate);
		//this.startDate = formatteddate;
		this.startDate=LocalDate.parse(startDate);
		//Converting String To Date Format
		LocalDate endformatteddate=LocalDate.parse(endDate);
		this.endDate = endformatteddate;
		//Converting String To Time Format
		LocalTime formattedtime=LocalTime.parse(startTime);
		this.startTime = formattedtime;
		//Converting String To Time Format
		LocalTime formattedendtime=LocalTime.parse(endTime);
		this.endTime = formattedendtime;
		this.numberOfStudents = numberOfStudents;
		this.courseFee = courseFee;
		this.amountCollected = amountCollected;
		courseId=courseName+(id++);
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public LocalTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}

	public int getCourseFee() {
		return courseFee;
	}

	public void setCourseFee(int courseFee) {
		this.courseFee = courseFee;
	}

	public int getAmountCollected() {
		return amountCollected;
	}

	public void setAmountCollected(int amountCollected) {
		this.amountCollected = amountCollected;
	}

}

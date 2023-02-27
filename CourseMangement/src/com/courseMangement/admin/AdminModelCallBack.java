package com.courseMangement.admin;

import java.util.List;

import com.courseMangement.dto.Student;

public interface AdminModelCallBack {

	boolean checkAdmin(String username, String password);

	boolean addCourse(String courseName, String trainerName, List<Student> studentList, int duration, String startDate,
			String endDate, String startTime, String endTime, int numberOfStudents, int courseFee, int amountCollected);

	boolean removeCourse(String courseName);

}

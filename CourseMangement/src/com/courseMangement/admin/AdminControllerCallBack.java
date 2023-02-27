package com.courseMangement.admin;

import java.util.List;

import com.courseMangement.dto.Student;

public interface AdminControllerCallBack {

	boolean checkAdmin(String username, String password);

	void selectOption(int option);

	boolean addCourse(String courseName, String trainerName, List<Student> studentList, int duration, String startDate,
			String endDate, String startTime, String endTime, int numberOfStudents, int courseFee, int amountCollected);

	boolean removeCourse(String courseName);

}

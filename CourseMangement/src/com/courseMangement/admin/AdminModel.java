package com.courseMangement.admin;

import java.util.List;

import com.courseMangement.dto.Student;
import com.courseMangement.repository.CourseManageMentRepository;

public class AdminModel implements AdminModelCallBack {

	private  AdminControllerCallBack adminController;
	
	public AdminModel( AdminControllerCallBack adminController) {
		this.adminController=adminController;
	}

	@Override
	public boolean checkAdmin(String username, String password) {
		return CourseManageMentRepository.getInstance().checkAdmin(username,password);
		
	}

	@Override
	public boolean addCourse(String courseName, String trainerName, List<Student> studentList, int duration,
			String startDate, String endDate, String startTime, String endTime, int numberOfStudents, int courseFee,
			int amountCollected) {
		return CourseManageMentRepository.getInstance().addCourse(courseName,trainerName,studentList,duration,startDate,endDate,startTime,endTime,numberOfStudents,courseFee,amountCollected);
		
	}

	@Override
	public boolean removeCourse(String courseName) {
		return CourseManageMentRepository.getInstance().removeCourse(courseName);	
	}

}

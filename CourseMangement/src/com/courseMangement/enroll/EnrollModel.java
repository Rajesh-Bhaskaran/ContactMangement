package com.courseMangement.enroll;

import java.util.List;

import com.courseMangement.dto.Course;
import com.courseMangement.repository.CourseManageMentRepository;

public class EnrollModel implements EnrollModelCallBack {

	private  EnrollControllerCallBack enrollController;
	
	public EnrollModel( EnrollControllerCallBack enrollController) {
		this.enrollController=enrollController;
	}

	@Override
	public List<Course> getCourse() {
		return CourseManageMentRepository.getInstance().getCourse();	
	}

	@Override
	public boolean enroll(Course selectedCourse,long phoneNumber) {
		return CourseManageMentRepository.getInstance().enroll(selectedCourse,phoneNumber);
		
	}

}

package com.courseMangement.enroll;

import java.util.List;

import com.courseMangement.dto.Course;

public class EnrollController implements EnrollControllerCallBack,EnrollControllerModelCallBack  {

	private EnrollViewCallBack enrollView;
	private EnrollModelCallBack enrollModel;
	
	public EnrollController(EnrollViewCallBack enrollView) {
		this.enrollView=enrollView;
		enrollModel=new EnrollModel(this);
	}

	@Override
	public List<Course> getCourse() {
		return enrollModel.getCourse();
	}

	@Override
	public Course selectCourse(int option, List<Course> courseList) {
				return courseList.get(option-1);
	}

	@Override
	public void prevOrNext(int option,Course selectedCourse) {
		switch(option) {
		case 1:
			enrollView.enroll(selectedCourse);
			break;
		case 2:
			enrollView.showCourse();
			break;
		default:
			System.out.println("Enter Valid Input");
			enrollView.validInput(selectedCourse);
			break;
		}
	}

	@Override
	public boolean enroll(Course selectedCourse,long phoneNumber) {
		return enrollModel.enroll(selectedCourse,phoneNumber);
		
	}

	
	

	
}

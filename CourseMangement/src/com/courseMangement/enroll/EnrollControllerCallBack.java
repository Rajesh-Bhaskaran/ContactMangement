package com.courseMangement.enroll;

import java.util.List;

import com.courseMangement.dto.Course;

public interface EnrollControllerCallBack {

	List<Course> getCourse();

	Course selectCourse(int option, List<Course> courseList);

	void prevOrNext(int option, Course selectedCourse);

	boolean enroll(Course selectedCourse, long phoneNumber);

	

}

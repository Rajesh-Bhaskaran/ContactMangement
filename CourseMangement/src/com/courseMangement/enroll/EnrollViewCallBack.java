package com.courseMangement.enroll;

import com.courseMangement.dto.Course;

public interface EnrollViewCallBack {

	void showCourse();

	void enroll(Course selectedCourse);

	void validInput(Course selectedCourse);

}

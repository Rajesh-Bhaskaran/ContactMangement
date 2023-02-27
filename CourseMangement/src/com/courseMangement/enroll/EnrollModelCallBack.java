package com.courseMangement.enroll;

import java.util.List;

import com.courseMangement.dto.Course;

public interface EnrollModelCallBack {

	List<Course> getCourse();

	boolean enroll(Course selectedCourse, long phoneNumber);

}

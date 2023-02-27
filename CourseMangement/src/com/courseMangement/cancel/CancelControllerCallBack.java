package com.courseMangement.cancel;

import java.util.List;

import com.courseMangement.dto.Course;

public interface CancelControllerCallBack {

	List<Course> cancel(long phoneNumber);

	Course selectDeletingCourse(int option, List<Course> courseList);

	boolean cancelCours(Course cours, long phoneNumber);



	

}

package com.courseMangement.cancel;

import java.util.List;

import com.courseMangement.dto.Course;

public interface CancelControllerModelCallBack {

	Course selectDeletingCourse(int option, List<Course> courseList);

}

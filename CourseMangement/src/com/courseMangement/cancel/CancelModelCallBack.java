package com.courseMangement.cancel;

import java.util.List;

import com.courseMangement.dto.Course;

public interface CancelModelCallBack {

	List<Course> cancel(long phoneNumber);

	boolean cancelCours(Course cours, long phoneNumber);

}

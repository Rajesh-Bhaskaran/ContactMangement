package com.courseMangement.login;

import java.util.List;

import com.courseMangement.dto.Course;

public interface LoginControllerCallBack {

	void selectUser(int option);

	List<Course> getCourse();

	

	void forCourseEnroll();

	void previousOrFurther(int option);

	boolean addUser(String name, long phoneNumber, String mail);

}

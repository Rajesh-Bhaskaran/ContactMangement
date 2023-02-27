package com.courseMangement.login;

import java.util.List;

import com.courseMangement.dto.Course;

public interface LoginModelCallBack {

	List<Course> getCourse();

	boolean addUser(String name, long phoneNumber, String mail);

}

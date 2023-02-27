package com.courseMangement.login;

import java.util.List;

import com.courseMangement.dto.Course;
import com.courseMangement.repository.CourseManageMentRepository;

public class LoginModel implements LoginModelCallBack {

	private  LoginControllerCallBack loginController;
	
	public LoginModel( LoginControllerCallBack loginController) {
		this.loginController=loginController;
	}

	@Override
	public List<Course> getCourse() {
		return CourseManageMentRepository.getInstance().getCourse();	
	}

	@Override
	public boolean addUser(String name, long phoneNumber, String mail) {
		return CourseManageMentRepository.getInstance().addUser(name,phoneNumber,mail);
		
	}

}

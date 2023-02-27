package com.courseMangement.login;

import java.util.List;

import com.courseMangement.dto.Course;

public class LoginController implements LoginControllerCallBack,LoginControllerModelCallBack  {

	private LoginViewCallBack loginView;
	private LoginModelCallBack loginModel;
	
	public LoginController(LoginViewCallBack loginView) {
		this.loginView=loginView;
		loginModel=new LoginModel(this);
	}

	//Logical Method For Selecting Login From User Given Input
	@Override
	public void selectUser(int option) {
		switch(option) {
		case 1:
			loginView.adminLogin();
			break;
		case 2:
			loginView.teacherLogin();
			break;
		case 3:
			loginView.studentLogin();
			break;
		case 4:
			loginView.studentSignUp();
			break;
		default:
			System.out.println("Enter Valid Input");
			loginView.selectuser();
		}
	}

	@Override
	public List<Course> getCourse() {
		return loginModel.getCourse();
		
	}

	
	

	
	public void forCourseEnroll() {
		
		
	}

	@Override
	public void previousOrFurther(int option) {
		switch(option)	{
		case 1:
			loginView.enroll();
		case 2:
			loginView.showCourse();
		}
	}

	//Method To Add New User 
	@Override
	public boolean addUser(String name, long phoneNumber, String mail) {
		return loginModel.addUser(name,phoneNumber,mail);
		
	}

	
	

}

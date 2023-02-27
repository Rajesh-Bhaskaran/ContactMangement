package com.courseMangement.login;

import java.util.List;
import java.util.Scanner;

import com.courseMangement.admin.AdminView;
import com.courseMangement.cancel.CancelView;
import com.courseMangement.dto.Course;
import com.courseMangement.enroll.EnrollView;

public class LoginView implements LoginViewCallBack{

	private Scanner scanner= new Scanner(System.in);
	
	private LoginControllerCallBack loginController;
	public LoginView(){
		 loginController= new LoginController(this);
	}
	
	public static void main(String[] args) {
		LoginView loginView= new LoginView();
		loginView.selectuser();
	}

	//Method To Select User,Getting From User
	public void selectuser() {
		System.out.println("Select Number");
		System.out.println("Press --->1 Admin Login");
		System.out.println("Press --->2 Trainer Login");
		System.out.println("Press --->3 Student Login");
		System.out.println("Press --->4 Student SignUp");
		int option=scanner.nextInt();
		loginController.selectUser(option);
	}
	

	@Override
	public void adminLogin() {
		AdminView adminview= new AdminView();
		adminview.goToadmin();
	}

	@Override
	public void teacherLogin() {
		
		
	}

	@Override
	public void studentLogin() {
		signUpdetails();
		
	}

	@Override
	public void studentSignUp() {
		signUpdetails();
		
	}

	private void signUpdetails() {
		System.out.println("Enter Name");
		String name=scanner.next();
		System.out.println("Enter Mobile Number");
		long phoneNumber=scanner.nextLong();
		System.out.println("Enter Mail");
		String mail=scanner.next();
		//Method Calling To Add User
		if(loginController.addUser(name,phoneNumber,mail))
			System.out.println("Successfully Added");
		else 
			System.out.println("Already Exsisit Account");
		System.out.println("Press--->1 For Enroll");
		System.out.println("Press---->2 For Cancel");
		int option=scanner.nextInt();
		if(option==1)
		showCourse();
		else
			cancel();
	}

	private void cancel() {
		CancelView  cancelView= new  CancelView();
		cancelView.cancel();
	}

	public void showCourse() {
		EnrollView enrollView= new  EnrollView();
		enrollView.showCourse();
	}

	@Override
	public void enroll() {
			
	}

	

	



}

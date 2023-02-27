package com.courseMangement.admin;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.courseMangement.dto.Student;
import com.courseMangement.login.LoginView;

public class AdminView implements  AdminViewCallBack{

	private Scanner scanner= new Scanner(System.in);
	
	private AdminControllerCallBack adminController;
	 public AdminView(){
		 adminController= new  AdminController(this);
	}
	
	public static void main(String[] args) {
		 AdminView  adminView= new  AdminView();
	}

	public void goToadmin() {
		System.out.println("Enter UserName");	
		String username=scanner.next();
		System.out.println("Enter Password");
		String password=scanner.next();
		if(adminController.checkAdmin(username,password)) {
			adminpowers();
		}else {
			System.out.println("Invalid");
			LoginView loginView= new LoginView();
			loginView.selectuser();
		}
	}

	//option For Showing Adding Or Removing Course
	public void adminpowers() {
		System.out.println("Press---->1 For Adding Course");
		System.out.println("Press---->2 For Removing Course");
		System.out.println("Press---->3 For Exit");
		int option=scanner.nextInt();
		adminController.selectOption(option);
	}

	//Method To Get Info For Adding Course
	@Override
	public void addCourse() {
		System.out.println("Enter Course Name");
		String courseName=scanner.next();
		System.out.println("Enter Trainer Name");
		String trainerName=scanner.next();
		List<Student> studentList=new ArrayList<>();
		System.out.println("Enter Duration");
		int duration=scanner.nextInt();
		System.out.println("Enter Start Date(yyyy/mm/dd)");
		String startDate=scanner.next();
		System.out.println("Enter End Date (yyyy/mm/dd)");
		String endDate=scanner.next();
		System.out.println("Enter 	Start Timing (Hour:Minutes)");
		String startTime=scanner.next();
		System.out.println("Enter End Timing (Hour:Minutes)");
		String endTime=scanner.next();
		int numberOfStudents=0;
		System.out.println("Enter Course Fee");
		int courseFee=scanner.nextInt();
		int amountCollected=0;
		if(adminController.addCourse(courseName,trainerName,studentList,duration,startDate,endDate,startTime,endTime,numberOfStudents,courseFee,amountCollected))
		{
			System.out.println("SuccessFully Added");
			System.out.println("--------------------");
			adminpowers();
		}else {
			System.out.println("Already Exsisting Course");
			System.out.println("--------------------");
			adminpowers();
		}
	}

	@Override
	public void removeCourse() {
		System.out.println("Enter Course Name");
		String courseName=scanner.next();
		if(adminController.removeCourse(courseName))
		{
			System.out.println("Course SuccessFully Removed");
			adminpowers();
		}
		else {
			System.out.println("No Such Course Exsisit");
			adminpowers();
		}
	}

	@Override
	public void exit() {
		LoginView loginview= new LoginView();
		 loginview.selectuser();
		
	}

}

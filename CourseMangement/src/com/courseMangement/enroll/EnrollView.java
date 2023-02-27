package com.courseMangement.enroll;

import java.util.List;
import java.util.Scanner;

import com.courseMangement.dto.Course;
import com.courseMangement.login.LoginView;

public class EnrollView implements  EnrollViewCallBack{

	private Scanner scanner= new Scanner(System.in);
	
	private EnrollControllerCallBack enrollController;
	public EnrollView(){
		 enrollController= new  EnrollController(this);
	}
	
	public static void main(String[] args) {
		EnrollView enrollView= new  EnrollView();
	}

	public void showCourse() {
		//Local Variable TO Just Serializing The Course
		int i=1;
	//Iterating To Show The Course Name
		List<Course> courseList=enrollController.getCourse();
		for(Course courseName:courseList)
		System.out.println("Press--->"+(i++)+" "+(courseName.getCourseName()));
		int option=scanner.nextInt();
     	Course selectedCourse=enrollController.selectCourse(option,courseList);
     	viewCourseDetails(selectedCourse);
		
	}

	private void viewCourseDetails(Course selectedCourse) {
		System.out.println("Course Details");
		System.out.println("--------------------------------------------");
		System.out.println("Course Name :"+selectedCourse.getCourseName());
		System.out.println("Trainer Name :"+selectedCourse.getTrainerName());
		System.out.println("Duration :"+selectedCourse.getDuration());
		System.out.println("Fees :"+selectedCourse.getCourseFee());
		System.out.println("Starting Date :"+selectedCourse.getStartDate());
		System.out.println("Ending Date :"+selectedCourse.getEndDate());
		System.out.println("Starting Time :"+selectedCourse.getStartTime());
		System.out.println("Ending Time :"+selectedCourse.getEndTime());
		System.out.println("-------------------------------------------");
		System.out.println("Press--->"+"1"+"Proceed To Payment");
		System.out.println("Press--->"+"2"+"For Previous Menu");
		int option=scanner.nextInt();
		enrollController.prevOrNext(option,selectedCourse);
	}

	@Override
	public void enroll(Course selectedCourse) {
		System.out.println("To Confirm Enroll Enter Phone Number");
		long phoneNumber=scanner.nextLong();
		if(enrollController.enroll(selectedCourse,phoneNumber))
			success();
		else
			failure();
	}

	private void failure() {
		System.out.println("You Have Already This Course Access");
		showCourse();
	}

	private void success() {
		System.out.println("SuccessFully Course Addedd");
		LoginView loginView= new LoginView();
		loginView.selectuser();
	}

	@Override
	public void validInput(Course selectedCourse) {
		int option=scanner.nextInt();
		enrollController.prevOrNext(option,selectedCourse);
	}

}

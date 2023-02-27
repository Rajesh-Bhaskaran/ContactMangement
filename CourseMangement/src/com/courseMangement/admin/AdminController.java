package com.courseMangement.admin;

import java.util.List;

import com.courseMangement.dto.Student;

public class AdminController implements AdminControllerCallBack,AdminControllerModelCallBack  {

	private AdminViewCallBack adminView;
	private AdminModelCallBack adminModel;
	
	public AdminController(AdminViewCallBack adminView) {
		this.adminView=adminView;
		adminModel=new AdminModel(this);
	}

	//Method To Passing Admin UserName And Password To Model Class
	@Override
	public boolean checkAdmin(String username, String password) {
		return adminModel.checkAdmin(username,password);
		
	}

	//Logical Method To Just To Select Adding Or Removong The Course
	@Override
	public void selectOption(int option) {
		switch(option) {
		case 1:
			adminView.addCourse();
		case 2:
			adminView.removeCourse();
		case 3:
		    adminView.exit();
		default:
			System.out.println("Enter Valid Input");
			adminView.adminpowers();
		}
	}

	@Override
	public boolean addCourse(String courseName, String trainerName, List<Student> studentList, int duration,
			String startDate, String endDate, String startTime, String endTime, int numberOfStudents, int courseFee,
			int amountCollected) {
		return adminModel.addCourse(courseName,trainerName,studentList,duration,startDate,endDate,startTime,endTime,numberOfStudents,courseFee,amountCollected);
		
	}

	@Override
	public boolean removeCourse(String courseName) {
		return adminModel.removeCourse(courseName);
		
	}

}

package com.courseMangement.cancel;

import java.util.List;
import java.util.Scanner;

import com.courseMangement.dto.Course;
import com.courseMangement.login.LoginView;

public class CancelView implements  CancelViewCallBack{

	private Scanner scanner= new Scanner(System.in);
	
	private CancelControllerCallBack cancelController;
	public CancelView(){
		cancelController= new  CancelController(this);
	}
	
	public static void main(String[] args) {
		CancelView  cancelView= new  CancelView();
	}

	public void cancel() {
		int i=1;
		System.out.println("Enter Number");
		long phoneNumber=scanner.nextLong();
		List<Course> courseList=cancelController.cancel(phoneNumber);
		if(courseList.size()==0)
			System.out.println("No Course Registered");
		else
		{
			for(Course cours:courseList) {
				System.out.println("Press--->"+(i++)+"For Cancel "+cours.getCourseName());
			}
			int option=scanner.nextInt();
			Course cours=cancelController.selectDeletingCourse(option,courseList);
		    cancelCourse(cours,phoneNumber);
		}
	}

	private void cancelCourse(Course cours, long phoneNumber) {
		if(cancelController.cancelCours(cours,phoneNumber))
			System.out.println("Successfully Cancel");
		else
			System.out.println("Not Cancelled");
		LoginView loginView= new LoginView();
		loginView.selectuser();
	}

}

package com.courseMangement.dto;

import java.util.ArrayList;
import java.util.List;

public class PaymentInfo {

	private static  List<Student>studentList= new ArrayList<>();

	

	public static void setStudentList(List<Student> studentList) {
		PaymentInfo.studentList = studentList;
	}



	public static List<Student> getStudentList() {
		return studentList;
	}



	public static void setStudentList(boolean add) {
		
	}

	
}

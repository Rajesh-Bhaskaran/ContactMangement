package com.courseMangement.cancel;

import java.util.List;

import com.courseMangement.dto.Course;
import com.courseMangement.repository.CourseManageMentRepository;

public class CancelModel implements CancelModelCallBack {

	private  CancelControllerCallBack cancelController;
	
	public CancelModel( CancelControllerCallBack cancelController) {
		this.cancelController=cancelController;
	}

	@Override
	public List<Course> cancel(long phoneNumber) {
		return CourseManageMentRepository.getInstance().cancel(phoneNumber);
		
	}

	@Override
	public boolean cancelCours(Course cours,long phoneNumber) {
		return CourseManageMentRepository.getInstance().cancelCours(cours,phoneNumber);
		
	}

}

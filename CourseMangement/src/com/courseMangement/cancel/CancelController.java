package com.courseMangement.cancel;

import java.util.List;

import com.courseMangement.dto.Course;

public class CancelController implements CancelControllerCallBack,CancelControllerModelCallBack  {

	private CancelViewCallBack cancelView;
	private CancelModelCallBack cancelModel;
	
	public CancelController(CancelViewCallBack adminView) {
		this.cancelView=adminView;
		cancelModel=new CancelModel(this);
	}

	@Override
	public List<Course> cancel(long phoneNumber) {
		return cancelModel.cancel(phoneNumber);
		
	}

	
	

	@Override
	public Course selectDeletingCourse(int option, List<Course> courseList) {
		return courseList.get(option-1);
		
	}

	@Override
	public boolean cancelCours(Course cours,long phoneNumber) {
		return cancelModel.cancelCours(cours,phoneNumber);
		
	}

	

	

}

package com.contactMangement.home;

import java.util.List;

import com.contactMangement.dto.ContactInfo;

public class HomeController implements HomeControllerCallBack, HomeControllerModelCallBack {

	private HomeViewCallBack homeView;
	private HomeModelCallBack homeModel;

	public HomeController(HomeViewCallBack homeView) {
		this.homeView = homeView;
		homeModel = new HomeModel(this);
	}

	@Override
	public void optionSelect(int option) {
		switch(option){
		case 1:
			homeView.addContact();
			break;
		case 2:
			homeView.removeContact();
			break;
		case 3:
			homeView.serachContact();
			break;
		case 4:
			homeView.editContact();
			break;
		case 5:
			homeView.viewContact();
			break;
		default:
			System.out.println("Enter Valid Input");
			homeView.start();
		}
		
	}

	@Override
	public List<ContactInfo> viewContact() {
		return homeModel.viewContact();
		
	}

}

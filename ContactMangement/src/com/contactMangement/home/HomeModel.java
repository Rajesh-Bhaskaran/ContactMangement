package com.contactMangement.home;

import java.util.List;

import com.contactMangement.dto.ContactInfo;
import com.contactMangement.repository.ContactMangementRepository;

public class HomeModel implements HomeModelCallBack {

	private HomeControllerCallBack homeController;

	public HomeModel(HomeControllerCallBack homeController) {
		this.homeController = homeController;
	}

	@Override
	public List<ContactInfo> viewContact() {
		return ContactMangementRepository.getInstance().viewContact();	
	}

}

package com.contactMangement.home;

import java.util.List;

import com.contactMangement.dto.ContactInfo;

public interface HomeControllerCallBack {

	void optionSelect(int option);

	List<ContactInfo> viewContact();

}

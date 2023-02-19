package com.flightreservation.login;

import java.util.List;

import com.flightreservation.dto.UserCredential;
import com.flightreservation.repositary.FlightRepository;

public class LoginModel implements LoginModelCallBack{

	private LoginControllerCallBack loginController;
	
	LoginModel(LoginControllerCallBack loginController){
		this.loginController=loginController;
	}

	@Override
	public List<UserCredential> getUserCredential() {
		return FlightRepository.getInstance().getUserCredential();
	}

	@Override
	public boolean addUserCredentials(String userName, String password) {
		FlightRepository.getInstance().addUserCredentials(userName,password);
		return false;
	}
}

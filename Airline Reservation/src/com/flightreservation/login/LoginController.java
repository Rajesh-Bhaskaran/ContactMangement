package com.flightreservation.login;

import java.util.List;

import com.flightreservation.dto.UserCredential;

public class LoginController implements LoginControllerCallBack {

	private LoginViewCallBack loginView;
	private LoginModelCallBack loginModel;
	
	LoginController(LoginViewCallBack loginView){
		this.loginView=loginView;
		loginModel=new LoginModel(this);
	}

	@Override
	public void chooseOption(int option) {
	    if(option==1)
		{
		loginView.userCredentials();	
		}
		else if(option==2)	
		{
		loginView.getuserCredentials();
		}
	}

	@Override
	public boolean checkUserCredential(String userName, String password) {
		List<UserCredential> userCredential=loginModel.getUserCredential();
		for(UserCredential user:userCredential) {
			if(user.getUsername().equals(userName)&&user.getPassword().equals(password))
				return true;
		}
		return false;
	}

	@Override
	public boolean addUserCredentials(String userName, String password) {
		if(loginModel.addUserCredentials(userName,password))
			return true;
		return false;
	}
}

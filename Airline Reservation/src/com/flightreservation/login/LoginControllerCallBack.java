package com.flightreservation.login;

public interface LoginControllerCallBack {

	void chooseOption(int option);

	boolean checkUserCredential(String userName, String password);

	boolean addUserCredentials(String userName, String password);

}

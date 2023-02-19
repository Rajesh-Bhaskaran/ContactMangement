package com.flightreservation.login;

import java.util.List;

import com.flightreservation.dto.UserCredential;

public interface LoginModelCallBack {

	List<UserCredential> getUserCredential();

	boolean addUserCredentials(String userName, String password);

}

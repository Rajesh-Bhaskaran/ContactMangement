package com.flightreservation.cancel;

import java.util.Scanner;

import com.flightreservation.login.LoginView;

public class CancelView implements CancelViewCallBack{

	private Scanner scanner= new Scanner(System.in);
	private CancelControllerCallBack cancelController;
	
	public CancelView(){
		this.cancelController=new CancelController(this);
	}

	public void cancel() {
		System.out.println("Enter User Name");
		String userName=scanner.next();
		if(cancelController.cancel(userName))
			System.out.println("SuccessFully Cancelled");
		else
			System.out.println("Not Found");
		LoginView loginView=new LoginView();
		loginView.process(userName);
	}
	
}

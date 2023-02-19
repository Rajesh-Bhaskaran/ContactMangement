package com.flightreservation.login;

import java.util.Scanner;

import com.flightreservation.booking.BookingView;
import com.flightreservation.cancel.CancelView;

public class LoginView implements LoginViewCallBack{

	private Scanner scanner= new Scanner(System.in);
	private LoginControllerCallBack loginController;
	public LoginView(){
		loginController= new LoginController(this);
	}
	
	public static void main(String[] args) {
		LoginView loginView= new LoginView();
		loginView.loginIndex();
	}

	public void loginIndex() {
		System.out.println("Enter 1--> User login");
		System.out.println("Enter 2--> New User");
		int option=scanner.nextInt();
		scanner.nextLine();
		loginController.chooseOption(option);
	}
	
	public void userCredentials() {
		System.out.println("Enter username");
		String userName=scanner.nextLine();
		System.out.println("Enter password");
		String password=scanner.nextLine();
		if(loginController.checkUserCredential(userName,password))
		{
			System.out.println("SuccessFully Login");
			process(userName);
		}
		else {
			loginIndex();
		}
	}

	public void process(String userName) {
		System.out.println("Enter 1--> Booking");
		System.out.println("Enter 2--> Cancellation");
		int option=scanner.nextInt();
		if(option==1) {
			BookingView bookingView=new BookingView();
			bookingView.book(userName);
		}
		else if(option==2) {
			CancelView cancelView=new CancelView();
			cancelView.cancel();
		}
		
	}

	@Override
	public void getuserCredentials() {
		System.out.println("Enter username");
		String userName=scanner.nextLine();
		System.out.println("Enter password");
		String password=scanner.nextLine();
		if(loginController.addUserCredentials(userName,password))
			System.out.println("Successfully Added");
		else
			System.out.println("Already Exsist");
		process(userName);
	}
	

}

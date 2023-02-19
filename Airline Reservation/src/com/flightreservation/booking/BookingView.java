package com.flightreservation.booking;

import java.util.List;
import java.util.Scanner;

import com.flightreservation.dto.FlightInfo;
import com.flightreservation.login.LoginView;

public class BookingView implements BookingViewCallBack {

	private Scanner scanner= new Scanner(System.in);
	private BookingControllerCallBack bookingController;
	
	public BookingView(){
		bookingController=new BookingController(this);
	}

	public void book(String userName) {
		List<FlightInfo> flightInfo=bookingController.flightdetails();
		for(FlightInfo flight:flightInfo) {
			System.out.println("---------------------------------------");
			System.out.println("Destination "+(flight.getDestination()));
			System.out.println("Departure "+(flight.getDeparture()));
			System.out.println("EconamicalSeatRate "+(flight.getEconomicSeatRate()));
			System.out.println("BuissenessSeatRate "+(flight.getBussinessSeatsRate()));
			System.out.println("Flight Id "+(flight.getFlightid()));
		}
		System.out.println("Enter FlightId");
		int flightId=scanner.nextInt();
		System.out.println("Enter E for Econamical B for Buisseness");
		String classType=scanner.next();
		System.out.println("Enter Number Of Tickets");
		int ticketCount=scanner.nextInt();
		//Checking Tickets Available In Flight Or Not
		if(bookingController.checkTicket(flightId,classType,ticketCount,flightInfo))
			ticketBooking(flightId,classType,ticketCount,userName);
		else
			System.out.println("No Seats Available");
	}

	private void ticketBooking(int flightId, String classType, int ticketCount,String userName) {
		System.out.println("Enter 1 For Continue Booking");
		System.out.println("Enter 2 For Cancel Booking");
		int no=scanner.nextInt();
		if(no==1)
		{
			int amount=bookingController.getPay(flightId,classType,ticketCount,userName);
			System.out.println("Pay "+amount);
			System.out.println("Enter Amount");
			int paying=scanner.nextInt();
			boolean value=true;
			while(value) {
				if(paying==amount) {
					if(bookingController.addPassengerInfo(userName,ticketCount,flightId,classType,paying))
						System.out.println("SuccessFully Booked");
					else
					{
						
					}
					value=false;
				}
			
			else {
				System.out.println("Enter Amount "+amount);
			}
			}
		}
		else 
			System.out.println("Thanks For Visiting");
		
		LoginView loginView=new LoginView();
		loginView.loginIndex();;
		
	}

	
}

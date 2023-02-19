package com.flightreservation.repositary;

import java.util.ArrayList;
import java.util.List;

import com.flightreservation.dto.FlightInfo;
import com.flightreservation.dto.PassengerInfo;
import com.flightreservation.dto.UserCredential;


public class FlightRepository {

	private static FlightRepository flightRepository;
//List Of User Credential POJO
	private List<UserCredential> userCredential = new ArrayList<>();
    private List<FlightInfo> flightInfo= new ArrayList<>();
	private List<PassengerInfo> passengerInfo= new ArrayList<>();
	
	public static FlightRepository getInstance() {
		if (flightRepository == null) {
			flightRepository = new FlightRepository();
			flightRepository.intialSetUp();
		}
		return flightRepository;
	}

	private void intialSetUp() {
		//User Creddential
		userCredential.add(new UserCredential("Rajesh","Rajesh"));
		//flight info
		flightInfo.add(new FlightInfo(20,10,5,5,10,5,new int[4][5],5000,2000,"Delhi","Chennai",1));
		flightInfo.add(new FlightInfo(20,10,5,5,10,5,new int[4][5],5000,2000,"Mumbai","Chennai",2));
	}

	public List<UserCredential> getUserCredential() {
		return userCredential;	
	}

	public List<FlightInfo> flightdetails() {
		return 	flightInfo;
	}

	public List<FlightInfo> getPay(int flightId,String classType, int ticketCount, String userName) {
		return flightInfo;
	}

	public boolean addPassengerInfo(String userName, int ticketCount, int flightId, String classType, int paying) {
		if(passengerInfo.add(new PassengerInfo(userName,ticketCount,flightId,classType,paying)))
		{
			for(FlightInfo flight:flightInfo) {
				if(flight.getFlightid()==flightId) {
					if(classType.equals("E")) {
						int ticket=flight.getEconomicSeatsAvailable()-ticketCount;
						flight.setEconomicSeatsAvailable(ticket);
					}
					else {
						int ticket=flight.getBussinessSeatsAvailable()-ticketCount;
						flight.setBussinessSeatsAvailable(ticket);
					}
				}
			}
			return true;
		}
		return false;
	}

	public boolean addUserCredentials(String userName, String password) {
		if(userCredential.add(new UserCredential(userName,password)))
			return true;
		return false;
	}

	public List<PassengerInfo> getPassengerInfo() {
		return passengerInfo;
		
	}

	public boolean cancelTicket(String userName) {
		boolean value=false;
		PassengerInfo deletepassenger = null;
		for(PassengerInfo passenger:passengerInfo) {
			if(passenger.getUserName().equals(userName)) {
				if(passenger.getClassType().equals("E")) {
					
					for(FlightInfo flight:flightInfo) {
						if(passenger.getFlightId()==flight.getFlightid())
						{
							if(passenger.getClassType().equals("E")) {
								int ticket=flight.getEconomicSeatsAvailable()+passenger.getTicketCount();
								flight.setEconomicSeatRate(ticket);
								value=true;
								deletepassenger=passenger;
							}
								
							}
							
						}
					
					}
				else {
					for(FlightInfo flight:flightInfo) {
						if(passenger.getFlightId()==flight.getFlightid())
						{
							if(passenger.getClassType().equals("B")) {
								int ticket=flight.getEconomicSeatsAvailable()+passenger.getTicketCount();
								flight.setBussinessSeatsAvailable(ticket);
								value=true;
								deletepassenger=passenger;
							}
								
							}
							
						}
				}
				}
				}
		if(deletepassenger!=null)
		passengerInfo.remove(deletepassenger);
		return value;
			}
		
	}



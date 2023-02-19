package com.flightreservation.booking;

import java.util.List;

import com.flightreservation.dto.FlightInfo;
import com.flightreservation.repositary.FlightRepository;

public class BookingModel implements BookingModelCallBack {

	private BookingControllerCallBack bookingController;
	
	BookingModel(BookingControllerCallBack bookingController){
		this.bookingController=bookingController;
	}

	@Override
	public List<FlightInfo> flightdetails() {
		return FlightRepository.getInstance().flightdetails();	
	}

	@Override
	public List<FlightInfo> getPay(int flightId, String classType, int ticketCount, String userName) {
		return FlightRepository.getInstance().getPay(flightId,classType,ticketCount,userName);
		
	}

	@Override
	public boolean addPassengerInfo(String userName, int ticketCount, int flightId, String classType, int paying) {
		return FlightRepository.getInstance().addPassengerInfo(userName,ticketCount,flightId,classType,paying);
		
	}
}

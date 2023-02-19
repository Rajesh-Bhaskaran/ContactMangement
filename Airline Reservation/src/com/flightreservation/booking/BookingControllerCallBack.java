package com.flightreservation.booking;

import java.util.List;

import com.flightreservation.dto.FlightInfo;

public interface BookingControllerCallBack {

	List<FlightInfo> flightdetails();

	boolean checkTicket(int flightId, String classType, int ticketCount, List<FlightInfo> flightInfo);
	
    int getPay(int flightId, String classType, int ticketCount, String userName);

	boolean addPassengerInfo(String userName, int ticketCount, int flightId, String classType, int paying);

}

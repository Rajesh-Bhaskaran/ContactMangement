package com.flightreservation.booking;

import java.util.List;

import com.flightreservation.dto.FlightInfo;

public interface BookingModelCallBack {

	List<FlightInfo> flightdetails();

	List<FlightInfo> getPay(int flightId, String classType, int ticketCount, String userName);

	boolean addPassengerInfo(String userName, int ticketCount, int flightId, String classType, int paying);

}

package com.flightreservation.booking;

import java.util.List;

import com.flightreservation.dto.FlightInfo;

public class BookingController implements BookingControllerCallBack,BookingModelControllerCallBack  {

	private BookingModelCallBack bookingModel;
	private BookingView bookingView;
	
	BookingController(BookingView bookingView){
		this.bookingView=bookingView;
		bookingModel=new BookingModel(this);
	}

	@Override
	public List<FlightInfo> flightdetails() {
		return bookingModel.flightdetails();
		
	}

	@Override
	public boolean checkTicket(int flightId, String classType, int ticketCount, List<FlightInfo> flightInfo) {
		for(FlightInfo flight:flightInfo) {
			if(flight.getFlightid()==flightId) {
				if(classType.equals("E")) {
					if(flight.getEconomicSeatsAvailable()>=ticketCount)
						return true;
				}
				else if(classType.equals("B")) {
					if(flight.getBussinessSeatsAvailable()>=ticketCount)
						return true;
				}
			}
		}
		return false;
	}

	@Override
	public int getPay(int flightId, String classType, int ticketCount, String userName) {
		List<FlightInfo> flight= bookingModel.getPay(flightId,classType,ticketCount,userName);
		for(FlightInfo flightinfo:flight) {
			if(flightinfo.getFlightid()==flightId) {
				if(classType.equals("E")) {
					return flightinfo.getEconomicSeatRate()*ticketCount;
				}
				else {
					return flightinfo.getEconomicSeatRate()*ticketCount;
				}
			}
		}
		return 0;
		
	}

	@Override
	public boolean addPassengerInfo(String userName, int ticketCount, int flightId, String classType, int paying) {
		return bookingModel. addPassengerInfo(userName,ticketCount,flightId,classType,paying);
		
	}
}

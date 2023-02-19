package com.flightreservation.dto;

public class PassengerInfo {
	
	private String userName;
	private int ticketCount;
	private int flightId;
	private String classType;
	private int  paying;
	
	public PassengerInfo(String userName, int ticketCount, int flightId, String classType, int paying) {
		super();
		this.userName = userName;
		this.ticketCount = ticketCount;
		this.flightId = flightId;
		this.classType = classType;
		this.paying = paying;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getTicketCount() {
		return ticketCount;
	}
	public void setTicketCount(int ticketCount) {
		this.ticketCount = ticketCount;
	}
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public String getClassType() {
		return classType;
	}
	public void setClassType(String classType) {
		this.classType = classType;
	}
	public int getPaying() {
		return paying;
	}
	public void setPaying(int paying) {
		this.paying = paying;
	}

	
	

}

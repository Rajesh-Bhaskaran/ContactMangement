package com.flightreservation.dto;

public class FlightInfo {

	private int totalSeats;
	private int totalEconomicSeats;
	private int totalBussinessSeats;
	private int totalThatKalSeats;
	private int EconomicSeatsAvailable;
	private int BussinessSeatsAvailable;
	private int[][] seatViewer;
	private int BussinessSeatsRate;
	private int EconomicSeatRate;
	private String destination;
	private String departure;
	private int flightid;

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public int getFlightid() {
		return flightid;
	}

	public void setFlightid(int flightid) {
		this.flightid = flightid;
	}

	public FlightInfo(int totalSeats, int totalEconomicSeats, int totalBussinessSeats, int totalThatKalSeats,
			int economicSeatsAvailable, int bussinessSeatsAvailable, int[][] seatViewer, int bussinessSeatsRate,
			int economicSeatRate,String destination,String departure,int flightid) {
		super();
		this.totalSeats = totalSeats;
		this.totalEconomicSeats = totalEconomicSeats;
		this.totalBussinessSeats = totalBussinessSeats;
		this.totalThatKalSeats = totalThatKalSeats;
		EconomicSeatsAvailable = economicSeatsAvailable;
		BussinessSeatsAvailable = bussinessSeatsAvailable;
		this.seatViewer = seatViewer;
		BussinessSeatsRate = bussinessSeatsRate;
		EconomicSeatRate = economicSeatRate;
		this.destination=destination;
		this.departure=departure;
		this.flightid=flightid;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public int getTotalEconomicSeats() {
		return totalEconomicSeats;
	}

	public void setTotalEconomicSeats(int totalEconomicSeats) {
		this.totalEconomicSeats = totalEconomicSeats;
	}

	public int getTotalBussinessSeats() {
		return totalBussinessSeats;
	}

	public void setTotalBussinessSeats(int totalBussinessSeats) {
		this.totalBussinessSeats = totalBussinessSeats;
	}

	public int getTotalThatKalSeats() {
		return totalThatKalSeats;
	}

	public void setTotalThatKalSeats(int totalThatKalSeats) {
		this.totalThatKalSeats = totalThatKalSeats;
	}

	public int getEconomicSeatsAvailable() {
		return EconomicSeatsAvailable;
	}

	public void setEconomicSeatsAvailable(int economicSeatsAvailable) {
		EconomicSeatsAvailable = economicSeatsAvailable;
	}

	public int getBussinessSeatsAvailable() {
		return BussinessSeatsAvailable;
	}

	public void setBussinessSeatsAvailable(int bussinessSeatsAvailable) {
		BussinessSeatsAvailable = bussinessSeatsAvailable;
	}

	public int[][] getSeatViewer() {
		return seatViewer;
	}

	public void setSeatViewer(int[][] seatViewer) {
		this.seatViewer = seatViewer;
	}

	public int getBussinessSeatsRate() {
		return BussinessSeatsRate;
	}

	public void setBussinessSeatsRate(int bussinessSeatsRate) {
		BussinessSeatsRate = bussinessSeatsRate;
	}

	public int getEconomicSeatRate() {
		return EconomicSeatRate;
	}

	public void setEconomicSeatRate(int economicSeatRate) {
		EconomicSeatRate = economicSeatRate;
	}
}

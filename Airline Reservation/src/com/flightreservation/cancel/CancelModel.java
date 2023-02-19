package com.flightreservation.cancel;

import java.util.List;

import com.flightreservation.dto.PassengerInfo;
import com.flightreservation.repositary.FlightRepository;

public class CancelModel implements CancelModelCallBack {

	private CancelControllerCallBack cancelController;
	public CancelModel(CancelControllerCallBack cancelController) {
		this.cancelController=cancelController;
	}
	@Override
	public List<PassengerInfo> getPassengerInfo() {
		return FlightRepository.getInstance().getPassengerInfo();
		
	}
	@Override
	public boolean cancelTicket(String userName) {
		return FlightRepository.getInstance().cancelTicket(userName);
		
	}

}

package com.flightreservation.cancel;

import java.util.List;

import com.flightreservation.dto.PassengerInfo;

public class CancelController implements CancelControllerCallBack {

	private CancelView cancelView;
	private CancelModelCallBack cancelModel;
	public CancelController(CancelView cancelView) {
		this.cancelView=cancelView;
		cancelModel=new CancelModel(this);
	}
	@Override
	public boolean cancel(String userName) {
		List<PassengerInfo> passengerInfo=cancelModel.getPassengerInfo();
		for(PassengerInfo passenger:passengerInfo) {
			if(passenger.getUserName().equals(userName)) {
				return cancelModel.cancelTicket(userName);
			}
		}
		return false;
	}

}

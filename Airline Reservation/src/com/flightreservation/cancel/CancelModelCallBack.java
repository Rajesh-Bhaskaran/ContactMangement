package com.flightreservation.cancel;

import java.util.List;

import com.flightreservation.dto.PassengerInfo;

public interface CancelModelCallBack {

	List<PassengerInfo> getPassengerInfo();

	boolean cancelTicket(String userName);

}

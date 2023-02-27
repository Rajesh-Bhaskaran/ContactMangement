package com.thirukkural.welcome;

import java.io.IOException;

import org.json.simple.parser.ParseException;

public class WelcomeController implements WelcomeControllerCallBack{

	private WelcomeViewCallBack welcomeView;
	
	public WelcomeController(WelcomeViewCallBack welcomeView) {
		this.welcomeView=welcomeView;
	}

	@Override
	public void selectOption(int option) throws IOException, ParseException {
		switch(option) {
		case 1:
			welcomeView.getkuralByNumber();
			break;
		case 2:
			welcomeView.getkuralCategory();
			break;
		case 3:
			welcomeView.getkuralOfTheDay();
			break;
		}	
	}

}

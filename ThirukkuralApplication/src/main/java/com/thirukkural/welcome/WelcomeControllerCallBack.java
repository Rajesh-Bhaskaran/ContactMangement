package com.thirukkural.welcome;

import java.io.IOException;

import org.json.simple.parser.ParseException;

public interface WelcomeControllerCallBack {

	void selectOption(int option) throws IOException, ParseException;

}

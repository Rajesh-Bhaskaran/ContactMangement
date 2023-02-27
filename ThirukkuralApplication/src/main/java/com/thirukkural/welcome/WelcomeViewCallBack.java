package com.thirukkural.welcome;

import java.io.IOException;

import org.json.simple.parser.ParseException;

public interface WelcomeViewCallBack {

	void getkuralByNumber() throws IOException, ParseException;

	void getkuralCategory() throws IOException, ParseException;

	void getkuralOfTheDay() throws IOException, ParseException;

	void welcome() throws IOException, ParseException;

}

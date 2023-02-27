package com.thirukkural.welcome;

import java.io.IOException;
import java.util.Scanner;

import org.json.simple.parser.ParseException;

import com.thirukkural.searchKural.SerachKuralView;

public class WelcomeView implements WelcomeViewCallBack {

	private Scanner scanner= new Scanner(System.in);
	private WelcomeControllerCallBack welcomeController;
	private static SerachKuralView serachKural=new SerachKuralView();
	WelcomeView(){
		welcomeController=new WelcomeController(this);
	}
	
	public static void main(String[] args) throws IOException, ParseException {
		WelcomeView welcomeView= new WelcomeView();
		welcomeView.welcome();
	}

	public void welcome() throws IOException, ParseException {
		System.out.println("\n1) திருக்குறளைத் எண் வாரியாக தேட 1ஐ அழுத்தவும்\n2) திருக்குறள் அதிகாரங்கள் வாரியாக பார்க்க 2ஐ அழுத்தவும்\n3) அன்றைய திருக்குறள் பார்க்க");
		int option = scanner.nextInt();
		welcomeController.selectOption(option);
	}

	@Override
	public void getkuralByNumber() throws IOException, ParseException {	
		serachKural.searchThiruKural(this);
	}

	@Override
	public void getkuralCategory() throws IOException, ParseException {
		serachKural.searchAdhigaram(this);
	}

	@Override
	public void getkuralOfTheDay() throws IOException, ParseException {
		serachKural.searchRandomKural(this);
	}

}

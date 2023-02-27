package com.thirukkural.searchKural;

import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.json.simple.parser.ParseException;

import com.thirukkural.dto.KuralInfo;
import com.thirukkural.welcome.WelcomeView;
import com.thirukkural.welcome.WelcomeViewCallBack;

public class SerachKuralView implements SerachViewCallBack{

	private WelcomeViewCallBack welcomeView;
	private SearchControllerCallBack searchKuralController;
	private Scanner scanner= new Scanner(System.in);
	
	public SerachKuralView(){
		searchKuralController= new SearchKuralController(this); 
	}
//Getting Kural Number From User
	public void searchThiruKural(WelcomeViewCallBack welcomeView) throws IOException, ParseException {
		this.welcomeView=welcomeView;
		System.out.println("திருக்குறள் எண்ணை (1-1330) உள்ளிடவும்");
		int kuralNumber=scanner.nextInt();
		searchKuralController.getKural(kuralNumber);
	}

	@Override
	public void getCorrectNumber() throws IOException, ParseException {
    System.out.println("நீங்கள் தவறான எண்ணை உள்ளிட்டுள்ளீர்கள். சரியான எண்ணை மீண்டும் உள்ளிடவும்");
    int kuralNumber=scanner.nextInt();
    searchKuralController.getKural(kuralNumber);
	}

	@Override
	public void showKural(KuralInfo kural) throws IOException, ParseException {
		System.out.println("குறள் எண் "+kural.getNumber());
		System.out.println("----------------------------------------------");
		System.out.println(" "+kural.getLine1());
		System.out.println(" "+kural.getLine2());
		System.out.println("----------------------------------------------");
		System.out.println("தமிழ் விளக்கம்: "+kural.getTamilexplanation());
		System.out.println("\nKural In English: "+kural.getTranslation());
		System.out.println(kural.getEnglishTranslation());
		welcomeView.welcome();
	}
	public void searchAdhigaram(WelcomeView welcomeView2) throws IOException, ParseException {
		welcomeView = welcomeView2;
		System.out.println("அதிகாரம் வாரியான தேடலை தேர்ந்தெடுத்துள்ளீர்கள்");
		System.out.println("அதிகாரம் எண்ணை(1-133) உள்ளிடவும்");
		int adhigaramNumber = scanner.nextInt();
		searchKuralController.adhigaramSearch(adhigaramNumber);	
	}
	@Override
	public void getCorrectadhigaramNumber() throws IOException, ParseException {
		System.out.println("நீங்கள் தவறான எண்ணை உள்ளிட்டுள்ளீர்கள். சரியான எண்ணை மீண்டும் உள்ளிடவும்");
	    int adhigaramNumber=scanner.nextInt();
	    searchKuralController.adhigaramSearch(adhigaramNumber);
	}
	@Override
	public void showAdhigaram(List<KuralInfo> getadhigaram) throws IOException, ParseException {
		System.out.println("Adikaram Name   "+getadhigaram.get(0).getAdikaramName());
			for(int i=0;i<10;i++) {
				System.out.println("குறள் எண் "+getadhigaram.get(i).getNumber());
				System.out.println("----------------------------------------------");
				System.out.println(" "+getadhigaram.get(i).getLine1());
				System.out.println(" "+getadhigaram.get(i).getLine2());
				System.out.println("----------------------------------------------");
				System.out.println("தமிழ் விளக்கம்: "+getadhigaram.get(i).getTamilexplanation());
				System.out.println("\nKural In English: "+getadhigaram.get(i).getTranslation());
				System.out.println(getadhigaram.get(i).getEnglishTranslation());
				System.out.println(getadhigaram.get(i).getAdikaramName());
				System.out.println(getadhigaram.get(i).getAdikaramTranslation());
			}
			welcomeView.welcome();
	}
	//Serach Random Kural
	public void searchRandomKural(WelcomeView welcomeView2) throws IOException, ParseException {
		Random r = new Random();
		int rand = r.nextInt(1330);
		searchKuralController.getKural(rand);
	}
}

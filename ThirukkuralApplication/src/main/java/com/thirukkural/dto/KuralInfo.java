package com.thirukkural.dto;

public class KuralInfo {
	private long number;
	private String line1;
	private String line2;
	private String tamilexplanation;
	private String translation;
	private String englishTranslation;
	private String adikaramName;
	private String adikaramTranslation;
	
	public String getAdikaramName() {
		return adikaramName;
	}



	public String getAdikaramTranslation() {
		return adikaramTranslation;
	}



	public KuralInfo(long number, String line1, String line2, String tamilexplanation, String translation,
			String englishTranslation,String adikaramName, String adikaramTranslation) {
		super();
		this.number = number;
		this.line1 = line1;
		this.line2 = line2;
		this.tamilexplanation = tamilexplanation;
		this.translation = translation;
		this.englishTranslation = englishTranslation;
		this.adikaramName=adikaramName;
		this.adikaramTranslation=adikaramTranslation;
	}
	
	

	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	public String getTamilexplanation() {
		return tamilexplanation;
	}
	public void setTamilexplanation(String tamilexplanation) {
		this.tamilexplanation = tamilexplanation;
	}
	public String getTranslation() {
		return translation;
	}
	public void setTranslation(String translation) {
		this.translation = translation;
	}
	public String getEnglishTranslation() {
		return englishTranslation;
	}
	public void setEnglishTranslation(String englishTranslation) {
		this.englishTranslation = englishTranslation;
	}
}

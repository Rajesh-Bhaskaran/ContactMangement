package com.thirukkural.repository;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.thirukkural.dto.KuralInfo;

public class KuralRepository {

	private static KuralRepository repo ;
    private List<KuralInfo> kuralInfo= new ArrayList<>();
	
	public static KuralRepository getInstance() {
		if(repo==null)
			repo=new KuralRepository();
		return repo;
	}

	public KuralInfo getKural(int kuralNumber) throws IOException, ParseException {
		//JSONParser
		   JSONParser jsonParser = new JSONParser();
			FileReader reader = new FileReader("/home/rajesh/eclipse-workspace/ThirukkuralApplication/jsonfiles/kural.json");
			Object 	obj=jsonParser.parse(reader);
			//Converting Java Object To JSON object
			JSONObject thirukuralJson = (JSONObject)obj;
			//Converting JSONObject  To JSONArray
			JSONArray array = (JSONArray)thirukuralJson.get("kural");
			//By Using  Kural Number Getting Kural And Converting Into JSON Object
			JSONObject kuralJsonObject = (JSONObject)array.get(kuralNumber);
			//Getting Kural Info
			Long number = (Long)kuralJsonObject.get("Number");
			String line1 = (String)kuralJsonObject.get("Line1");
			String line2 = (String)kuralJsonObject.get("Line2");
			String tamilexplanation=(String)kuralJsonObject.get("mv");
			String translation = (String)kuralJsonObject.get("Translation");
			String englishTranslation = (String)kuralJsonObject.get("explanation");
			String adikaramName=(String)kuralJsonObject.get("adikaram_name");
			String adikaramTranslation=(String)kuralJsonObject.get("adikaram_translation");
			return new KuralInfo(number,line1,line2,tamilexplanation,translation,englishTranslation,adikaramName,adikaramTranslation);
		
	}

	public List<KuralInfo> getadhigaram(int adhigaramNumber) throws IOException, ParseException {
		JSONParser jsonParser = new JSONParser();
		FileReader reader = new FileReader("/home/rajesh/eclipse-workspace/ThirukkuralApplication/jsonfiles/kural.json");
		Object 	obj=jsonParser.parse(reader);
		//Converting Java Object To JSON object
		JSONObject thirukuralJson = (JSONObject)obj;
		//Converting JSONObject  To JSONArray
		JSONArray array = (JSONArray)thirukuralJson.get("kural");
		//Finding Adhigaram Starting Kural
		//Iteration To Get Kural In User Given Adhigaram Enn
		for(int i=adhigaramNumber;i<=adhigaramNumber+10;i++) {
			JSONObject kuralJsonObject = (JSONObject)array.get(i);
			Long number = (Long)kuralJsonObject.get("Number");
			String line1 = (String)kuralJsonObject.get("Line1");
			String line2 = (String)kuralJsonObject.get("Line2");
			String tamilexplanation=(String)kuralJsonObject.get("mv");
			String translation = (String)kuralJsonObject.get("Translation");
			String englishTranslation = (String)kuralJsonObject.get("explanation");
			String adikaramName=(String)kuralJsonObject.get("adikaram_name");
			String adikaramTranslation=(String)kuralJsonObject.get("adikaram_translation");
			kuralInfo.add(new KuralInfo(number,line1,line2,tamilexplanation,translation,englishTranslation,adikaramName,adikaramTranslation));
		}
		return kuralInfo;
	}
	
}



import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.thirukkural.dto.KuralInfo;

public class Test {

	public static void main(String[] args) {
		//JSONParser
				JSONParser jsonParser = new JSONParser();
				Object obj=null;
				JSONObject thirukuralJson=null;
				try {
					FileReader reader = new FileReader(".\\jsonfiles\\kural.json");
					try {
						thirukuralJson=(JSONObject)jsonParser.parse(reader);
					} catch (IOException e) {
						e.printStackTrace();
					} catch (ParseException e) {
						e.printStackTrace();
					}
					//Converting Java Object To JSON object
					//JSONObject thirukuralJson = (JSONObject)obj;
					//Converting JSONObject  To JSONArray
					JSONArray array = (JSONArray)thirukuralJson.get("kural");
					//By Using  Kural Number Getting Kural And Converting Into JSON Object
					JSONObject kuralJsonObject = (JSONObject)array.get(5);
					//Getting Kural Info
					Integer number = (Integer)kuralJsonObject.get("Number");
					String line1 = (String)kuralJsonObject.get("Line1");
					String line2 = (String)kuralJsonObject.get("Line2");
					String tamilexplanation=(String)kuralJsonObject.get("mv");
					String translation = (String)kuralJsonObject.get("Translation");
					String englishTranslation = (String)kuralJsonObject.get("explanation");
					System.out.println(line1);
					System.out.println(line2);
				}	
            catch(Exception e) {
            	System.out.println("Exce");
            }
	

				
	}
}



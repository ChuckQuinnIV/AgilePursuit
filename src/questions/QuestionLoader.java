package questions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class QuestionLoader {
	
	private volatile static QuestionLoader instance; 
	
	public static QuestionLoader getInstance() { 
		if (instance == null) {
			synchronized (QuestionLoader.class) {
				if (instance == null ){
					instance = new QuestionLoader();
				}
			}
		}
		return instance;	
	}
	//http://www.javainterviewpoint.com/read-json-java-jsonobject-jsonarray/
	
	public static void initializeQuestions () throws FileNotFoundException, IOException, ParseException{
		JSONParser parser = new JSONParser();
		JSONObject jsonObject = (JSONObject) parser.parse(new FileReader("./src/test.json"));
		
		JSONArray questions = (JSONArray) jsonObject.get("questions");
		
		Iterator<JSONObject> iterator = questions.iterator();
        while (iterator.hasNext()) {
        	JSONObject someQuestion = iterator.next();
        		System.out.println(someQuestion.toString());
        	}
		

	}
	
	
	public static void main (String args[]) throws FileNotFoundException, IOException, ParseException{
		initializeQuestions();
		
	}

}

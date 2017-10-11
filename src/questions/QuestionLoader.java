package questions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
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
	
	public ArrayList<Question> initialize() {
		ArrayList<Question> questions = new ArrayList<Question>();

		JSONParser parser = new JSONParser();
		JSONObject jsonObject = null;
		try {
			jsonObject = (JSONObject) parser.parse(new FileReader("./src/test.json"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		JSONArray JSONquestions = (JSONArray) jsonObject.get("questions");
		
		@SuppressWarnings("unchecked")
		Iterator<JSONObject> questionsIterator = JSONquestions.iterator();
        while (questionsIterator.hasNext()) {
        	JSONObject someQuestion = questionsIterator.next();
        		String question = someQuestion.get("question").toString();
        		int category = ((Long) someQuestion.get("category")).intValue();
        		String type = someQuestion.get("type").toString();
        		String[] chocies = new String[4];
        		String answer = null;
        		int i = 0;
        		JSONObject JSONchoices = (JSONObject) someQuestion.get("choices");
        		for (Iterator iterator = JSONchoices.keySet().iterator(); iterator.hasNext();){
        			chocies[i] = iterator.next().toString();
        			//System.out.println(x);
        			if ((boolean) JSONchoices.get(chocies[i])){
        				answer = chocies[i];
        			}
        			i++;
        		}
        			
        		Question temp = new Question(question, answer, chocies, category, type);
        		questions.add(temp);
        	}
        return questions;
	}
}

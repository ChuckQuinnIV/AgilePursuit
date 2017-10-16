package questions;

import java.util.ArrayList;
import java.util.Collections;

public class QuestionStack {
	
	ArrayList<Question> Questions;
	
	private volatile static QuestionStack instance; 
	
	public static QuestionStack getInstance() { 
		if (instance == null) {
			synchronized (QuestionLoader.class) {
				if (instance == null ){
					instance = new QuestionStack();
				}
			}
		}
		return instance;	
	}
	
	 private QuestionStack(){
		 Questions = new QuestionLoader().initialize();
		 Collections.shuffle(Questions);
	 }
	 
	 public Question pop(){
		 Question q = Questions.get(0);
		 Questions.remove(0);
		 return q;
	 }
	 
	 public int size (){
		 return Questions.size();
	 }
	 
	 
	 
}

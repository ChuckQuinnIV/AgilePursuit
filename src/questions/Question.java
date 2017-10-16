package questions;

import java.util.Arrays;

public class Question {
	
	private int category;
	private String question;
	private String type;
	private String answer;
	private String[] chocies = new String[4];

	
	
	public Question (String inQuestion, String inAnswer, String[] inChoices, int inCategory, String inType){
		question = inQuestion;
		answer = inAnswer;
		chocies = inChoices;
		category = inCategory;		
		type = inType;
		
	}
	
	
	public int getCategory() {
		return category;
	}

	public String getQuestion() {
		return question;
	}

	public String getAnswer() {
		return answer;
	}

	public String[] getChocies() {
		return chocies;
	}
	
	public boolean check(String c){
		return answer.equals(c);
	}


	@Override
	public String toString() {
		return "Question [category=" + category + ", question=" + question + ", type=" + type + ", answer=" + answer
				+ ", chocies=" + Arrays.toString(chocies) + "]";
	}







}

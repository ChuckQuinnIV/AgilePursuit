package game;

import java.util.Random;

import questions.Question;
import questions.QuestionStack;
import scoreCard.ScoreCard;
import scoreCard.ScoreCardMgr;

public class Play {
	private String g1;
	private String g2;
	
	private int round = 1;
	private int turnCount = 0;
	
	private QuestionStack Questions = QuestionStack.getInstance();
	private ScoreCardMgr ScoreCardMgr;
	
	private Question currQuestion;
	private int currCategory;
	
	public Play(String g1, String g2){
		this.g1 = g1;
		this.g2 = g2;
		ScoreCardMgr = new ScoreCardMgr(g1,g2);	
	}
	
	public int getTurnCount() {
		return turnCount;
	}
	
	public String whoseTurn(){
		if (getTurnCount() % 2 == 0){return g1;} 
		else { return g2;}
	}
	
	
	public int getRound() {
		return round;
	}
	
	public Question getQuestion(){
		if (turnCount % 2 == 0){round++;};
		currQuestion = Questions.pop();
		currCategory = currQuestion.getCategory();
		return currQuestion;
	}
	
	public boolean checkAnswer(String answer){
		String group = whoseTurn();
		turnCount++;
		if (currQuestion.check(answer)){
			ScoreCardMgr.addPoint(group, currCategory);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isGameOver(){
		if (Questions.size() == 0) {return true;}
		else if (round > 40) {return true;}
		else if (ScoreCardMgr.getWinner(g1, g2) != "no winner") {return true;}
		return false;
	}
	
	public String winner(){
		return ScoreCardMgr.getWinner(g1, g2);
	}
	
	public String getStringScoreCard(){
		return ScoreCardMgr.toString();
	}
}

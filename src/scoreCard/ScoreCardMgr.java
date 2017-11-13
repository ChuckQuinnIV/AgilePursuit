package scoreCard;

import java.util.HashMap;

public class ScoreCardMgr {

	private HashMap<String,ScoreCard> scoreCardMgr = new  HashMap<String,ScoreCard>();
	String g1;
	String g2;

	public ScoreCardMgr(String g1, String g2){
		this.g1 = g1;
		this.g2 = g2;
		scoreCardMgr.put(g1, new ScoreCard(g1));
		scoreCardMgr.put(g2, new ScoreCard(g2));
	}

	public void addPoint(String g1, int category){
		scoreCardMgr.get(g1).addPoint(category);
	}

	public String getStringScoreCard(String g1){
		return scoreCardMgr.get(g1).toString();
	}

	public String toString(){
		String str = "";
		for (String s : scoreCardMgr.keySet()){
			str += scoreCardMgr.get(s).toString();
		}
		return str;
	}
	
	public String getWinner() {
		ScoreCard team1 = scoreCardMgr.get(g1);
		ScoreCard team2 = scoreCardMgr.get(g2);
		boolean g1win = team1.isWinner();
		boolean g2win = team2.isWinner();
		String winner;
		
		if (g1win && !g2win) {winner = g1;}
		else if (!g1win && g2win) {winner = g2;}
		else {winner = null;}
		return winner;
	}
	
}

package scoreCard;

import java.util.HashMap;

public class ScoreCardMgr {

	private HashMap<String,ScoreCard> scoreCardMgr = new  HashMap<String,ScoreCard>();

	public ScoreCardMgr(String g1, String g2){
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
	
	
	public static void main(String[] args) {
		ScoreCardMgr sc = new ScoreCardMgr("g1","g2");
		System.out.println(sc);
	}

	
}

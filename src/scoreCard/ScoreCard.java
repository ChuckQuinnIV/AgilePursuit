package scoreCard;

import java.util.HashMap;
import java.util.Map.Entry;

public class ScoreCard {
	
	private HashMap<Integer,Integer> scoreCard = new  HashMap<Integer,Integer>();
	private String groupName; 
	
	public ScoreCard(String groupName) {
		super();
		this.groupName = groupName;
		scoreCard.put(1, 0);
		scoreCard.put(2, 0);
		scoreCard.put(3, 0);
		scoreCard.put(4, 0);
		scoreCard.put(-1, 0);
	}
	
	public String getGroupName() {
		return groupName;
	}
	
	public void addPoint(int category){
		scoreCard.put(category, scoreCard.get(category) + 1);
	}
	
	public boolean isWinner() {
		for(int i: scoreCard.values()) {
			if (i < 3) {
				return false;
			}
		}
		return true;
	}

	@Override
	public String toString() {
		String str =  String.format("|%-15s|\n", "SCORECARD");
		str +=  String.format("|%-15s|\n", groupName);;
		str += String.format("|%-8s|%-6s|\n", "Category", "Points");
		for (Entry<Integer, Integer> entry : scoreCard.entrySet()) {
			str += String.format("|%-8d|%-6d|\n", entry.getKey(), entry.getValue());
		}
		return str;
	}

}

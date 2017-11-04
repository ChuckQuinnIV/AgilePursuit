package scoreCard;

import java.util.HashMap;
import java.util.Map.Entry;

public class ScoreCard {
	
	private HashMap<Integer,Integer> scoreCard = new  HashMap<Integer,Integer>();

	
	public ScoreCard() {
		scoreCard.put(1, 0);
		scoreCard.put(2, 0);
		scoreCard.put(3, 0);
		scoreCard.put(4, 0);
		scoreCard.put(-1, 0);
	}
	
	public void addPoint(int category){
		scoreCard.put(category, scoreCard.get(category) + 1);
	}
	
}

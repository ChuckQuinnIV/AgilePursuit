package player;

import java.util.ArrayList;
import java.util.HashMap;

import questions.Question;

public class PlayerMgr {
	
	private HashMap<Integer,Player> allPlayers = new HashMap<Integer,Player>();
	
	
	@Override
	public String toString() {
		return allPlayers.toString();
	
	}

	public void addPlayer(Player n){
		int id = n.getId();
		Player value = allPlayers.get(id);
		if (value != null) { throw new IllegalArgumentException(id + " is already in the all Players hashmap");}
		allPlayers.put(n.getId(), n);
	}

	

}

package player;

import java.util.ArrayList;

import questions.Question;

public class PlayerMgr {
	
	private ArrayList<Player> allPlayers = new ArrayList<Player>();;
	
	
	@Override
	public String toString() {
		String s = "";
		for (Player p : allPlayers) {
			s += p.toString() + " \n";
		}
		return s;
	}


	public void addPlayer(Player n){
		allPlayers.add(n);
	}

	

}

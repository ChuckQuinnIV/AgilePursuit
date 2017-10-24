package group;

import java.io.Serializable;
import java.util.ArrayList;

import player.Player;

public class Group implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private	String groupName = "";
	private int gamesWon = 0;
	private int gamesTotal = 0;
	private ArrayList<String> players = new ArrayList<String>();
	
	public Group(String InGroupName) {
		groupName = InGroupName;
	}
	
	@Override
	public String toString() {
		return "Group [groupName=" + groupName + ", gamesWon=" + gamesWon + ", gamesTotal=" + gamesTotal + ", players=" + players + "]";
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public int getGamesWon() {
		return gamesWon;
	}

	public void setGamesWon(int gamesWon) {
		this.gamesWon = gamesWon;
	}

	public int getGamesTotal() {
		return gamesTotal;
	}

	public void setGamesTotal(int gamesTotal) {
		this.gamesTotal = gamesTotal;
	}

	public ArrayList<String> getPlayers() {
		return players;
	}
	
	public void addPlayer(String p) {
		players.add(p);
	}
	
	
}

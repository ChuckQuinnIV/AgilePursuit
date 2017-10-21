package group;

import java.io.Serializable;
import java.util.ArrayList;

import player.Player;

public class Group implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private	String groupName = "";
	private int gamesWon = 0;
	private int gamesTotal = 0;
	private ArrayList<Player> players = new ArrayList<Player>();
	
	public Group(String InGroupName, int InGamesWon, int InGamesTotal, ArrayList<Player> InPlayers) {
		groupName = InGroupName;
		gamesWon = InGamesWon;
		gamesTotal = InGamesTotal;
		players = InPlayers;
	}
	
	@Override
	public String toString() {
		return "Group [groupName=" + groupName + ", gamesWon=" + gamesWon + ", gamesTotal="
				+ gamesTotal + ", players=" + players + "]";
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

	public ArrayList<Player> getPlayers() {
		return players;
	}

	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}
	
	public void addPlayer(Player p) {
		players.add(p);
	}
	
	
}

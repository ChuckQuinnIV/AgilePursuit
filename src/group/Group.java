package group;

import java.io.Serializable;
import java.util.ArrayList;

import player.Player;

public class Group implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String groupId = "";
	private	String groupName = "";
	private int gamesWon = 0;
	private int gamesTotal = 0;
	private ArrayList<Player> players = new ArrayList<Player>();
	
	public Group(String InGroupId, String InGroupName, int InGamesWon, int InGamesTotal, ArrayList<Player> InPlayers) {
		groupId = InGroupId;
		groupName = InGroupName;
		gamesWon = InGamesWon;
		gamesTotal = InGamesTotal;
		players = InPlayers;
	}
	
	@Override
	public String toString() {
		return "Group [groupId=" + groupId + ", groupName=" + groupName + ", gamesWon=" + gamesWon + ", gamesTotal="
				+ gamesTotal + ", players=" + players + "]";
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
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

package player;

import java.io.Serializable;
import java.util.ArrayList;

public class Player implements Serializable {
	
	private String username = "";
	private ArrayList<String> groups = new ArrayList<String>();
	private int gamesWon = 0;
	private int gamesTotal = 0;
	
	public Player(String InUsername) {
		username = InUsername;
	}

	@Override
	public String toString() {
		return "Player [username=" + username + ", groups=" + groups + ", gamesWon=" + gamesWon
				+ ", gamesTotal=" + gamesTotal + "]";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


	public ArrayList<String> getGroups() {
		return groups;
	}
	
	public void addGroup(String groupName) {
		 groups.add(groupName);
	}
	
	public void removeGroup(String groupName) {
		 groups.remove(groupName);
	}

	public int getGamesWon() {
		return gamesWon;
	}

	public void incrementGamesWon() {
		gamesWon++;
	}
	
	public int getGamesTotal() {
		return gamesTotal;
	}
	
	public void incrementGamesTotal() {
		gamesTotal++;
	}
	
	
	
	

}

package player;

import java.util.ArrayList;

public class Player {
	
	int id = 0;
	String username = "";
	ArrayList<String> groups = new ArrayList<String>();
	int gamesWon = 0;
	int gamesTotal = 0;
	
	public Player(int InId, String InUsername, ArrayList<String> InGroups, int InGamesWon, int InGamesTotal) {
		id = InId;
		username = InUsername;
		groups = InGroups;
		gamesWon = InGamesWon;
		gamesTotal = InGamesTotal;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", username=" + username + ", groups=" + groups + ", gamesWon=" + gamesWon
				+ ", gamesTotal=" + gamesTotal + "]";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getId() {
		return id;
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

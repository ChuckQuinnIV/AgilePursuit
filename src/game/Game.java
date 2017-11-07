package game;


import java.io.IOException;
import java.util.HashMap;
import group.Group;
import group.GroupMgr;
import player.Player;
import player.PlayerMgr;

public class Game {

	private PlayerMgr Players = new PlayerMgr();
	private GroupMgr Groups = new GroupMgr();
	private int round = 1;
	private int turnCount = 0;

	
	public void addPlayer(String username) throws IOException{
		Player p = new Player(username);
		Players.addPlayer(p);
		Players.saveFile();
	}
	
	public void addGroup (String groupName) throws IOException{
		Group g = new Group(groupName);
		Groups.addGroup(g);
		Groups.saveFile();
	}
	
	public HashMap<String, Group> getAllGroups(){
		return Groups.getAllGroups();
	}
	
	public HashMap<String, Player> getAllPlayers(){
		return Players.getAllPlayers();
	}
	
	public void addPlayerToGroup(String groupName, String username) throws IOException{
		Players.getPlayer(username).addGroup(groupName);
		Groups.getGroup(groupName).addPlayer(username);
		Groups.saveFile();
		Players.saveFile();
	}
	
	public Play play(String g1, String g2){
		return new Play(g1, g2);
	}

}

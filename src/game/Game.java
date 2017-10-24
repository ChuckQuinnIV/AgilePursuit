package game;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

import group.Group;
import group.GroupMgr;
import player.Player;
import player.PlayerMgr;
import questions.Question;
import questions.QuestionStack;

public class Game {

	private QuestionStack Questions = QuestionStack.getInstance();
	private PlayerMgr Players = new PlayerMgr();
	private GroupMgr Groups = new GroupMgr();
	private int round = 1;
	private int turnCount = 0;


	public int getTurnCount() {
		return turnCount;
	}
	
	public int getRound() {
		return round;
	}
	
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
	
	public boolean isGameOver(){
		if (Questions.size() == 0) {return true;}
		else if (round > 40) {return true;}
		return false;
	}

	public Question getQuestion(){
		turnCount++;
		if (turnCount % 2 == 1){ round++;};
		return Questions.pop();
	}

}

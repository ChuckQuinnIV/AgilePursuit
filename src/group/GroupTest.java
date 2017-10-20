package group;

import java.io.IOException;
import java.util.ArrayList;

import player.Player;

public class GroupTest {

	public static void main(String[] args) throws IOException {
		
		GroupMgr GroupManager = new GroupMgr();
		
		System.out.println(GroupManager.containsGroup("Nick Team"));
		System.out.println(GroupManager.toString());
		
		GroupManager.clear();
		System.out.println(GroupManager.toString());
		
		Group g1 = new Group("Nick Team", "Nick YA!", 1, 3, new ArrayList<Player>());
		GroupManager.addGroup(g1);
		Group g2 = new Group("Chuck Team", "Chuck YA!", 1, 3, new ArrayList<Player>());
		GroupManager.addGroup(g2);
		Group g3 = new Group("Ray Team", "Ray YA!", 1, 3, new ArrayList<Player>());
		GroupManager.addGroup(g3);
		Group g4 = new Group("Nick Team2", "Nick YA!", 1, 3, new ArrayList<Player>());
		GroupManager.addGroup(g4);
		GroupManager.saveFile();
		
		Player p1 = new Player(1,"nstanley", new ArrayList<String>(), 1,5);
		Player p2 = new Player(2,"aeinstein", new ArrayList<String>(), 5,5);
		
		GroupManager.addPlayer(p1,g1);
		GroupManager.addPlayer(p1, g1);
		
		System.out.println(GroupManager.toString());
	}

}

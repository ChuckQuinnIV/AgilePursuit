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
		
		Group g1 = new Group("Nick_YA!");
		GroupManager.addGroup(g1);
		Group g2 = new Group("Chuck_YA!");
		GroupManager.addGroup(g2);
		Group g3 = new Group("Ray_YA!");
		GroupManager.addGroup(g3);
		Group g4 = new Group("Nick_YA!");
		GroupManager.addGroup(g4);
		GroupManager.saveFile();
		
		Player p1 = new Player("nstanley");
		Player p2 = new Player("aeinstein");
		
		GroupManager.addPlayer("nstanley", "Nick_YA");
		GroupManager.addPlayer("aeinstein", "Ray_YA");
		
		System.out.println(GroupManager.toString());
	}

}

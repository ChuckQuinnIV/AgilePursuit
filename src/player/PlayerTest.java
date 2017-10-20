package player;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PlayerTest {

	public static void main(String[] args) throws IOException {
		
		PlayerMgr PlayerManager = new PlayerMgr();
		
		System.out.println(PlayerManager.containsPlayer(1));
		System.out.println(PlayerManager.containsPlayer(1));

		
		PlayerManager.clear();
		System.out.println(PlayerManager.toString());
				
		Player p1 = new Player(1,"nstanley", new ArrayList<String>(), 1,5);
		PlayerManager.addPlayer(p1);
		Player p2 = new Player(2,"aeinstein", new ArrayList<String>(), 5,5);
		PlayerManager.addPlayer(p2);
		Player p3 = new Player(3,"cdarwin", new ArrayList<String>(), 3,5);
		PlayerManager.addPlayer(p3);
		PlayerManager.saveFile();
		Player p4 = new Player(4, "testName", new ArrayList<String>(), 4,6);
		PlayerManager.addPlayer(p4);
		PlayerManager.saveFile();
		System.out.println(PlayerManager.toString());

		
		

		

	}
}


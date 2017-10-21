package player;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PlayerTest {

	public static void main(String[] args) throws IOException {
		
		PlayerMgr PlayerManager = new PlayerMgr();
		
		System.out.println(PlayerManager.containsPlayer("nstanley"));
		System.out.println(PlayerManager.containsPlayer("cdarwin"));

		
		PlayerManager.clear();
		System.out.println(PlayerManager.toString());
				
		Player p1 = new Player("nstanley", new ArrayList<String>(), 1,5);
		PlayerManager.addPlayer(p1);
		Player p2 = new Player("aeinstein", new ArrayList<String>(), 5,5);
		PlayerManager.addPlayer(p2);
		Player p3 = new Player("cdarwin", new ArrayList<String>(), 3,5);
		PlayerManager.addPlayer(p3);
		PlayerManager.saveFile();
		Player p4 = new Player("testName", new ArrayList<String>(), 4,6);
		PlayerManager.addPlayer(p4);
		PlayerManager.saveFile();
		System.out.println(PlayerManager.toString());

		
		

		

	}
}


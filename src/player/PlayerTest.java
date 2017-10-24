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
				
		Player p1 = new Player("nstanley");
		PlayerManager.addPlayer(p1);
		Player p2 = new Player("aeinstein");
		PlayerManager.addPlayer(p2);
		Player p3 = new Player("cdarwin");
		PlayerManager.addPlayer(p3);
		PlayerManager.saveFile();
		Player p4 = new Player("testName");
		PlayerManager.addPlayer(p4);
		PlayerManager.saveFile();
		System.out.println(PlayerManager.toString());

		
		

		

	}
}


package player;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PlayerTest {

	public static void main(String[] args) throws IOException {
		
		PlayerMgr PlayerManager = new PlayerMgr();
		
		HashMap<Integer, Player> localPlayers; 
		
		Player p1 = new Player(1,"nstanley", new ArrayList<String>(), 1,5);
		PlayerManager.addPlayer(p1);

		Player p2 = new Player(2,"aeinstein", new ArrayList<String>(), 5,5);
		PlayerManager.addPlayer(p2);
		
		Player p3 = new Player(3,"cdarwin", new ArrayList<String>(), 3,5);
		PlayerManager.addPlayer(p3);
		
		localPlayers = PlayerManager.getHash();
		PlayerManager.saveFile();
		
		System.out.println(PlayerManager.toString());
		
		localPlayers.clear();
		
		System.out.println(PlayerManager.toString());
		
		try {
			PlayerManager.setHash(PlayerManager.readFile());
			localPlayers = PlayerManager.getHash();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(PlayerManager.toString());
		
		Player p4 = new Player(5, "testName", new ArrayList<String>(), 4,6);
		PlayerManager.addPlayer(p4);
		
		PlayerManager.saveFile();
		
		try {
			PlayerManager.setHash(PlayerManager.readFile());
			localPlayers = PlayerManager.getHash();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(PlayerManager.toString());
		System.out.println(localPlayers.keySet());
		System.out.println(localPlayers.values());
		
		localPlayers = PlayerManager.getHash();
		System.out.println(localPlayers);
		System.out.println(localPlayers.size());
		
		/*System.out.print("Enter Username: ");
		Scanner sc = new Scanner(System.in);
		String username = sc.nextLine();
		*/
		
		Player localPlayer = localPlayers.get(1);
		System.out.println(localPlayer.toString());
		localPlayer.incrementGamesWon();
		localPlayer.incrementGamesTotal();
		localPlayer.addGroup("TestTeam1");
		System.out.println(localPlayer.toString());
		

	}
}


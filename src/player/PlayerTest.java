package player;

import java.util.ArrayList;

public class PlayerTest {

	public static void main(String[] args) {
		
		PlayerMgr PlayerManager = new PlayerMgr();
		
		Player p1 = new Player(1,"nstanley", new ArrayList<String>(), 1,5);
		PlayerManager.addPlayer(p1);	

		Player p2 = new Player(2,"aeinstein", new ArrayList<String>(), 5,5);
		PlayerManager.addPlayer(p2);	
		
		Player p3 = new Player(3,"cdarwin", new ArrayList<String>(), 3,5);
		PlayerManager.addPlayer(p3);	
		
		System.out.println(PlayerManager.toString());
		
		


	}
}

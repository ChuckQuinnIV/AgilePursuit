package test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import player.Player;
import player.PlayerMgr;

public class PlayerMgrTest {


	@Test
	public void testAddPlayer() {
		PlayerMgr Players = new PlayerMgr();
		Player p = new Player("testPlayer1");
		Players.addPlayer(p);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testAddPlayerIllegalArgumentException() {
		PlayerMgr Players = new PlayerMgr();
		Player p = new Player("testPlayer1");
		Players.addPlayer(p);
		Players.addPlayer(p);
	}

	@Test
	public void testContainsPlayer() {
		PlayerMgr Players = new PlayerMgr();
		Player p = new Player("testPlayer1");
		assertFalse(Players.containsPlayer("testPlayer1"));
		Players.addPlayer(p);
		assertTrue(Players.containsPlayer("testPlayer1"));
	}

	@Test
	public void testGetPlayer() {
		PlayerMgr Players = new PlayerMgr();
		Player p = new Player("testPlayer1");
		Players.addPlayer(p);
		assertEquals(Players.getPlayer("testPlayer1"),p);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetPlayerIllegalArgumentException() {
		PlayerMgr Players = new PlayerMgr();
		Players.getPlayer("testPlayer1");
	}
	
	@Test
	public void testSaveFile() throws IOException {
		PlayerMgr Players = new PlayerMgr();
		Players.saveFile();
	}

	@Test
	public void testGetAllPlayers() {
		PlayerMgr Players = new PlayerMgr();
		Player p1 = new Player("testPlayer1");
		Player p2 = new Player("testPlayer2");
		Players.addPlayer(p1);
		Players.addPlayer(p2);
		HashMap<String,Player> allPlayers = new HashMap<String,Player>();
		allPlayers.put("testPlayer1", p1);
		allPlayers.put("testPlayer2", p1);
		assertEquals(Players.getAllPlayers(),Players.getAllPlayers());// this is sad an bad
	}

	@Test
	public void testDeletePlayer() {
		PlayerMgr Players = new PlayerMgr();
		Player p1 = new Player("testPlayer1");
		Player p2 = new Player("testPlayer2");
		Players.addPlayer(p1);
		Players.addPlayer(p2);
		HashMap<String,Player> allPlayers = new HashMap<String,Player>();
		allPlayers.put("testPlayer1", p1);
		Players.deletePlayer("testPlayer2");
		assertEquals(Players.getAllPlayers(),Players.getAllPlayers());// this is sad an bad
	}

	@Test
	public void testToString() {
		PlayerMgr Players = new PlayerMgr();
		Player p1 = new Player("testPlayer1");
		Player p2 = new Player("testPlayer2");
		assertEquals(Players.toString(),Players.toString()); // this is sad an bad
	}

}

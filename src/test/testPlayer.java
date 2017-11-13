package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import player.Player;

public class testPlayer {

	@Test
	public void testGetUsername() {
		Player player = new Player("testUser1");
		assertEquals("testUser1", player.getUsername());
	}
	

	
	@Test
	public void testGetGamesTotal() {
		Player player = new Player("testUser1");
		assertEquals(0, player.getGamesTotal());
	}
	
	@Test
	public void testIncrementGamesTotal() {
		Player player = new Player("testUser1");
		assertEquals(0, player.getGamesTotal());
		player.incrementGamesTotal();
		assertEquals(1, player.getGamesTotal());
	}
	
	@Test
	public void testGetGamesWon() {
		Player player = new Player("testUser1");
		assertEquals(0, player.getGamesWon());
	}
	
	@Test
	public void testIncrementGamesWon() {
		Player player = new Player("testUser1");
		assertEquals(0, player.getGamesWon());
		player.incrementGamesWon();
		assertEquals(1, player.getGamesWon());
	}
	
	@Test
	public void testSetUsername() {
		Player player = new Player("testUser1");
		player.setUsername("testUser2");
		assertEquals("testUser2", player.getUsername());
	}
	
	@Test
	public void testGetGroups() {
		Player player = new Player("testUser1");
		assertEquals("testUser1", player.getUsername());
		assertEquals(player.getGroups(),new ArrayList<String>());
	}
	
	@Test
	public void testAddGroup() {
		Player player = new Player("testUser1");
		ArrayList<String> groups = new ArrayList<String>();
		groups.add("testGroups1");
		player.addGroup("testGroups1");
		assertEquals(player.getGroups(),groups);
	}
	
	@Test
	public void testRemoveGroup() {
		Player player = new Player("testUser1");
		ArrayList<String> groups = new ArrayList<String>();
		groups.add("testGroups1");
		player.addGroup("testGroups1");
		groups.remove("testGroups1");
		player.removeGroup("testGroups1");
		assertEquals(player.getGroups(),groups);
	}
	
	@Test
	public void testToString() {
		Player player = new Player("testUser1");
		assertEquals(player.toString(),"Player [username=testUser1, groups=[], gamesWon=0, gamesTotal=0]");
	}
	
	
	
	
	
	

}

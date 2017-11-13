package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import group.Group;

public class GroupTest {
	Group group;

	@Before
	public void setUp() throws Exception {
		group = new Group("testGroup1");
	}

	@After
	public void tearDown() throws Exception {
		group = null;
	}

	@Test
	public void testToString() {
		assertEquals(group.toString(),"Group [groupName=testGroup1, gamesWon=0, gamesTotal=0, players=[]]");
	}
	
	@Test
	public void testGetGroupName() {
		assertEquals("testGroup1",group.getGroupName());
	}

	@Test
	public void testSetGroupName() {
		group.setGroupName("testGroup2");
		assertEquals("testGroup2",group.getGroupName());
	}

	@Test
	public void testGetGamesWon() {
		assertEquals(0,group.getGamesWon());
	}

	@Test
	public void testSetGamesWon() {
		group.setGamesWon(1);
		assertEquals(1,group.getGamesWon());
	}

	@Test
	public void testGetGamesTotal() {
		assertEquals(0,group.getGamesTotal());
	}

	@Test
	public void testSetGamesTotal() {
		group.setGamesTotal(1);
		assertEquals(1,group.getGamesTotal());

	}

	@Test
	public void testGetPlayers() {
		group.addPlayer("testPlayer3");
		group.getPlayers();
	}


}

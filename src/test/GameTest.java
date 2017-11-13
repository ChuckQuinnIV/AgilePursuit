package test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import game.Game;

public class GameTest {
	Game game;
	
	@Before
	public void setUp() throws Exception {
		game = new Game();
	}

	@After
	public void tearDown() throws Exception {
		game = null;
	}

	@Test
	public void testAddGroup() throws IOException {
		int curNum = game.getAllGroups().size();
		game.addGroup("testGroup1");
		assertTrue(game.getAllGroups().size() == curNum + 1 );
	}

	@Test
	public void testAddPlayer() throws IOException {
		int curNum = game.getAllPlayers().size();
		game.addPlayer("testUser1");
		assertTrue(game.getAllPlayers().size() == curNum + 1 );
	}

	@Test
	public void testAddPlayerToGroup() throws IOException {
		game.addPlayerToGroup("testGroup12", "testUser12");
	}


}

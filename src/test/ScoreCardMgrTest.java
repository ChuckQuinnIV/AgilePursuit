package test;

import static org.junit.Assert.*;

import java.awt.Window.Type;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import scoreCard.ScoreCardMgr;

public class ScoreCardMgrTest {
	
	ScoreCardMgr sc;
	@Before
	public void setUp() throws Exception {
		sc = new ScoreCardMgr("test1","test2");	
	}

	@After
	public void tearDown() throws Exception {
		sc = null;
	}

	@Test
	public void testAddPoint() {
		sc.addPoint("test1", 1);
		
	}

	@Test
	public void testGetStringScoreCard() {
		assertTrue(sc.getStringScoreCard("test1").getClass().equals(String.class));
	}

	@Test
	public void testToString() {
		assertTrue(sc.toString().getClass().equals(String.class));
	}

	@Test
	public void testGetWinner() {
		assertEquals(null, sc.getWinner());
		sc.addPoint("test1", 1);
		sc.addPoint("test1", 1);
		sc.addPoint("test1", 1);
		sc.addPoint("test1", 2);
		sc.addPoint("test1", 2);
		sc.addPoint("test1", 2);
		sc.addPoint("test1", 3);
		assertEquals(null, sc.getWinner());
		sc.addPoint("test1", 3);
		sc.addPoint("test1", 3);
		sc.addPoint("test1", 4);
		sc.addPoint("test1", 4);
		sc.addPoint("test1", 4);
		sc.addPoint("test1", -1);
		sc.addPoint("test1", -1);
		sc.addPoint("test1", -1);
		assertEquals("test1", sc.getWinner());
	}

}

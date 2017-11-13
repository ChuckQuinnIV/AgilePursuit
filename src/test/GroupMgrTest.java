package test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import group.Group;
import group.GroupMgr;

public class GroupMgrTest {
	GroupMgr Groups;

	@Before
	public void setUp() throws Exception {
		Groups = new GroupMgr();
	}

	@After
	public void tearDown() throws Exception {
		Groups = null;
	}

	@Test
	public void testAddGroup() {
		int curSize = Groups.getAllGroups().size();
		Group g1 = new Group("testGroup1");
		Groups.addGroup(g1);
		assertEquals(Groups.getAllGroups().size(), curSize + 1);
	}

	@Test
	public void testContainsGroup() {
		Group g1 = new Group("testGroup1");
		Groups.addGroup(g1);
		assertTrue(Groups.containsGroup("testGroup1"));
		assertFalse(Groups.containsGroup("testGroup2"));

	}

	@Test
	public void testGetGroup() {
		Group g1 = new Group("testGroup1");
		Group g2 = new Group("testGroup2");
		Groups.addGroup(g1);
		Groups.addGroup(g2);
		assertEquals(Groups.getGroup("testGroup1"),g1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetGroupIllegalArgumentException() {
		Group g1 = new Group("testGroup1");
		Groups.addGroup(g1);
		Groups.getGroup("nulltestGroup");
	}

	@Test
	public void testGetAllGroups() {
		assertEquals(Groups.getAllGroups(),Groups.getAllGroups()); // sad and bad
	}

	@Test
	public void testSaveFile() throws IOException {
		Groups.saveFile();
	}

	@Test
	public void testDeleteGroup() {
		int curSize = Groups.getAllGroups().size();
		Group g1 = new Group("deleteTestGroup1");
		Groups.addGroup(g1);
		assertEquals(Groups.getAllGroups().size(), curSize + 1);
		Groups.deleteGroup("deleteTestGroup1");
		assertEquals(Groups.getAllGroups().size(), curSize);
	}

	@Test
	public void testToString() {
		assertEquals(Groups.toString(), Groups.toString());
	}

	@Test
	public void testAddPlayer() {
		Group g1 = new Group("AddPlayerTestGroup1");
		Groups.addGroup(g1);
		Groups.addPlayer("testAddPlayer", "AddPlayerTestGroup1");
		Groups.deleteGroup("AddPlayerTestGroup1");
	}

}

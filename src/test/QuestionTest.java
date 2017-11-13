package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import questions.Question;

public class QuestionTest {
	
	Question q;

	@Before
	public void setUp() throws Exception {
		String[] o = {"TestA","TestB","TestC","TestD"};
		q = new Question ("TestQ", "TestA",o,1,"multiple");
	}

	@After
	public void tearDown() throws Exception {
		q = null;
	}

	@Test
	public void testGetCategory() {
		assertEquals(q.getCategory(), 1);
	}

	@Test
	public void testGetQuestion() {
		assertEquals(q.getQuestion(), "TestQ");
	}

	@Test
	public void testGetAnswer() {
		assertEquals(q.getAnswer(), "TestA");
	}

	@Test
	public void testGetChocies() {
		String[] o = {"TestA","TestB","TestC","TestD"};
		assertTrue(q.getChocies()[0].equals(o[0]));
		assertTrue(q.getChocies()[1].equals(o[1]));
		assertTrue(q.getChocies()[2].equals(o[2]));
		assertTrue(q.getChocies()[3].equals(o[3]));
	}

	@Test
	public void testCheck() {
		assertFalse(q.check("TestZ"));
		assertTrue(q.check("TestA"));
	}

	@Test
	public void testToString() {
		assertEquals(q.toString(), "Question [category=1, question=TestQ, type=multiple, answer=TestA, chocies=[TestA, TestB, TestC, TestD]]");
	}

}

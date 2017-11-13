package test;

import static org.junit.Assert.*;

import java.awt.Window.Type;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import questions.Question;
import questions.QuestionStack;

public class QuestionStackTest {

	QuestionStack Questions;
	
	@Before
	public void setUp() throws Exception {
		Questions = QuestionStack.getInstance();
		Questions = QuestionStack.getInstance();
	}

	@After
	public void tearDown() throws Exception {
		Questions = null;
	}

	@Test
	public void testPop() {
		Question q = Questions.pop();
		assertTrue(q.getClass().equals(Question.class));
	}

	@Test
	public void testSize() {
		int currSize = Questions.size();
		Questions.pop();
		assertEquals(Questions.size(), currSize - 1);
	}

}

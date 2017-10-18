package questions;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Question_Test {

	public static int TESTCATEGORY = 1;
	public static String TESTQUESTION = "This is a test question";
	public static String TESTTYPE = "TestType";
	public static String TESTANSWER = "TestCorrect";
	public static String[] TESTCHOICES = {"TestCorrect", "TestIncorrect", "TestIncorrect", "TestIncorrect"};
	private Question testQuestion = null;
	
	public Question_Test() {		
	}
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		testQuestion = new Question(TESTQUESTION, TESTANSWER, TESTCHOICES, TESTCATEGORY, TESTTYPE);
	}

	@After
	public void tearDown() throws Exception {
		testQuestion = null;
	}


	@Test
	public void testGetCategory() {
		System.out.println("getCategory");
		assertEquals(TESTCATEGORY, testQuestion.getCategory());
	}

	@Test
	public void testGetQuestion() {
		System.out.println("getQuestion");
		assertEquals(TESTQUESTION, testQuestion.getQuestion());
	}

	@Test
	public void testGetAnswer() {
		System.out.println("getAnswer");
		assertEquals(TESTANSWER, testQuestion.getAnswer());
	}

	@Test
	public void testGetChocies() {
		System.out.println("getChoices");
		Assert.assertArrayEquals(TESTCHOICES, testQuestion.getChoices());
	}

	@Test
	public void testCheck() {
		System.out.println("testCheck");
		assertTrue(testQuestion.check(TESTANSWER));
	}

	@Test
	public void testToString() {
		System.out.println("toString");
		String expected = "Question [category=" + TESTCATEGORY + ", question=" + TESTQUESTION + ", type=" + TESTTYPE + ", answer=" + TESTANSWER
				+ ", choices=" + TESTCHOICES + "]";
		assertEquals("question toString results incorrect", testQuestion.toString(), expected);
	}

}

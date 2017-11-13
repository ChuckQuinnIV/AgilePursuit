package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import questions.Question;
import questions.QuestionLoader;

public class QuestionLoaderTest {

	@Test
	public void testGetInstance() {
		QuestionLoader Questions = new QuestionLoader().getInstance();
		QuestionLoader Questions2 = new QuestionLoader().getInstance();
		assertTrue(Questions.equals(Questions2));

	}

}

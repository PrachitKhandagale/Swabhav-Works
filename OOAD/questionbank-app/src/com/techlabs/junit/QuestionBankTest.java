package com.techlabs.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.UUID;

import org.junit.jupiter.api.Test;

import com.techlabs.questionbank.Question;
import com.techlabs.questionbank.QuestionBank;

class QuestionBankTest {

	@Test
	public void testForGetQuestionById() throws Exception {
		QuestionBank questionBank=new QuestionBank("Data/Questions.csv");
		List<Question> questionList=questionBank.getQuestions();
		Question question=questionList.get(0);
		UUID qid=questionList.get(0).getId();
		assertEquals(qid,question.getId());
	}
}

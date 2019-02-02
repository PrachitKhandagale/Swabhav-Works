package com.techlabs.questionanswer.test;

import java.util.List;

import com.techlabs.questionanswer.Question;
import com.techlabs.questionanswer.QuestionFactory;

public class TestQuestionAnswer {

	public static void main(String[] args) {
		// QuestionFactory qFactory=new QuestionFactory();
		List<Question> listOfQuestion = QuestionFactory.getQuestions();
		for (Question q : listOfQuestion) {
			System.out.println(q+"\n");
		}
	}
}

package com.techlabs.questionbank.test;

import java.util.List;
import java.util.Scanner;
import java.util.UUID;

import com.techlabs.questionbank.Question;
import com.techlabs.questionbank.QuestionBank;

public class TestQuestionBank {
	static int count = 0;
	static QuestionBank questionBank;

	public static void main(String[] args) throws Exception {
		questionBank = new QuestionBank("Data/Questions.csv");
		List<Question> listOfQuestion = questionBank.questionRange(4);
		//List<Question> listOfQuestion = questionBank.getRandomQuestion(4);
		for (Question question : listOfQuestion) {
			printQuestionAndOption(question);
		}
		System.out.println("Total Number Of Correct Answer:" + count);
		System.out.println("Wrong answers:" + (listOfQuestion.size() - count));
		int total = listOfQuestion.size();
		float winPercentage = (100 / total) * count;
		System.out.println("Win percentage is: " + winPercentage + "%");

		printUUIDQuestion();
	}

	public static void printQuestionAndOption(Question question) {

		Scanner sc = new Scanner(System.in);
		// System.out.println(question.getId());
		System.out.println(question.getQuestion());
		List<String> options = question.getOptionList();
		int cnt=1;
		for (String option : options) {
			
			System.out.println(cnt+". "+option);
			cnt++;
		}
		int answer = sc.nextInt();
		if (questionBank.checkResult(question, answer - 1)) {
			count++;
			System.out.println("Correct");
		}
		System.out.println();
	}

	public static void printUUIDQuestion() {

		// QuestionBank questionBank = new QuestionBank();
		List<Question> listOfQuestion = questionBank.questionRange(5);
		UUID uuid = listOfQuestion.get(1).getId();
		Question question = questionBank.getQuestionByUUID(uuid);
		System.out.println("Get question by UUID:" + question.getQuestion());
	}

}

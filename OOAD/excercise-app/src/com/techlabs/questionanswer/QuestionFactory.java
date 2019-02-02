package com.techlabs.questionanswer;

import java.util.ArrayList;
import java.util.List;

public class QuestionFactory {
	private static List<Question> questionList;

	public static List<Question> getQuestions() {
		return questionList;
	}

	static {
		questionList = new ArrayList<Question>();

		Question q1 = new Question();
		String question1 = "What is the capital of Maharashtra?";
		q1.setQuestion(question1);
		List<Option> optionList = new ArrayList<Option>();

		optionList.add(new Option("Mumbai",true));
		optionList.add(new Option("Kolhapur",false));
		optionList.add(new Option("Pune",false));
		optionList.add(new Option("Nagpur",false));
		q1.setOptionList(optionList);

		questionList.add(q1);

		Question q2 = new Question();
		String question2 = "What is the capital of Madhya Pradesh?";
		q2.setQuestion(question2);
		
		List<Option> optionList2 = new ArrayList<Option>();
		optionList2.add(new Option("Jabalpur",false));
		optionList2.add(new Option("Bhopal",true));
		optionList2.add(new Option("Indore",false));
		optionList2.add(new Option("Gwalier",false));
		q2.setOptionList(optionList2);
		
		questionList.add(q2);

		String question3 = "Who is captain of Indian team?";
		Question q3 = new Question();

		q3.setQuestion(question3);
		List<Option> optionList3 = new ArrayList<Option>();
		optionList3.add(new Option("Dhoni",false));
		optionList3.add(new Option("Kohli",true));
		optionList3.add(new Option("Sachin",false));
		optionList3.add(new Option("Rahane",false));
		q3.setOptionList(optionList3);
		
		questionList.add(q3);

	}

}

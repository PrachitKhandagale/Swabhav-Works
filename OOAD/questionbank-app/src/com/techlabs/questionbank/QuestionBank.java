package com.techlabs.questionbank;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class QuestionBank {
	private List<Question> questionList = new ArrayList<Question>();

	public QuestionBank(String fileName)throws Exception {
		//initializeSetOfQuestions();
		loadQuestionsFromCsvFile(fileName);
	}
	
	public void loadQuestionsFromCsvFile(String fileName) throws Exception {
		//fileName = "Data/QuestionOption.csv";
		File file = new File(fileName);
		BufferedReader br = new BufferedReader(new FileReader(file));
		String string;
		while ((string = br.readLine()) != null) {
			String[] strArray = string.split(",");
			List<String> options = new ArrayList<String>();
			options.add(strArray[1]);
			options.add(strArray[2]);
			options.add(strArray[3]);
			options.add(strArray[4]);
			int index = options.indexOf(strArray[5]);
			
			Question question = new Question(strArray[0], options, index);
			questionList.add(question);
		}
		questionList.remove(0);
		System.out.println("\n");
		br.close();
	}

	public void initializeSetOfQuestions() {

		List<String> options1 = new ArrayList<String>();
		options1.add("1.Nagpur");
		options1.add("2.Kolhapur");
		options1.add("3.Mumbai");
		options1.add("4.Ratnagiri");
		Question question1 = new Question("What is Capital of Maharashtra?", options1, 2);
		questionList.add(question1);

		List<String> options2 = new ArrayList<String>();
		Question question2 = new Question("What is Capital of Madhya Pradesh?", options2, 0);
		options2.add("1.Bhopal");
		options2.add("2.Jabalpur");
		options2.add("3.Indore");
		options2.add("4.Gwalier");
		questionList.add(question2);

		List<String> options3 = new ArrayList<String>();
		Question question3 = new Question("What is the capital of Arunachal Pradesh?", options3, 0);
		options3.add("1.Itanagar");
		options3.add("2.Dispur");
		options3.add("3.Imphal");
		options3.add("4.Shillong");
		questionList.add(question3);

		List<String> options4 = new ArrayList<String>();
		Question question4 = new Question("Which state has Almond as its State Tree?", options4, 2);
		options4.add("1.Himachal Pradesh");
		options4.add("2.Goa");
		options4.add("3.Jammu and Kashmir");
		options4.add("4.Arunachal Pradesh");
		questionList.add(question4);

		List<String> options5 = new ArrayList<String>();
		Question question5 = new Question("Which state has the largest area?", options5, 3);
		options5.add("1.Maharashtra");
		options5.add("2.Madhya Pradesh");
		options5.add("3.Jammu and Kashmir");
		options5.add("4.Rajasthan");
		questionList.add(question5);

		List<String> options6 = new ArrayList<String>();
		Question question6 = new Question("Which state has the largest population?", options6, 1);
		options6.add("1.Maharashtra");
		options6.add("2.Uttar Pradesh");
		options6.add("3.Bihar");
		options6.add("4.Andra Pradesh");
		questionList.add(question6);

		List<String> options7 = new ArrayList<String>();
		Question question7 = new Question("In what state are the Elephant Falls located?", options7, 3);
		options7.add("1.Mizoram");
		options7.add("2.Orissa");
		options7.add("3.Manipur");
		options7.add("4.Meghalaya");
		questionList.add(question7);

		List<String> options8 = new ArrayList<String>();
		Question question8 = new Question("In which state is the main language Khasi?", options8, 2);
		options8.add("1.Mizoram");
		options8.add("2.Nagaland");
		options8.add("3.Meghalaya");
		options8.add("4.Tripura");
		questionList.add(question8);

		List<String> options9 = new ArrayList<String>();
		Question question9 = new Question("What is the state flower of Haryana?", options9, 0);
		options9.add("1.Lotus");
		options9.add("2.Rhododendron");
		options9.add("3.Golden Shower");
		options9.add("4.Not declared");
		questionList.add(question9);

		List<String> options10 = new ArrayList<String>();
		Question question10 = new Question("What are the major languages spoken in Andhra Pradesh?", options10, 1);
		options10.add("1.English and Telugu");
		options10.add("2.Telugu and Urdu");
		options10.add("3.Telugu and Kannada");
		options10.add("4.All of the above languages");
		questionList.add(question10);
	}

	public List<Question> getQuestions() {
		return questionList;
	}

	public List<Question> questionRange(int range) {
		//Random random = new Random();
		List<Question> rangeList = new ArrayList<Question>();
		for (int i = 0; i < range; i++) {
			rangeList.add(questionList.get(i));
		}
		return rangeList;
	}

	public boolean checkResult(Question question, int index) {
		if (question.getOptionIndex() == index) {
			return true;
		}
		return false;
	}

	public Question getQuestionByUUID(UUID queID) {
		int index = 0;
		for (Question question : questionList) {
			if (question.getId() == queID) {
				index = questionList.indexOf(question);
			}
		}
		return questionList.get(index);
	}
	
	public List<Question> getRandomQuestion(int range){
		List<Question> rangeList = new ArrayList<Question>();
		for(int i=0;i<range;i++) {
			Random random=new Random();
			int number=random.nextInt(questionList.size());
			rangeList.add(questionList.get(number));
		}
		return rangeList;
		
	}
	

	
}

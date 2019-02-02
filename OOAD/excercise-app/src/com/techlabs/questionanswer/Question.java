package com.techlabs.questionanswer;

import java.util.List;
import java.util.UUID;

public class Question {
	private UUID id=UUID.randomUUID();
	private String question;
	private List<Option> optionList;
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<Option> getOptionList() {
		return optionList;
	}
	public void setOptionList(List<Option> optionList) {
		this.optionList = optionList;
	}
	@Override
	public String toString() {
		return question + "\n" + optionList;
	}
	
	
}

package com.techlabs.questionbank;

import java.util.List;
import java.util.UUID;

public class Question {
	private UUID id;
	private String question;
	private List<String> optionList;
	private int optionIndex;

	public Question(String question, List<String> optionList,int optionIndex) {
		this.id = UUID.randomUUID();
		this.question = question;
		this.optionList = optionList;
		this.optionIndex=optionIndex;
	}

	public UUID getId() {
		return id;
	}

	public String getQuestion() {
		return question;
	}

	public List<String> getOptionList() {
		return optionList;
	}

	public int getOptionIndex() {
		return optionIndex;
	}

}

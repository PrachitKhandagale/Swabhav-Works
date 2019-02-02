package com.techlabs.questionanswer;

public class Option {
	private String option;
	private boolean isCorrect;
	
	public Option(String option,boolean isCorrect) {
		this.option = option;
		this.isCorrect = isCorrect;
	}
	
	//public Option() {}
	
	public String getOption() {
		return option;
	}
	public void setOption(String option) {
		this.option = option;
	}
	public boolean isCorrect() {
		return isCorrect;
	}
	public void setCorrect(boolean isCorrect) {
		this.isCorrect = isCorrect;
	}
	@Override
	public String toString() {
		return  option;
	}
	

}

package com.techlabs.tictactoe;

public class Cell {
	private Mark mark;

	public Cell() {
		this.mark = Mark.EMPTY;
	}

	public Mark getMark() {
		return mark;
	}

	public void setMark(Mark mark) {
//		if (this.mark == Mark.EMPTY && mark != Mark.EMPTY) {
//			this.mark = mark;
//		} else {
//			// System.out.println("Can Not Set Again");
//			throw new RuntimeException("Cell already Mark.");
//		}
		this.mark=mark;
	}

}

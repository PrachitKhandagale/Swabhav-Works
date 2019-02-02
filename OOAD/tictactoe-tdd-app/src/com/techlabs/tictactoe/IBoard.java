package com.techlabs.tictactoe;

public interface IBoard {

	Cell[] getCells();

	boolean isFull();

	boolean isEmpty();

	void setCellMark(int index, Mark mark);

	Mark getCellMark(int index);

}
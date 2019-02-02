package com.techlabs.tictactoe;

public interface IResultAnalyzer {

	Result getResult();

	IBoard getBoard();

	boolean horizontalWin();

	boolean verticalWin();

	boolean diagonalWin();

	Result analyzeGameResult();

}
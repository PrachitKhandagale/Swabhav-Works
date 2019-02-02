package com.techlabs.tictactoe;
public class Game {
	private Player player1;
	private Player player2;
	private IResultAnalyzer resultAnalyizer;
	private IBoard board;
	private Player currentPlayer = player1;
	private boolean currentState = true;

	public Game(IResultAnalyzer resultAnalyizer, IBoard board, Player player1, Player player2) {
		this.resultAnalyizer = resultAnalyizer;
		this.board = board;
		this.player1 = player1;
		this.player2 = player2;
	}
	
	public void play(int index, Mark value) {
		board.setCellMark(index, value);
		currentState = !currentState;
	}

	public Result play2(int index) {
		if (currentState == true) {
			board.setCellMark(index, Mark.CROSS);
			resultAnalyizer.analyzeGameResult();
			if (resultAnalyizer.getResult() == Result.WON) {
				return resultAnalyizer.getResult();
			}
			if (resultAnalyizer.getResult() == Result.DRAW) {
				return resultAnalyizer.getResult();
			}
		}
		if (currentState == false) {
			board.setCellMark(index, Mark.NOUGHT);
			resultAnalyizer.analyzeGameResult();
			if (resultAnalyizer.getResult() == Result.WON) {
				return resultAnalyizer.getResult();
			}
			if (resultAnalyizer.getResult() == Result.DRAW) {
				return resultAnalyizer.getResult();
			}
		}
		switchPlayer();
		 currentState = !currentState;
		return resultAnalyizer.getResult();

	}

	public void switchPlayer() {
		if (currentPlayer == player1) {
			currentPlayer = player2;
		} else {
			currentPlayer = player1;
		}
	}

	public Player getPlayer1() {
		return player1;
	}

	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}

	public Player getPlayer2() {
		return player2;
	}

	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}

	public IResultAnalyzer getResultAnalyizer() {
		return resultAnalyizer;
	}

	public void setResultAnalyizer(IResultAnalyzer resultAnalyizer) {
		this.resultAnalyizer = resultAnalyizer;
	}

	public IBoard getBoard() {
		return board;
	}

	public void setBoard(IBoard board) {
		this.board = board;
	}

	public Player getCurrentPlayer() {
		return currentPlayer;
	}

	public void setCurrentPlayer(Player currentPlayer) {
		this.currentPlayer = currentPlayer;
	}

	public boolean isCurrentState() {
		return currentState;
	}

	public void setCurrentState(boolean currentState) {
		this.currentState = currentState;
	}
	

}
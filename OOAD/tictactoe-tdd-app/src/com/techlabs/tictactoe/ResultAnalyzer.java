package com.techlabs.tictactoe;

public class ResultAnalyzer implements IResultAnalyzer {
	private Result result;
	private IBoard board;

	public ResultAnalyzer(IBoard board) {
		this.board = board;
	}

	@Override
	public Result getResult() {
		return result;
	}
	@Override
	public IBoard getBoard() {
		return board;
	}

	@Override
	public boolean horizontalWin() {
		if (Mark.EMPTY != board.getCellMark(0) && board.getCellMark(0) == board.getCellMark(1)
				&& board.getCellMark(1) == board.getCellMark(2)) {
			return true;
		}
		if (Mark.EMPTY != board.getCellMark(3) && board.getCellMark(3) == board.getCellMark(4)
				&& board.getCellMark(4) == board.getCellMark(5)) {
			return true;
		}
		if (Mark.EMPTY != board.getCellMark(6) && board.getCellMark(6) == board.getCellMark(7)
				&& board.getCellMark(7) == board.getCellMark(8)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean verticalWin() {
		if (Mark.EMPTY != board.getCellMark(0) && board.getCellMark(0) == board.getCellMark(3)
				&& board.getCellMark(3) == board.getCellMark(6)) {
			return true;
		}
		if (Mark.EMPTY != board.getCellMark(1) && board.getCellMark(1) == board.getCellMark(4)
				&& board.getCellMark(4) == board.getCellMark(7)) {
			return true;
		}
		if (Mark.EMPTY != board.getCellMark(2) && board.getCellMark(2) == board.getCellMark(5)
				&& board.getCellMark(5) == board.getCellMark(8)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean diagonalWin() {
		if (Mark.EMPTY != board.getCellMark(0) && board.getCellMark(0) == board.getCellMark(4)
				&& board.getCellMark(4) == board.getCellMark(8)) {
			return true;
		}
		if (Mark.EMPTY != board.getCellMark(2) && board.getCellMark(2) == board.getCellMark(4)
				&& board.getCellMark(4) == board.getCellMark(6)) {
			return true;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see com.techlabs.tictactoe.IResultAnalyzer#analyzeGameResult()
	 */
	@Override
	public Result analyzeGameResult() {
		if (horizontalWin() || verticalWin() || diagonalWin()) {
			return result = Result.WON;
			//return Result.WON;
		}
		if (board.isEmpty()) {
			return result = Result.NOTSTARTED;
			//System.out.println(result);
			//return Result.NOTSTARTED;
		}
		if (board.isFull()) {
			return result = Result.DRAW;
			//return Result.DRAW;
		}
		if (result != Result.DRAW && result != Result.WON && !board.isEmpty()) {
			return result = Result.INPROGRESS;
			//System.out.println(result);
			//return Result.INPROGRESS;
		}
		return null;
	}
}

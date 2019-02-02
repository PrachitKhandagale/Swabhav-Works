package com.techlabs.tictactoe.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.techlabs.tictactoe.Board;
import com.techlabs.tictactoe.IBoard;
import com.techlabs.tictactoe.IResultAnalyzer;
import com.techlabs.tictactoe.Mark;
import com.techlabs.tictactoe.Result;
import com.techlabs.tictactoe.ResultAnalyzer;

class ResultAnalyzerTest {

	@Test
	void testForHorizontalWin() {
		IBoard board = new Board();
		IResultAnalyzer analyzer = new ResultAnalyzer(board);
		board.setCellMark(1, Mark.CROSS);
		board.setCellMark(7, Mark.CROSS);
		board.setCellMark(8, Mark.CROSS);
		boolean result = analyzer.horizontalWin();
		assertEquals(false, result);
	}

	@Test
	void testForVerticalWin() {
		IBoard board = new Board();
		IResultAnalyzer analyzer = new ResultAnalyzer(board);
		board.setCellMark(2, Mark.CROSS);
		board.setCellMark(5, Mark.CROSS);
		board.setCellMark(8, Mark.CROSS);
		boolean result = analyzer.verticalWin();
		assertEquals(true, result);
	}

	@Test
	void testForDiagonalwin() {
		IBoard board = new Board();
		IResultAnalyzer analyzer = new ResultAnalyzer(board);
		board.setCellMark(2, Mark.CROSS);
		board.setCellMark(4, Mark.CROSS);
		board.setCellMark(6, Mark.CROSS);
		boolean result = analyzer.diagonalWin();
		assertEquals(true, result);
	}

	@Test
	public void testForAnalyzeGameResultWon() {
		IBoard board = new Board();
		IResultAnalyzer analyzer = new ResultAnalyzer(board);
		board.setCellMark(2, Mark.CROSS);
		board.setCellMark(4, Mark.CROSS);
		board.setCellMark(6, Mark.CROSS);
		Result result = analyzer.analyzeGameResult();
		assertEquals(Result.WON, result);

	}

	@Test
	public void testForAnalyzeGameResultNotStarted() {
		IBoard board = new Board();
		IResultAnalyzer analyzer = new ResultAnalyzer(board);
		Result result = analyzer.analyzeGameResult();
		assertEquals(Result.NOTSTARTED, result);
	}

	@Test
	public void testForAnalyzeGameResultDraw() {
		IBoard board = new Board();
		IResultAnalyzer analyzer = new ResultAnalyzer(board);
		board.setCellMark(0, Mark.CROSS);
		board.setCellMark(2, Mark.NOUGHT);
		board.setCellMark(1, Mark.CROSS);
		board.setCellMark(3, Mark.NOUGHT);
		board.setCellMark(5, Mark.CROSS);
		board.setCellMark(4, Mark.NOUGHT);
		board.setCellMark(6, Mark.CROSS);
		board.setCellMark(8, Mark.NOUGHT);
		board.setCellMark(7, Mark.CROSS);
		Result result = analyzer.analyzeGameResult();
		assertEquals(Result.DRAW, result);
	}

	@Test
	public void testForAnalyzeGameResultInprogress() {
		IBoard board = new Board();
		IResultAnalyzer analyzer = new ResultAnalyzer(board);
		board.setCellMark(0, Mark.CROSS);
		board.setCellMark(1, Mark.NOUGHT);
		Result result = analyzer.analyzeGameResult();
		assertEquals(Result.INPROGRESS, result);
	}
	
	@Test
	public void testForHorizontalWinSecondIf() {
		IBoard board = new Board();
		IResultAnalyzer analyzer = new ResultAnalyzer(board);
		board.setCellMark(3, Mark.CROSS);
		board.setCellMark(4, Mark.CROSS);
		board.setCellMark(5, Mark.CROSS);
		boolean result = analyzer.horizontalWin();
		assertEquals(true, result);
	}

	@Test
	public void testForHorizontalWinFirstIf() {
		IBoard board = new Board();
		IResultAnalyzer analyzer = new ResultAnalyzer(board);
		board.setCellMark(0, Mark.CROSS);
		board.setCellMark(1, Mark.CROSS);
		board.setCellMark(2, Mark.CROSS);
		boolean result = analyzer.horizontalWin();
		assertEquals(true, result);
	}
	@Test
	public void testForHorizontalWinthirdIf() {
		IBoard board = new Board();
		IResultAnalyzer analyzer = new ResultAnalyzer(board);
		board.setCellMark(6, Mark.CROSS);
		board.setCellMark(7, Mark.CROSS);
		board.setCellMark(8, Mark.CROSS);
		boolean result = analyzer.horizontalWin();
		assertEquals(true, result);
	}

	@Test
	public void testForVerticalWinFirstIf() {
		IBoard board = new Board();
		IResultAnalyzer analyzer = new ResultAnalyzer(board);
		board.setCellMark(0, Mark.CROSS);
		board.setCellMark(3, Mark.CROSS);
		board.setCellMark(6, Mark.CROSS);
		boolean result = analyzer.verticalWin();
		assertEquals(true, result);
	}

	@Test
	void testForVerticalWinSecondIf() {
		IBoard board = new Board();
		IResultAnalyzer analyzer = new ResultAnalyzer(board);
		board.setCellMark(1, Mark.CROSS);
		board.setCellMark(4, Mark.CROSS);
		board.setCellMark(7, Mark.CROSS);
		boolean result = analyzer.verticalWin();
		assertEquals(true, result);
	}

	@Test
	void testforVerticalWinThirdIf() {
		IBoard board = new Board();
		IResultAnalyzer analyzer = new ResultAnalyzer(board);
		board.setCellMark(2, Mark.CROSS);
		board.setCellMark(5, Mark.CROSS);
		board.setCellMark(8, Mark.CROSS);
		boolean result = analyzer.verticalWin();
		assertEquals(true, result);
	}

	@Test
	public void testForVerticalWinCheckForFalse() {
		IBoard board = new Board();
		IResultAnalyzer analyzer = new ResultAnalyzer(board);
		board.setCellMark(1, Mark.CROSS);
		board.setCellMark(5, Mark.CROSS);
		board.setCellMark(8, Mark.CROSS);
		boolean result = analyzer.verticalWin();
		assertEquals(false, result);
	}
}

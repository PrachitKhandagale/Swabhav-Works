package com.techlabs.tictactoe.test;

import com.techlabs.tictactoe.Board;
import com.techlabs.tictactoe.Game;
import com.techlabs.tictactoe.IBoard;
import com.techlabs.tictactoe.IResultAnalyzer;
import com.techlabs.tictactoe.Player;
import com.techlabs.tictactoe.Result;
import com.techlabs.tictactoe.ResultAnalyzer;

public class TestTicTacToe {

	public static void main(String[] args) {
		Player player1 = new Player("Vinod");
		Player player2 = new Player("Prachit");
		IBoard board = new Board();
		IResultAnalyzer resultAnalyizer = new ResultAnalyzer(board);
		Game game = new Game(resultAnalyizer, board, player1, player2);
		game.play2(0);
		game.play2(1);
		game.play2(4);
		game.play2(2);
		game.play2(8);
		//System.out.println(resultAnalyizer.getResult());
		boardPrint(board, resultAnalyizer);
	}

//		game.play(0);
//		game.play(1);
//		game.play(4);
//		game.play(2);
//		game.play(8);
//		game.boardPrint();

//		
//		game.play(0);
//		game.play(2);
//		game.play(3);
//		game.play(5);
//		game.play(7);
//		game.play(8);
//		game.boardPrint();

//		game.play(0);
//		game.play(2);
//		game.play(1);
//		
//		game.play(3);
//		game.play(5);
//		game.play(4);
//		game.play(6);
//		game.play(8);
//		game.play(7);
//		boardPrint(board, resultAnalyzer);

//}

	public static void boardPrint(IBoard board, IResultAnalyzer resultAnalyzer) {
		System.out.println();
		System.out.println(board.getCellMark(0) + " | " + board.getCellMark(1) + " | " + board.getCellMark(2));
		System.out.println(" _________");
		System.out.println(board.getCellMark(3) + " | " + board.getCellMark(4) + " | " + board.getCellMark(5));
		System.out.println(" _________");
		System.out.println(board.getCellMark(6) + " | " + board.getCellMark(7) + " | " + board.getCellMark(8));
		System.out.println();
		if (resultAnalyzer.getResult() == Result.WON) {
			System.out.println("WON");
			return;
		}
		if (resultAnalyzer.getResult() == Result.DRAW) {
			System.out.println("Game Draw");
		}}}

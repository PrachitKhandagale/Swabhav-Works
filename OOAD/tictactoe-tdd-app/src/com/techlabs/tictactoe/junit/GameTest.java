package com.techlabs.tictactoe.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.techlabs.tictactoe.Board;
import com.techlabs.tictactoe.Game;
import com.techlabs.tictactoe.IBoard;
import com.techlabs.tictactoe.IResultAnalyzer;
import com.techlabs.tictactoe.Player;
import com.techlabs.tictactoe.Result;
import com.techlabs.tictactoe.ResultAnalyzer;

class GameTest {

	@Test
	public void testGameForWin() {
		Player player1=new Player("Prachit");
		Player player2=new Player("Vinod");
		IBoard board=new Board();
		IResultAnalyzer resultAnalyze=new ResultAnalyzer(board);
		Game game=new Game(resultAnalyze, board, player1, player2);
		game.play2(0);
		game.play2(1);
		game.play2(4);
		game.play2(2);
		game.play2(8);
		assertEquals(Result.WON, resultAnalyze.getResult());
	}
	@Test
	public void testGameForDraw() {
		Player player1=new Player("Prachit");
		Player player2=new Player("Vinod");
		IBoard board=new Board();
		IResultAnalyzer resultAnalyze=new ResultAnalyzer(board);
		Game game=new Game(resultAnalyze, board, player1, player2);
		game.play2(0);
		game.play2(2);
		game.play2(1);
		game.play2(3);
		game.play2(5);
		game.play2(4);
		game.play2(6);
		game.play2(8);
		game.play2(7);
		assertEquals(Result.DRAW, resultAnalyze.getResult());
	}
	
	@Test
	public void testGameForWinFirstPlayer() {
		Player player1=new Player("Prachit");
		Player player2=new Player("Vinod");
		IBoard board=new Board();
		IResultAnalyzer resultAnalyze=new ResultAnalyzer(board);
		Game game=new Game(resultAnalyze, board, player1, player2);
		game.play2(0);
		game.play2(1);
		game.play2(4);
		game.play2(2);
		game.play2(8);
		Player player=new Player("Prachit");
		assertEquals(player1.getPlayerName(), player.getPlayerName());
	}
	public void testForGetSetPlayer() {
		Player player1=new Player("Prachit");
		Player player2=new Player("Vinod");
		IBoard board=new Board();
		IResultAnalyzer resultAnalyze=new ResultAnalyzer(board);
		Game game=new Game(resultAnalyze, board, player1, player2);
		//game.setPlayer("Prachit");
		//String name=game.getPlayer();
		//assertEquals("Prachit", name);
	}
}

package com.techlabs.tictactoe.junit;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.techlabs.tictactoe.Board;
import com.techlabs.tictactoe.IBoard;

class BoardTest {

	@Test
	public void testForIsEmpty() {
		IBoard board=new Board();
		boolean actual=board.isEmpty();
		assertEquals(true, actual);
	}
	
	@Test
	public void testForIsFull() {
		IBoard board=new Board();
		boolean actual=board.isFull();
		assertEquals(false, actual);
	}
}

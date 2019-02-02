package com.techlabs.tictactoe.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.techlabs.tictactoe.Cell;
import com.techlabs.tictactoe.Mark;

class CellTest {

	@Test
	public void testOGetMark() throws Exception {
		Cell cell=new Cell();
		cell.setMark(Mark.NOUGHT);
		Mark result=cell.getMark();
		assertEquals(Mark.NOUGHT, result);
	}
	
	@Test
	public void testXGetMark() throws Exception {
		Cell cell=new Cell();
		cell.setMark(Mark.CROSS);
		Mark result=cell.getMark();
		assertEquals(Mark.CROSS, result);
	}
	
//	@Test
//	public void testAlreadyMarkedCell()throws Exception {
//		Cell cell=new Cell();
//		cell.setMark(Mark.EMPTY);
//		Mark result=cell.getMark();
//		cell.setMark(Mark.NOUGHT);
//		assertEquals(Mark.NOUGHT, result);
//		
//	}
	
}

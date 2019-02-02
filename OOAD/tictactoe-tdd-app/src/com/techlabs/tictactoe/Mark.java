package com.techlabs.tictactoe;

public enum Mark {
	NOUGHT,CROSS,EMPTY;
	@Override
	public String toString() {
		switch(this){
		case NOUGHT:
			return "O";
		case CROSS:
			return "X";
		case EMPTY:
			return " ";
		 default:
			return null;
		}
	}

}

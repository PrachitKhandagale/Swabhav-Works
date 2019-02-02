package com.techlabs.tictactoe;

public enum Result {
	WON,DRAW,INPROGRESS,NOTSTARTED,DUPLICATE_NUMBER,INVALID;
	@Override
	public String toString() {
		switch(this){
		case WON:
			return "Won";
		case DRAW:
			return "Draw";
		case INPROGRESS:
			return "InProgress";
		case NOTSTARTED:
			return "NotStarted";
		 default:
			return null;
		}
	}

}

package com.techlabs.tictactoe;

public class Player {
	private String playerName;
	
	public Player(String name) {
		//super();
		this.playerName = name;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
}

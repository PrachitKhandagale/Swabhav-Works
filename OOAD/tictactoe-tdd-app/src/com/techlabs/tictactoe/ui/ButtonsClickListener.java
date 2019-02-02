package com.techlabs.tictactoe.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.techlabs.tictactoe.Player;

public class ButtonsClickListener implements ActionListener {
	private PlayerFrame playerFrame;
	public ButtonsClickListener(PlayerFrame playerFrame) {
		this.playerFrame=playerFrame;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Player player1=new Player(playerFrame.getText1().getText());
		Player player2=new Player(playerFrame.getText2().getText());
		GameConsoleFrame gameConsole=new GameConsoleFrame(player1,player2);
	}
}

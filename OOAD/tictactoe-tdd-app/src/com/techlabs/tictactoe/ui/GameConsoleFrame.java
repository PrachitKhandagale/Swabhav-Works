package com.techlabs.tictactoe.ui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.practice.TicTacToeUi;
import com.techlabs.tictactoe.Board;
import com.techlabs.tictactoe.Game;
import com.techlabs.tictactoe.IBoard;
import com.techlabs.tictactoe.IResultAnalyzer;
import com.techlabs.tictactoe.Mark;
import com.techlabs.tictactoe.Player;
import com.techlabs.tictactoe.ResultAnalyzer;

public class GameConsoleFrame extends JFrame {

	private static final long serialVersionUID = 6254663143741838790L;
	private Container container;
	int a[][] = { { 10, 1, 2, 3, 11 }, { 10, 1, 4, 7, 11 }, { 10, 1, 5, 9, 11 }, { 10, 2, 5, 8, 11 },
			{ 10, 3, 5, 7, 11 }, { 10, 3, 6, 9, 11 }, { 10, 4, 5, 6, 11 }, { 10, 7, 8, 9, 11 } };
	private JButton buttons[] = new JButton[9];
	private JLabel nowPlaying;
	JLabel nowPlayingStr = new JLabel("Now Playing : ");
	Player player1, player2;
	int startX = 50;
	int startY = 40;
	int stepX = 70;
	int stepY = 50;
	int widthX = 50;
	int widthY = 30;

	public GameConsoleFrame(Player player, Player player2) {
		this.player1 = player;
		this.player2 = player2;
//		System.out.println(player.getPlayerName());
//		System.out.println(player2.getPlayerName());
		initialize();
	}

	public void initialize() {
		IBoard board = new Board();
		IResultAnalyzer resultAnalyizer = new ResultAnalyzer(board);
		Game game = new Game(resultAnalyizer, board, player1, player2);

		ActionListener actionListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				for (int i = 0; i < buttons.length; i++) {
					if (e.getSource() == buttons[i])
						buttonClicked(i, buttons[i]);
				}

			}

			private void checkResult() {
				for (int i = 0; i <= 7; i++) {

					String text1 = buttons[(a[i][1] - 1)].getText();
					String text2 = buttons[(a[i][2] - 1)].getText();
					String text3 = buttons[(a[i][3] - 1)].getText();
					if ((text1 == text2) && (text2 == text3) && (text1 != null)) {
						if (text1 == Mark.CROSS.toString() || text1 == Mark.NOUGHT.toString()) {
							String winner;
							if (text1 == Mark.CROSS.toString())
								winner = player1.getPlayerName();
							else
								winner = player2.getPlayerName();
							nowPlaying.setText("GAME COMPLETED !!!");
							for (int j = 0; j < 9; j++)
								buttons[j].setEnabled(false);
							JOptionPane.showMessageDialog(GameConsoleFrame.this, "Player " + winner + " won!");
							break;
						}
					}
				}
			}

//			private void buttonClicked(int index,JButton button) {
//				String iconCross="D:\\image\\cross.png";
//				String iconNough="D:\\image\\nought.png";
//				ImageIcon cross=new ImageIcon(iconCross);
//				ImageIcon nough=new ImageIcon(iconNough);
//				//String playerName = player.getPlayerName();
//				//int position = index - 1;
//				if(game.isCurrentState()) 
//				{
//					button.setIcon(cross);//(Mark.CROSS.toString());
//					game.play(index,Mark.CROSS);
//					nowPlaying.setText(player2.getPlayerName());
//				}
//				else
//				{
//					button.setIcon(nough);//(Mark.NOUGHT.toString());
//					game.play(index,Mark.NOUGHT);
//					nowPlaying.setText(player1.getPlayerName());
//				}
//				button.setEnabled(false);
//				
//				checkResult();
//				
//			}
//		};

			private void buttonClicked(int index, JButton button) {
				String iconCross = "D:\\image\\cross.png";
				String iconNough = "D:\\image\\nought.png";
				ImageIcon cross = new ImageIcon(iconCross);
				ImageIcon nough = new ImageIcon(iconCross);
				if (game.isCurrentState()) {
					button.setText(Mark.CROSS.toString());
					game.play(index, Mark.CROSS);
					nowPlaying.setText(player2.getPlayerName());
				} else {
					button.setText(Mark.NOUGHT.toString());
					game.play(index, Mark.NOUGHT);
					nowPlaying.setText(player1.getPlayerName());
				}
				button.setEnabled(false);

				checkResult();

			}
		};

		container = getContentPane();
		int x = startX;
		int y = startY;
		int j = 0;
		for (int i = 0; i < buttons.length; x += stepX, i++, j++) {
			buttons[i] = new JButton(Mark.EMPTY.toString());
			if (j == 3) {
				j = 0;
				y += stepY;
				x = startX;
			}
			buttons[i].setBounds(x, y, widthX, widthY);
			add(buttons[i]);
			buttons[i].addActionListener(actionListener);
			container.add(buttons[i]);
		}

		nowPlaying = new JLabel(player1.getPlayerName());

		nowPlayingStr.setBounds(300, 130, 100, 30);
		nowPlaying.setBounds(300, 150, 150, 30);

		container.add(nowPlayingStr);
		container.add(nowPlaying);

		setLayout(null);
		setSize(500, 500);
		setVisible(true);
	}
}

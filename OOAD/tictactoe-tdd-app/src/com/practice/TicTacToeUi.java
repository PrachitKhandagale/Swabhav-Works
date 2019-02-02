package com.practice;


import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TicTacToeUi extends JFrame implements ActionListener {
		int i, j, ii, jj, yesnull;
		int a[][] = { { 10, 1, 2, 3, 11 }, { 10, 1, 4, 7, 11 }, { 10, 1, 5, 9, 11 }, { 10, 2, 5, 8, 11 },
				{ 10, 3, 5, 7, 11 }, { 10, 3, 6, 9, 11 }, { 10, 4, 5, 6, 11 }, { 10, 7, 8, 9, 11 } };

		boolean state, set;
		String text;
		
		int startX = 50;
		int startY = 40;
		int stepX = 70;
		int stepY = 50;
		int widthX = 50;
		int widthY = 30;
		

		JLabel l1, l2;
		JButton b[] = new JButton[9];
		JButton reset;
		private JLabel label1;
		private JLabel label2;
		private JTextField text1;
		private JTextField text2;
		private Container container;
		private JButton button;

		public void showButton() {

			int x = startX;
			int y = startY;
			j = 0;
			for (i = 0; i <= 8; i++, x += stepX, j++) {
				b[i] = new JButton(Mark.EMPTY);
				if (j == 3) {
					j = 0;
					y += stepY;
					x = startX;
				}
				b[i].setBounds(x, y, widthX, widthY);
				add(b[i]);
				b[i].addActionListener(this);
			} 

			reset = new JButton("RESET");
			reset.setBounds(100, 350, 100, 50);
			add(reset);
			reset.addActionListener(this);

		}


		public TicTacToeUi() {
			super("Swabhav - Tic Tac Toe");
			container = getContentPane();
			
			
			label1 = new JLabel("Player1 : ");
			label2 = new JLabel("Player2 : ");
			text1 = new JTextField();
			text2 = new JTextField();
			button = new JButton("GO");
			label1.setBounds(100, 100, 100, 30);
			label2.setBounds(100, 160, 100, 30);
			text1.setBounds(200, 100, 100, 40);
			text2.setBounds(200, 160, 100, 40);
			button.setBounds(200, 250, 100, 30);

			container.add(button);
			container.add(label1);
			container.add(label2);
			container.add(text1);
			container.add(text2);
			setTitle("Player Frame");
			setSize(500, 500);
			setLayout(null);
			setVisible(true);
			state = false;
			set = true;
			
			button.addActionListener(this);

			
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		}// eof constructor


		public void actionPerformed(ActionEvent e) {
			/********************************/
			if (e.getSource()==button) {
				remove(button);
				remove(label1);
				remove(label2);
				remove(text1);
				remove(text2);
				repaint(0, 0, 500, 500);
				showButton();
			}
			else {
				if (e.getSource() == reset) {
					for (i = 0; i <= 8; i++) {
						b[i].setText(Mark.EMPTY);
					} 
					state = false;
				} else {
					for (i = 0; i <= 8; i++) {
						if (e.getSource() == b[i]) {

							if (b[i].getText() == Mark.EMPTY) {
								if (state == true) {
									text=Mark.NOUGH;
									state = false;
								} else {
									text=Mark.CROSS;
									state = true;
								}
								b[i].setText(text);
							}
						}
					} // eof for
				} // eof else

			checkResult();

		}}// eof actionperformed

		

		public static void main(String[] args) {
			new TicTacToeUi();
		}
		
		
		void checkResult() {
			for (i = 0; i <= 7; i++) {

				String text1 = b[(a[i][1] - 1)].getText();
				String text2 = b[(a[i][2] - 1)].getText();
				String text3 = b[(a[i][3] - 1)].getText();
				if ((text1 == text2) && (text2 == text3) && (text1 != null)) {
					if (text1 == Mark.CROSS) {
						JOptionPane.showMessageDialog(TicTacToeUi.this, "Player " + this.text1.getText() + " won!");
						break;
					} else if (text1 == Mark.NOUGH) {
						JOptionPane.showMessageDialog(TicTacToeUi.this, "Player " + this.text2.getText() + " won!");
						break;
					}
				}
			}
		}
	}



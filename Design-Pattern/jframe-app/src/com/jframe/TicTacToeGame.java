package com.jframe;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TicTacToeGame extends JFrame implements ActionListener {
	int i, j, ii, jj, x, y, yesnull;
	int a[][] = { { 10, 1, 2, 3, 11 }, { 10, 1, 4, 7, 11 }, { 10, 1, 5, 9, 11 }, { 10, 2, 5, 8, 11 },
			{ 10, 3, 5, 7, 11 }, { 10, 3, 6, 9, 11 }, { 10, 4, 5, 6, 11 }, { 10, 7, 8, 9, 11 } };

	boolean state, set;
	String text;
	

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

		x = 50;
		y = 40;
		j = 0;
		for (i = 0; i <= 8; i++, x += 70, j++) {
			b[i] = new JButton("");
			if (j == 3) {
				j = 0;
				y += 50;
				x = 50;
			}
			System.out.println("{"+x +","+y+"}");
			b[i].setBounds(x, y, 50, 30);
			add(b[i]);
			b[i].addActionListener(this);
		} // eof for

		reset = new JButton("RESET");
		reset.setBounds(100, 350, 100, 50);
		add(reset);
		reset.addActionListener(this);

	}// eof showButton


	TicTacToeGame() {
		super("Swabhav - Tic Tac Toe");
		container = getContentPane();
		
		
		label1 = new JLabel("Player1:");
		label2 = new JLabel("Player2:");
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
					b[i].setText("");
				} 
				state = false;
			} else {
				for (i = 0; i <= 8; i++) {
					if (e.getSource() == b[i]) {

						if (b[i].getText() == "") {
							if (state == true) {
								text="0";
								state = false;
							} else {
								text="1";
								state = true;
							}
							b[i].setText(text);
						}
					}
				} // eof for
			} // eof else

		for (i = 0; i <= 7; i++) {

			String text1 = b[(a[i][1] - 1)].getText();
			String text2 = b[(a[i][2] - 1)].getText();
			String text3 = b[(a[i][3] - 1)].getText();
			if ((text1 == text2) && (text2 == text3) && (text1 != null)) {
				if (text1 == "1") {
					JOptionPane.showMessageDialog(TicTacToeGame.this, "Player " + this.text1.getText() + " won!");
					break;
				} else if (text1 == "0") {
					JOptionPane.showMessageDialog(TicTacToeGame.this, "Player " + this.text2.getText() + " won!");
					break;
				}
			}
		}

	}}// eof actionperformed

	

	public static void main(String[] args) {
		new TicTacToeGame();
	}
}
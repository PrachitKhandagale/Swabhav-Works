package com.techlabs.tictactoe.ui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PlayerFrame extends JFrame {

	private JLabel label1;
	private JLabel label2;
	private JTextField text1;
	private JTextField text2;
	private Container container;
	private JButton button;

	public PlayerFrame() {
		container = getContentPane();
		label1 = new JLabel("Player1:");
		label2 = new JLabel("Player2:");
		text1 = new JTextField();
		text2 = new JTextField();
		button = new JButton("OK");
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
		button.addActionListener(new ButtonsClickListener(this));
	}

	public JLabel getLabel1() {
		return label1;
	}

	public JLabel getLabel2() {
		return label2;
	}

	public JTextField getText1() {
		return text1;
	}

	public JTextField getText2() {
		return text2;
	}

	public Container getContainer() {
		return container;
	}

	public JButton getButton() {
		return button;
	}

}

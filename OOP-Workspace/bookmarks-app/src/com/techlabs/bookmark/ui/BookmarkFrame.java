package com.techlabs.bookmark.ui;

import java.awt.Container;
import javax.swing.*;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class BookmarkFrame extends JFrame {
	private Container container;
	private JLabel label1;
	private JLabel label2;
	private JButton button1;
	private JButton button2;
	private JTextField textfield;
	private JPasswordField passwordField;

	public BookmarkFrame() {
		setTitle("Bookmark Frame");

		container = getContentPane();
		label1 = new JLabel("Name:");
		label2 = new JLabel("URL:");
		textfield = new JTextField();
		button1 = new JButton("ADD");
		button2 = new JButton("Display");
		passwordField = new JPasswordField();

		label1.setBounds(100, 100, 200, 30);
		textfield.setBounds(170, 100, 150, 30);
		label2.setBounds(100, 150, 200, 40);
		passwordField.setBounds(170, 150, 150, 30);
		button1.setBounds(200, 200, 100, 30);
		button2.setBounds(200, 250, 100, 30);
		// button.addActionListener();

		container.add(label1);
		container.add(label2);
		container.add(textfield);
		container.add(passwordField);
		container.add(button1);
		container.add(button2);
		setSize(500, 500);
		setLayout(null);
		setVisible(true);
	}

	public Container getContainer() {
		return container;
	}

	public JLabel getLabel1() {
		return label1;
	}

	public JLabel getLabel2() {
		return label2;
	}

	public JButton getButton1() {
		return button1;
	}

	public JButton getButton2() {
		return button2;
	}

	public JTextField getTextfield() {
		return textfield;
	}

	public JPasswordField getPasswordField() {
		return passwordField;
	}

}

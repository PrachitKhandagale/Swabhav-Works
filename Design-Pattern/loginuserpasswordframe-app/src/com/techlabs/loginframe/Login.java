package com.techlabs.loginframe;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame {

	private Container container;
	private JLabel label1;
	private JLabel label2;
	private JButton button;
	private JTextField textfield;
	private JPasswordField passwordField;

	public Login() {
		setTitle("Login Frame");
		
		container = getContentPane();
		label1 = new JLabel("UserName:");
		label2 = new JLabel("Password:");
		textfield = new JTextField();
		button=new JButton("Login");
		passwordField=new JPasswordField();
		
		label1.setBounds(100, 100, 200, 30);
		textfield.setBounds(170, 100, 150, 30);
		label2.setBounds(100, 200, 200, 40);
		passwordField.setBounds(170, 200, 150, 30);
		button.setBounds(200, 300, 100, 30);
		
		container.add(label1);
		container.add(label2);
		container.add(textfield);
		container.add(passwordField);
		container.add(button);
		setSize(500, 500);
		setLayout(null);
		setVisible(true);
		button.addActionListener(new ActionOnButton(this));
		
	}


	public JLabel getLabel1() {
		return label1;
	}

	public JLabel getLabel2() {
		return label2;
	}

	public JButton getButton() {
		return button;
	}

	public JTextField getTextfield() {
		return textfield;
	}

	public JPasswordField getPasswordField() {
		return passwordField;
	}

}

package com.techlabs.loginframe;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomeFrame extends JFrame {
	private JLabel label;
	private Container container;
	Login login=new Login();
	String name=login.getTextfield().getText();
	public WelcomeFrame() {
		container=getContentPane();
		setTitle("Welcome");
		label=new JLabel("Welcome "+name);
		label.setBounds(200, 200, 300, 50);
		container.add(label);
		setLayout(null);
		setSize(500, 500);
		setVisible(true);
	}

}

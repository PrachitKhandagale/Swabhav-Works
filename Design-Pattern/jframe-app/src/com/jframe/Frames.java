package com.jframe;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Frames extends JFrame{
	
	private JLabel label1;
	private JLabel label2;
	private JTextField text1;
	private JTextField text2;
	private Container container;
	private JButton button;
	private JFrame startFrame;

	public Frames() {
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
		container.add(startFrame);
		setTitle("Player Frame");
		setSize(500, 500);
		setLayout(null);
		setVisible(true);
	}

	

}

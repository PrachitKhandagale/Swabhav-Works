package com.techlabs.synchronous;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Synchronous extends JFrame {

	private Container container;
	private JButton hello, button2;

	public Synchronous() {
		init();
	}

	public void init() {
		container = getContentPane();
		hello = new JButton("Hello");
		button2 = new JButton("Display");

		hello.setBounds(50, 100, 100, 30);
		button2.setBounds(200, 100, 100, 30);

		container.add(hello);
		container.add(button2);

		ActionListener actionListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame();
				JOptionPane.showMessageDialog(frame, "Hello");
			}
		};

		ActionListener actionListener2 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Date date = new Date();
				while (true) {
					System.out.println(date);
				}
			}
		};

		hello.addActionListener(actionListener);
		button2.addActionListener(actionListener2);

		setLayout(null);
		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] agrs) {
		Synchronous synchronous = new Synchronous();
	}
}

package com.techlabs.asynchronous;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Asynchronous extends JFrame{
	
	private Container container;
	private JButton hello;
	private JButton display;
	public Asynchronous() {
		container=getContentPane();
		hello=new JButton("Hello");
		display=new JButton("Display");
		hello.setBounds(100, 100, 100, 30);
		display.setBounds(200, 100, 100, 30);
		container.add(display);
		container.add(hello);
		
		setLayout(null);
		setSize(500, 500);
		setVisible(true);
		
	}
	

}

package com.techlabs.observerframe;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonObserverFrame extends JFrame{
	Container container;
	JButton jbutton;
	public ButtonObserverFrame() {
		setTitle("Button Click Listner Example");
		setSize(500,500);
		setLayout(null);
		container=getContentPane();
		jbutton=new JButton("OK");
		jbutton.setBounds(100, 100, 100, 30);
		container.add(jbutton);
		jbutton.addActionListener(new OkListner());
		jbutton.addActionListener(new GoodByeListener());
		setVisible(true);
	}
}

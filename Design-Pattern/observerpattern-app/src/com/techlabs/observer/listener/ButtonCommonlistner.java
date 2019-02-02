package com.techlabs.observer.listener;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonCommonlistner extends JFrame {
	private Container container;
	private JButton jbutton;
	private JButton jbutton2;

	public ButtonCommonlistner() {
		setTitle("Common Listener");
		setSize(500, 500);
		setLayout(new FlowLayout());
		container = getContentPane();
		this.jbutton=new JButton("Blue");
		container.add(jbutton);
		this.jbutton2=new JButton("Red");
		container.add(jbutton2);
		jbutton.addMouseListener(new CommonListener(this));
		jbutton2.addMouseListener(new CommonListener(this));
		setVisible(true);
	}

	public Container getContainer() {
		return container;
	}

	public void setContainer(Container container) {
		this.container = container;
	}

	public JButton getJbutton() {
		return jbutton;
	}

	public void setJbutton(JButton jbutton) {
		this.jbutton = jbutton;
	}

	public JButton getJbutton2() {
		return jbutton2;
	}

	public void setJbutton2(JButton jbutton2) {
		this.jbutton2 = jbutton2;
	}
	

}

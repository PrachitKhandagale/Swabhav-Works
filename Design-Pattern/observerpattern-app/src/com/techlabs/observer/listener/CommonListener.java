package com.techlabs.observer.listener;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CommonListener implements MouseListener {
	private ButtonCommonlistner buttonCommonlistener;;

	public CommonListener(ButtonCommonlistner buttonCommonlistener) {
		this.buttonCommonlistener = buttonCommonlistener;

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == buttonCommonlistener.getJbutton()) {
			buttonCommonlistener.getContainer().setBackground(Color.BLUE);
		}
		if (e.getSource() == buttonCommonlistener.getJbutton2()) {
			buttonCommonlistener.getContainer().setBackground(Color.RED);
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

}

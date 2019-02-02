package com.techlabs.loginframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionOnButton implements ActionListener {
	private Login login;
	public  ActionOnButton(Login login) {
		this.login=login;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		String username=login.getTextfield().getText();
		char[] password=login.getPasswordField().getPassword();
		String password1="";
		for(int i=0;i<password.length;i++) {
			password1=password1+password[i];
		}
		if (username.equals(password1)) {
			WelcomeFrame welcome = new WelcomeFrame();
			welcome.setSize(500, 500);
			welcome.setVisible(true);
		}

	}

}

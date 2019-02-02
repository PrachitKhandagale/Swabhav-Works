package com.techlabs.htmlcontrol.test;

import com.techlabs.htmlcontrol.Control;
import com.techlabs.htmlcontrol.ControlGroup;

public class TestControl {
	public static StringBuffer compositeBuilder = new StringBuffer();

	public static void main(String[] args) {
		ControlGroup htmlRoot = new ControlGroup("html");
		ControlGroup body = new ControlGroup("body");
		ControlGroup div = new ControlGroup("div");

		Control paragraph = new Control("p","Enter name");

		htmlRoot.addItem(body);
		body.addItem(div);
		div.addItem(paragraph);

		htmlRoot.displayDom();
	}

}

package com.techlabs.player.test;

import com.techlabs.player.GenderOption;
import com.techlabs.player.Player;

public class PlayerTest {

	public static void main(String[] args) {
		Player p1 = new Player("Prachit", 14, GenderOption.MALE);
		Player p2 = new Player("Vinod");
		Player p3 = p1.whoIsElder(p2);
		printDetails(p1);
		printDetails(p2);
		printDetails(p3);
	}

	public static void printDetails(Player p) {
		System.out.println("Name:" + p.getName() + "\tAge:" + p.getAge() + "\tGender:" + p.getGender());
	}

}

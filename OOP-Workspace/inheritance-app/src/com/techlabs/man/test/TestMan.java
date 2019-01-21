package com.techlabs.man.test;

import com.techlabs.man.Boy;
import com.techlabs.man.Infant;
import com.techlabs.man.Kid;
import com.techlabs.man.Man;

public class TestMan {

	public static void main(String[] args) {
//		case1();
//		case2();
//		case3();
//		atThePark(new Man());
//		atThePark(new Boy());
//		atThePark(new Kid());
//		atThePark(new Infant());
		
	}
	public static void case1() {
		Man x;
		x=new Man();
		x.read();
		x.eat();
		x.play();
		System.out.println();
	}
	public static void case2() {
		Boy y;
		y=new Boy();
		y.read();
		y.eat();
		y.play();
		y.walk();
		System.out.println();
	}
	public static void case3() {
		Man x;
		x=new Boy();
		x.play();
		x.read();
		x.eat();
		System.out.println();
	}
	public static void atThePark(Man x) {
		System.out.println("At the park ");
		x.play();
	}
}
